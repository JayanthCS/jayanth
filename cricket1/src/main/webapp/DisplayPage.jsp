<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<style type="text/css">
th, td {
	text-align: center;
	border: 1px solid;
}
</style>

</head>
<body>

	<h1 style="color: blue">Details.........</h1>

	<table>
		<thead>
			<th>Name</th>
			<th>Country</th>
			<th>Age</th>
			<th>File</th>
			</thead>
			<br>

			<c:forEach items="${saving}" var="item">
				<tr>
					<td>${item.name}</td>
					<td>${item.country}</td>
					<td>${item.age}</td>
					<td><a target="_blank"
						href="fileDownload?fileName=${item.fileName}&contentType=${item.contentType}">${item.fileName}</a></td>




				</tr>


			</c:forEach>
		

	</table>
</body>
</html>