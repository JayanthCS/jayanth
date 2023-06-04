<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display page</title>
<style type="text/css">

th,td {
  text-align: center;
  border: 1px solid;
}

</style>
</head>



<body>

	<h1 style="color:blue">Display page.............</h1>







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

					</tr>


				</c:forEach>




			</thead>


		</table>
</body>
</html>