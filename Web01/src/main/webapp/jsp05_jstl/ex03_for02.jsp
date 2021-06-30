<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** JSTL forEach begin, end , step **</title>
</head>
<body>
	<h2>
		<pre>
** JSTL forEach begin, end , step **
=> 구간반복: StartIndex(begin), LastIndex(end), 증감값(Step) 적용
=> step 의 default 값은 1
=> 실습 1) 
   1 ~ 10 까지를 다음처럼 출력하세요 ~~
    -> 1, 2, 3, .... 10
	-> java코드의 예ex) : for(int i=1;i<11; i++){....}
</pre>

		<c:forEach var="i" begin="1" end="10" step="1" varStatus="vs">
			<%-- ${i}<c:if test="${not vs.last }">,</c:if> --%>
	
	${i}<c:if test="${i<10}">,</c:if>

		</c:forEach>
		<hr>
		<pre>
=> 실습 2) 
   1 ~ 10 중에서 짝수만, index, count 출력하기 
   단, table을 이용해서 출력하세요  ~
   ex03_for01의 table과 비교해 보세요 ~
=> count : 반복횟수
=> index : 반복자(iterator)의 값
		   begin, step 을 지정하지 않으면 0부터 1씩 증가    

</pre>
<table border="1" style="text-align: center; width: 100%">
  <tr>
    <th>i짝수</th>
    <th>Index</th>
    <th>Count</th>
  </tr>
  <c:forEach var="i" begin="2" end="10" step="2" varStatus="vs">
  <tr>
  		<td>${i}</td>
 	 	<td>${vs.index}</td>
	 	<td>${vs.count}</td>
  </tr>
  </c:forEach>
</table>

** 비교 <br>
<table border="1" style="text-align: center; width: 100%">
  <tr>
    <th>i짝수</th>
    <th>Index</th>
    <th>Count</th>
  </tr>
  <c:forEach var="i" begin="1" end="10" step="1" varStatus="vs">
  		<c:if test="${i%2==0}">
  			<tr>
  				<td>${i}</td>
 	 			<td>${vs.index}</td>
	 			<td>${vs.count}</td>
			</tr>
  		</c:if>
  
  </c:forEach>
</table>   
=> 실습 3) 1~30 을 다음처럼 1행에 5개씩 출력하세요~<br>
<!-- 
1,2,3,4,5
6,7,8,9,10
11,12,13,14,15
...
............30 -->
<c:forEach var="i" begin="1" end="30" step="1" varStatus="vs">
	<c:choose>
	<c:when test="${i%5==0}">${i}<br></c:when>
<c:otherwise>
	${i},
</c:otherwise>	
	</c:choose>
</c:forEach>



** Table<br>
<table>
<c:forEach var="i" begin="1" end="26" step="5">
<tr align="right">
   <c:forEach var="j" begin="${i}" end="${i+4}" step="1">
      <td width="50">${j}</td>
   </c:forEach>   
</tr>
</c:forEach>
</table>


	</h2>
</body>
</html>