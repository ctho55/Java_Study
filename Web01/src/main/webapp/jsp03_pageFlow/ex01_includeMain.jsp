<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Include Main **</title>
</head>
<body>
<pre> <h2>
 ** Include Main **
 => Jsp에서 다른 웹문서(page) 포함하기
 => Jsp Action Tag : include, Directive Include
 => 여기는 호출 전 Main
 <% int mainValue = 100; %>
 * mainValue = <%=mainValue%>
 
 ** 1) JSP Action Tag 
 => JSP 문서의 완성된 웹페이지가 포함됨.
 => 변수 공유 불가능 (코드 호환이 안됨)
 
** 2) Directive 
=> JSP 문서의 소스코드가 포함됨
 => 변수 공유 가능 (코드 호환이 됨)

** Test  1) JSP Action Tag
=================================================================
<%-- <jsp:include page="ex01_includeSub.jsp" /> --%>
 ** Test 2) Directive 
 <%@ include file="ex01_includeSub.jsp" %>
=================================================================
 
 
 
 => 여기는 호출 후 Main
  ** Sub 의 변수 호출 : <%=subValue %> 
 
 

 
 
 
 
 
 
 </h2></pre>


</body>
</html>