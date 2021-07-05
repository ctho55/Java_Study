<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bdetail.jsp</title>
</head>
<body>

	<table>
		<tr height="40">
			<td bgcolor="Lavender">Seq</td>
			<td>${Apple1.seq}</td>
		</tr>
		<tr height="40">
			<td bgcolor="Lavender">Title</td>
			<td>${Apple1.title}</td>
		</tr>
		<tr height="40">
			<td bgcolor="Lavender">ID</td>
			<td>${Apple1.id}</td>
		</tr>
		<tr height="40">
			<td bgcolor="Lavender">content</td>
			<td>${Apple1.content}</td>
		</tr>
		<tr height="40">
			<td bgcolor="Lavender">regdate</td>
			<td>${Apple1.regdate}</td>
		</tr>
		<tr height="40">
			<td bgcolor="Lavender">cnt</td>
			<td>${Apple1.cnt}</td>
		</tr>

	</table>
	<hr>
	<c:if test="${loginID == Apple.id}">
		<a href="/Web02/bdetail?seq=${Apple.seq}&jcode=U">글수정</a>
		<a href="/Web02/bdelete?seq=${Apple.seq}">글삭제</a>
	</c:if>
	<a href="/Web02/binsertf">새글등록</a>
	<a href="/Web02/logout">Logout</a>
	<br>
	<hr>
	
	<a href="/Web02/blist">bList</a>
	<a href="/Web02/index.jsp">HOME</a>
	
	<c:if test="${not empty message}">
  ${message} <br>
	</c:if>
</body>
</html>