<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="css\style.css">
<title>Color Shop</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div id="shop">
			<a href="#">ColorShop</a> <a href="#">Products</a> <a href="Contacts.jsp">Contacts</a>
		</div>
		<ul>
			<li><a href="LogIn.jsp"><span
					class="glyphicon glyphicon-user"></span>Log In</a></li>
			<li><a href="SignUp.jsp"><span
					class="glyphicon glyphicon-chevron-right"></span> Sign up</a></li>
		</ul>
	</div>
	</nav>

	<header>

	<div class="text-center">
		<h1>Welcome to ColorShop</h1>
		<h3>Providing you with the best of the best.</h3>

	</div>

	</header>

	<main>


	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">color 1</div>
					<div class="panel-body">
						<img src="images/PaintCans.jpg" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Best quality</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">color 2</div>
					<div class="panel-body">
						<img src="images/OpenPaintCans.jpg" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Vibrant colors</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">color 3</div>
					<div class="panel-body">
						<img src="images/VioletColorCans.jpg" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">50% off!</div>
				</div>
			</div>
		</div>
	</div>
	<br>

	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">spray 1</div>
					<div class="panel-body">
						<img src="images/CansArt.jpg" class="img-responsive" style="width: 100%"
							alt="Image">
					</div>
					<div class="panel-footer">Top spray cans</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">spray 2</div>
					<div class="panel-body">
						<img src="images/SprayCansFromAbove.JPG" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy them!</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">spray 3</div>
					<div class="panel-body">
						<img src="images/Sprays.png" class="img-responsive" style="width: 100%"
							alt="Image">
					</div>
					<div class="panel-footer">Buy now!</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br>

	<h3 id="signIn">Sign in to see our full stock</h3>
	<br />
	<button>
		<a href="SignUp.jsp">Sign In </a>
	</button>

	<br />
	<br />
	</main>

	<footer class="container-fluid text-center">
	<p id="copy">WebShop &copy; Amila Galijasevic</p>
</body>
</html>