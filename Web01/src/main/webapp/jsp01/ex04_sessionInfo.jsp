<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%-- 
<%@ page import="java.text.SimpleDateFormat, java.util.Date" %>  
일반적으로 많이 이용됨 --%> 

<%@ page import="java.text.SimpleDateFormat" %>   
<%@ page import="java.util.Date" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Session Info **</title>
</head>
<body>
<%	// java 와 동일하게 import 가능함
	SimpleDateFormat formatter = new 
	SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date now = new java.util.Date();
%>
<pre><h2>
** Session Info JSP **

* Session_ID : <%=session.getId()%>

* Now : <%=formatter.format(now)%>
<% now.setTime(session.getCreationTime()); %>
* CreationTime : <%=formatter.format(now)%>
<% now.setTime(session.getLastAccessedTime()); %>
* LastAccessedTime : <%=formatter.format(now)%>
</h2></pre>

</body>
</html>