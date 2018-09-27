<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Car</title>
</head>
<body>
<h2>Search Car</h2>

<form action=" " method="post">
<table style="width: 50%">
	<tr>
		
		<td>Select start time:</td><td> <input type="time" name="starttime" id="starttime"></td></tr>
	<tr><td>Select start date: </td><td><input type="date" name="startdate" id="startdate"></td></tr>
	<tr><td>Select end time: </td><td><input type="time" name="endtime">id="endtime"</td></tr>
	<tr><td>Select end date: </td><td><input type="date" name="enddate">id="enddate"</td></tr>
	<tr>
		<td>Passengers : </td><td> <input type="text" name="passengers" id="passenger"/></td>
	</tr>
	
</table>
<br>
<br>
<input type="submit"  name = "submit" value = "Submit" /></form>
</body>
</html>