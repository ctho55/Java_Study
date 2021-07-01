package jdbcTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/slist02")
public class MVC2_03SList_JSTL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_03SList_JSTL() {
        super();
    }
// ** MVC2 , JSTL EL 적용 StudentList
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentService(); 
		List<StudentVO> list = new ArrayList<>();
		list = service.selectList();
		request.setAttribute("Banana", list);
		String uri = "mvcTest_jsp/mvc2_03sList_JSTL.jsp";
		request.getRequestDispatcher(uri).forward(request, response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}  //class
