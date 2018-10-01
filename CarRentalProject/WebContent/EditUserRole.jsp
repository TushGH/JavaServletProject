<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User Role</title>
</head>
<body>
<form name="Loginform" action="${pageContext.request.contextPath}/Admin" method="post" style="width: 300px; ">


Username  <input type="text" name="username" /><br>
Role      <input type="text" name="role" /><br>


<input type="submit" name="submit" value="editrole" >
</form>
</body>
</html>