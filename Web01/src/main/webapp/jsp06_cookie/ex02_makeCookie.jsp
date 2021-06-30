<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Make Cookie **</title>
</head>
<body>
<h2><pre>
** Make Cookie **

=> Cookie 객체 생성 -> 생성자의 매개변수로 name, value 를 지정
=> response 에 담기
<%
	Cookie ck1 = new Cookie("MyCookie1","Green");
	response.addCookie(ck1);
	Cookie ck2 = new Cookie("MyCookie2","그린컴퓨터");
	// value 에 space 포함되면 Exception 발생
	response.addCookie(ck2);
%>
** 쿠키 확인 **
=> <a href="ex01_viewCookie.jsp">ViewCookies</a>
=> <a href="ex03_upDelCookie.jsp">UpDelCookies</a>


</pre></h2>

</body>
</html>