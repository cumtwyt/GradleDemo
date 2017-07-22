<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>网上书城</title>
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
	<nav class="gtco-nav" role="navigation">
			<div class="gtco-container">
				<div class="row">
					<div class="col-xs-2">
						<div id="gtco-logo"><a href="index"><span style="font-family: 仿宋;font-size: 17px;font-weight: 200">用户：${numb}</span></a></div>
						<div id="gtco-logo"><a href="index"><span style="font-family: 仿宋;font-size: 14px">当前在线人数：${applicationScope.count}人</span></a></div>
					</div>
					<div class="col-xs-8 text-center menu-1">
						<ul>
							<li class="active"><a href="index">首页</a></li>
							<li><a href="#new">新品上市</a></li>
							<li class="has-dropdown"><a href="index#show">书籍展示</a></li>
							<li class="has-dropdown"><a href="# ">用户设置</a>
								<ul class="dropdown">
									<li style="font-size:13px;font-family:仿宋;"><a href="backpwd">查看个人信息</a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="p-update">修改密码</a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="check">修改个人信息</a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="order">查看订单 </a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="deletecomment">清空用户评论 </a></li>
								</ul>
							</li>
							<li><a href="#contact">联系我们</a></li>
						</ul>
					</div>
				</div>
			</div>
	</nav>
	<header id="gtco-header" class="gtco-cover" role="banner" style="background-image:url(images/back3.jpg);">
		<div class="gtco-container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<div class="display-t">
						<div class="display-tc animate-box" data-animate-effect="fadeIn">
							<h1>各“书”己见</h1>
							<h2>welcome to<br/>bookshop</h2>
							<p><a href="#" class="btn btn-default">开启书海之旅</a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	<div class="gtco-container">
		<div class="col-lg-12">
			<br/>
			<hr/>
		</div>
	</div>
	<div class="gtco-container">
		<div class="col-lg-12">
			<h3>用户评论</h3>
		</div>
		<div class="panel-body">
			<div class="panel panel-blue" style="background: #e8fff5;overflow-y: scroll;height: 400px;">
				<div class="panel-body">
					<ul style="list-style:none;">
						<c:forEach items="${requestScope.comment_list}" var="comment">
						<li class="left clearfix">
							<div class="chat-body clearfix">
								<div class="header">
									<strong class="primary-font">用户ID：${comment.user_id }</strong> <br/>
									<small class="text-muted">书籍ID：${comment.good_id }</small>
								</div>
								<div class="panel-body">
									<span>书籍评论</span>
									<p>
											${comment.com_con } 
									</p>
								</div>
								<div class="panel-body">
									<img src="images/${comment.com_image}" style="width:80%;height:50%"/>
								</div>
							</div>
						</li>
						</c:forEach>
					</ul>
				</div>
					</div>
			<div class="input-group">
				<span class="input-group-btn">
					<a href="addcomment"><button class="form-control" style="margin-top:40px;background: #52d3aa;color: #fff;border: 2px solid #52d3aa;" id="btn-chat">发表我的评论</button></a>
				</span>
			</div>
		</div><!--/.col-->
	</div>
	<div class="gtco-container" id="show">
		<div class="row">
			<hr/>
		</div>
	</div>

	<div id="gtco-started" id="contact">
			<div class="gtco-container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2 style="font-family:华文行楷">各“书”己见--网上书城</h2>
					</div>
					<div class="row">
						<div class="col-md-4 gtco-widget" style="padding-left:50px;">
							<h3>About Company</h3>
							<p>公司简介：Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit. Eos cumque dicta adipisci architecto culpa amet.</p>
						</div>
						<div class="col-md-2 col-md-push-1">
							<ul class="gtco-footer-links">
								<li><a href="#">Address</a></li>
								<li><a href="#">江苏省-徐州市-泉山区-大学路1号</a></li>
							</ul>
						</div>
		
						<div class="col-md-2 col-md-push-1">
							<ul class="gtco-footer-links">
								<li><a href="#">Tel</a></li>
								<li><a href="#">400-1111-2222</a></li>	
							</ul>
						</div>
		
						<div class="col-md-2 col-md-push-1">
						<ul class="gtco-footer-links">
							<li><a href="#">Post Code</a></li>
							<li><a href="#">220112</a></li>
						</ul>
					</div>
					</div>
				</div>
			</div>
	</div>
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
