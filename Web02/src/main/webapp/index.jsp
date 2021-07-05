<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 **</title>
<link rel="stylesheet" type="text/css" href="./myLib/myStyle.css">
</head>
<body>
<h2>** WebProgramming_MVC2 **</h2>
<c:if test="${loginID!=null}">
	<br>&nbsp;&nbsp;${loginName} 님 안녕하세요 ~~<br>
</c:if>
<c:if test="${not empty message}">
=> 	${message} <br>
</c:if>
<hr>
<img src="./myimg/city.jpg" width="400" height="300">
<hr>
<c:if test="${loginID!=null}">
	<a href="/Web02/mdetail">MyInfo</a>&nbsp;&nbsp;
	<!--ㅡmdetail 에서는 loginID 를 이용해서 검색 -->
	<a href="/Web02/mdelete">회원탈퇴</a>
	<a href="/Web02/mlist">List</a>&nbsp;&nbsp;
	<a href="/Web02/logout">로그아웃</a>
	<a href="/Web02/blist">게시판[List]</a>
</c:if>

<c:if test="${loginID==null}">
	<a href="/Web02/member/loginForm.jsp">로그인</a>&nbsp;&nbsp;
	<a href="/Web02/member/joinForm.jsp">회원가입</a>&nbsp;&nbsp;
	<!-- 게시판 추가 
			=> Table 작성, VO, DAO, Servicem, 서블릿, JSP  -->
	
</c:if>
</body>
</html>