<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** MVC2 StudentList_JSTL **</title>
</head>
<body>
<h2>** MVC2 StudentList_JSTL **</h2>
<table border="1" width="800">
<tr bgcolor="aqua" height="30">
	<th>idNo</th><th>Name</th><th>성별</th><th>나이</th><th>Java</th><th>Html</th>
</tr>
<c:forEach var="list" items="${Banana}">
<tr height="30">
	<td>${list.idno}</td>
	<td>${list.name}</td>
	<td>${list.gender}</td>
	<td>${list.age}</td>
	<td>${list.java}</td>
	<td>${list.html}</td>
</tr>
</c:forEach>
</table>
</body>
</html>