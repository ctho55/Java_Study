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
@WebServlet("/check")
public class Ex03_ChecBox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Ex03_ChecBox() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//request 처리
		// => 한글처리 (get: default utf8, post: 반드시 알려줘야함)
		// paremeter 처리 
		request.setCharacterEncoding("utf-8");
		
		//** checkbox : 하나의 name에 복수개의 Value 를 가짐
		// => getparameterValues("..") 이용하여 배열로 처리함. 
		
		String[] gift = request.getParameterValues("gift");	
		
		response.setContentType("text/html; charset=utf-8");
		//response 처리
		// => 한글처리 
		PrintWriter out = response.getWriter();
		
		//선택을 했는지 안했는지 확인 
		if(gift != null) {
			out.print("<h2>** 선택항목 => <br>");
			for(String s:gift) {
				out.print(s+"<br>");
			}
				
		}else {
			out.print("<h2>** 선택항목이 없습니다.~~");
		}
		
				
		
		
		
		
		
	}// doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}//doPost

}
