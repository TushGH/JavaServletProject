<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="loginRegister" method="post">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password1"></td>
			</tr>
			
			<tr>
				<td>Retype-Password:</td>
				<td><input type="text" name="password2"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Register"></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>