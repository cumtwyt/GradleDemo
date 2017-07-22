<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>用户登录</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Website Template" />
	<meta name="keywords" content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
	

	

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />

	<!-- <link href='https://fonts.googleapis.com/css?family=Work+Sans:400,300,600,400italic,700' rel='stylesheet' type='text/css'> -->
	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">

	<!-- Magnific Popup -->
	<link rel="stylesheet" href="css/magnific-popup.css">

	<!-- Owl Carousel  -->
	<link rel="stylesheet" href="css/owl.carousel.min.css">
	<link rel="stylesheet" href="css/owl.theme.default.min.css">

	<!-- Theme style  -->
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
<body>
<div class="gtco-loader"></div>
	
	<div id="page">
	<nav class="gtco-nav" style="background:#4F9D9D;position: static;" role="navigation">
		<div class="gtco-container">
			<div class="row">
				<div class="col-xs-2">
					<div id="gtco-logo"><a href="index">返回首页</a></div>
				</div>
				<div class="col-xs-8 text-center menu-1">
					<p style="font-size:30px;color:#ffffff;font-family: 华文行楷;">各“书”己见--用户登录</p>
				</div>
			</div>
			
		</div>
	</nav>
	<div id="gtco-team" class="gtco-section">
		<div class="gtco-container">
			<div class="row animate-box">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>欢迎登录各“书”己见</h2>
				</div>
			</div>
			<div class="container">
				<div class="row row-bottom-padded-md">
					<div class="col-md-6 col-md-offset-3 text-center">
						<h2 class="fh5co-lead animate-box">Login For The Shop</h2>
						<p class="fh5co-sub-lead animate-box">用户登录</p>
					</div>
				</div>
		<section id="fh5co-features-2">
			<div class="gtco-section">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-6 animate-box">
					<h3>请输入：</h3>
					<form action="login" method="post">
						<div class="row form-group">
							<div class="col-md-12">
								<label for="loginname">用户名：</label>
    							<input type="text" placeholder="Username" name="loginname" id="loginname" class="form-control" >
							</div>
						</div>
						<div class="row form-group">
							<div class="col-md-12">
								<label for="pwd">密码：</label>
    							<input type="password" placeholder="Password" name="password" id="pwd" class="form-control">
        					</div>
        				</div>
        				<div class="row form-group">
        					<div class="col-md-12">
    							<input type="checkbox"  id="checkbox"/>记住密码
        					</div>
						</div>
						<br/>
						<div class="form-group">
							<button type="submit" class="btn btn-primary" onclick="Save()">登录</button>
							<span style="font-family: 仿宋;font-size: 14px"><a href="backpwd">忘记密码</a></span>
    						<a href="enrollbutton"/><input type="button" value="注册" class="btn btn-primary"/></a>
  						</div>
  						<c:if test="${message!=null}"><c:out value="${message}"></c:out></c:if>
					</form>
				</div>
				<div class="col-md-5 col-md-push-1 animate-box">
					
					<div class="gtco-contact-info">
						<figure class="fh5co-feature-image animate-box">
						<img src="images/login.jpg"  class="img-responsive"  alt="Free HTML5 Bootstrap Template by FREEHTML5.co">
					</figure>
					</div>

				</div>

				</div>
			</div>
			
		</div>
	</div>
		</section>
		<!-- END #fh5co-features-2 -->

		</div>
	</div>
	
		
	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>
	<script src="js/jquery.cookie.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			if($.cookie("rmbUser")=="true"){
				$("#checkbox").attr("checked",true);
				$("#loginname").val($.cookie("name"));
				$("#pwd").val($.cookie("pwd"));
				
			}
			
		});
	
		function Save(){
			if($("#checkbox:checked").length==1){
				var str_username=$("#loginname").val();
				var str_password=$("#pwd").val();
				$.cookie("rmbUser","true",{expires:7});
				$.cookie("name",str_username,{expires:7});
				$.cookie("pwd",str_password,{expires:7});
			}else{
				$.cookie("rmbUser","false",{expires:-1});
				$.cookie("name","",{expires:-1});
				$.cookie("pwd","",{expires:-1});
			}
			
		};
	</script>

</body>
</html>
