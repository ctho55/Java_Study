<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Ajax Parameter Test View (Get/Post)**</title>
</head>
<body>
<pre><h2>
** Ajax Parameter Test View (Get/Post)**

=> 전송된 Parameter Value 

I D : ${param.id} 
P W : ${param.password}
Name: <%= request.getParameter("name")%>

<!-- param 객체는 EL의 내장 객체이며, 파라미터 값을 얻어올 수 있다. 
위 코드는 "id"에 해당하는 name 속성의 파라미터 값을 얻어올 수 있으며, 
JSP 스크립트 요소 안의 request.getAttribute("id")와 같다 -->

</h2></pre>

</body>
</html>