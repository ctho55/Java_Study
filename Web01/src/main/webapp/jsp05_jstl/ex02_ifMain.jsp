<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSTL if(조건분기) Test Main **</title> 
</head>
<body>
<pre><h2>
** JSTL if(조건분기) Test Main **
=> if, choose (java 의 switch ~ case)

1) if
=> test 속성에 EL 을 사용해서 조건지정
=> else 구문 없음

2) choose
=> if 문에 else 구문 없음을 보완 
=> java 의 switch ~ case
</h2></pre>
<hr>
<%-- 
<% // Java Code 와 비교해 보세요 ~~
	String color = request.getParameter("color");
	if (color.equals("1")) %>
		<span style="color:Red;">~~ Red 선택 ~~</span>
<%  else if (color.equals("2")) %>
		<span style="color:Green;">~~ Green 선택 ~~</span>		
   ........ --%>

** if Tag Test =>  
<c:if test="${param.color==1}">
	<span style="color:Red;">~~ Red 선택 ~~</span>
</c:if>
<c:if test="${param.color==2}">
	<span style="color:Green;">~~ Green 선택 ~~</span>
</c:if>
<c:if test="${param.color==3}">
	<span style="color:Blue;">~~ Blue 선택 ~~</span>
</c:if>
<c:if test="${param.color==4}">
	<span style="color:Yellow;">~~ Yellow 선택 ~~</span>
</c:if>
<c:if test="${param.color==5}">
	<span style="color:hotPink;">~~ E R R O R ~~</span>
</c:if>
<br>
** choose Tag Test =>
<c:choose>
	<c:when test="${param.color==1}">
		<span style="color:Red;">~~ Red 선택 ~~</span>
	</c:when>
	<c:when test="${param.color==2}">
		<span style="color:Green;">~~ Green 선택 ~~</span>
	</c:when>
	<c:when test="${param.color==3}">
		<span style="color:Blue;">~~ Blue 선택 ~~</span>
	</c:when>
	<c:when test="${param.color==4}">
		<span style="color:Yellow;">~~ Yellow 선택 ~~</span>
	</c:when>
	<c:otherwise>
		<span style="color:hotPink;">~~ E R R O R ~~</span>
	</c:otherwise>
</c:choose>

</body>
</html>