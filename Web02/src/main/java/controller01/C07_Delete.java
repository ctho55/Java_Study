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

/**
 * Servlet implementation class C04_Insert
 */
@WebServlet("/mdelete")
public class C07_Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C07_Delete() {
        super();
    }

  //** Member Join
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 준비
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "";
		String message = null;
		
		// => 삭제대상 -> vo에 set
		
		HttpSession session = request.getSession(false);
		
		//2. Service
		if(session!=null && session.getAttribute("loginID")!=null) {
			//삭제 가능 => message, index.jsp
			vo.setId((String)session.getAttribute("loginID")); 
			if( service.delete(vo) > 0) {
				// 삭제 성공
				uri="/index.jsp";
				message="탈퇴성공 !! 1개월후 재가입 가능 합니다 ~~";
				session.invalidate();
			}else {// 삭제 실패
				message="탈퇴실패 ";
			}
			uri="/index.jsp";
		}else {
			//삭제 불가능 => message, loginForm.jsp
			message="로그인 정보가 없습니다~~";
			uri="/member/loginForm.jsp";
		}
		
		
		//3. View = forward
		
	    request.setAttribute("message", message);		
		request.getRequestDispatcher(uri).forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
