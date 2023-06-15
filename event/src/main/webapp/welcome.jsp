<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
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
	margin-left: -16%;
	position: absolute;
	margin-top: -10%;

}


</style>
</head>
<body>

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">X-Workz</a>
 <a href="Image.jsp">View In</a> 
 <a href="saving">View Details</a>
 
</div>

</nav>



<h1 style="color:green" class="d-flex justify-content-center">Welcome Page</h1>

<h1 class="d-flex justify-content-center">Register here for event</h1>

<a style="color:blue" class="d-flex justify-content-center">${msg}</a>

<c:forEach  items="${error}" var="error">
<a style="color:red" class="d-flex justify-content-center">${error.defaultMessage}</a><br>

</c:forEach>


<br>





<div id="form" class="d-flex justify-content-center">
<form action="save" method="post" enctype="multipart/form-data">
<label>First Name:</label><input type="text" name="fname" id="name" onchange="valideName()"> <span id="nameError" style="color: red;"></span> <br>
<label>Last Name:</label><input type="text" name="lname" id="lname" onchange="validLName()"> <span id="lnameError" style="color: red;"></span><br>
<label>Mobile No:</label><input type="text" name="mobile" id="mobile" onchange="validMobile()"> <span id="mobileError" style="color: red;"></span><br>
<label>Address:</label><input type="text" name="address" id="address" onchange="validAddress()"><span id="addressError" style="color: red;"></span><br>
<label>Email:</label><input type="text" name="email" id="email"><br>

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






<label>Description:</label> <textarea name="description"></textarea>

<br>
<label><p>Favorite Location:</p></label>
<input type="radio" name="favLocation" value="Goa">Goa

<input type="radio"  name="favLocation" value="Karnataka">Karnataka

<input type="radio" name="favLocation" value="Bengaluru">Bengaluru
<br>
<label >Upload image</label>

<input type="file"  name="file"><br>
<input type="submit"  value="save"> 

</form>
</div>


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

function validLName() {
	var userLName=document.getElementById("lname");
	var userLNameValue=userLName.value;
	console.log(userLNameValue);
	if(userLNameValue!=null && userLNameValue!=""&& userLNameValue.length>1&& userLNameValue.length<30){
		document.getElementById("lnameError").innerHTML="";
	}else{
		document.getElementById("lnameError").innerHTML="lname should be greater than 3 and less than 30";
	}
}

function validMobile() {
	var userMobile=document.getElementById("mobile");
	var userMobileValue=userMobile.value;
	console.log(userMobileValue);
	if(userMobileValue!=""&&userMobileValue.length>9){
		document.getElementById("mobileError").innerHTML="";
			}else{
				document.getElementById("mobileError").innerHTML="Mobile number should be greaterThan 9 and not empty";
			}
}

function validAddress() {
	var userAddress=document.getElementById("address");
	var userAddressValue=userAddress.value;
	console.log(userAddressValue);
	if(userAddressValue!=null&&userAddressValue!=""&&userAddressValue.length>5&&userAddressValue.length<50){
		document.getElementById("addressError").innerHTML="";
	}else{
		document.getElementById("addressError").innerHTML="Address should be more than 5 and less than 50";	
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