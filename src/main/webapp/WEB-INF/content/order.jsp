<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>用户订单</title>
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
						<div id="gtco-logo"><a href="index"><p style="font-size:25px;color:#ffffff;font-family:隶书;">${numb}的订单/首页</p></a></div>
					</div>
					<div class="col-xs-8 text-center menu-1">
					<p style="font-size:30px;color:#ffffff;font-family: 华文行楷;">各“书”己见--用户订单</p>
					</div>
					<div class="col-xs-2">
						<div>
						<form action="selectorder">
							<input type="text" name="order_id" placeholder="输入订单号查询订单" style="width:70%"/>
					 		<input type="submit" value="搜索" style="width:25%"/>
						</form>
						</div>
					</div>
				</div>
			</div>
		</nav>
		<div class="gtco-container">
			<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center">
						<h1 class="page-header">我的订单</h1>
						<h3>Show The Order</h3>
					</div>
			</div>
			<div class="row animate-box">
				<div class="panel panel-default col-lg-12" >
					<div class="panel-heading" style="height:10%">
						<div >
							<p>订单商品清单</p>
						</div>
					</div>
					<div class="panel-body">
						<table>
						    <thead>
							    <tr>
							        <th style="width:15%;">订单编号</th>
							        <th style="width:15%;">购买书籍名称</th>
							        <th style="width:10%;">购买数量</th>
							        <th style="width:10%;">单价</th>
							        <th style="width:20%;">图片</th>
							        <th style="width:10%;">状态</th>
							        <th style="width:10%;">操作</th>	
							        <th style="width:10%;">评论</th>								        
							    </tr>
							 </thead>
					 	     <tbody>
					 	     	  <c:forEach items="${save}" var="order"> 
					 	     	  	<form action="makesure?order_id=${order.order_id }" method="post">
										<tr>
											<td style="height:80px;">${order.order_id } </td>
											<td>${order.order_gname} </td>
											<td><input type="number" value="${order.order_number}" name="good_number" style="width:60%">本</td>
											<td>${order.order_price}元/本</td>
											<td><img src="images/${order.order_image}" class="img-responsive;display: block;max-width: 20%;height: auto;"/></td>
											<td>${order.order_status}</td>
											<td><input type="submit" value="确认收货" class="btn btn-primary" name="order_status"/></td>
											<td><a href="addmark?order_id=${order.order_id}"><button type="button" class="btn btn-primary">订单评价</button></a></td>
										</tr>
								 </form>
								  </c:forEach>
				    		</tbody>
						</table>
					</div>
				</div>
			</div>
		</div> 
		<hr>
		<div id="gtco-started" id="contact">
			<div class="gtco-container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2 style="font-family:华文行楷">各“书”己见--网上书城</h2>
					</div>
					<div class="row">
						<div class="col-md-4 gtco-widget">
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