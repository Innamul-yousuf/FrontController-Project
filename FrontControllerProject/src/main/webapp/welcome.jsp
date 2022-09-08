<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr>

<h1>Welcome page</h1>
		<form action="logout.do" method="post">
		<input type="hidden" name="formid" value="logout">
		<input type="hidden" name="stuname" value="<%=request.getAttribute("stuname") %>">
		<input type="hidden" name="stupass" value="<%=request.getAttribute("stupass") %>">	

		<input type="submit" value="Logout">
		</form>
<hr>		
		
		
		
</body>
</html>