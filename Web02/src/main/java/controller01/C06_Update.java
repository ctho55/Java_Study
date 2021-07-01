package controller01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import vo.MemberVO;

/**
 * Servlet implementation class C04_Insert
 */
@WebServlet("/mupdate")
public class C06_Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C06_Update() {
        super();
    }

  //** Member Join
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. request 처리
		// => Parameter -> vo 에 set
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "";
		String message = null;
		
		request.setCharacterEncoding("utf-8");
		vo.setId(request.getParameter("id")); 
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setLev(request.getParameter("lev"));
		vo.setBirthd(request.getParameter("birthd"));
		vo.setPoint(Integer.parseInt(request.getParameter("point")));
		vo.setWeight(Float.parseFloat(request.getParameter("weight")));
		
		//2. Service
		
		if(service.update(vo)>0) {
			//수정성공 => list 출력하기
			message="~~ 정보 수정 성공";
			uri="/mlist";
		}else {
			//수정실패 => 다시 수정하기 (수정가능한 폼 출력 )
			message="~~ 정보수정 실패!! 다시 하세요";
			uri="/mdetail?jcode=U";
		}
		
		//3. View = forward
		
	    request.setAttribute("message", message);		
		request.getRequestDispatcher(uri).forward(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
