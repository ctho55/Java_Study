package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex03_GetPost
 */
@WebServlet("/Ex03_GetPost")
public class Ex03_GetPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ex03_GetPost() {
		super();
		// TODO Auto-generated constructor stub
	}

	// **Get request 의 header 영역의 url에 쿠리스트링으로 전달 (512 byte 이내)
	// **Post: request의 body영역에 담겨져서 전달(크기제한 없음, 보안성)

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request(전달되어진 요청값) 처리
		// Get 방식에서는 default "UTF-8" 로 처리하기 때문에
		// (html 문서에서 "UTF-8" 작성되었고, )

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		// response 처리 : view 작성 & 전송
		// 1) 한글 처리
		response.setContentType("text/html; charset=UTF-8");
		// ** response 타입 지정
		// => 웹브라우져에게 처리할 데이터의 MIME 타입을 알려줌
		// => MIME : Multipurpose Internet Mail Extensions
		// => 데이터 송.수신시 자료의 형식에 대한 정보
		// => Jsp 의 page 디렉티브의 contentType 속성값과 동일

		// 출력객체 생성
		PrintWriter out = response.getWriter();
		// 3) view 작성
		out.print("<html><body><h2>");
		out.print("** Get 방식 TEST ** <br>");
		out.print("** your info ** <br>");
		out.print("** I D : **" + id + " <br>");
		out.print("** Name : **" + name + " <br>");
		out.print("</h2></body></html>");

	}// doget

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// request(전달되어진 요청값) 처리
		// ** 한글처리 필요함
		// => Paramerter 처리전에 처리해야함.

		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		// response 처리 : view 작성 & 전송
		response.setContentType("text/html; charset=UTF-8");

		PrintWriter out = response.getWriter();

		// 3) view 작성 & 전송
		out.print("<html><body><h2>");
		out.print("** post 방식 TESt ** <br>");
		out.print("** your info ** <br>");
		out.print("** I D : **" + id + " <br>");
		out.print("** Name : **" + name + " <br>");
		out.print("</h2></body></html>");

	}// dopost

}
