<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Car</title>
</head>
<body>
<h2>ADD CAR</h2>

<form action=" " method="post">
<table style="width: 50%">
	<tr><td>Car Name </td><td><input type="text" name="carname" id="carname"></td></tr>
	<tr><td>Capacity </td><td><input type="text" name="carname" id="carname"></td></tr>
	
	<tr><td>Extra Rate</td><td><input type="radio" name="extras" id="extras">GPS</td>
	<td><input type="radio" name="extras" id="extras">OnStar</td>
	<td><input type="radio" name="extras" id="extras">SiriusXM</td></tr>
	
	<tr><td>Rates</td><td><input type="radio" name="extras" id="extras">Weekday</td>
	<td><input type="radio" name="extras" id="extras">Weekend</td>
	<td><input type="radio" name="extras" id="extras">Week</td></tr>
	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "Submit" /></form>
</body>
</html>