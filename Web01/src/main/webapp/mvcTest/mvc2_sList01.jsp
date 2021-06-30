<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.*, jdbcTest.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** MVC2_StudentList01 _ Java **</title>
<%
	List<StudentVO>	list = new ArrayList<StudentVO>();
	list = (ArrayList<StudentVO>)request.getAttribute("Banana");
%>
</head> 
<body>
<h2>** MVC2_StudentList01 _ Java **</h2>
<table>
<tr bgcolor="aqua">
	<th>idNo</th><th>Name</th><th>성별</th><th>나이</th><th>Java</th><th>Html</th>
</tr>
<%  for (int i=0; i<list.size(); i++) { %>	
<tr><td><%=list.get(i).getIdno()%></td>
	<td><%=list.get(i).getName()%></td>
	<td><%=list.get(i).getGender()%></td>
	<td><%=list.get(i).getAge()%></td>
	<td><%=list.get(i).getJava()%></td>
	<td><%=list.get(i).getHtml()%></td>
</tr>
<% } %>
</table>

</body>
</html>