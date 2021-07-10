package controllerF;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

// ** FrontController 패턴 1.
// => 대표 컨트롤러 1개만 서블릿으로 작성
//    나머지 컨트롤러는 일반 클래스로 작성
// => 모든 요청을 이 대표컨트롤러(FrontController) 가 받도록 함.

// => 요청에 대한 서비스를 if문으로 서블릿내에서 모두 처리
//    코드가독성, 모듈의 재사용성 떨어짐 
// => Factory 패턴
//    각각의 서비스를 일반클래스(컨트롤러)로 작성 Factory로부터 제공받음 

//@WebServlet(urlPatterns = { "*.do" })
// => @ 방식 또는 web.xml 방식 
public class Ex01_FrontBasic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ex01_FrontBasic() { super();  }

    BoardService service = new BoardService();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// 1. 요청(request) 분석
    	// => url 또는 uri 분석해서 요청명 확인
    	// => 한글처리 
    	request.setCharacterEncoding("utf-8");
    	String uri = request.getRequestURI();
    	// url : http://localhost:8080/Web01/life
    	// uri : Web01/life
    	String mappingName = uri.substring(uri.lastIndexOf("/"));
    	
    	System.out.println("** URL => "+request.getRequestURL());
    	System.out.println("** URI => "+uri);
    	System.out.println("** mappingName => "+mappingName);
    	
    	String message="~~ FrontController_Basic Test ~~";
    	uri = "index.jsp" ;
    	// 2. 해당 서비스 실행
    	if ("/blist.do".equals(mappingName)) {
    		// BoardList
    		List<BoardVO> list = service.selectList();
    		request.setAttribute("Banana", list);
    		uri = "/board/boardList.jsp" ;
    	}else if ("/bdetail.do".equals(mappingName)) {
    		// BoardDetail
    		BoardVO vo = new BoardVO();
    		vo.setSeq(Integer.parseInt(request.getParameter("seq")));
    		vo = service.selectOne(vo);
    		if (vo != null) {
    			request.setAttribute("Apple", vo);
    			uri = "/board/boardDetail.jsp" ;
    		}else {
    			message = "요청한 자료는 존재하지 않습니다 ~~" ;
    			uri = "blist.do" ;
    		}
    	} else  {
    		message = "요청한 요청명의 서비스는 존재하지 않습니다 ~~" ;
    	}
    	
    	// 3. View 처리
    	if (message != null) request.setAttribute("message", message);
		request.getRequestDispatcher(uri).forward(request, response);
    	
    } //doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	} 
} //class
