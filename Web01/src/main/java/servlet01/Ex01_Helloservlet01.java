package servlet01;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//*** HttpServlet 계층도
// Object -> GenericServlet (A) -> HttpServlet (A)

// => GenericServlet 이 구현한 interface 
//  public abstract class GenericServlet implements Servlet, ServletConfig, java.io.Serializable

 
@WebServlet("/hellos")
public class Ex01_Helloservlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex01_Helloservlet01() {
        super();
        // TODO Auto-generated constructor stub
    } 

    
    
    
    // 클라이언트의 요청에 자동반응하는 이벤트 드리븐 방식으로 작동
    // 요청방식 이 Get -> doGet , Post -> doPost
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		
		// 한글 처리
		response.setContentType("text/html; charset=UTF-8");
		// 출력객체 생성
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1 style ='color:blue;'> **Hello servlet!! ** </h1>");
		out.print("<h1 style ='color:red;'> **Hello servlet!! ** </h1>");
		out.print("<h1>** Servlet은 java coding 매우편리 </h1>");
		out.print("<h1 >** 그러나 view작성 (Html coding) 매우 불편~~ </h1>");
		out.print("<body><html>");
		
	} // do get

	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	} // dopost 

}
