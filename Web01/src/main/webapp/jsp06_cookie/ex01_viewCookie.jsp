<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** View Cookies **</title>
</head>
<body>
<h2><pre>
** View Cookies **
=> request 객체에 담겨진 쿠키목록 확인
=> 웹 브라우져는 request 의 header 에 쿠키의 값을 담아보냄
=> request.getCookies() : 배열타입이며 없으면 null
<hr>
=> Cookie List
<%
	Cookie[] ck = request.getCookies();
	if ( ck!=null && ck.length>0 ) {
		for (int i=0; i<ck.length; i++) {
			out.print("** Name : "+ck[i].getName());
			out.print(", Value : "+ck[i].getValue()+"<br>");
		} //for
	}else{
		out.print("** Cookie Not Found **");
	}
%>
<hr>
=> <a href="ex02_makeCookie.jsp">MakeCookies</a>
=> <a href="ex03_upDelCookie.jsp">UpDelCookies</a>
</pre></h2>

</body>
</html>