package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.MemberVO;

// ** DAO (Data Access Object)
// => CRUD
public class MemberDAO {
	// ** 전역변수 정의
	Connection cn = DBConnection.getConnection();
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	String sql;

	// ** selectList
	public List<MemberVO> selectList() {
		sql = "select * from member order by id" ;
		List<MemberVO> list = new ArrayList<>();
		try {
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			// 출력자료 가 있는지 확인
			if (rs.next()) {
				// 출력자료 -> list (MemberVO 에 set -> add List)
				do {
					MemberVO vo = new MemberVO();
					vo.setId(rs.getString(1));
					vo.setPassword(rs.getString(2));
					vo.setName(rs.getString(3));
					vo.setLev(rs.getString(4));
					vo.setBirthd(rs.getString(5));
					vo.setPoint(rs.getInt(6));
					vo.setWeight(rs.getDouble(7));
					list.add(vo);
				}while(rs.next());
			}else {
				System.out.println("** selectList() : 출력 자료가 없습니다 ~~ ");
				list=null;
			} //else
		}catch (Exception e) {
			System.out.println("** selectList Exception => "+e.toString());
			list=null;
		}
		return list;
	} //selectList
	
	// ** selectOne
	public MemberVO selectOne(MemberVO vo) {
		sql="select * from member where id=?" ;
		try {
			pst=cn.prepareStatement(sql);
			pst.setString(1,vo.getId());
			rs = pst.executeQuery();
			// 결과 확인
			if (rs.next()) {
				vo.setId(rs.getString(1));
				vo.setPassword(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setLev(rs.getString(4));
				vo.setBirthd(rs.getString(5));
				vo.setPoint(rs.getInt(6));
				vo.setWeight(rs.getDouble(7));
			}else {
				System.out.println("** 해당하는 자료가 없습니다 ~~ **");
				vo=null;
			} //else
		} catch (Exception e) {
			System.out.println("** selectOne Exception => "+e.toString());
			vo=null;
		}
		return vo;
	} //selectOne
	
	// ** Join : insert
	
	// ** update
	
	// ** delete
	
	
	
	
} //class
