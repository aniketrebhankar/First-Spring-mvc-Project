<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search train</title>
</head>
<body>
<form action="saveuser" method="post">

<pre>
Train No:<input type ="number" name="trainno">
Train Name:<input type ="text" name ="trainname">
Source:<input type="text" name="source">
Destination:<input type="text" name="destination">
<!-- Departure time<input type ="date" name="dt"> -->
<!-- Arrival time<input type ="date" name="at"> -->

<input type="submit" value="submit">

</pre>

</form>

<a href="Login.html">login page</a>

</body>
</html>