<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>

<body style="width:450px;">
<h2 align="center">WELCOME TO ADMIN HOMEPAGE</h2>
<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">
<input type ="button" value="LOGOUT">
<input type="submit"  name = "submit" value = "logout" />
</form>
<img src="car4.png" alt="car img" height="100" width="100">
<br><br><br>
1.<a href="UpdateProfile3.jsp"> Edit User Profile </a> <br>
2.<a href="EditUserRole.jsp"> Change User Roles</a> <br>
3.<a href="RevokeRenter.jsp"> Revoke Renter </a> <br>

4.<a href="UpdateProfile3.jsp"> Update Profile </a> <br><br><br>
<form name="Loginout" action="index.jsp" method="post" style="width: 300px; ">

</form>
<br><br>
**For any additional functionalities link will appear here




</body>
</html>