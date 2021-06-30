<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="java.util.Arrays" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Request Parameter Test **</title>
</head>
<body>
<pre><h2>
** Request Parameter Test **
=> 당신의 입력 내용
* I D => <%=request.getParameter("id")%>
* Name=> <%=request.getParameter("name")%>


* 좋아하는 동물 1 =>  
<%    String[] pets=request.getParameterValues("pet"); 
   if ( pets != null ) {
      for (String p:pets) {
         out.print("  "+p);
      } // for
   }else {
      out.print("~~ 선택한 동물이 없습니다 ~~") ;
   } //else
%><br><br>


* 좋아하는 동물 2 => <%=Arrays.toString(pets)%>


* 좋아하는 동물 3 =>
<% if (request.getParameterValues("pet")==null) {%>
   <%="선택한 동물이 없습니다 ~~"%>
   <% return; } %>
<%   for (String p:request.getParameterValues("pet")) {
   switch(p) {
   case "dog": p="강아지 "; break;
   case "cat": p="고양이 "; break;
   case "pig": p="꿀꿀이 "; break;
   case "eagle": p="독수리 "; break;
   default: break;
   } %>
   <%=p%>
<%}%>

</h2></pre>
</body>
</html>