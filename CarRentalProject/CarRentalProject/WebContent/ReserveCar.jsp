<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CHOOSE CARS FROM HERE</title>
</head>
<body>
<table class="myTable"> 
			
			<c:forEach items="${availablecars}" var="availcar">
			<tr class="myTableRow"> 
				<td><c:out value="${availcar.CarName}" /></td> 
				<td><c:out value="${availcar.capacity}" /></td>
				
		   </tr>
		   </c:forEach>
</table>
</body>
</html>