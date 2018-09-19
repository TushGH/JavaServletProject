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
<form action="register" method="post">
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
	<tr>
		<td>Role</td>
		<td><select name="role">
    		<option value="manager">Manager</option>
    		<option value="user">User</option>
    		<option value="admin">Admin</option>
  		</select></td>
	</tr>
	<tr>
		<td>Driver's License Number</td>
		<td><input type="text" name="drivers_license"/></td>
	</tr>
	<tr>
		<td>Date of Birth</td>
		<td><input type="date" name="bday"/></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="email" name="email" placeholder="Valid email"/></td>
	</tr>
	<tr>
		<td>Phone</td>
		<td><input type="text" name="phone" placeholder="Phone Number" /></td>
	</tr>
	<tr>
		<td>Address</td>
		<td><input type="text" name="address" /></td>
	</tr>
	<tr>
		<td>UTA ID</td>
		<td><input type="text" name="uta_id" placeholder="100*******"/></td>
	</tr>
	<tr>
		<td>Auto Club Member</td>
		<td><input type="radio" name="AAC" value="No" checked> No<br></td>
  		<td><input type="radio" name="AAC" value="yes"> Yes<br></td>
	</tr>
</table>
<br>
<br>
<input type="submit" value="Submit" /></form>
</body>
</html>