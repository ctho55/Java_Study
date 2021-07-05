package controller01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import vo.MemberVO;

@WebServlet("/mjoin")
public class C04_Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C04_Insert() {
        super();
    }
// ** Member Join
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. request 처리
		// => Parameter -> vo 에 set
		// => 한글처리 (utf-8 인 경우 get 방식은 안해도 되지만, post 방식은 반드시 해야함) 
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "";
		String message = null;
		
		request.setCharacterEncoding("utf-8");
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setLev(request.getParameter("lev"));
		vo.setBirthd(request.getParameter("birthd"));
		vo.setPoint(Integer.parseInt(request.getParameter("point")));
		vo.setWeight(Double.parseDouble(request.getParameter("weight")));
		
		// 2. Service
		if (service.insert(vo) > 0) {
			// 가입성공 => message, 로그인 (loginForm.jsp)
			message = "~~ 환영 합니다 !! 로그인 후 이용하세요 ~~";
			uri="/member/loginForm.jsp";
		}else {
			// 가입실패 => message, 재가입유도 (joinForm.jsp)
			message = "~~ 회원가입 실패 !! 다시 하세요 ~~";
			uri="/member/joinForm.jsp";
		}
		
		// 3. View => forward
		request.setAttribute("message",message);
		request.getRequestDispatcher(uri).forward(request, response);
	} //doGet
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
