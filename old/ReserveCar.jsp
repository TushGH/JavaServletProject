<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CHOOSE CARS FROM HERE</title>
</head>
<body>
	<table class="myTable">

		<c:forEach items="${caravail}" var="availcar">
			<tr class="myTableRow">
				<td>${availcar.carName}</td> 
				<td>${availcar.capacity} </td>
				<td>${availcar.startDate}</td>
				
				

			</tr>
		</c:forEach>
	</table>
</body>
</html>