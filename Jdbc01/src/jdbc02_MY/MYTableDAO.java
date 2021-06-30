package jdbc02_MY;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc01.DBConnection;

public class MYTableDAO {

	static Connection cn = DBConnection.getConnection();
	static Statement st;
	static PreparedStatement pst;
	static ResultSet rs;
	static String sql;

	public List<MYTableVO> selectList() {
		List<MYTableVO> list = new ArrayList<MYTableVO>();
		sql = "select * from member ";
		try {
			st = cn.createStatement();
			rs = st.executeQuery(sql);
			if (rs.next()) {
				do {
					MYTableVO vo = new MYTableVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
							rs.getString(5));
					list.add(vo);
				} while (rs.next());
			} else {
				System.out.println(" 출력자료가 없습니다 .");
				list = null;
			}

		} catch (Exception e) {
			System.out.println("** selectList Exception =>" + e.toString());
			list = null;
		} // catch
		return list;
	}// selectList()

	public int insert(MYTableVO vo) {
		sql = "insert into member values(?,?,?,?,?) ";
		int count = 0;
		try {
			pst = cn.prepareStatement(sql);

			pst.setString(1, vo.getMember_num());
			pst.setString(2, vo.getName());
			pst.setString(3, vo.getAddr());
			pst.setString(4, vo.getNickname());
			pst.setString(5, vo.getPhone());
			count = pst.executeUpdate();
			if (count > 0) {
				System.out.println("*** 입력성공 ***");
				return count;
			} else
				System.out.println("*** 입력실패 ***");
		} catch (Exception e) {
			System.out.println("** insert Exception => " + e.toString());
			return 0;
		}
		return count;
	}

	public int update(MYTableVO vo) {
		sql = "update member set phone = ? , nickname = ? where name= ? ";

		try {
			pst = cn.prepareStatement(sql);

			pst.setString(1, vo.getPhone());
			pst.setString(2, vo.getNickname());
			pst.setString(3, vo.getName());

			return pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("** update Exception => " + e.toString());
		}

		return 0;
	}

	public int delete(MYTableVO vo) {
		sql = "delete from member where name = ?";

		try {
			pst = cn.prepareStatement(sql);
			pst.setString(1, vo.getName());
			return pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("** delete Exception => " + e.toString());
			return 0;
		}
	}// delete

}// class
