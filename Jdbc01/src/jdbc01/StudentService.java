package jdbc01;

import java.util.List;

// *** Service  
// => DAO 와 사용자 클래스 사이에서 요청 전달 역할

public class StudentService {

	private StudentDAO dao = new StudentDAO();

	public List<StudentVO> selectList() {
		return dao.selectList();
	}

	public StudentVO selectOne(StudentVO vo) {
		return dao.selectOne(vo);
	}

	public int insert(StudentVO vo) {
		return dao.insert(vo);
	}

	public int update(StudentVO vo) {
		return dao.update(vo);
	}

	public int delete (StudentVO vo) {
		return dao.delete(vo);
	}
	
	public void transactionTest() {
		dao.transactionTest();
	}
	
	
	public List<String> selectgenderlist(StudentVO vo) {
		return dao.selectgenderlist(vo);
	}
} // class
