<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<style type="text/css">
th, td {
	text-align: center;
	border: 1px solid;
}
</style>
</head>



<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">X-Workz</a>
   </div>
  </nav>
	<h1 style="color: blue">Display page.............</h1>







	<table>
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Mobile</th>
			<th>Address</th>
			<th>Email</th>
			<th>Country</th>
			<th>State</th>
			<th>Fav Color</th>
			<th>Fav Location</th>
			<th>Description</th>
			<th>File</th>

			<br>

			<c:forEach items="${saving}" var="item">
				<tr>
					<td>${item.fname}</td>
					<td>${item.lname}</td>
					<td>${item.mobile}</td>
					<td>${item.address}</td>
					<td>${item.email}</td>
					<td>${item.country}</td>
					<td>${item.state}</td>
					<td>${item.favColor}</td>
					<td>${item.favLocation}</td>
					<td>${item.description}</td>
					<td><a target="_blank"
						href="fileDownload?fileName=${item.fileName}&contentType=${item.contentType}">${item.fileName}</a></td>


				</tr>


			</c:forEach>




		</thead>


	</table>
</body>
</html>