package controllerF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

public class Ex06_BDetail implements Ex04_Controller {
	
	@Override
	public String doUser(HttpServletRequest request, HttpServletResponse response) {
		BoardService service = new BoardService();
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(request.getParameter("seq")));
		vo = service.selectOne(vo);
		if (vo != null) {
			request.setAttribute("Apple", vo);
			return "/board/boardDetail.jsp" ; 
		}else {
			request.setAttribute("message", "~~ 글번호에 해당하는 글을 찾을 수 없습니다 ~~") ;
			return "/blist.do" ;
		}
	} // doUser

} //class
