<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** Form input Parameter test **</title>
</head>
<body>
<h2>** Form input Parameter test **</h2>
	<form action="ex05_02ReceiveForm.jsp" method="get">
	  *	I D : <input type="text" name="id" value="banana"> <br>
	  *	Name : <input type="text" name="name" value="홍길동"><br><br>
	  * 좋아하는 동물은 ? <br>
	  			<input type="checkbox" name="pet" value="dog">강아지 <br>
	  			<input type="checkbox" name="pet" value="cat">고양이 <br>
	  			<input type="checkbox" name="pet" value="pig">돼지 <br>	
				<input type="checkbox" name="pet" value="eagle">독수리 <br><br>
	<input type="submit" value="SEND"><br>
	<input type="reset" value="RESET"><br>
	
	</form>

</body>
</html>