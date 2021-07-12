package controllerF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

public class Ex05_BList implements Ex04_Controller {

	@Override
	public String doUser(HttpServletRequest request, HttpServletResponse response) {
	
		BoardService service = new BoardService();
		BoardVO vo = new BoardVO();
		
		vo.setId(request.getParameter("id"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		
		if (service.insert(vo)>0) {
			request.setAttribute("message","~~ insert success");
			return "/blist.do";
		}else {
			request.setAttribute("message", "~~insert success");
			return "/board/binsertForm.jsp";
		}
		
	} //doUser
} // class
