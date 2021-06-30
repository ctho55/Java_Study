package servlet02_form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05_RequestInfo")
public class Ex05_RequestInfo extends HttpServlet {
   private static final long serialVersionUID = 1L;
 
    public Ex05_RequestInfo() {
        super();
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // ** 기본 처리
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      // ** request 객체의 주요 메서드 
      out.print("<h2>** request 객체의 주요 메서드 **</h2>");
      out.print("<h2>=> Console 창에서 확인 하세요 ~~</h2>");
      out.print("<h2>=> 1) HeaderNames & Value</h2>");
      out.print("<h2>=> 2) ContextPath</h2>");
      out.print("<h3>......JAVA 웹애플리케이션 현재 프로젝트의 최상위 경로</h3>");
      out.print("<h2>=> 3) RealPath</h2>");
      out.print("<h2>=> 4) 기타등등</h2>");
      
      System.out.println("** 1) HeaderNames & Value");
      Enumeration<String> headers = request.getHeaderNames();
      while (headers.hasMoreElements()) {
         String hname = headers.nextElement();
         String hvalue = request.getHeader(hname);
         System.out.println(hname+"=> "+hvalue);
      }
      System.out.println("** 2) ContextPath => "+ request.getContextPath());
      System.out.println("** 3) RealPath => "+ request.getRealPath("/"));
      System.out.println("**  => RemoteAddress => "+ request.getRemoteAddr());
      System.out.println("**  => getRequestURL => "+ request.getRequestURL());
      System.out.println("**  => getRequestURI => "+ request.getRequestURI());
      System.out.println("**  => getServerName => "+ request.getServerName());
      System.out.println("**  => getgetServerPort => "+ request.getServerPort());
      System.out.println("**  => getServletPath => "+ request.getServletPath());
       
      
   
   } // doGet

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   } // doPost

} //class