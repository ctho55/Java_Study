package service;

import java.util.List;

import util.MemberDAO;
import vo.MemberVO;

public class MemberService {
	
	MemberDAO dao = new MemberDAO();
	
	public List<MemberVO> selectList() {
		return dao.selectList();
	} //selectList()
	
	public MemberVO selectOne(MemberVO vo) {
		return dao.selectOne(vo);
	} //selectOne

} //class
