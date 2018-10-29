<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body>
<img src="car4.png" alt="car img" height="100" width="100">
<form action="${pageContext.request.contextPath}/SearchFunction" method = "POST">
start date   <input type = "date" name = "startdate" value="${uname}" /><br>
end date     <input type = "date" name = "enddate" value="${uname}" /><br>
start time   <input type="text" name="starttime" value="${uname}" /> please use format hh:mm:ss<br> 
End Time     <input type="text"  name="endtime"  value="${uname}"  /> please use format  hh:mm:ss<br>
Capacity     <input type="text" name="capacity" value="${uname}" /><br>

<input type="submit" name="submit" value="Search">

</form>
</body>
</html>