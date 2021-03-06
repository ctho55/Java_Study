<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** EL Basic **</title>
</head>
<body>
<pre><h2>
** EL Basic **
=> EL: Expression Language , 표현언어
=> 편리한 값(Value) 의 출력과 사용 

1. 값(변수의 값) 의 출력
1.1) Java의 표현식 => <%="Java표현식"%>
1.2) out 객체 => <% out.print("out객체출력"); %>
1.3) E L => ${"~~ Hello EL !!!"} 
-----------------------------------

** EL 자료형 **
정수형: ${10}
실수형: ${10.1234}
문자형: ${"안녕하세요 ~~"}
논리형: ${true}
null: ${null}
-----------------------------------

** EL 연산 **
=> 4칙(산술) 연산 
=> + - * / %
\${5+2} => ${5+2}
\${5-2} => ${5-2}
\${5*2} => ${5*2}
\${5/2} => ${5/2}
\${5%2} => ${5%2}

=> 관계연산
-> gt: greater than / lt: less than 
-> ge: greater equal / le: less equal
-> eq: equal, == / ne: not equal , != 

\${5>2} => ${5>2}
\${5 gt 2} => ${5 gt 2}
\${5<2} => ${5<2}
\${5 lt 2} => ${5 lt 2}
\${5>=2} => ${5>=2}
\${5 ge 2} => ${5 ge 2}
\${5<=2} => ${5<=2}
\${5 le 2} => ${5 le 2}
\${5==2} => ${5==2}
\${5 eq 2} => ${5 eq 2}
\${5!=2} => ${5!=2}
<%-- \${5_ne_2} => ${5 ne 2} --%> 

=> 논리연산
\${5>2 && 10>100} => ${5>2 && 10>100}
\${5>2 || 10>100} => ${5>2 || 10>100}

=> 조건(삼항) 식
\${5>2 ? 5:2} => ${5>2 ? 5:2}
-----------------------------------

** Java 변수 
=> 사용불가능, JSTL 로 정의된 변수 사용가능
<% String name = "홍길동"; %>
\${name} => ${name}
\${empty_name} => ${empty name}
<!-- => empty : 검사할 객체가 비어있는지 확인 
				비어있으면 true 
				list, map 타입의 객체가 값이 있는지 없는지 구분해줌  
	 => EL 에 자바변수는 직접 값을 전달하지 못함
	  (jsp에서 자바코드가 완전 분리됨을 목표로 하기때문에 자바변수를 사용할 필요는 없으므로)  
	 => EL 에 변수명이 오면 속성(Attribute) 의 이름으로 인식함. 				 
 -->

** request 객체의 parameter 처리
=> 매우 편리함
=> request 객체의 parameter를 의미하는 el 의 내부객체 : param
\${empty_param.id} => ${empty param.id}
\${param.id} => ${param.id}
\${param["id"]} => ${param["id"]}

=> Java의 동일표현
request.getParameter("id") => <%=request.getParameter("id")%>

</h2></pre>

</body>
</html>