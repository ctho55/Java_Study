<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 BoardDetail **</title>
<link rel="stylesheet" type="text/css" href="./myLib/myStyle.css">
</head>
<body>
<h2>** Web MVC2 BoardDetail **</h2>
<table>
	<tr height="40"><td bgcolor="SkyBlue">Seq</td>
		<td>${Apple.seq}</td></tr>
	<tr height="40"><td bgcolor="SkyBlue">Id</td>
		<td>${Apple.id}</td></tr>
	<tr height="40"><td bgcolor="SkyBlue">Title</td>
		<td>${Apple.title}</td></tr>	
	<tr height="40"><td bgcolor="SkyBlue" >Content</td>
		<td><textarea rows="10" cols="40" readonly>${Apple.content}</textarea></td>
	</tr>
	<tr height="40"><td bgcolor="SkyBlue">Regdate</td>
		<td>${Apple.regdate}</td></tr>
	<tr height="40"><td bgcolor="SkyBlue">Count</td>
		<td>${Apple.cnt}</td></tr>
</table>

<c:if test="${message!=null}">
<hr>
=> ${message}
</c:if>
<br><hr>
<!--** 로그인 했는지 ..
 	** 글쓴이(Apple.id) 와 글보는이(loginID) 가 동일인 인지 .. 
 	=> 표시 되는 메뉴가 달라져야 함 -->
<c:if test="${loginID!=null}"> 	
  <c:if test="${loginID==Apple.id}">
	<a href="/Web02/bdetail?seq=${Apple.seq}&jcode=U">글수정</a>&nbsp;
	<a href="/Web02/bdelete?seq=${Apple.seq}">글삭제</a>&nbsp;
  </c:if>
	<a href="/Web02/board/binsertForm.jsp">새글등록</a>&nbsp;
	<a href="/Web02/logout">Logout</a>&nbsp;
	<br><hr>
</c:if>  
<a href="/Web02/blist">bList</a>&nbsp;
<a href="/Web02/index.jsp">HOME</a>
</body>
</html>