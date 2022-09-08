<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='red'>
<h1>Students Login Portal</h1>
<form action="login.do" method="post">
<input type="hidden" name="formid" value="login">
UserName:<input type="text" name="stuname">
PassWord:<input type="text" name="stupass">
<input type="submit" value="login">
</form>
<form  action="registerlog.do">
		Sign up<input type="submit" value="Register">
		<input type="hidden" name="formid" value="registerlog">
		</form>

</body>
</html>