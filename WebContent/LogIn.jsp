<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Log In</title>
<link rel="stylesheet" href="css\formstyle.css">
<link rel='stylesheet prefetch'
	href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>
</head>

<body>

	<div id="shop">
		<a href="index.jsp"><span class="glyphicon glyphicon-chevron-left"></span>Back</a>
	</div>
	<div class="wrapper">
		<form class="form-signin" method ="post" action ="login" id ="login">
			<h2 class="form-signin-heading">Please Log In</h2>
			<input type="text" class="form-control" name="email"
				placeholder="Email Address" required="" autofocus="" /> <input
				type="password" class="form-control" name="password"
				placeholder="Password" required="" />

			<button class="btn btn-lg btn-primary btn-block" type="submit">Log
				In</button>
		</form>
	</div>
	<div id="link-container">
		<a id="link" href="SignUp.jsp">If you don't have an account <b>click
				here to Sign Up</b></a>
	</div>
</body>
</html>