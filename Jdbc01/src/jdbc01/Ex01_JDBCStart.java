package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// JDBC Start : studentList 출력하기

// *** 기능별로 구분 : 공통모듈 구현 
// => DB 연결(계정 및 DB 단위)  : DBConnection
// => sql 구문 처리(Table 단위) : DB Access 기능 담당 -> DAO (DB Access Object)
// => Service 객체 : DAO 와 사용자 클래스 사이에서 요청 전달 역할  
// => Data(Table, Entity) 객체 : VO (Value Object) , DTO(Data Transfer Object)
// => 사용자 Class : 요청 받고, 처리, 결과출력(View)

// Table 단위로 VO, Service, Dao 필요함 

public class Ex01_JDBCStart {
	// JDBC 객체 정의
	private static Connection cn;
	private static Statement st;
	private static ResultSet rs;
	private static String sql;
	
	// ** DB 연결 : Connection 객체 생성
	// => DB 별로 1개
	public static void dbConnection() {
		try {
			// 1) MySql JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2) Connection 객체 생성
			String url ="jdbc:mysql://localhost:3306/mydb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
			cn = DriverManager.getConnection(url,"root","mysql");
			System.out.println("** DB Connection 성공 **");
		} catch (Exception e) {
			System.out.println("** DB Connection 실패 => "+e.toString());
		}
	} // dbConnection
	// ** SQL 구문 처리
	// => CRUD 를구현하면 기본 메서드 5개
	// => 테이블 별로 작성
	public static void selectList() { 
		sql = "select * from student" ;
		try {
			// 1) Statement 객체 생성
			// => Connection 객체에 의해 생성됨
			st = cn.createStatement();
			rs = st.executeQuery(sql);  // 
			if (rs.next()) {
				// 출력
				do {
					System.out.printf("[ %s, %s, %s, %d, %d, %d ]\n"
									,rs.getString(1),rs.getString(2),rs.getString(3)
									,rs.getInt(4),rs.getInt(5),rs.getInt(6));
				}while(rs.next());
			}else {  
				System.out.println("** 출력자료가 1건도 없음 **");
			}
		} catch (Exception e) {
			System.out.println("** selectList Exception => "+e.toString());
		}
	} //selectList()
	
	// ** 호출 & 사용
	// => 요청 받고, 처리, 결과출력
	public static void main(String[] args) {
		dbConnection();
		selectList();
	} //main
} //class
