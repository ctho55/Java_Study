package servlet03_FlowScope;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Ex03_SessionInfo")
public class Ex03_SessionInfo extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public Ex03_SessionInfo() {
        super();
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 1. Session 생성 
      HttpSession session = request.getSession();
      
      // 2. Session info 출력
      SimpleDateFormat formatter = new 
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      Date now = new Date();
      
      response.setContentType("text/html; charset=utf8");
      PrintWriter out = response.getWriter();
      out.print("<pre><h2>");
      out.println("** Session Info **");
      out.println("** Session ID => "+session.getId());
      // 클라이언트 접속시 서버가 자동으로 생성하는 session_id
      // 3EA4EC5F32C3477626F83102DBDBE8E6  
      
      // Test 1) 세션 생성시간 과 session_id
      out.println("** now => "+formatter.format(now));
      // 세션 생성시간
      now.setTime(session.getCreationTime()); 
      out.println("** creationTime => "+formatter.format(now));
      // session 의 마지막 접근시간 
      now.setTime(session.getLastAccessedTime()); 
      out.println("** LastAccessedTime => "+formatter.format(now));
      out.print("</h2></pre>");
      
      // Test 2) 세션시간 설정
      // => session 의 유효시간 (초 단위) : 1시간 (60*60)
      // => 설정화일 (web.xml) 에서도 설정 가능
      //    Tag session-config 의 subTag session-timeout 
      //session.setMaxInactiveInterval(10); // 10초
      
      // Test 3) 세션 강제종료
      session.invalidate();
      
      // Test1 => 새로고침 버튼 누르면, session_id 변경없고, now 와 Last... 만 변경됨
      // Test2 => 10초 후 새로고침 버튼 누르면, session_id 와 모두 변경됨
      // Test3 => 새로고침 버튼 누르면 무조건 session_id 와 모두 변경됨 
      
   } //doGet

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   } 
} //class