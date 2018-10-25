<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Car</title>
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
</head>
<body>
<h2>ADD CAR</h2>
<img src="car4.png" alt="car img" height="100" width="100">
<form name="Loginform" action="${pageContext.request.contextPath}/rentalcontrol" method="post" style="width: 300px; ">
<input type ="button" value="LOGOUT">
<input type="submit"  name = "submit" value = "logout" />
</form>
<br><br><br>
<form name="Loginform" action="${pageContext.request.contextPath}/ManagerController" method="post" style="width: 300px; ">
<table style="width: 50%">
	<tr><td>Car Name </td><td><input type="text" name="CarName" id="carname"></td></tr>
	<tr><td>Capacity </td><td><input type="text" name="Capacity" id="carname"></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td>Extra Rates :</td></tr>
	<tr><td>GPS</td><td><input type="text" name="Gps" id="gps"></td></tr>
	<tr><td>OnStar</td><td><input type="text" name="OnStar" id="OnStar"></td></tr>
	<tr><td>SiriusXM</td><td><input type="text" name="SiriusXM" id="SiriusXM"></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td>Rates :</td></tr>
	<tr><td>Weekday</td><td><input type="text" name="WeekDay" id="weekday"></td></tr>
	<tr><td>Weekend</td><td><input type="text" name="WeekEnd" id="weekend"></td></tr>
	<tr><td>Week</td><td><input type="text" name="Week" id="week"></td></tr>
	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "AddCar" /></form>
</body>
</html>