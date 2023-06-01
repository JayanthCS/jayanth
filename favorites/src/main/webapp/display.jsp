<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	Food:<%=request.getAttribute("food")%>
	<br> Place:<%=request.getAttribute("place")%>
	<br> Person:<%=request.getAttribute("person")%>
	<br> Laptop1:<%=request.getAttribute("laptop1")%>
	<br> Laptop2:<%=request.getAttribute("laptop2")%>
	<br> Laptop3:<%=request.getAttribute("laptop3")%>



</body>
</html>