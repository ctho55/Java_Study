package servlet01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex04_LifeCycle
 */
@WebServlet("/Ex04_LifeCycle")
public class Ex04_LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int cno = 1; // 생성자 매서드 호출 횟수
	int ino = 1; // intit() 호출 횟수
	int dno = 1; // destory() 매서드 호출 횟수
	int gno = 1; // doGet() 매서드 호출 횟수

	// 생성 (메모리에load) : 서버 스타트 후 첫요청 들어오면 자동생성
	public Ex04_LifeCycle() {
		super();
		System.out.println("** 생성자 메서드 호출 횟수 =>" + cno++);
	}

	// init() : 인스턴스 생성직후 자동호출
	public void init() throws ServletException {
		System.out.println("** init() 메서드 호출 횟수 =>" + ino++);
	}

	// destory(메모리에서 소멸) : 서버종료시 (모든자원 close) 
	public void destroy() {
		System.out.println("** destroy() 메서드 호출 횟수 =>" + dno++);
	}

	// doGet : 클라이언트로부터 Get 요청이 들어왓을때 자동 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h2> ** servlet LifeCycle Test ** </h2>");
		out.print("<pre><h2>");
		out.print("** 현재시간: "+ new Date());
		out.print("** doget() 메서드 호출 횟수 => "+ gno );
		out.print("</h2></pre>");
		System.out.println("** doget() 메서드 호출 횟수 =>" + gno++);
		
	}// doget

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}// dopost

}
