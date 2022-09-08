<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page..</h1>
<form action="register.do" method="post">
<input type="hidden" name="formid" value="register">
UserName:<input type="text" name="stuname">
Uid:<input type="text" name="stuid"><br>
PassWord:<input type="text" name="stupass"><br>
Class:<input type="text" name="stuclass"><br>
<br>	

<input type="submit" value="Register">

</form>
</body>
</html>