<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 Board Insert **</title>
<link rel="stylesheet" type="text/css" href="./myLib/myStyle.css">
</head>
<body>
<h2>** Web MVC2 Board Insert_FrontController Test **</h2>
<!-- <table><form action="/Web02/binsert" method="get"> -->
<!-- FrontController Test -->
<table><form action="/Web02/binsert.do" method="get">
   <tr height="40"><td bgcolor="Silver">Id</td>
      <td><input type="text" name="id" value="${loginID}" readonly></td></tr>
   <tr height="40"><td bgcolor="Silver">Title</td>
      <td><input type="text" name="title"></td></tr>   
   <tr height="40"><td bgcolor="Silver" >Content</td>
      <td><textarea name="content" rows="10" cols="40"></textarea></td>
   </tr>
   <tr height="40"><td></td>
      <td><input type="submit" value="전송">&nbsp;&nbsp;
         <input type="reset" value="취소">
      </td>
   </tr>
</form></table>

<c:if test="${message!=null}">
<hr>
=> ${message}
</c:if>
<br><hr>
<a href="/Web02/blist">bList</a>&nbsp;
<a href="/Web02/index.jsp">HOME</a>
</body>
</html>