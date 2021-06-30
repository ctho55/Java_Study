<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*, jdbcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** MVC2_Student Detail_EL **</title>
</head>
<body>
<h2>** MVC2_Student Detail_EL **</h2>
<table>
<tr><th bgcolor="aqua">IdNo</th><td>${Apple.idno}</td></tr>
<tr><th bgcolor="aqua">Name</th><td>${Apple.name}</td></tr>
<tr><th bgcolor="aqua">성별</th><td>${Apple.gender}</td></tr>
<tr><th bgcolor="aqua">나이</th><td>${Apple.age}</td></tr>
<tr><th bgcolor="aqua">Java</th><td>${Apple.java}</td></tr>
<tr><th bgcolor="aqua">Html</th><td>${Apple.html}</td></tr>
</table>
<br><hr><br>
Student Not Found : ${empty Apple} <br>
Exception Code : ${Error} <br>
=> Servlet 에서 Exception 을 처리하는 경우 전달됨.<br>
</body>
</html>