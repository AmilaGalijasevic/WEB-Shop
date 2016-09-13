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
	<form action="search" method = "get">
		<div id="shop">
			<a href="Home.jsp">ColorShop</a> <a href="products">Products</a> <a
				href="Contacts.jsp">Contacts</a>

		</div>


		<input id="search-bar" name="search" type="text" placeholder="Search">
		<input id="search-button" class="btn btn-default btn-md"
			name="search_submit" type="submit" value="Search" span
			class=" glyphicon glyphicon-search"> </span>


		<ul>
			<li><a href="Cart.jsp"><span
					class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
			<li><a href="LogOut.jsp"><span
					class="glyphicon glyphicon-off"></span> Log Out</a></li>


		</ul>
	</form>
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
						<img src="http://www.gallaudet.edu/Images/EventXite/PaintCans.jpg"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Best quality</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">color 2</div>
					<div class="panel-body">
						<img src="http://goo.gl/TkHFTy" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Vibrant colors</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">color 3</div>
					<div class="panel-body">
						<img src="http://goo.gl/g3eiJd" class="img-responsive"
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
						<img src="http://goo.gl/9nBuv0" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Top spray cans</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">spray 2</div>
					<div class="panel-body">
						<img src="http://goo.gl/BTs4zZ" class="img-responsive"
							style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy them!</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-default">
					<div class="panel-heading">spray 3</div>
					<div class="panel-body">
						<img
							src="http://maximilliangallery.com/wp-content/uploads/2012/10/AndyAppleton_3WiseCans_2012.png"
							class="img-responsive" style="width: 100%" alt="Image">
					</div>
					<div class="panel-footer">Buy now!</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<br />

	</main>
	<footer class="container-fluid text-center">
	<p id="copy">WebShop &copy; Amila Galijasevic</p>
	</footer>
</body>
</html>
