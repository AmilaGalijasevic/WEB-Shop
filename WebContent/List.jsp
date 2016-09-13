<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
<link rel="stylesheet" href="css\formstyle.css">
<link rel='stylesheet prefetch'
	href='http://netdna.bootstrapcdn.com/bootstrap/3.0.2/css/bootstrap.min.css'>
</head>

<body>
	<div id="shop">
		<a href="Home.jsp"><span class="glyphicon glyphicon-chevron-left"></span>Back</a>
	</div>

	<div class="wrapper">
		<div class="container">
			<h2 style="color: white;">Found colors:</h2>
			<br>
			<c:out value="${message}"></c:out>
					<form action="AddToCart" >
			<table class="table table-hover" style="color: white;">
				<thead>
					<tr>
						<th>#</th>
						<th>Type</th>
						<th>Name</th>
						<th>Color</th>
						<th>Cart</th>

					</tr>
				</thead>
				<tbody>

						<c:forEach items="${list}" var="product" varStatus="counter">
							<tr>
								<td>${counter.count}</td>
								<td>${product.getType()}</td>
								<td>${product.getName()}</td>
								<td>${product.getColor()}</td>
								<td> <input type="checkbox" name = "name" value= "${product.getName()}"
									value="radio">  Add</td>
								<td>
							</tr>
						</c:forEach>

				</tbody>
			</table>
						<input type="submit" value="Add to cart">
					</form>
		</div>

	</div>

</body>
</html>
