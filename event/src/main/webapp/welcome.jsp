<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
  </div>
  <form action="saving" method="post">
<input type="submit" value="details">

</form>
</nav>

<nav class="navbar navbar-light" style="background-color: #e3f2fd;">
  <!-- Navbar content -->
</nav>
<h1 style="color:green">Welcome Page</h1>

<h1>Register here for event</h1>

<a style="color:blue">${msg}</a>
<br>



<form action="save" method="get">
First Name:<input type="text" name="fname"><br>
Last Name:<input type="text" name="lname"><br>
Mobile No:<input type="text" name="mobile"><br>
Address:<input type="text" name="address"><br>
Email:<input type="text" name="email"><br>

<label>Country:</label>
<select name="country">
<option value=" ">....Select Country...</option>
<option value="india">India</option>
<option value="pakistan">Pakistan</option>
<option value="uk">UK</option>
<option value="china">China</option>
</select><br>

<label>State:</label>
<select name="state">
<option value="">....Select State....</option>
<option value="karnataka">Karnataka</option>
<option value="kerala">Kerala</option>
<option value="thamil nadu">Thamil nadu</option>
<option value="dehli">Dehli</option>
<option value="up">UP</option>
</select>

 <p>Please Select your favorite Color.............</p>
 <input type="radio" id="green" name="favColor" value="Green">
 <label for="green">Green</label><br>
 <input type="radio" id="black" name="favColor" value="Black">
 <label for="black">Black</label><br>
 <input type="radio" id="blue" name="favColor" value="Blue">
 <label for="blue">Blue</label><br>



<p>Favorite Location for even............ </p>
<input type="checkbox" id="goa" name="favLocation" value="Goa">
<label for="goa">Goa</label><br>
<input type="checkbox" id="karnataka" name="favLocation" value="Karnataka">
<label for="karnataka">Karnataka</label><br>
<input type="checkbox" id="bengaluru" name="favLocation" value="Bengaluru">
<label for="bengaluru">Bengaluru</label><br>


Description: <textarea name="description"></textarea>

<br>

<input type="submit" value="save"> 

</form>



</body>
</html>