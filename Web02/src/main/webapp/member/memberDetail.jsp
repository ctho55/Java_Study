<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 memberDetail **</title>
</head>
<body>
<h2>** Web MVC2 memberDetail **</h2>
<table>
<tr height="40">
	<td bgcolor="Lavender">I  D</td>
	<td>${Apple.id}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Password</td>
	<td>${Apple.password}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Name</td>
	<td>${Apple.name}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Level</td>
	<td>${Apple.lev}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Birthday</td>
	<td>${Apple.birthd}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Point</td>
	<td>${Apple.point}</td>
</tr>
<tr height="40">
	<td bgcolor="Lavender">Weight</td>
	<td>${Apple.weight}</td>
</tr>
</table>

<hr>

<a href="/Web02/mdetail?jcode=U">내정보수정</a>&nbsp;&nbsp; 
<!-- ** 내정보수정
		=> 내정보 표시하는 폼이 출력(mdetail) -> 수정후, 수정버튼 -> 수정 서블릿 -->

<a href="/Web02/mdelete.jsp">회원탈퇴</a>
<a href="/Web02/index.jsp">HOME</a>



</body>
</html>