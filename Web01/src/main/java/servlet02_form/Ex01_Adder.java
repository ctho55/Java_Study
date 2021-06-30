package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex01_Adder
 */
@WebServlet("/Ex01_Adder")
public class Ex01_Adder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01_Adder() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
	
		// 한글 처리 
		response.setContentType("text/html; charset=UTF-8");
		
		//출력 객체 생성 
		
		PrintWriter out = response.getWriter();
		out.print("<html><h2>");
		out.print("** Get 방식 숫자 더하기 Test **<br>");
		out.print("** insert num **<br>");
		out.print(" num1 :"+num1 +"<br>");
		out.print(" num2 :"+ num2+"<br>");
		out.print(" ADD result ="+(num1+num2)+"<br>");
		out.print("<br><br><a href='javascript:history.go(-1)'>다시 입력 하기</a></h2><br>");
		out.print("</h2></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		doGet(request, response);
	}

}
