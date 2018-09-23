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
	<TR>
    <TD >Role         
    </TD>   
    <TD >
       <select  name= "select"  value="select">        
            <option value="user">user</option>
            <option value="manager">manager</option>
            <option value="admin">admin</option>
            
       </select>
    </TD>        
</TR> 
<tr>
		<td>License</td>
		<td><input type="text" name="license"/></td>
	</tr>
	
<tr>
		<td>Email</td>
		<td><input type="email" name="Emai"/></td>
	</tr>	
	
	<tr>
		<td>Phone Number:</td>
		<td><input type="text" name="phno"/></td>
	</tr>
	
<tr>
		<td>Address</td>
		<td><input type="textarea" rows="4" columns="5" name="addr"/></td>
	</tr>

<tr>
		<td>UTA ID</td>
		<td><input type="text" name="uta_id"/></td>
	</tr>	

<tr >
		<td>Auto club Member</td>
		<td><input type="radio" name="auto_club" value="yes"/>Yes</td>
		<td><input type="radio" name="auto_club" value="no"/>No</td>
	</tr>	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "Register" /></form>
</body>
</html>