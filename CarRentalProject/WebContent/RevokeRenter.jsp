<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Revoke Renter</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body style="width:450px;">
<h2 align="center">WELCOME TO REVOKE RENTER </h2>

<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">

<input type="submit"  name = "submit" value = "logout" />
</form>
<img src="car4.png" alt="car img" height="100" width="100">
<br><br><br>

<form name="Loginform" action="${pageContext.request.contextPath}/Admin" method="post" style="width: 300px; ">

<table><tr><td>Username<input type="text" name="username" /></td></tr>

<tr><td><input type="submit" name="submit" value="Revoke" ></td></tr></table>
</form>


</body>
</html>