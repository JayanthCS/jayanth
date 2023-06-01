<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<h1>Welcome Page...........</h1>
<h1>Contact App.............</h1>



<form action="save" method="post">
Name:<input type="text" name="name"><br>
Email:<input type="text" name="email"><br>
<label>Country:</label>
<select name="country">
<option value=" ">....Select Country...</option>
<option value="india">India</option>
<option value="pakistan">Pakistan</option>
<option value="uk">UK</option>
<option value="china">China</option>
</select><br>

Mobile:<input type="text" name="mobile"><br>

<label>Type:</label>
<select name="type">
<option value="">....Select Type....</option>
<option value="friend">Friend</option>
<option value="cousin">Cousin</option>
<option value="driver">Driver</option>
<option value="">Engineer</option>
</select><br>

Description: <textarea name="description"></textarea>

<br>

<input type="submit" value="send">




	</form>

</body>
</html>