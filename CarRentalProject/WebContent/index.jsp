<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Greeting Form</title>
</head>

<body style="width:450px;">
<h2 align="center">WELCOME TO CAMPUS RENTAL CAR </H2>
<table>

<tr>
<td>
<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">
<table>
<tr>
<td>UserName</td> <td></td>
<td><input type="text" id="username" name="user_name" /></td>
</tr>
<tr>
<td>Password</td> <td></td>
<td><input type="password" id="password" name="password"></td>
</tr>
<tr>
	<td><a href="Registration.jsp">New User</a></td>
	<td></td>
	<td><a href="ForgetPswd.jsp">Forget Password</a></td>
</tr><tr>
<tr><td><input type="submit" name="submit" value="login" ></td></tr>
</table>
</form>

</table>
</body>
</html>