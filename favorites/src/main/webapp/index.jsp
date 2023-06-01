<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<h1>Favorites List</h1>

	<div>
		<form action="send" method="post">

			<div>
				<label>Fav food:</label> <input type="text" name="fFood">
			</div>
			<div>
				<label>Fav Place:</label> <input type="text" name="fPlace">
			</div>
			<div>
				<label>Fav Person:</label> <input type="text" name="fPerson">
			</div>
			<div>
			<input type="submit" value="send">
			</div>


	</form>
	</div>

</body>
</html>