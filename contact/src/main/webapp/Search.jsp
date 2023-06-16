<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
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
<a href="Home.jsp">Home</a>  
 <a href="view">View Details</a>
 
</div>

</nav>

<form action="search" method="get">
Name<input type="text" name="name" /><input type="submit" value="Search" class="btn-success">

</form>

<table>
		<tr>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Comments</th>
			<th>File Name</th>
			<th>Content Type</th>
			<th>File Size</th>
			<th>File</th>
			</tr>
			
			
			<c:forEach items="${lists}" var="nm">

				<tr>
					<td>${nm.name}</td>
					<td>${nm.email}</td>
					<td>${nm.mobile}</td>
					<td>${nm.comments}</td>
					<td>${nm.fileName}</td>
					<td>${nm.contentType}</td>
					<td>${nm.fileSize}</td>
<td><a target="_blank" href="fileDownload?fileName=${nm.fileName}&contentType=${item.contentType}">${nm.fileName}</a></td>
					
					
				</tr>

			</c:forEach>

	</table>



</body>
</html>