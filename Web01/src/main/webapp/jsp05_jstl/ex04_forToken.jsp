<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** forTocken & PageFlow (import, redirect) **</title>
</head>
<body>
<h2><pre>
** 1. Tockens
=> 구분자로 분리된 각각의 토큰을 처리할때 사용됨
=> test 1.1) 단일 구분자 
	<c:forTokens var="menu" items="짜장면. 짬뽕, 쌀국수, 김밥, 떡볶이" delims=",">
		${menu},&nbsp;
	</c:forTokens>
=> test 1.2) 복수 구분자 
	<c:forTokens var="menu" items="짜장면. 짬뽕, 쌀국수, 김밥, 떡볶이"  delims=",.">
		${menu},&nbsp;
	</c:forTokens>

** improt (WebPage가 포함됨)
=> JSP: iclude 와 동일 
   (즉, 실행결과 Page가 포함되므로 변수 공유 불가 )
----------------Before-----------------------------------------------------------------
<%-- <c:import url="ex02_ifForm.jsp" /> --%>
<c:import var="iform" url="ex02_ifForm.jsp" />
${iform} &nbsp;
----------------After---------------------------------------------------------------

** 3. redirect
=> response.sendRedirect() 와 동일 
=> 웹브라우져의 주소창의 url이 변경됨 
<%-- <c:redirect url="ex03_for01.jsp"/> --%>

** 4.url
=> Value 를 url 로 인식 시켜줌 
=> test 4.1) a_Tag Link
	<c:url var="test" value="ex03_for01.jsp"/>
	test = ${test} <br>
	<a href="${test}">urlTest</a>
=> test 4.2) image 
	<c:url var="iname" value="../image/aaa.gif" />
	<img src="${iname}" width="200" height="300">

</pre></h2>
</body>
</html>