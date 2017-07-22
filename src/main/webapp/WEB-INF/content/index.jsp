<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>各“书”己见</title>
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
						<li><a href="#class">主题分类</a></li>
						<li class="has-dropdown"><a href="#show">书籍展示</a></li>
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
	
	<div id="gtco-testimonial">
		<div class="gtco-container"id="new">
			<!-- <div class="row"> -->
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2>新书上架</br>new</h2>
					</div>
				</div>
				<div class="row animate-box">
					
				
					<div class="owl-carousel owl-carousel-fullwidth ">
						<c:forEach items="${requestScope.good_list}" var="good" begin="0" end="2" step="1">
                        <div class="item">
                            <div class="testimony-slide active text-center">
								<figure>
									<a href="item.action?id=${good.good_id}"><img src="images/${good.good_image}"/></a>
								</figure>
								<p style="font-size:22px;font-family:华文新魏;">${good.good_name}</p>
								<blockquote>
									<p>价格：￥${good.good_price}<br/>&ldquo;${good.good_remark}&rdquo;</p>
								</blockquote>
							</div>
						</div>
						</c:forEach>
					</div>
				</div>
			<!-- </div> -->
		</div>
	</div>
	<div class="gtco-container" id="class">
			
			<div class="row animate-box">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>热门主题</h2>
					<p>hot</p>
				</div>
			</div>

			<div class="row animate-box">
				
				<div class="gtco-tabs">
					<ul class="gtco-tab-nav">
						<li class="active"><a href="" data-tab="1"><span class="icon visible-xs"><i class="icon-command"></i></span><span class="hidden-xs">主题1</span></a></li>
						<li><a href="" data-tab="2"><span class="icon visible-xs"><i class="icon-bar-graph"></i></span><span class="hidden-xs">主题2</span></a></li>
						<li><a href="#" data-tab="3"><span class="icon visible-xs"><i class="icon-bag"></i></span><span class="hidden-xs">主题3</span></a></li>
						<li><a href="#" data-tab="4"><span class="icon visible-xs"><i class="icon-box"></i></span><span class="hidden-xs">主题4</span></a></li>
					</ul>

					<!-- Tabs -->
					<div class="gtco-tab-content-wrap">
						<div class="gtco-tab-content tab-content active" data-tab-content="1">
							<div class="col-md-6">
								<div class="gtco-video gtco-bg" style="background-image: url(images/class1.jpg); ">
									<a href="category.action?sid=1"><i>more</i></a>
									<div class="overlay"></div>
								</div>
							</div>
							<div class="col-md-6">
								<h2>Web Design</h2>
								<p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>

								<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

								<div class="row">
									<div class="col-md-6">
										<h2 class="uppercase">Keep it simple</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
									<div class="col-md-6">
										<h2 class="uppercase">Less is more</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
								</div>

							</div>
						</div>

						<div class="gtco-tab-content tab-content" data-tab-content="2">
							<div class="col-md-6">
								<div class="gtco-video gtco-bg" style="background-image: url(images/class2.jpg); ">
									<a href="category.action?sid=2"><i>more</i></a>
									<div class="overlay"></div>
								</div>
							</div>
							<div class="col-md-6">
								<h2>Online Marketing</h2>
								<p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>

								<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

								<div class="row">
									<div class="col-md-6">
										<h2 class="uppercase">Ready to use</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
									<div class="col-md-6">
										<h2 class="uppercase">100% Satisfaction</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
								</div>

							</div>
						</div>

						<div class="gtco-tab-content tab-content" data-tab-content="3">
							<div class="col-md-6">
								<div class="gtco-video gtco-bg" style="background-image: url(images/class3.jpg); ">
									<a href="category.action?sid=3"><i>more</i></a>
									<div class="overlay"></div>
								</div>
							</div>
							<div class="col-md-6">
								<h2>e-Commerce</h2>
								<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

								<p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>
								<div class="row">
									<div class="col-md-6">
										<h2 class="uppercase">Easy to shop</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
									<div class="col-md-6">
										<h2 class="uppercase">No credit card required</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
								</div>
								
							</div>
						</div>

						<div class="gtco-tab-content tab-content" data-tab-content="4">
							<div class="col-md-6">
								<div class="gtco-video gtco-bg" style="background-image: url(images/class4.jpg); ">
									<a href="category.action?sid=4"><i>more</i></a>
									<div class="overlay"></div>
								</div>
							</div>
							<div class="col-md-6">
								<h2>Logo &amp; Branding</h2>
								<p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>

								<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

								<div class="row">
									<div class="col-md-6">
										<h2 class="uppercase">Pixel perfect</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
									<div class="col-md-6">
										<h2 class="uppercase">User Interface Expert</h2>
										<p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
									</div>
								</div>
							</div>
						</div>
				</div>
			</div>
		</div>
	<div class="gtco-container" id="show">
			<div class="row animate-box">
				<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
					<h2>书籍展示区</h2>
					<h3>Show The Books</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12" style="float:right;margin-top:25px;">
					<a href="shop"><button type="submit" class="btn btn-primary">查看更多</button></a>
				</div>
			</div><!--/.row-->
			<div class="row">
			<hr/>			
			<div class="col-lg-12">
				<h2>书籍展示</h2>
			</div>
			<c:forEach items="${requestScope.good_list}" var="good">
				<div class="col-md-4">
				<div class="panel panel-success">
					<div class="panel-body">
						<a href="item.action?id=${good.good_id}"><img src="images/${good.good_image}"height="240px" width="100%"></a>
					</div>
                    <div class="panel-heading">
						<a href="item.action?id=${good.good_id}">${good.good_name }</a>
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
	</div><!-- /.row -->
	</div>
	<div id="gtco-started" id="contact">
			<div class="gtco-container">
				<div class="row animate-box">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2 style="font-family:华文行楷">各“书”己见--网上书城</h2>
					</div>
					<div class="row">
						<div class="col-md-4 gtco-widget"style="padding-left:50px;">
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

