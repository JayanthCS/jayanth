<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


</head>
<body>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<h1 style="color:blue">Display Info Page..........</h1>

<h4 style="color:green">${msg}</h4>


Name:<%= request.getParameter("name") %><br>
Email:<%= request.getParameter("email") %><br>
Mobile:<%= request.getParameter("mobile") %><br>
Country:<%= request.getParameter("country") %><br>
Type:<%= request.getParameter("type") %><br>
Description:<%= request.getParameter("description") %>
<br>


<form action="done" method="post">
<input type="submit" value="details">

</form>


</body>
</html>