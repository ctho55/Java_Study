package controllerF;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

public class Ex05_BList implements Ex04_Controller {

	@Override
	public String doUser(HttpServletRequest request, HttpServletResponse response) {
	
		BoardService service = new BoardService();
		List<BoardVO> list = service.selectList();
		if (list == null) {
			request.setAttribute("message", "~~ 출력할 자료가 1건도 없습니다 ~~");
			return "/index.jsp" ;
		}else {
			request.setAttribute("Banana", list);
			return "/board/boardList.jsp" ;
		}
	} //doUser
} // class
