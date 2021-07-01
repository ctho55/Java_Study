<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Web MVC2 Memberupdate Form **</title>
<style type="text/css">
table {
	margin-left: auto;
	margin-right: auto;
	text-align: center;
	align-content: center;
}
</style>
</head>

<body>
	<h2 style="text-align: center;">** Web MVC2 Memberupdate Form **</h2>
	<table>
		<form action="/Web02/mupdate" method="get">

			<h3 style="text-align: center;">** Web MVC2 Memberupdate Form **</h3>
			<tr height="40">
				<td>I D</td>
				<td><input type="text" placeholder="아이디" name="id"
					maxlength="20" value="${Apple.id}" readonly="readonly"></td>
			<!-- ** input Tag 입력 막기
					=> disabled : 서버로 전송 안됨
					=> readonly : 서버로 전송 됨 
				 -->
			</tr>

			<tr height="40">
				<td>P W</td>
				<td><input type="password" placeholder="비밀번호" name="password"
					maxlength="20" size="20" value="${Apple.password}"></td>
			</tr>

			<tr height="40">
				<td>Name</td>
				<td><input type="text" placeholder="이름" name="name"
					maxlength="20" size="20" value="${Apple.name}"></td>
			</tr>

			<tr height="40">
				<td>Level</td>
				<td><select name="lev" >
					<c:choose>
						<c:when test="${Apple.lev =='A'}">
						<option value="A" selected="selected">관리자</option>
						<option value="B">나무</option>
						<option value="C">잎새</option>
						<option value="D">새싹</option>
						</c:when>
						<c:when test="${Apple.lev =='B'}">
						<option value="A">관리자</option>
						<option value="B" selected="selected">나무</option>
						<option value="C">잎새</option>
						<option value="D">새싹</option>
						</c:when>
						<c:when test="${Apple.lev =='C'}">
						<option value="A">관리자</option>
						<option value="B">나무</option>
						<option value="C" selected="selected">잎새</option>
						<option value="D">새싹</option>
						</c:when>
						<c:when test="${Apple.lev =='D'}">
						<option value="A">관리자</option>
						<option value="B">나무</option>
						<option value="C">잎새</option>
						<option value="D" selected="selected">새싹</option>
						</c:when>
					</c:choose>
				</select></td>
			</tr>

			<tr height="40">
				<td>birthd</td>
				<td><input type="date" name="birthd" value="${Apple.birthd}"></td>
			</tr>

			<tr height="40">
				<td>point</td>
				<td><input type="text" placeholder="포인트" name="point" size="20"
					value="${Apple.point}"></td>
			</tr>

			<tr height="40">
				<td>weight</td>
				<td><input type="text" placeholder="몸무게" name="weight"
					maxlength="5" size="20" value="${Apple.weight}"></td>
			</tr>

			<tr height="40">
				<td><input type="submit" value="수정"> &nbsp;&nbsp; <input
					type="reset" value="취소"></td>
			</tr>

		</form>

	</table>
	<c:if test="${message != null}">
		<br>${message}<br>
		<br>
	</c:if>

	<hr>
	<a href="/Web02/index.jsp">HOME</a>

</body>
</html>