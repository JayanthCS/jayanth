<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">

label{
width:100px;
display:inline-block;
margin:4px;
}

#form{
border-radius: 10px;
	background: aqua;
	color: black;
	width: 500px;
	padding: 20px;
	left: 50%;
	top: 50%;
	margin-left: -23%;
	position: absolute;
	margin-top: -10%;

}


</style>
</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">X-Workz</a>
<a href="Home.jsp">Home</a>  
 <a href="view">View Details</a>
 <a href="Search.jsp">Search</a>
 
</div>

</nav>
<h1 style="color: blue;" class="d-flex justify-content-center">Register here</h1>
<h1 style="color: red;">${errors}</h1>
<h1 style="color: green;" class="d-flex justify-content-center">${msg}</h1>


<div id="form" class="d-flex justify-content-center">
<form action="save" method="post" enctype="multipart/form-data">
<div>
<label>Name:</label>
<input type="text" name="name">
</div>
<div>
<label>Email:</label>
<input type="text" name="email" onchange="validEmail()" id="email">
<span id="Display" style="color: red"></span>
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

<script>

function validEmail() {
	const email=document.getElementById("email");
	const emailValue=email.value;
	console.log(emailValue)
	const mail = new XMLHttpRequest();
	mail.open("POST","http://localhost:8080/contact/valid/"+emailValue);
	mail.send();
	mail.onload= function(){
		document.getElementById("Display").innerHTML=this.responseText;
	}
}



</script>

</body>


</html>