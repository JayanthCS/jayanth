<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>
	<nav class="navbar navbar-dark bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">X-Workz</a> <a href="saving">View
				Details</a>
		</div>

	</nav>

	<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
		<!-- Navbar content -->
	</nav>
		<h1 style="color: blue">Welcome Page............</h1>
		<h1>Enter Cricketer details.......</h1>

		<a style="color: blue">${msg}</a><br>
		<c:forEach items="${error}" var="error">
			<a style="color: red">${error.defaultMessage}</a>
		</c:forEach>
		<br>
		<div>
			<a href="Image.jsp">View In</a>
		</div>

		<form action="save" method="post" enctype="multipart/form-data">

			Name:<input type="text" name="name"><br> <label>Country:</label>
			<select name="country">
				<option value=" ">....Select Country...</option>
				<option value="india">India</option>
				<option value="pakistan">Pakistan</option>
				<option value="uk">UK</option>
				<option value="china">China</option>
			</select><br> Age:<input type="number" name="age" /><br> <label>Upload
				image</label> <input type="file" name="file" /><br> <input
				type="submit" value="save" />


		</form>
</body>
</html>