package jdbc01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// *** DAO (DB Access Object) 
// => CRUD SQL 구문 처리

public class StudentDAO {
	// JDBC 객체 정의
	static Connection cn = DBConnection.getConnection();
	static Statement st;
	static PreparedStatement pst;
	static ResultSet rs;
	static String sql;

	public List<StudentVO> selectList() {
		// 결과를 전달할 객체 정의 -> 순차처리에 적합한 자료형 : ArrayList
		List<StudentVO> list = new ArrayList<StudentVO>();
		sql = "select * from student";
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				// 결과처리
				// => 사용자 클래스에서 출력 (View 처리)
				// => 결과를 View 에게 전달
				// 결과 -> Service -> User 의 View
				do { // 결과를 list 에 add
					StudentVO vo = new StudentVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getInt(5), rs.getInt(6));
					// vo.setIdno(rs.getString(1));
					list.add(vo);
				} while (rs.next());
			} else {
				System.out.println("** 출력자료가 1건도 없음 **");
				list = null;
			}
		} catch (Exception e) {
			System.out.println("** selectList Exception => " + e.toString());
			list = null;
		}
		return list;
	} // selectList()

	public StudentVO selectOne(StudentVO vo) {
		// sql = "select * from student where name=\""+vo.getName()+"\"" ;
		// => Statement : Sql 구문을 완성하면 됨 (문자열 +)
		// select * from student where name="홍길동" -> vo.getName()
		//
		// ??? = vo.getName() ;
		// => PreparedStatement
		// => 변수 사용가능 (바인딩 변수 ?)
		// => 쿼리구문 실행 전에 바인딩 변수(?)를 처리해서 구문이 완성되도록 함.
		sql = "select * from student where name=?";
		try {
			// 1) statement
			// st = cn.createStatement();
			// rs = st.executeQuery(sql); // 완성된 SQL 구문이 전달되어 실행

			// 2) PreparedStatement
			pst = cn.prepareStatement(sql);
			pst.setString(1, vo.getName());
			rs = pst.executeQuery();

			if (rs.next()) {
				vo.setIdno(rs.getString(1));
				vo.setName(rs.getString("name")); // index 또는 컬럼명 사용
				vo.setGender(rs.getString(3));
				vo.setAge(rs.getInt(4));
				vo.setJava(rs.getInt(5));
				vo.setHtml(rs.getInt(6));
				return vo;
			} else
				return null;
		} catch (Exception e) {
			System.out.println("** selectOne Exception => " + e.toString());
			return null;
		}
	} // selectOne

	public List<String> selectgenderlist(StudentVO vo) {
		List<String> list = new ArrayList<String>();
		sql = "select * from student where gender= \"" + vo.getGender() + "\"";
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {

				do {
					StudentVO volist = new StudentVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
							rs.getInt(5), rs.getInt(6));

					list.add(volist.getName());
				} while (rs.next());
			} else {
				System.out.println("** 출력자료가 1건도 없음 **");
				list = null;
			}
		} catch (Exception e) {
			System.out.println("** selectList Exception => " + e.toString());
			list = null;
		}
		return list;
	}// 성별을 받고 이름만 출력하는 메소드

	public int insert(StudentVO vo) {
		sql = "insert into student values(?,?,?,?,?,? ) ";
		int count = 0;
		try {
			pst = cn.prepareStatement(sql);
			// 바인딩변수 (PreparedStatement)
			// => 바인딩변수의 순서와 갯수 중요
			pst.setString(1, vo.getIdno());
			pst.setString(2, vo.getName());
			pst.setString(3, vo.getGender());
			pst.setInt(4, vo.getAge());
			pst.setInt(5, vo.getJava());
			pst.setInt(6, vo.getHtml());
			// 실행
			// => I,U,D의 경우에는 executeUpdate() 사용
			// => executeUpdate() 의 return 값은 처리갯수를 int 로
			count = pst.executeUpdate();
			if (count > 0) {
				System.out.println("*** 입력성공 ***");
				return count;
			} else
				System.out.println("*** 입력실패 ***");
		} catch (Exception e) {
			System.out.println("** insert Exception => " + e.toString());
			return 0; // 입력 실패
		}
		return count;
	}// insert

	public int update(StudentVO vo) {
		sql = "update student set java = ?, html = ? where name=? ";
		try {
			pst = cn.prepareStatement(sql);
			pst.setInt(1, vo.getJava());
			pst.setInt(2, vo.getHtml());
			pst.setString(3, vo.getName());
			return pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("** update Exception => " + e.toString());
			return 0;
		}
	}// update

	public int delete(StudentVO vo) {
		sql = "delete from student where name = ?";

		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, vo.getName());
			return pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("** delete Exception => " + e.toString());
			return 0;
		}
	}// delete

	//** Transaction Test
		// => I -> U 만원 송금한다고 가정
		//    I잔액 -= 만원 (A처리) 동시에 U잔액 +=만원 (B처리)
		//    A , B 모두 성공 아니면 모두 실패
		// => 이 경우 A, B 중 하나라도 실패이면 모두 원상복귀
		// => 위와같이 한번에 같이 처리하도록 묶어주는것을 트랜잭션 이라함.
		public void transactionTest() {
			try {
				// 1) Transaction 적용전
				// => 첫번째는 입력되고, 두번째에서 키중복 오류 발생
				//    즉, "I잔액 -= 만원" 은 처리되고 "U잔액 +=만원" 는 오류발생으로 처리 안된상황
				//transactionInsert(); // A처리
				//transactionInsert(); // B처리 -> 오류발생
				
				// 2) Transaction 적용
				// => 첫번째는 입력되고, 두번째에서 키중복 오류 발생
				// => rollback 되어 모두 입력 안되도록 해준다.
				// ** JDBC Transaction 특징
				// => Connection 객체가 모두 관리
				// => 기본설정은 AutoCommit true.
				
				// 2.1) AutoCommit 을 false 로 
				// => commit 명령을 만날때까지 commit 안됨.
				cn.setAutoCommit(false);
				
				// 아래 메서드에서는 Exception 을 직접 처리하지 않고 위임해야 Rollback 이 적용됨.
				transactionInsert();
				transactionInsert();
				// 오류발생-> catch 구문으로 분기 -> rollback
				cn.commit();
			} catch (Exception e) {
				System.out.println("** transactionTest => "+e.toString());
				try {
					cn.rollback();
					System.out.println("** Rollback 성공 **");
				} catch (Exception e2) {
					System.out.println("** Rollback Exception => "+e2.toString());
				} //catch_rollback
			} //catch
		} //transactionTest
		
		// ** Transaction 적용을 위해 Exception 을 throws 함.
		public void transactionInsert() throws Exception {
			sql = "insert into student values(\"444444-1234567\",\"최길동\",\"남\",33,90,90)";
			// insert into student values("888888-1234567","최길동","남",33,90,90);
			pst=cn.prepareStatement(sql);
			pst.executeUpdate();
			throw new Exception();
		} //transactionInsert
	
	
}//class
