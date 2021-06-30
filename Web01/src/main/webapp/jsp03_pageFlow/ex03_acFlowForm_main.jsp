<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSP Page Flow Test **</title>
</head>
<body>
<pre><h2>
 ** JSP Page Flow ** 
=>  ex03_acFlowFor.jsp 에서 전달된 값을 이용해서 Forward 또는 Redirect 테스트 
=>  this page는 출력 될까요 ? 
	(처리만 할뿐 , 출력되지는 않음)
=> 웹 페이지 이동(전환) 방법
	1)  JavaCode : forward, redirect
	2)  jsp ActionTag : forward만 가능 
	3)  JSTL : redirect 다음주에.. 
	4)  HTML : meta Tag 로 
    <!-- <meta charset="UTF-8" http-equiv="refresh" 
                  content="3;url=ex02_includeMain.jsp"> -->

=> Test 1) JavaCode  	
<%
int pagecode = Integer.parseInt(request.getParameter("page"));

String uri = "";
String radio = request.getParameter("send");
switch (pagecode) {
// Server 내에서 경로설정이 다르기 때문에 서블릿으로 이동하는 경우
// 1번은 redirect 로, 2번은 forward로 Test 
case 1:
	uri = "/Web01/hellos";
	break;
case 2:
	uri = "/GUGU";
	break;
case 3:
	uri = "../servletTestForm/form03_Check.jsp";
	break;
case 4:
	uri = "../servletTestForm/form04_Select.jsp";
	break;
default: out.print("Pagecode를 정확하게 선택하지 안하였습니다"); break;
}
/*  if (radio.equals("fo")) {

	out.print("** Forward Test !!! **");
	request.getRequestDispatcher(uri).forward(request, response);
} else if (radio.equals("re")) {
	out.print("** Redirect Test !!! **");
	response.sendRedirect(uri);
}  */	

%>
************************************************************************
2)  Test 2) jsp ActionTag : forward  
<jsp:forward page="<%=uri%>" />

=> 주소창에는 ex03_FlowMain.jsp 가 표시됨
************************************************************************




</h2></pre>

</body>
</html>