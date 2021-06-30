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

@WebServlet("/logout")
public class Ex05_Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Ex05_Logout() { super(); }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2>** Logout **</h2>");
		
		HttpSession session = request.getSession(false);
		
		if ( session !=null ) {
			if ( session.getAttribute("name") != null )  
				 out.print("<h2> "+ session.getAttribute("name")+" 님 안녕히 가세요 ~~~</h2>");
			else out.print("<h2> 로그아웃 되어있습니다 ~~~</h2>");
			session.invalidate();
		} else {
			out.print("<h2>~~ Session is null ~~~</h2>");
		}
		out.print("<br><br><hr><a href='/Web01/servletTestForm/form05_Login.jsp'>LoginForm</a>");
		out.print("&nbsp;&nbsp<a href='/Web01/default.html'>[Home]</a>");
	} // doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} //class
