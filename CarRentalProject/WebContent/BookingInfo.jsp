<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BooKing Details</title>
</head>
<body>
<input name="errMsg" value="<c:out value='${errorMsg}'/>"
		type="text"
		style="background-color: white; color: red; border: none; width: 800px"
		disabled="disabled">
		
		
<select name="CardName" form="carform" >
  <option value="volvo">VISA</option>
  <option value="saab">MASTER CARD</option>
  <option value="mercedes">AMERICAN EXPRESS</option>
  <option value="audi">DISCOVER</option>
</select><br>
<form action="${pageContext.request.contextPath}/SearchFunction" id="carform" method = "POST">
VALID THROUGH <input type="text" name="vt"><br>
CVV NO <input type="text" name="cvv"/>

</form>
		
		
</body>
</html>