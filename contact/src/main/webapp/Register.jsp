<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">X-Workz</a>
//<a href="Home.jsp">Home</a>  
 <a href="ViewDetails">View Details</a>
 
</div>

</nav>
<h1>Register here</h1>
<h1 style="color: red;">${errors}</h1>
<h1 style="color: green;">${msg}</h1>


<div>
<form action="save" method="post" enctype="multipart/form-data">
<div>
<label>Name:</label>
<input type="text" name="name">
</div>
<div>
<label>Email:</label>
<input type="text" name="email">
</div>
<div>
<label>Mobile No:</label>
<input type="number" name="mobile">
</div>
<div>
<label>Comments:</label>
<textarea name="comments"></textarea>
</div>
<div>
<label>File:</label>
<input type="file" name="file">
</div>
<input type="submit" value="save">

</form>
</div>


</body>
</html>