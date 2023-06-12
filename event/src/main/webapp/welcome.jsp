<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">X-Workz</a>
  
 <a href="saving">View Details</a>
</div>

</nav>

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  <!-- Navbar content -->
</nav>
<center>
<h1 style="color:green">Welcome Page</h1>

<h1>Register here for event</h1>

<a style="color:blue">${msg}</a>

<c:forEach  items="${error}" var="error">
<a style="color:red">${error.defaultMessage}</a><br>

</c:forEach>


<br>

<div><a href="Image.jsp">View In</a></div>




<form action="save" method="post" enctype="multipart/form-data">
First Name:<input type="text" name="fname" id="name" onchange="valideName()"> <span id="nameError" style="color: red;"></span> <br>
Last Name:<input type="text" name="lname" id="lname"><br>
Mobile No:<input type="text" name="mobile" id="mobile"><br>
Address:<input type="text" name="address" id="address"><br>
Email:<input type="text" name="email" id="email"><br>

<label>Country:</label>
<select name="country" id="country" onchange="validCountry()"> 
<option value=" ">....Select Country...</option>
<option value="india">India</option>
<option value="pakistan">Pakistan</option>
<option value="uk">UK</option>
<option value="china">China</option>
</select><span id="countryError" style="color: red;"></span><br>

<label>State:</label>
<select name="state">
<option value="">....Select State....</option>
<option value="karnataka">Karnataka</option>
<option value="kerala">Kerala</option>
<option value="thamil nadu">Thamil nadu</option>
<option value="dehli">Dehli</option>
<option value="up">UP</option>
</select>
<br>
<label> Favorite Color:</label>
 <input type="radio" name="favColor" value="Green">Green
 
 <input type="radio" name="favColor" value="Black">Black
 
 <input type="radio" name="favColor" value="Blue">Blue

 <br>



<p>Favorite Location for even............ </p>
<input type="checkbox" name="favLocation" value="Goa">
<label for="goa">Goa</label><br>
<input type="checkbox"  name="favLocation" value="Karnataka">
<label for="karnataka">Karnataka</label><br>
<input type="checkbox" name="favLocation" value="Bengaluru">
<label for="bengaluru">Bengaluru</label><br>


Description: <textarea name="description"></textarea>

<br>
<label >Upload image</label>

<input type="file"  name="file"><br>
<input type="submit"  value="save"> 

</form>
</center>


<script>
function valideName() {
	var userName=document.getElementById("name");
	var userNameValue=userName.value;
	console.log(userNameValue);
	if(userNameValue!=null && userNameValue!=""&& userNameValue.length>3&& userNameValue.length<30){
		document.getElementById("nameError").innerHTML="";
	}else{
		document.getElementById("nameError").innerHTML="name should be greater than 3 and less than 30";
	}
}


function validCountry() {
	var userCountry=document.getElementById("country");
	var userCountryValue=userCountry.value;
	console.log(userCountryValue);
	if(userCountryValue!=" "){
		document.getElementById("countryError").innerHTML="";
		
	}else{
		document.getElementById("countryError").innerHTML="Please Select country";
	}
}

</script>
</body>
</html>