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

@WebServlet("/blist")
public class C01_BList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C01_BList() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 준비
		String message=null;
		// 전달된 message 처리하기
		if (request.getParameter("message") != null)
			message = request.getParameter("message");
		
		String uri = "/board/boardList.jsp" ;
		BoardService service = new BoardService();
		
		// 2. Service
		List<BoardVO> list = service.selectList();
		if (list == null) message = "~~ 출력할 자료가 1건도 없습니다 ~~" ;
		
		// 3. View
		request.setAttribute("Banana", list);
		if (message !=null) request.setAttribute("message", message);
		request.getRequestDispatcher(uri).forward(request, response);
	
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
