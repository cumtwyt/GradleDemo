<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>分类主题</title>

<link href="css/bootstrap.min1.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles1.css" rel="stylesheet">
<link rel="stylesheet" href="css/style.css">

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body style="padding-top:0;">
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
						<li><a href="index#new">新品上市</a></li>
						<li><a href="index#class">主题分类</a></li>
						<li class="has-dropdown"><a href="#show">书籍展示</a></li>
						<li class="has-dropdown"><a href="# ">用户设置</a>
							<ul class="dropdown">
								<li style="font-size:13px;font-family:仿宋;"><a href="backpwd">查看个人信息</a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="check">修改个人信息</a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="addcomment">添加书籍评论 </a></li>
								<li style="font-size:13px;font-family:仿宋;"><a href="deletecomment">清空用户评论 </a></li>
							</ul>
						</li>
						<li><a href="#contact">联系我们</a></li>
					</ul>
				</div>
				<div class="col-xs-2 text-right hidden-xs menu-1">
					<ul >
						<li class="btn-cta"><a href="login"><span>用户登录</span></a></li>
					</ul>
					<br/>
					<ul >
						<li class="btn-cta"><a href="enrollbutton"><span>新用户注册</span></a></li>
					</ul>
					<br/>
					<ul >
						<li class="btn-cta"><a href="mlogin"><span>管理员登录</span></a></li>
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
							<h2>welcome to<br/>online bookshop</h2>
							<p><a href="#" class="btn btn-default">开启书海之旅</a></p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
	</div>
	<div class="gtco-container" id="show">
		<div class="row">
			<hr/>
		</div>
	</div>
	<div class="gtco-container" id="show">
		<div class="row">
			<ol class="breadcrumb">
				<li class="active">Show The Book</li>
			</ol>
		</div><!--/.row-->
		<div class="row">
			<hr/>			
			<div class="col-lg-12">
				<h2>Basic Panels</h2>
			</div>
			<form action="category" method="post">
			<c:forEach items="${requestScope.good_list}" var="good">
				<div class="col-md-4">
					<div class="panel panel-success">
						<div class="panel-body">
							<a href="item.action?id=${good.good_id}"><img src="images/${good.good_image}"height="240px" width="100%"></a>
						</div>
	                    <div class="panel-heading">
							${good.good_name }
						</div>
	                    <div class="panel-body">
							价格：${good.good_price }元
						</div>
	                    <div class="panel-body">
							<a href="item.action?id=${good.good_id}"><p>${good.good_remark }</p></a>
						</div>
					</div>
				</div>
			</c:forEach>
			</form>
	</div><!-- /.row -->
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
			
		
		
	</div><!--/.main-->

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