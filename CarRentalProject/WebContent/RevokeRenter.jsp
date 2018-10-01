<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Revoke Renter</title>
</head>
<body>
<h2>Revoke Renter</h2>


<form name="Loginform" action="${pageContext.request.contextPath}/Admin" method="post" style="width: 300px; ">


<input type="text" name="username" />
<input type="submit" name="submit" value="revoke" >
</form>


</body>
</html>