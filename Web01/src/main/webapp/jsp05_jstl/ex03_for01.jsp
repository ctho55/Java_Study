<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSTL Loop(forEach) Test **</title>
<%
String[] students = { "안세영", "방혜원", "신동혁", "박선민", "고연서", "박영민", "이지은" };
pageContext.setAttribute("sList", students);
%>

</head>
<body>
	<pre>
		<h2>
** JSTL Loop(forEach) Test **
1) forEach 구문 기본형식 
=> java 의 forEach 와 유사
	for(Stirng s:students){ ... }
	
<c:forEach var="sname" items="${sList}">
	<%-- ${sname} , --%>
	<c:out value="${sname}"></c:out>,
</c:forEach>	
<hr>

2) varStatus 속성 활용
=> index, count, first, last
<table border="1" style="text-align: center; width: 100%">
<tr>
	<th>Name</th>
					<th>Index</th>
					<th>Count</th>
					<th>First</th>
					<th>Last</th>
</tr>
<c:forEach var="sname" items="${sList}" varStatus="vs">
	<tr>
						<td>${sname}</td>
						<td>${vs.index}</td>
						<td>${vs.count}</td>
						<td>${vs.first}</td>
						<td>${vs.last}</td>
	</tr>
</c:forEach>
</table>
<hr>
3) varStatus 속성 first, last 활용
=> first, last : boolean Type
=> for, if 중첩 구문 
=> 실습과제 
   .first는 굵은 파랑으로 출력 
   .ul li를 이용해서 출력 하면서 이름뒤에 쉼표 ,
   . 단, 마지막에는 마침표 표시

<table>
** if test <br>
<ul>
  <c:forEach var="sname" items="${sList}" varStatus="vs">
	 <c:if test="${vs.first}">
		<li style="color: blue; font-weight: bold;"> ${sname},</li> 
	 </c:if>
	 <c:if test="${vs.first == false && vs.last == false}">
		<li> ${sname}, </li> 
	 </c:if>
	 <c:if test="${vs.last}">
		<li style="color: yellow;"> ${sname}.</li> 
	 </c:if>
	
  </c:forEach>
</ul>
</table>

** choose test <br>
<table>
<ul>
	<c:forEach var="sname" items="${sList}" varStatus="vs">
<c:choose>
	<c:when test="${vs.first}">
		<li style="color: blue; font-weight: bold;"> ${sname},</li>
	</c:when>
	<c:when test="${vs.last}">
		<li style="color: yellow;"> ${sname}.</li> 
	</c:when>
	<c:otherwise>
		<li> ${sname}, </li> 
	</c:otherwise>
</c:choose>
	</c:forEach>
</ul>
</table>




</h2>
	</pre>


</body>
</html>