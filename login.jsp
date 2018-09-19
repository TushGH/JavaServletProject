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
		<td><h3>${message}</h3>
		<h3>${successMessage} </h3>
		</td>
		<td></td>
		</tr> 
		<tr>
		  <td><h3>Login Page</h3></td>
		  <td></td>
		  </tr>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"></td>
				<td><a href="register.jsp">Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>