<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 LoginForm Test **</title>
<link rel="stylesheet" type="text/css" href="./myLib/myStyle.css">
</head>
<body>
	<h2>** Web MVC2 LoginForm Test **</h2>

	<c:if test="${userid!=null}">
		<br>&nbsp;&nbsp;${username} 님 안녕하세요 ~~<br>
	========사용자정보===== <br>
	${userid} <br>
	${username} <br>
	${userlev} <br>
	${usersessiontime}
</c:if>


	<hr>
	<img src="./myimg/city.jpg" width="400" height="300">
	<hr>

	<c:if test="${userid==null}">
	<a href="/Web02/member/loginForm.jsp">로그인</a>&nbsp;&nbsp;
	<a href="/Web02/member/joinForm.jsp">회원가입</a>&nbsp;&nbsp;
		<a href="/Web02/member/loginForm2.jsp">user LoginTest</a>
</c:if>
	<c:if test="${userid != null }">
		<a href="/Web02/mdetail">MyInfo</a>&nbsp;&nbsp;
	<!--ㅡmdetail 에서는 loginID 를 이용해서 검색 -->
		<a href="/Web02/mdelete">회원탈퇴</a>
		<a href="/Web02/mlist">List</a>&nbsp;&nbsp;
	<a href="/Web02/logout">로그아웃</a>
		<a href="/Web02/blist">게시판[List]</a>
	</c:if>


</body>
</html>