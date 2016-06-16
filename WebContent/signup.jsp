<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7]>		<html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>			<html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>			<html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->	<html class="no-js" lang=""> <!--<![endif]-->
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="description" content="">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>RARORIBICA</title>
	<link rel="apple-touch-icon" href="apple-touch-icon.png">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/owl.theme.css">
	<link rel="stylesheet" href="css/transitions.css">
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/responsive.css">
	<script src="js/modernizr-2.8.3-respond-1.4.2.min.js"></script>
</head>
<body>
	<div id="sliding" class="sliding">
		<div class="container">
			<a href="#" class="show_hide fa fa-close pull-right"></a>
			<form class="header-search-form">
				<fieldset>
					<input type="text" class="form-control" placeholder="Search here...">
				</fieldset>
			</form>
		</div>
	</div>
	
	<div id="wrapper">
		<header id="header" class="tg-header haslayout">
			<nav id="nav" class="navbar navbar-default" data-spy="affix" data-offset-top="205">
				<div class="container">
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a href="index.jsp">Home</a></li>
							<li><a href="our-journey.jsp">our journey</a></li>
							<li><a href="new-journey.jsp">new journey</a></li>
							<li><a href="about-us.jsp">about us</a></li>
							<li><a href="#" class="btn-search fa fa-search show_hide">search</a></li>
							<li style="position: absolute; margin-left: 220px;"><a href="login.jsp">Log in</a></li>
							<li class="selected" style="position: absolute; margin-left: 290px;">
								<a href="signup.jsp">Sign up</a>
								<!--<ul class="dropdown-menu">
									<li class="active"><a href="index.html">Home</a></li>
									<li><a href="index-slider.html">Home slider</a></li>
									<li><a href="index-masonry.html">Home Masnory</a></li>
									<li><a href="index-three-columns.html">Home Three Columns</a></li>
									<li><a href="single.html">Single</a></li>
									<li><a href="index-fixnav.html">Sticky Nav</a></li>
								</ul>-->
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</header>
		
		<main id="main" class="haslayout" >
			<div id="twocolumns" class="container">
				<div class="row">
					<div class="box div-center">
						<div class="description">
							<p>Be part of our journey journal.</p>
						</div>
						<form class="form-newsletter" action="SignUpServlet" method="post" name="create new post">
							<fieldset>
								<div class="form-group"><input type="text" name="name" class="form-control" placeholder="Name" required></div>
								<div class="form-group"><input type="text" name="username" class="form-control" placeholder="Username" required></div>
								<div class="form-group"><input type="password" name="password1" class="form-control" placeholder="Password" required></div>
								<div class="form-group"><input type="password" name="password2" class="form-control" placeholder="Confirm Password" required></div>
								<div class="form-group"><button type="submit">Sign Up</button></div>
							</fieldset>
						</form>
						<div class="description" style="text-align:center">
							<p>Already have an account? <a href="login.jsp">Log In here.</a> </p>
						</div>
					</div>
				</div>
			</div>
		</main>
		
		<footer id="footer" class="haslayout">
			<div class="copyright">
				<div class="container">
					<p>Copyright &copy; 2016 - All Rights Reserved.</p>
				</div>
			</div>
		</footer>
	</div>
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/owl.carousel.js"></script>
	<script src="js/isotope.pkgd.min.js"></script>
	<script src="js/isotop.js"></script>
	<script src="js/theia-sticky-sidebar.js"></script>
	<script src="http://maps.google.com/maps/api/js?sensor=false"></script>
	<script src="js/gmap3.min.js"></script>
	<script src="js/main.js"></script>
</body>
</html>