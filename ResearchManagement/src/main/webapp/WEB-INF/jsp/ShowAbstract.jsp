
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Scrolling Nav - Start Bootstrap Template</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="css/scrolling-nav.css" rel="stylesheet">

</head>

<body id="page-top">

	<!-- Navigation -->
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand js-scroll-trigger" href="#page-top">Start
				Bootstrap</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse"
				data-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ml-auto">
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#about">About</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#services">Services</a></li>
					<li class="nav-item"><a class="nav-link js-scroll-trigger"
						href="#contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<header class="bg-primary text-white">
		<div class="container text-center">
			<h1>Abstract Details</h1>

		</div>
	</header>

	<section id="about">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 mx-auto">



					<form>
						
						<div class="form-group">
							<label for="exampleInputPassword1">Title</label> <input
								type="text" class="form-control" id="exampleInputPassword1"
								value="${Papers.title}">
						</div>
						<div class="form-group">
							<label for="exampleInputEmail1">Abstract</label>
							<textarea class="form-control" id="exampleFormControlTextarea1"
								rows="10" value="${Papers.abstractColumn}">${Papers.abstractColumn}</textarea>
							
								
						</div>
						
						<a href="../Index" class="btn btn-primary">Go to Index</a>
					</form>
				</div>
			</div>
		</div>
	</section>





	<!-- Footer -->
	<footer class="py-5 bg-dark">
		<div class="container">
			<p class="m-0 text-center text-white">Copyright &copy; Your
				Website 2017</p>
		</div>
		<!-- /.container -->
	</footer>

	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom JavaScript for this theme -->
	<script src="js/scrolling-nav.js"></script>

</body>

</html>
