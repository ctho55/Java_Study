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
 * Servlet implementation class C05_mDetail
 */
@WebServlet("/mdetail")
public class C05_mDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C05_mDetail() {
        super();
    }
    
    // ** Detail : myinfo
    // My : Login Member
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 준비
		//=> vo.setId(누구) : session 에서~~
		MemberService service =new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "/member/loginForm.jsp";
		String message = null;
		
		HttpSession session = request.getSession(false);
		if(session != null && session.getAttribute("loginID") !=null) {
			// 내정보 가져오기 
			// Service, memberDetail.jsp
			// 2.Service
			vo.setId((String)session.getAttribute("loginID"));
			vo=service.selectOne(vo);
			if (vo !=null) {
				request.setAttribute("Apple", vo);
				//if(request.getParameter("jcode").equals("U")) 
				// NullpointerException 발생가능성 매우 높음 
				// => 예방차원에서 아래처럼 비교 
				if("U".equals(request.getParameter("jcode"))) {
					uri="/member/updateForm.jsp";
				}else uri="/member/memberDetail.jsp";
			}else {
			   message="Detil NotFound 재로그인 후 이요하세요~~";
			}
		}else {
			// 로그인 후 이용하세요~~
			// => loginForm.jsp
			message="~~Session Notfound 로그인 후 이용하세요";
		}
	
		//3. View 
		if (message!=null) {
			request.setAttribute("message", message);
		}
		request.getRequestDispatcher(uri).forward(request, response);
		
	}//doget

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}//dopost

}
