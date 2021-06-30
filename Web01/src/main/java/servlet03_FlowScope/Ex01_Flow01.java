package servlet03_FlowScope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/flow01")
public class Ex01_Flow01 extends HttpServlet {
   private static final long serialVersionUID = 1L;
   
// ** PageFlow
// => 서버내에서 웹페이지(Html, Jsp) 또는 Servlet 간의 이동   
// => 서버외 : 클라이언트의 요청으로 이동 ( a Tag , submit 등 )    
// => 경우
//    servlet -> servlet
//    servlet -> jsp , html
//    jsp -> jsp   

// ** Forward 와 Redirect
// * Forward : 웹브라우져의 주소창이 안바뀜
//    => 현재의 요청에 대해 서버내에서 page만 이동함.
// * Redirect: 웹브라우져의 주소창이 바뀜
//     => 현재의 요청에 대해 응답 -> 재요청 -> 처리
       
    public Ex01_Flow01() {
        super();
    }
 
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   // ** 1. Forward
   // => 서버내에서 출력될 결과 웹페이지가 바뀜   
   // => 웹브라우져에 표시된 요청명은 flow01 이지만 실행된 화면은 hellos
      
   // 1.1) Servlet -> Servlet
   // => 서블릿은 매핑네임 으로 요청   
      String uri = "hellos" ;
      System.out.println("** Forward Test 1.1) Servlet -> Servlet **");
      
      // response 의 한글처리 필요함.
      response.setContentType("text/html; charset=utf-8");
      
      // 아래 구문은 웹브라우져에 출력되지않고 forward 함. 
      PrintWriter out = response.getWriter();
      out.print("<h2>** Forward Test !!! **</h1>");
      
   // 1.2) Servlet -> Jsp, Html
   // => Jsp, Html 은 wepapp 다음 폴더부터 경로 적용하면 됨.    
      uri = "servletTestForm/form01_Adder.html";
      
      //RequestDispatcher dis = request.getRequestDispatcher(uri);
      //dis.forward(request, response) ;
      //request.getRequestDispatcher(uri).forward(request, response);
      
   // ** 2. Redirect
   // => 재요청 처리 
   //    첫번째 요청 flow01 에서 hellos 라는 요청을 다시 보내줄것을 웹브라우져에게 response 함.
   //    재요청으로 hellos 가 서버로 전달되어 처리하는 방식   
   // => 그러므로 웹브라우져에 표시된 요청명이 hellos 로 변경됨   
   // 2.1) Servlet -> Servlet
      System.out.println("**  Test 2) Redirect  Servlet -> Servlet **");      
      uri = "hellos" ;
      
   // 2.2) Servlet -> Jsp, Html   
      uri = "servletTestForm/form03_Check.jsp" ;
      response.sendRedirect(uri);
   
   } //doGet

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   } //doPost

} //class