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

@WebServlet("/loginCheck")
public class Ex05_LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ex05_LoginCheck() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>** Login 상태 확인 **</h2>");
		
		// ** Login상태 확인
		// => session 에 idno , name 이 존재하는지 확인
		//    존재하면 " ~~~님 로그인 상태입니다 ~~"
		//    아니면 " 로그인후 이용 하세요 ~~~"
		
		// 1) session 확인
		// => getAttribute 의 경우에는 session 인스턴스를 생성해서 사용함.
		// => 생성시 getSession() 에 매개변수 적용이 가능함
		//    -> (true) , () 없는것 동일 : session 값이 없을때 자동생성 후 return 
		//    -> (false) : session 값이 없을때 null 을 return 
		//                 반드시 session 이 null 인지 확인후 처리
		HttpSession session = request.getSession(false);
		
		if ( session !=null && 
				session.getAttribute("idno")!=null && 
				session.getAttribute("name")!=null) {
			// 로그인 되어있는 상태
			out.print("<h2>** "
					+session.getAttribute("name")
					+" 님 로그인 상태입니다 ~~  </h2>") ;
			out.print("<br><br><a href='/Web01/logout'>Logout</a>");
		}else {
			// 로그인 하고 하세요 ~~
			out.print("<h2>~~ 로그인후 이용 하세요 ~~~</h2>");
			out.print("<br><br><a href='/Web01/servletTestForm/form05_Login.jsp'>LoginForm</a>");
		}
		out.print("&nbsp;&nbsp<a href='javascript:history.go(-1)'>이전으로</a>");
		 
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} //class
