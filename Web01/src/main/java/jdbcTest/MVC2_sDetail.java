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

@WebServlet("/sdetail")
public class MVC2_sDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MVC2_sDetail() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// sdeatil 요청 : MVC 패턴2
	// => Controller 와 View 가 분리됨.
	// => Service 처리결과 보관 -> setAttribute 
	//    출력할 View 로 제어(역할)를 넘김-> forward 	
	// 1) Service 처리
	StudentService service = new StudentService();
	StudentVO vo = new StudentVO();
	// 검색 하려는 Data 의 Key(idNo) 값을 vo 에 set
	// => test idNo : 030213-3039444  
	vo.setIdno("130213-3039444");
	vo = service.selectOne(vo);
	
	// 2) 결과 처리	
	request.setAttribute("Apple", vo);
	String uri = "mvcTest/mvc2_sDetail.jsp" ;
	request.getRequestDispatcher(uri).forward(request, response);
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
