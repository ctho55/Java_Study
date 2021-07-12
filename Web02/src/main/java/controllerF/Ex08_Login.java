package controllerF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberService;
import vo.MemberVO;

// ** Board Insert 
// => binsert.do
public class Ex08_Login implements Ex04_Controller {

	@Override
	public String doUser(HttpServletRequest request, HttpServletResponse response) {
		// 1. Request 처리
		// => 한글처리 ( FrontController 에서 ), Parameter 처리
		MemberService service = new MemberService();
		MemberVO vo = new MemberVO();
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		vo.setId(id);
		vo = service.selectOne(vo);
		if (vo!=null) {
			// password 확인
			// => password 와 vo.getPassword() 비교
			if ( vo.getPassword().equals(password)) {
				// 로그인 성공
				// => 로그인 정보 보관, index 로
				request.getSession().setAttribute("loginID",id);
				request.getSession().setAttribute("loginName",vo.getName());
				return  "/index.jsp";
			}else {
				// password 오류 
				request.setAttribute("message","~~ password 오류 !!! 다시 하세요 ~~"  );
				return "/member/loginForm.jsp";
			}
		}else {
			// id 오류
			request.setAttribute("message","~~ id 오류 !!! 다시 하세요 ~~" );
			return "/member/loginForm.jsp";
		}
		
	} // doUser

} // class