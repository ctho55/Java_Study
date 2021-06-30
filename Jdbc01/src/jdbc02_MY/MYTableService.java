package jdbc02_MY;

import java.util.List;

public class MYTableService {

	MYTableDAO dao = new MYTableDAO();

	public List<MYTableVO> selectList() {
		return dao.selectList();
	}

	public int insert(MYTableVO vo) {
		return dao.insert(vo);
	}

	public int update(MYTableVO vo) {
		return dao.update(vo);
	}

	public int delete(MYTableVO vo) {
		return dao.delete(vo);
	}

}
