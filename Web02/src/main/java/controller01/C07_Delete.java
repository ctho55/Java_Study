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

@WebServlet("/mdelete")
public class C07_Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C07_Delete() {
        super();
    }
// ** Member Delete : 회원탈퇴
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 준비
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "";
		String message = null;
		
		// => 삭제 대상 -> vo 에 set
		HttpSession session = request.getSession(false);
		
		if (session!=null && session.getAttribute("loginID")!=null) {
			// 삭제 가능 => message, index.jsp
			vo.setId((String)session.getAttribute("loginID"));
			// 2. Service
			if (service.delete(vo) > 0) {
					// 삭제성공
				message="~~ 회원탈퇴 성공 !!  1개월후 재가입 가능 합니다 ~~";
				session.invalidate();
			}else { // 삭제실패
				message="~~ 회원탈퇴 오류 !!  다시 하세요 ~~";
			}
			uri="/index.jsp";	
		}else {
			// 삭제불가능 => message, loginForm.jsp 
			message="~~ 로그인 정보가 없습니다!! 로그인후 하세요 ~~";
			uri="/member/loginForm.jsp";	
		}
		
		// 3. View => forward
		request.setAttribute("message",message);
		request.getRequestDispatcher(uri).forward(request, response);
	} //doGet
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
