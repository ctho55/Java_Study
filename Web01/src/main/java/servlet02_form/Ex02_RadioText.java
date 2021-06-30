package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex02_RadioText
 */
@WebServlet("/radio")
public class Ex02_RadioText extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Ex02_RadioText() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//request 처리
		// => 한글처리 , paremeter 처리 
		String gender = request.getParameter("gender");
		String mail = request.getParameter("mailcheck");
		String content = request.getParameter("content");
		
		if(mail.equals("Yes")) {
			mail="수신동의";
		}
		else {
			mail = "수신거부";
		}
		
		//response 처리
		// => 한글처리 
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2> ** 성별 : "+gender+"<br>");
		out.print("<h2> ** 메일 : "+mail+"<br>");
		out.print("<h2> ** 인사 : "+content+"<br>");
		out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2><br>");
	
	}// doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request 처리
				// => 한글처리 , paremeter 처리 
				request.setCharacterEncoding("utf-8");
				String gender = request.getParameter("gender");
				String mail = request.getParameter("mailcheck");
				String content = request.getParameter("content");
				
				if(mail.equals("Yes")) {
					mail="수신동의";
				}
				else {
					mail = "수신거부";
				}
				
				//response 처리
				// => 한글처리 
				
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				out.print("<h2> ** 성별 : "+gender+"<br>");
				out.print("<h2> ** 메일 : "+mail+"<br>");
				out.print("<h2> ** 인사 : "+content+"<br>");
				out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2><br>");
			
		
	}//doPost

}
