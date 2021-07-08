package controller01;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberService;
import vo.LoginVO;
import vo.MemberVO;

@WebServlet("/login2")
public class C01_Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public C01_Login2() {
        super();
    }
 // ** Login
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ** 준비
		MemberService service =  new MemberService();
		MemberVO mvo = new MemberVO();
		LoginVO vo = new LoginVO();
		String uri = "/member/loginForm2.jsp";		
		String message = null;
		Date now = new Date();
		SimpleDateFormat formatter = new 
	            SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		mvo.setId(id);
		mvo = service.selectOne(mvo);
		
		if (mvo != null) {
			if ( mvo.getPassword().equals(password)) {
				vo.setId(mvo.getId());
				vo.setName(mvo.getName());
				vo.setLev(mvo.getLev());
				now.setTime(session.getCreationTime());
				vo.setRegdate(formatter.format(now));
				// vo.setregdate(request.getSession().getCreationTime()+"")
				
				
				request.getSession().setAttribute("userid",vo.getId());
				request.getSession().setAttribute("username",vo.getName());
				request.getSession().setAttribute("userlev",vo.getLev());
				request.getSession().setAttribute("usersessiontime",vo.getRegdate());
				
				uri ="/index.jsp" ;
			}else {
				message = "~~ password 오류 !!! 다시 하세요 ~~" ;
			}
			message = "~~ id 오류 !!! 다시 하세요 ~~" ;
		}

		if (message != null) request.setAttribute("message", message);
		request.getRequestDispatcher(uri).forward(request, response);
	
	
	} //doGet
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
} //class
