package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



// ** @ Annotation , 애노테이션 
// 컴파일러에게 알려줌

// ** @WebServlet 
// => url 매핑네임 을 알려줌 
// => 복수 선언가능 (배열의 형태로)
// => 단, 중복되면 절대 안됨: Server가 Start가 안됨..
// => 한글은 가능은 하지만 비추 
// => web.xml (설정파일)에 설정할수도 있음. 
// => 두 방벙느 각각 장단점이 있으므로 용도에 맞게 선택함 
//  ( @ 은 수정시 재컴파일이 필요, web.xml 은 재컴파일이 필요하지 않아, xml 문을 익혀야함, 등 )


//@WebServlet("/Ex02_GuGu")// 단수 
@WebServlet(urlPatterns = {"/GUGU","/구구"})// 복수 
public class Ex02_GuGu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ex02_GuGu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 처리
				response.setContentType("text/html; charset=UTF-8");
				// 출력객체 생성
				PrintWriter out = response.getWriter();
				out.print("<html><body>");
				out.print("<h1 style ='color:blue;'> 구구단을 외자  </h1>");
				
				for(int i= 1; i<=9 ; i++) {
					for(int j =1 ; j<=9 ; j++) {
					
						out.printf("%d x %d = %d &nbsp",i,j,i*j);
						
					}//for j
					out.print("<br>");
				}//fot i
				
				out.print("<body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

} // class
