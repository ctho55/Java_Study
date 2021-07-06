package controller02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.BoardService;
import vo.BoardVO;

@WebServlet("/bdetail")
public class C02_BDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public C02_BDetail() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1. 준비
		String message = null;
		String uri = "/board/boardDetail.jsp";
		BoardService service = new BoardService();
		BoardVO vo = new BoardVO();
		// 2. Service
		// => 로그인 했을때만 글내용을 볼 수 있도록 ( boardList.jsp 에서 처리 )
		// => 조회수 증가
		// 글쓴이(Parameter 로 전달) 와 글보는이(loginID) 가 달라야 함.
		// DAO, Service 에 countUp 메서드 추가
		vo.setSeq(Integer.parseInt(request.getParameter("seq")));

		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("loginID") != null) {
			String loginID = (String) session.getAttribute("loginID");
			// 글쓴이(Parameter 로 전달) 와 글보는이(loginID) 가 다른경우에만 조회수 증가
			System.out.println("loginID=> " + loginID);
			System.out.println("request.getParameter(id)=> " + request.getParameter("id"));
			// 글내용 조회
			vo = service.selectOne(vo);
			if (vo != null) {
				request.setAttribute("Apple", vo);
				if (!loginID.equals(request.getParameter("id"))) {
					service.countUp(vo);
				}
				if ("U".equals(request.getParameter("jcode"))) {
					uri = "/board/bupdate.jsp";
				}
			} else {
				message = "~~ 글번호에 해당하는 글을 찾을 수 없습니다 ~~";
				uri = "/blist";
			}
		} else {
			message = "~~ 로그인 정보가 없습니다 !! 로그인 후 다시 하세요  ~~";
			uri = "/member/loginForm.jsp";
		}

		// 3. View
		if (message != null)
			request.setAttribute("message", message);
		request.getRequestDispatcher(uri).forward(request, response);

	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
} // class
