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

@WebServlet("/slist01")
public class MVC2_sList01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_sList01() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// sList 요청 : MVC 패턴2
	// => Controller 와 View 가 분리됨.
	// => Service 처리결과 보관 -> setAttribute 
	//    출력할 View 로 제어(역할)를 넘김-> forward 	
	// 1) Service 처리
	StudentService service = new StudentService();
	List<StudentVO>	list = new ArrayList<StudentVO>();
	list = service.selectList();
	
	// 2) 결과 처리	
	request.setAttribute("Banana", list);
	String uri = "mvcTest/mvc2_sList01.jsp" ;
	request.getRequestDispatcher(uri).forward(request, response);
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
