package servlet03_FlowScope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

@WebServlet("/slogin")
public class Ex05_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ex05_Login() { super(); }
    
// ** Login 기능
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1) request 값 처리
		request.setCharacterEncoding("utf-8");
		String idno = request.getParameter("idno") ;
		String name = request.getParameter("name");
		
		// 2) Service
		// => DB 조회 확인
		// => 일치조건 설정: idno="900909-1234567" , name="홍길동" 
		String uri = "";
		if (idno.equals("900909-1234567") && name.equals("홍길동")) {
				// 성공
			request.getSession().setAttribute("idno",idno);
			request.getSession().setAttribute("name",name);
			//System.out.println("** Login Success idno , name => "+idno+name);
			System.out.println("** Login Success idno , name => "
					+request.getSession().getAttribute("idno")
					+request.getSession().getAttribute("name"));
			
			uri="servletTestForm/form05_LoginSuccess.jsp";
		}else {	// 실패
			System.out.println("** Login Fail idno , name => "+idno+name);
			uri="servletTestForm/form05_Login.jsp";
		}
		// => 확인결과에 따라 Forward
		//    성공 -> 로그인 정보를 session에 보관 , form05_LoginSuccess.jsp 
		//    실패 -> loginForm(form05_Login.jsp) 재출력
		request.getRequestDispatcher(uri).forward(request, response); 
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} //class
