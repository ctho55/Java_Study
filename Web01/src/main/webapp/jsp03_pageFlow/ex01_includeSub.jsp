<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Include Sub **</title>
</head>
<body>
<pre><h2>
** Include Sub **
 => Main 의 변수 확인
* mainValue = <%=mainValue%> 
=> Sub 의 변수 정의
<%String subValue = "하하호호"; %>
* subValue = <%=subValue%>




**** Sub End ********************************

</h2></pre>



</body>
</html>