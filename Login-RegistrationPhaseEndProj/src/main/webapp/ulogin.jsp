<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>

	<form action="ulogin" method="post" name="form_name" id="form_id" class="form_class" >
	 
	  <label for="name">Name:</label><br>
	  <input type="text" id="name" name="name"><br>
	 
	  <label for="password">Password:</label><br>
	  <input type="text" id="password" name="password"><br><br>
	  
	  <input type="submit" value="Enter">
	</form>
	
	<br>
	<a href="index.jsp">Return Home</a>
	<br>

</body>
</html>