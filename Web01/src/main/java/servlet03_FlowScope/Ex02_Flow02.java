package servlet03_FlowScope;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/flow02")
public class Ex02_Flow02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex02_Flow02() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// select태그 처리

		response.setContentType("text/html; charset=utf-8");
		int page = Integer.parseInt(request.getParameter("page"));

		String url = null;
		String radio = request.getParameter("send");
		switch (page) {

		case 1:
			url = "hellos";
			break;
		case 2:
			url = "gugu";
			break;
		case 3:
			url = "servletTestForm/form03_Check.jsp";
			break;
		case 4:
			url = "servletTestForm/form04_Select.jsp";
			break;
		default:
			break;

		}

		PrintWriter out = response.getWriter();

		// if ("f".equals(request.getParameter("send"))) {
		// ** NullPointExeption 예방
		// => request.getParameter("send")가 값이 없는경우 NullPointExeption 발생
		if (radio.equals("fo")) {

			out.print("<h2>** Forward Test !!! **</h1>");
			request.getRequestDispatcher(url).forward(request, response);
		} else if (radio.equals("re")) {
			out.print("<h2>** Redirect Test !!! **</h1>");
			response.sendRedirect(url);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
