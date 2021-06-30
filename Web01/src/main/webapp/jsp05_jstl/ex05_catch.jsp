<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** catch Tag Test **</title>
</head>
<body>
<h2><pre>
** catch Tag Test **
=> 예외상황을 처리 해 주는 Tag
=> 비정상적인 종료 
=> jav try ~ catch 
	try{
	...
	}catch(Exception e){
	...
	}final{
	...
	}
=> c:catch~~ /c:catch 블럭에서 Exception 발생시 대응 
=> 예외발생시 발생한 Exception 객체를 var의 값에 저장하고 catch 구문
밖으로 진행  

<c:catch var="e">
	** 예외발생전
	* java
	  	-> 정상 10/2 => <%=10/2 %>
	  	-> 예외! 10/0 => <%=10/10 %> : Exception 500 (by zero)
	
	* EL
		-> 정상  10/2 => ${10/2}
		-> 예외! 10/0 => ${10/0} : infinity(실수연산) 
		.EL 연산의 나누기 연산은 실수형으로 처리
        .Exception 발생 하지 않음
		.단, %연산은 정수 연산 
		-> 예외~ 10%0 => ${10%0} : Exception (by zero)
		-> 예외(실수) => ${10.0%0.0} : NAN (by zero)
	** 예외발생후   	
</c:catch>
<!-- 
catch Tag 에 정의된 변수를 이용해서 오류를 확인할수있게해줌
=> null 이면 정상임을 의미
   아니면 오류발생을 의미 -->
<c:if test="${e!=null}">
	=> Exception : ${e}
</c:if>

*** Program Stop ***
</pre></h2>

</body>
</html>