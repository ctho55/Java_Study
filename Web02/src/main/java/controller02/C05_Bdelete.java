package controller02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

@WebServlet("/bdelete")
public class C05_Bdelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C05_Bdelete() {
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
					
		vo.setSeq(Integer.parseInt(request.getParameter("seq")));
		
			// 2. Service
			if (service.delete(vo)>0) {
				message="게시물 삭제가 성공적으로 완료되었습니다.";
			}else {
				message="게시물 삭제가 실패하였습니다.";
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
