<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>订单打分</title>
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
	<script src="js/jquery.min.js"></script>
	</head>
<body>
<div class="gtco-loader"></div>
	
	<div id="page">
	<nav class="gtco-nav" style="background:#4F9D9D;position: static;" role="navigation">
		<div class="gtco-container">
			<div class="row">
				<div class="col-xs-2">
					<div id="gtco-logo"><a href="index">首页</a></div>
				</div>
				<div class="col-xs-8 text-center menu-1">
					<p style="font-size:30px;color:#ffffff;font-family: 华文行楷;">各“书”己见--订单打分</p>
				</div>
			</div>
			
		</div>
	</nav>
	<div id="gtco-team" class="gtco-section">
		<div class="gtco-container">
			<div class="container">
				<div class="row row-bottom-padded-md">
					<div class="col-md-6 col-md-offset-3 text-center">
						<h2 class="fh5co-lead animate-box">订单打分</h2>
						<p class="fh5co-sub-lead animate-box">Mark The Order</p>
					</div>
				</div>
				<div class="gtco-section">
					<div class="gtco-container">
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
							    </tr>
							 </thead>
					 	     <tbody>
										<tr>
											<td style="height:80px;">${order.order_id } </td>
											<td>${order.order_gname} </td>
											<td><input type="number" value="${order.order_number}" name="good_number" style="width:60%">本</td>
											<td>${order.order_price}元/本</td>
											<td><img src="images/${order.order_image}" class="img-responsive;display: block;max-width: 20%;height: auto;"/></td>
											<td>${order.order_status}</td>
										</tr>
				    		</tbody>
						</table>
					</div>
					</div>
				</div>
				<section id="fh5co-features-2">
					<div class="gtco-section">
						<div class="gtco-container">
							<div class="row">
								<div class="col-md-6 animate-box">
									<form action="intomark?order_id=${order.order_id }" method="post">   
										<div class="stars">
										    <span>对订单物流打分：</span>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <input type="text" name="mark_wl" class="small" />
										</div>
										<div class="stars">
										    <span>对订单质量打分：</span>
										    <i class="" score="1">★</i>
										    <i class="" score="2">★</i>
										    <i class="" score="3">★</i>
										    <i class="" score="4">★</i>
										    <i class="" score="5">★</i>
										    <input type="text" name="mark_zl" class="small"/>
										</div>
										<div class="stars">
										    <span>对订单服务打分：</span>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <i>★</i>
										    <input type="text" name="mark_fw" class="small"/>
										</div>
										<input type="submit" value="提交评分" class="form-control" style="margin-top:40px;background: #52d3aa;color: #fff;border: 2px solid #52d3aa;"/>
									</form>		
								</div>
								<div class="col-md-5 col-md-push-1 animate-box">
									
									<div class="gtco-contact-info">
										<h3>各“书己见</h3>
										<ul>
											<li class="address">求知而来&nbsp;载知而归 </li>
											<li class="address">锦绣成文&nbsp;原非我有</li>
											<li class="address">腹有诗书&nbsp;气质自华</li>
											<li class="address">琳琅满架&nbsp;惟待人求</li>
											<li class="address">足不出朔州&nbsp;视野遍全球</li>
										</ul>
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
	<script>
    $(function(){
        /*
        * 鼠标点击，该元素包括该元素之前的元素获得样式,并给隐藏域input赋值
        * 鼠标移入，样式随鼠标移动
        * 鼠标移出，样式移除但被鼠标点击的该元素和之前的元素样式不变
        * 每次触发事件，移除所有样式，并重新获得样式
        * */
        var stars = $('.stars');
        var Len = stars.length;
        //遍历每个评分的容器
        for(i=0;i<Len;i++){
            //每次触发事件，清除该项父容器下所有子元素的样式所有样式
            function clearAll(obj){
                obj.parent().children('i').removeClass('on');
            }
            stars.eq(i).find('i').click(function(){
                var num = $(this).index();
                clearAll($(this));
                //当前包括前面的元素都加上样式
                $(this).addClass('on').prevAll('i').addClass('on');
                //给隐藏域input赋值
                $(this).siblings('input').val(num);
            });
            stars.eq(i).find('i').mouseover(function(){
                var num = $(this).index();
                clearAll($(this));
                //当前包括前面的元素都加上样式
                $(this).addClass('on').prevAll('i').addClass('on');
            });
            stars.eq(i).find('i').mouseout(function(){
                clearAll($(this));
                //触发点击事件后input有值
                var score = $(this).siblings('input').val();
                for(i=0;i<score;i++){
                    $(this).parent().find('i').eq(i).addClass('on');
                }
            });
        }
    })
</script>
</body>
</html>