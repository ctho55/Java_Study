<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Request Parameter 활용 **</title>
</head>
<body>
<pre><h2>
** Request Parameter 활용 **
	=> 동질성 비교, 연산 등등
1. 동질성 비교
=> Parameter Value 출력
* I      D : ${param.id}
* Password : ${param.pw}

=> 동질성 비교
\${param.id=="banana"} -> ${param.id=="banana"}
\${param.pw=="12345"} -> ${param.pw=="12345"}

=> null 확인 ( empty, == )
-> empty : 변수(또는 parameter)의 값을 확인 (parameter 는 있지만 그 값이 없는 경우에 true)
\${empty_param.id} -> ${empty param.id}
\${empty_param.pw} -> ${empty param.pw}

-> == : 변수(또는 parameter)의 존재를 확인 (parameter 는 있지만 그 값이 없는 경우에 false)
\${param.id==null} -> ${param.id==null}
\${param.pw==null} -> ${param.pw==null}

2. ADD 연산
=> ex02_~~~.jsp

3. pageContext 객체 Test
=> JSP 페이지에 대한 정보를 저장한다.
=> 기본 객체를 return 하는 메서드를 제공.
* 요 청 URL : ${pageContext.request.requestURL}
* 요 청 URI : ${pageContext.request.requestURI}
	
</h2></pre>

</body>
</html>