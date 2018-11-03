<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input name="errMsg" value="<c:out value='${errorMsg}'/>"
		type="text"
		style="background-color: white; color: red; border: none; width: 800px"
		disabled="disabled">
<img src="car4.png" alt="car img" height="100" width="100">
<link rel="stylesheet" type="text/css" href="test.css" media="screen" />
<table><tr><td>CAR AVAILABLE </td></tr>
<c:forEach items="${list}" var="item">
  <tr><td>  ${item}  </td></tr><br>
</c:forEach>
</table>
<br> <br> <br>
Please Choose your car from drop Down List : 
<select name="database1" form="carform" >
  <c:forEach items="${list}" var="databaseValue">
    <option value="${databaseValue}">
        ${databaseValue}
    </option>
  </c:forEach>
</select><br><br>
PLEASE SELECT YOUR CAR HERE
<form action="${pageContext.request.contextPath}/SearchFunction" id="carform" method = "POST">



<input type = "hidden" name = "startdaten" value="${startdate}" /><br>
<input type = "hidden" name = "enddaten" value="${enddate}" /><br>
<input type="hidden" name="starttimen" value="${starttime}"/> <br> 
<input type="hidden"  name="endtimen" value="${endtime}" /> <br>
<input type="hidden" name="capacityn"  value="${capacity}" /><br>


             <input type ="submit" value="BookMyCar" name="submit"/>
</form>
</body>
</html>