<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>

<body style="width:450px;">
<h2 align="center">WELCOME TO ADMIN HOMEPAGE</h2>
<h2> Welcome <input name="Username"  value="<c:out value='${username}'/>" type="text"  style =" color: blue; " disabled="disabled"></h2>
<input name="errMsg" value="<c:out value='${Message}'/>"
		type="text"
		style="background-color: white; color: red; border: none; width: 800px"
		disabled="disabled">

<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">

<input type="submit"  name = "submit" value = "logout" />
</form>
<img src="car4.png" alt="car img" height="100" width="100">
<br><br><br>
1.<a href="UpdateProfile3.jsp"> Edit User Profile </a> <br>
2.<a href="EditUserRole.jsp"> Change User Roles</a> <br>
3.<a href="RevokeRenter.jsp"> Revoke Renter </a> <br>




<br><br>

<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">
Username <input type = "text" name = "username"> <br>
Update Users Profile  here.. :) <input type="submit" name="submit" value="UserProfileUpdate" style ="color: yellow;  " >
</form>


<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">

Update your profile here.. :) <br> <input type="submit" name="submit" value="editprofileA" style ="color: yellow;  " >
</form>
</body>
</html>