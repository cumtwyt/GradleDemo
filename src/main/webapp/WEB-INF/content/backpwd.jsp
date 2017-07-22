<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix= "form" uri= "http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>找回密码</title>
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
							<p style="font-size:30px;color:#ffffff;font-family: 华文行楷;">各“书”己见--找回密码</p>
						</div>
					</div>
					
				</div>
			</nav>
			<div id="gtco-team" class="gtco-section">
				<div class="gtco-container">
					<div class="container">
						<div class="row row-bottom-padded-md">
							<div class="col-md-6 col-md-offset-3 text-center">
								<h2 class="fh5co-lead animate-box">Find Your Password</h2>
								<p class="fh5co-sub-lead animate-box">找回密码</p>
							</div>
						</div>
					</div>
					<section id="fh5co-features-2">
						<div class="gtco-section">
							<div class="gtco-container">
								<div class="row">
									<div class="col-md-6 animate-box">
										<h3>请输入：</h3>
										<form action="ifindpwd" method="post">
											<div>
												  <div class="row form-group" >
												    <label for="exampleInputusername">用户名</label>
												    <input name="username" class="form-control" id="exampleInputusername" placeholder="用户名" value="${user.user_name}" }>
												  </div>
												  <div class="row form-group">验证问题</label>
												    <input name="question" type="text" class="form-control" id="exampleInputquestion" placeholder="请输入你注册时设置的问题" value="${user.user_que}">
												  </div>
												  <div class="row form-group">
												    <label for="exampleInputanswer">验证答案</label>
												    <input name="answer" class="form-control" id="exampleInputanswer" placeholder="请输入您的答案" value="${user.user_anw}">
												  </div>
												  <div class="row form-group">
												  	<input type="submit" class="form-control" value="提交" style="margin-top:40px;background: #52d3aa;color: #fff;border: 2px solid #52d3aa;"  />
												  </div>
													  <div style="float:right;margin-top:25px;"><a href="login">返回登录页面</a></div>
											  		  <c:if test="${message!=null }"><c:out value="${message}" /></c:if>
										   	</div>
										</form>	
									</div>
									<div class="col-md-5 col-md-push-1 animate-box">
										<div class="gtco-contact-info">
											<h3>各“书己见</h3>
											<ul>
												<li class="address">求知而来&emsp;载知而归 </li>
												<li><hr></li>
												<li class="address">锦绣成文&emsp;原非我有</li>
												<li><hr></li>
												<li class="address">腹有诗书&emsp;气质自华</li>
												<li><hr></li>
												<li class="address">琳琅满架&emsp;惟待人求</li>
												<li><hr></li>
												<li class="address">足不出朔州&emsp;视野遍全球</li>
											</ul>
										</div>
									</div>
								</div>
							</div>
						</div>
					</section>
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
</body>

</html>