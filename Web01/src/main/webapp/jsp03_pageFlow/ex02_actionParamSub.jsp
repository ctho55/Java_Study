<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSP ActionTag Parameter Sub **</title>
</head>
<body>
<pre><h2>
** JSP ActionTag Parameter Sub **
=> request 의 Parameter 형식으로 전달됨 
   그러므로 requewst.getParameter("..")로 처리하면 됨 
=> 전달된 Main의 Data Value
	* name : <%= request.getParameter("name") %>
			( 클라이언트의 요청 Parameter : 유지됨을 확인 )
	* menu : <%=request.getParameter("menu") %>
	* price :<%=request.getParameter("price") %>
	* special :<%=request.getParameter("special") %>

=> 값 변경 Test 
<%int price= Integer.parseInt(request.getParameter("price"))*5; %>
	* New price <%=price %>
</h2></pre>
</body>
</html>