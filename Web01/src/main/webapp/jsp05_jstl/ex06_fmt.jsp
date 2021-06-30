<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Format(fmt) Test **</title>
</head>
<body>
<h2><pre>
** Format(fmt) Test **

1. DateTime Format
=> 현재 날짜 시간 가져오기
   Java : Date now = new Date();
<c:set var="now" value="<%=new Date()%>" />
* now : ${now}

* date : <fmt:formatDate value="${now}" type="date"/> 
* time : <fmt:formatDate value="${now}" type="time"/>
------------------------------------------------------------

* both  : <fmt:formatDate value="${now}" type="both"
                  dateStyle="default" timeStyle="default"/>
* short : <fmt:formatDate value="${now}" type="both"
                  dateStyle="short" timeStyle="short"/>
* medium: <fmt:formatDate value="${now}" type="both"
                  dateStyle="medium" timeStyle="medium"/>                  
* long  : <fmt:formatDate value="${now}" type="both"
                  dateStyle="long" timeStyle="long"/>                  
* full  : <fmt:formatDate value="${now}" type="both"
                  dateStyle="full" timeStyle="full"/>                  
-----------------------------------------------------
=> Pattern (yyyy년 MM월 dd일 hh시 mm분 ss초) 적용
   <fmt:formatDate value="${now}" pattern="yyyy년 MM월 dd일 hh시 mm분 ss초"/>

=> 각 나라별 시간을 적용하려면 
   fmt:setTimeZone, fmt:timeZone 태그 활용
-----------------------------------------------------   

2. Number Format
<c:set var="myMoney" value="123456789"/>   
=> myMoney : <fmt:formatNumber value="${myMoney}" 
               pattern="###,###,###,###"/>원   

</pre></h2>


</body>
</html>