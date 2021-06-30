<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JavaCode : Scriptlet, Expression, Declaration **</title>
</head>
<body>
<h2>** JavaCode **</h2>
1) Scriptlet: 자바코드<br>
2) Expression: 표현식 (출력문)<br>
3) Declaration: 선언부 (메서드 등)<br>
<hr>
<%! //Declaration: 선언부
	public int multiply(int a, int b) {
		return a*b ;
	}
%>
=> multiply(a, b) Test <br>
 multiply(123, 456) = <%=multiply(123,456)%><br>
 
<% //Scriptlet: 자바코드
	int result = multiply(100,5)+12345;
%>
 result = <%=result%>

</body>
</html>