<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EDIT USER PROFILE</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body>
<h2>EDIT USER PROFILE</h2>
<img src="car4.png" alt="car img" height="100" width="100">
<a href="index.jsp" class="logoutstyle">Logout</a>
<br><br><br>
<form action=" " method="post">
<table style="width: 50%">
	<tr>
		<td>User Name</td>
		<td><input type="text" name="user_name" id="username"/></td>
	</tr>
	
	<tr>
		<td>Full Name</td>
		<td><input type="text" name="name" id="fullname"/></td>
	</tr>
	

<tr>
		<td>Email</td>
		<td><input type="email" name="Emai" id="email"/></td>
	</tr>	
	
	<tr>
		<td>Phone Number:</td>
		<td><input type="text" name="phno" id="phoneno"/></td>
	</tr>
	
<tr>
		<td>Address</td>
		<td><input type="textarea" rows="4" columns="5" name="addr" id="address"/></td>
	</tr>



</table>
<br>
<br>
<br>
<input type="submit"  name = "submit" value = "Save Edits" /></form>
</body>
</html>