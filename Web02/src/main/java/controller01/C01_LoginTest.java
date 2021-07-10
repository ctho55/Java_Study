package controller01;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import vo.MemberVO;
import vo.UserVO;

@WebServlet("/logintest")
public class C01_LoginTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C01_LoginTest() {
        super();
    }
 // ** LoginTest
 // => UserVO Test (로그인 한 User 의 정보보관)
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ** 준비
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String uri = "/member/loginForm2.jsp";
		String message = "";
		// 1. Parameter 처리
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		// 2. Service
		// => id 가 맞는지 , password 가 맞는지
		// => 성공 : index
		//    실패 : loginForm2 으로 재로그인 유도
		vo.setId(id);
		vo = service.selectOne(vo);
		if (vo!=null) {
			// password 확인
			// => password 와 vo.getPassword() 비교
			if ( vo.getPassword().equals(password)) {
				// 로그인 성공
				// => 로그인 정보 보관, index 로
				UserVO user = new UserVO();
				user.setId(id);
				user.setName(vo.getName());
				user.setLev(vo.getLev());
				// 세션 생성시간 출력포맷 처리 : String Type
				SimpleDateFormat formatter = new 
						SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				user.setSctime(formatter.format(request.getSession().getCreationTime())); 
				
				// 세션 생성시간 처리 : Date Type
				user.setSctimeDate(new Date(request.getSession().getCreationTime()));
				
				request.getSession().setAttribute("loginUser",user);
				message = "~~ UserVO Test 중 !!! 정상 로그인 후 이용하세요 ~~" ;
				uri = "/index.jsp";
			}else {
				// password 오류 
				message = "~~ password 오류 !!! 다시 하세요 ~~" ;
			}
		}else {
			// id 오류
			message = "~~ id 오류 !!! 다시 하세요 ~~" ;
		}
		// 3. View 처리 : forward
		if (message != null) request.setAttribute("message", message);
		request.getRequestDispatcher(uri).forward(request, response);
	
	} //doGet
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
