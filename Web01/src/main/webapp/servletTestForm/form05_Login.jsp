<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Login Test **</title>
</head>
<body>
<h2>** Servlet : Student Login **</h2>
<table>
<form action="/Web01/slogin" method=get>
<h2>
<tr><td><label for=idno> IdNo : </label></td>
 	<td><input type="text" name=idno id=idno></td>
</tr>
<tr><td><label for=name> Name : </label></td>
	<td><input type="text" name=name id=name></td>
</tr>
<tr><td></td>	
	<td><br>
	<input type="submit" value=로그인>&nbsp;&nbsp;
	<input type="reset" value="취소">
	</td>
</tr>	
</h2>
</form></table>
</body>
</html>