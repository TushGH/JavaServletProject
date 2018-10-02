<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FORGET PASSWORD</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body>
<h2>RESET PASSWORD</h2>
<img src="car4.png" alt="car img" height="100" width="100">
<a href="index.jsp" class="logoutstyle">Logout</a>
<br><br><br>
<form name="Loginform" action="NameController" method="post" style="width: 300px; ">
<table>
<tr>
<td>UTA ID</td> <td></td>
<td><input type="text" id="usrname" name="usrname"  required/></td>
</tr>
<tr>
<td>Password</td> <td></td>
<td><input type="password" id="pswd" name="pswd" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required></td>
</tr>
<tr>
<td>Confirm Password</td> <td></td>
<td><input type="password" id="pswd" name="pswd" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required></td>
</tr>

<tr><td><input type="submit" id="login" name="login" value="Submit"/></td></tr>
</table>
</form>

</table>
</body>
</html>