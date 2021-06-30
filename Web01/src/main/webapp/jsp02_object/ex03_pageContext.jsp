<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> ** Jsp Object: PageContext **</title>
</head>
<body>
<pre><h2>
** Jsp Object : PageContext **
=> Jsp 페이지에 대한 정보를 저장한다. 
=> 기본 객체를 return 하는 메서드를 제공 

<% HttpServletRequest req = (HttpServletRequest)pageContext.getRequest(); %>

=> request 객체와 pageContext 에서 제공받은  req 와 동질성 비교
비교결과 : <%=request==req %>

=> pageContext 객체가 제공하는 out 객체로 출력하기 
<%pageContext.getOut().print("~~ pageContext 객체로 출력하기 ~~ "); %>


</h2></pre>
</body>
</html>