<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web02 MVC2 BoardList **</title>
<link rel="stylesheet" type="text/css" href="./myLib/myStyle.css">
</head>
<body>
<h2>** Web02 MVC2 BoardList **</h2>
<br>
<c:if test="${message!=null}">
 => ${message}<br> 
</c:if>
<hr>
<table>
<tr height="40" bgcolor="PaleTurquoise">
	<th>Seq</th><th>Title</th><th>ID</th><th>RegDate</th><th>조회수</th>
</tr>
<c:forEach var="list" items="${Banana}"><tr height="40">
	<td>${list.seq}</td>
	<!-- 로그인 했을때만 글내용을 볼 수 있도록 -->
	<td><%-- <c:if test="${loginID!=null}">
			<a href="/Web02/bdetail?seq=${list.seq}&id=${list.id}">${list.title}</a>
		</c:if> --%>
		<a href="/Web02/bdetail.do?seq=${list.seq}">${list.title}</a>
		<c:if test="${loginID==null}">
			${list.title}
		</c:if>
	</td>
	<td>${list.id}</td><td>${list.regdate}</td><td>${list.cnt}</td>
</tr></c:forEach>
</table>
<br><hr>
<c:if test="${loginID!=null}"> 	
	<a href="/Web02/board/binsertForm.jsp">새글등록</a>&nbsp;&nbsp;
	<a href="/Web02/logout">Logout</a>&nbsp;&nbsp;
</c:if>  
<c:if test="${loginID==null}"> 
	<a href="/Web02/member/loginForm.jsp">로그인</a>&nbsp;&nbsp;
	<a href="/Web02/member/joinForm.jsp">회원가입</a>&nbsp;&nbsp;
</c:if>
<a href="/Web02/index.jsp">HOME</a>
</body>
</html>