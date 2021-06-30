<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSP ActionTag Parameter Main **</title>
<% 
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	// form 없이 쿼리스트링으로 Test ?name="홍길동"
	String menu = "짜장면";
	int price = 6000 ;
	String special = "";
%> 
</head>
<body><h2>
<pre><h2>
** JSP ActionTag Parameter Main **
=> Before Data value 
	* name = <%=name%>
	* menu = <%=menu%>
	* price = <%=price%>
===========================================================
<jsp:include page="ex02_actionParamSub.jsp">
	<jsp:param value="<%=menu%>" name="menu"/>
	<jsp:param value="<%=price%>" name="price"/>
	<jsp:param value="탕수육" name="special"/>

</jsp:include>
===========================================================
=> After Data value 
	* name = <%=name%>
	* menu = <%=menu%>
	* price = <%=price%>
	* special = <%=special%>

</h2></pre>



</h2></body>
</html>