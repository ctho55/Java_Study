<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%-- <%@ page errorPage="ex01_errorMessage.jsp" %>  --%>
<html>
<head>
<meta charset="UTF-8">
<title>** Exception Test Main **</title>
</head>
<body> 
<pre><h2>
=> test1) WebPage 별로 : WebPage의 page디렉티브에서 정의 
=> test2) 응답 상태코드별로 : web.xml
=> test3) Exception 별로 : web.xml 
=> test4) 에러처리의 우선순위
   1. 현재 Page : page 디렉티브의 errorPage
   2. Exception Type
   3. Error Code
</h2></pre>

<hr>
1)NullPointerException : Exception Type 
country : <%=request.getParameter("country").toString() %>

2)NumberFormatException : 상태코드 500 
NumberFormat : <%=Integer.parseInt(request.getParameter("country")) %>

3) ArithmeticException : Exception Type 
=> by zero 로 Test 
123 / 0 => <%=123/0 %>



</body>
</html>