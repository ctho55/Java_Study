<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
<title>** JSTL Start **</title>
</head>
<body>
<pre><h2>
** JSTL Start **
=> Jstl Library 를 정의 
   디렉티브 taglib 에 uri=".." prefix=".."

1. 출력 : out Tag
=> Java 의 out 객체 역할, EL을 대신할 수 있음
<c:out value=" ~~ Hello JSTL !!! ~~" />

2. 변수 정의
=> set, remove
=> 정의
<c:set var="name" value="홍길동" />
<c:set var="age" value="123" />
<% String name="김자바" ; %>
* 비교 Java => <%=name%>

3. 변수 출력
=> Jstl out Tag
* name = <c:out value="${name}" />
* age = <c:out value="${age}" />

=> 출력 우선순위 : value, default 또는 컨텐츠
<c:set var="test" value="Value_1순위" />
* test 1 = <c:out value="${test}" />

* test 2 = <c:out value="${test2}" default="기본값_2순위" />

<c:set var="test">컨텐츠_3순위</c:set>
* test 3 = <c:out value="${test}" />

=> EL 
* \${name} = ${name}
* \${age} = ${age}
* \${age+123} = ${age+123}

<hr>

4. 연산 적용 
<c:set var="add" value="${age+age}" />
\${add} = ${add}
<c:set var="bool" value="${age==name}" />
\${bool} = ${bool}

5. 변수 삭제
=> age remove
<c:remove var="age"/>
* name_empty Test => ${empty name}
* age_empty Test => ${empty age}
\${age} => ${age}
</h2></pre>

</body>
</html>