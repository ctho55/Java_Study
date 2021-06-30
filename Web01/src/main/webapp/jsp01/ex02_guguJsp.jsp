<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** GuGu JSP **</title>
</head>
<body>
<h2>** 구구단 출력하기 JSP **</h2>
<!-- Html 주석 입니다 ~~ -->
<%-- JSP 주석 입니다 
<% 
// 방법1
for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				out.print(j+"*"+i+"="+(i*j)+"&nbsp;");	
			} // for_j
			out.print("<br>");
		} // for_i	
%> --%>

<% 	
// 방법2
for(int i=1;i<=9;i++) {
		for(int j=2;j<=9;j++) {
%>
<%=j%>*<%=i%>=<%=i*j%>&nbsp;&nbsp;
<%		
	} // for j
%>
	<br>
<%
	} // for i		
%>


</body>
</html>