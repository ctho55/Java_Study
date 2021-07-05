package controller02;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

@WebServlet("/binsert")
public class C03_BInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C03_BInsert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 준비
		// => request 처리 
		//    한글, Parameter
		request.setCharacterEncoding("utf-8");
		String message=null;
		String uri = "/Web02/blist" ;
		BoardService service = new BoardService();
		BoardVO vo = new BoardVO() ;
		
		vo.setId(request.getParameter("id"));
		vo.setTitle(request.getParameter("title"));
		vo.setContent(request.getParameter("content"));
		
		// 2. Service
		if (service.insert(vo) > 0) {
			message = "~~ 새글 등록 성공 ~~" ;
		}else {
			message = "~~ 새글 등록 실패 !! 다시 하세요 ~~" ;
			uri = "/Web02/board/binsertForm.jsp" ;
		}
		// 3. View
		if (message !=null) request.setAttribute("message", message);
		//request.getRequestDispatcher(uri).forward(request, response);
		response.sendRedirect(uri);
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
