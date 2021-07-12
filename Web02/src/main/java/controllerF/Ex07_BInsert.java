package controllerF;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardService;
import vo.BoardVO;

// ** Board Insert 
// => binsert.do
public class Ex07_BInsert implements Ex04_Controller {
   
   @Override
   public String doUser(HttpServletRequest request, HttpServletResponse response) {
      // 1. Request 처리
      // => 한글처리 ( FrontController 에서 ), Parameter 처리
      BoardService service = new BoardService();
      BoardVO vo = new BoardVO();
      
      vo.setId(request.getParameter("id"));
      vo.setTitle(request.getParameter("title"));
      vo.setContent(request.getParameter("content"));
      
      // 2. Service
      if (service.insert(vo) > 0) {
         request.setAttribute("message","~~ insert success ~~");
         return "/blist.do" ;
      }else {
         request.setAttribute("message","~~ insert success ~~");
         return "/board/binsertForm.jsp" ;
      }
   } // doUser

} //class