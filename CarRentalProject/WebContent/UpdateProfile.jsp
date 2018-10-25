<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE PROFILE</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body>
<h2>UPDATE PROFILE</h2>
<img src="car4.png" alt="car img" height="100" width="100">
<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">

<input type="submit"  name = "submit" value = "logout" />
</form>
<br><br><br>
<form name="Loginform" action="${pageContext.request.contextPath}/ManagerController" method="post" style="width: 300px; ">
<table style="width: 50%">
	<tr>
		<td>User Name</td>
		<td><input type="text" name="username" id="username"/></td>
	</tr>
	
	<tr>
		<td>Full Name</td>
		<td><input type="text" name="name" id="fullname"/></td>
	</tr>
	

<tr>
		<td>Email</td>
		<td><input type="email" name="email" id="email"/></td>
	</tr>	
	
	<tr>
		<td>Phone Number:</td>
		<td><input type="text" name="phone" id="phoneno"/></td>
	</tr>
	
<tr>
		<td>Address</td>
		<td><input type="textarea" rows="4" columns="5" name="addr" id="address"/></td>
	</tr>
<tr>
		<td>Current Password</td>
		<td><input type="password" name="curpassword" id="currentpassword"/></td>
	</tr>
	<tr>
		<td>New Password</td>
		<td><input type="password" name="newpassword" id="newpassword"/></td>
	</tr>
	<tr>
		<td>Confirm Password</td>
		<td><input type="password" name="conpassword" id="confirmpassword"/></td>
	</tr>



</table>
<br>
<br>
<br>
<input type="submit" name="submit" value="UpdateProfile" >
</form>
</body>
</html>