<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Jsp Object: application **</title>
</head>
<body>
	<pre>
		<h2>
** Jsp Object: application **
=> 웹 어플리케이션에 대한 정보를 저장

1) 초기화 파라미터 Name & Value
=> 초기화 파라미터는 web.xml(설정파일) 에 등록함
<context-param> Tag ~~

<ul> 
<%
 Enumeration<String> inames = application.getInitParameterNames();
 while (inames.hasMoreElements()) {
 	String iname = inames.nextElement();
 %>
	<li><%
	out.print(iname+"="+application.getInitParameter(iname));

	} // while
	%>

			
</ul>
2) 서버정보
* 서버정보 : <%=application.getServerInfo() %>
* 서블릿 규약 메이져 버전 : <%=application.getMajorVersion() %>
* 서블릿 규약 마이너 버전 : <%=application.getMinorVersion() %>
=> 버전 : 메이져버젼.마이너버전
	   (메이져버젼 이 변경되면 버젼간의 호환이 안됨)
	   
3) 리소스(Resources) 정보
* RealPath 1: <%=application.getRealPath("")%>
			-> 매개변수로 경로명, "" 사용시에는 현재 프로젝트의 realpath return
			-> 지정한 경로의 시스템상에서의 realPath return 
* RealPath 2 : <%=application.getRealPath("/jsp02_object")%>

* Resource 1: <%=application.getResource("") %> 
			-> 매개변수로 경로명, "" 사용시에는 현재 프로젝트의 url 객체 return
* Resource 2: <%=application.getResource("/jsp02_object") %>
			-> 지정한 경로에 접근 할 수 있는 url 객체 return 
		</h2>
	</pre>

</body>
</html>