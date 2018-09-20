<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<h2>Car Rental System</h2>

IN REGISTRATION PAGE
<form action="${pageContext.request.contextPath}/rentalcontrol" method="post">
<table style="width: 50%">
	<tr>
		<td>User Name</td>
		<td><input type="text" name="user_name"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password"/></td>
	</tr>
	<tr>
		<td>Full Name</td>
		<td><input type="text" name="name" /></td>
	</tr>
	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "Register" /></form>
</body>
</html>