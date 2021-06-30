package jdbcTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/slist")
public class MVC1_sList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC1_sList() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// sList 요청 : MVC 패턴1 -> Controller 와 View 가 분리되지 않음 
	// 1) Service 처리
	StudentService service = new StudentService();
	List<StudentVO>	list = new ArrayList<StudentVO>();
	list = service.selectList();
	
	// 2) 결과 출력_Vlew	
	response.setContentType("text/html; charset=utf-8");
	PrintWriter out = response.getWriter();
	out.print("<h2>*** StudentList MVC1_Servlet ***</h2>");
	for (StudentVO s:list) {
		out.print(  s+ "<br>") ;
	}
	
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
