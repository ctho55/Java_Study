package controllerF;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//** FrontController 패턴 2.
//=> Factory 패턴 적용
//   - ServiceFactory
//   - 개별컨트롤러(일반클래스) : 일관성을 위해 강제성 부여 ( interface 사용 )

//@WebServlet("/Ex02_FrontController")
public class Ex02_FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex02_FrontController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 요청(request) 분석
    	// => url 또는 uri 분석해서 요청명 확인
    	// => 한글처리 
    	request.setCharacterEncoding("utf-8");
    	String uri = request.getRequestURI();
    	String mappingName = uri.substring(uri.lastIndexOf("/"));
    	uri = "index.jsp" ;
	
    	// 2. 해당 서비스 실행
    	// => ServiceFactory 에 요청

    	// ** 싱글톤 Test 위해 다음의 주소 비교 
    	// => ServiceFactory 에 싱글톤 적용전.후 비교
    	
    	// 적용전 : 모두 서로 다른 주소 
    	//Ex03_ServiceFactory sf= new Ex03_ServiceFactory() ;
    	// 적용후 : 모두 서로 같은 주소 
    	Ex03_ServiceFactory sf= Ex03_ServiceFactory.getInstance() ;
    	
    	Ex03_ServiceFactory sf1= Ex03_ServiceFactory.getInstance() ;
    	Ex03_ServiceFactory sf2= Ex03_ServiceFactory.getInstance() ;
    	System.out.println("sf=>"+sf);
    	System.out.println("sf1=>"+sf1);
    	System.out.println("sf2=>"+sf2);
    	
    	Ex04_Controller controller = sf.getController(mappingName) ;
    	if ( controller!=null) {
    		uri = controller.doUser(request, response);
    	}else request.setAttribute("message", "~~ 없는 요청 입니다 ~~") ;
    	
    	// 3. View 처리
    	request.getRequestDispatcher(uri).forward(request, response);
	
	} //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

} //class
