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
<a href="index.jsp" class="logoutstyle">Logout</a>
<br><br><br>
<form action=" " method="post">
<table style="width: 50%">
	<tr><td>Car Name </td><td><input type="text" name="carname" id="carname"></td></tr>
	<tr><td>Capacity </td><td><input type="text" name="carname" id="carname"></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td>Extra Rates :</td></tr>
	<tr><td>GPS</td><td><input type="textbox" name="extras" id="gps"></td></tr>
	<tr><td>OnStar</td><td><input type="textbox" name="extras" id="OnStar"></td></tr>
	<tr><td>SiriusXM</td><td><input type="textbox" name="extras" id="SiriusXM"></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td></td></tr>
	<tr><td>Rates :</td></tr>
	<tr><td>Weekday</td><td><input type=textbox" name="extras" id="weekday"></td></tr>
	<tr><td>Weekend</td><td><input type="textkbox" name="extras" id="weekend"></td></tr>
	<tr><td>Week</td><td><input type="textbox" name="extras" id="week"></td></tr>
	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "Submit" /></form>
</body>
</html>