package controller01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;
import vo.MemberVO;

@WebServlet("/mdetail")
public class C05_mDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C05_mDetail() {
        super();
    }
// ** Detail : MyInfo
// => My : Login Member
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 준비
		// => vo.setId(누구) : session 에서 ~~
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "/member/loginForm.jsp";
		String message = null;
		
		// ** 누구를 검색할지 
		// => mdeatil 요청을 분석하며 아래 4경우
		// 1.1) User가 내정보 보기
		// 1.2) 관리자가 회원정보 보기
		// 1.3) User가 내정보 수정하기
		// 1.4) 관리자가 회원정보 수정하기
		// => 1.1) loginID 로 처리가능 
		// => 1.2) , 1.3), 1.4) Parameter 로 처리가능
		
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("loginID") != null) {
			
			String loginID = (String)session.getAttribute("loginID");
			// 정보수정하기 또는 id Parameter 가 존재하는 경우에는 Parameter 로
			// 아니면 loginID 로
			if ("U".equals(request.getParameter("jcode")) || request.getParameter("id") != null) {
				vo.setId(request.getParameter("id"));
			} else {
				vo.setId(loginID);
			}
			
			// => Service , memberDetail.jsp
			// 2. Service
			System.out.println("before vo =>"+vo);
			vo=service.selectOne(vo);
			System.out.println("after vo =>"+vo);
			if (vo != null) {
				request.setAttribute("Apple", vo);
				// if (request.getParameter("jcode").equals("U"))
				// "jcode" 가 없는경우 NullPointerException 발생
				// => 예방차원에서 아래처럼 비교
				if ("U".equals(request.getParameter("jcode")))
					 uri = "/member/updateForm.jsp";
				else uri = "/member/memberDetail.jsp";
			}else {
				// => loginForm.jsp
				message="~~ Detail NotFound 재로그인 후 이용하세요 ~~";
			}
		}else {
			// 로그인 후 이용하세요 ~~ 
			// => loginForm.jsp
			message="~~ Session NotFound 로그인 후 이용하세요 ~~";
		}
		// 3. View => forward
		if (message!=null) { request.setAttribute("message",message); }
		
		request.getRequestDispatcher(uri).forward(request, response);
		
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
