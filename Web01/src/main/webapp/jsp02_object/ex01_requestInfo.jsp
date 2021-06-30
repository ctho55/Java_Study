<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Request Information **</title>
</head>
<body>
<pre><h2> ** Request Information **
Jsp Object Test
=> Web 기본 객체 
=> Jsp에서 별도 선언 없이 바로 사용가능 


* ContextPath => <%=request.getContextPath() %>
* getMethod => <%=request.getMethod() %>
* RequestUrL => <%=request.getRequestURL() %>
* RequestURI => <%=request.getRequestURI() %>
* ServerName => <%=request.getServerName() %>
* SeverPort => <%=request.getServerPort() %>
* ServletPath => <%=request.getServletPath() %>

</h2></pre>


</body>
</html>