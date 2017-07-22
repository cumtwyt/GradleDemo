<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>后台管理</title>

<link href="css/bootstrap.min1.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles1.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">


<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">各“书”己见</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
					<p>${sessionScope.manager.manager_name }</p>
					</li>
					
				</ul>
			</div>
		</div><!-- /.container-fluid -->
	</nav>
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="功能模块">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="mindex"><span class="glyphicon glyphicon-pencil"></span>后台系统首页</a></li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>用户管理<span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-1">
					<li>&emsp;&emsp;&emsp;<a href="showuser" class=""><span class="glyphicon glyphicon-pencil"></span>查看会员</a></li>
					<li>&emsp;&emsp;&emsp;<a href="deleteuser" class=""><span class="glyphicon glyphicon-pencil"></span>删除会员</a></li>
				</ul>
			</li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>书籍管理<span data-toggle="collapse" href="#sub-item-2" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-2">
				<li>&emsp;&emsp;&emsp;<a href="readgood"><span class="glyphicon glyphicon-pencil"></span>查看书籍</a></li>
					<li>&emsp;&emsp;&emsp;<a href="addbook"><span class="glyphicon glyphicon-pencil"></span>添加书籍</a></li>
					<li>&emsp;&emsp;&emsp;<a href="updatebook"><span class="glyphicon glyphicon-pencil"></span> 修改书籍</a></li>
					<li>&emsp;&emsp;&emsp;<a href="deletebook"><span class="glyphicon glyphicon-pencil"></span>删除书籍</a></li>
				</ul>
			</li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>订单管理<span data-toggle="collapse" href="#sub-item-3" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-3">
					<li class="active">&emsp;&emsp;&emsp;<a href="readorder"><span class="glyphicon glyphicon-pencil"></span>查看订单</a></li>
				</ul>
			</li>
			
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>书籍分类管理<span data-toggle="collapse" href="#sub-item-4" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-4">
					<li>&emsp;&emsp;&emsp;<a href="readsubject"><span class="glyphicon glyphicon-pencil"></span>查看分类</a></li>
					<li>&emsp;&emsp;&emsp;<a href="addsubject"><span class="glyphicon glyphicon-pencil"></span>添加分类</a></li>
					<li>&emsp;&emsp;&emsp;<a href="updatesubject"><span class="glyphicon glyphicon-pencil"></span> 修改分类</a></li>
					<li>&emsp;&emsp;&emsp;<a href="deletesubject"><span class="glyphicon glyphicon-pencil"></span>删除分类</a></li>
				</ul>
			</li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>书籍评论管理<span data-toggle="collapse" href="#sub-item-5" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-5">
					<li>&emsp;&emsp;&emsp;<a href="readcomment"><span class="glyphicon glyphicon-pencil"></span>查看评论lun</a></li>
				</ul>
			</li>
			
			<li role="presentation" class="divider"></li>
			<li><a href="mlogin"><span class="glyphicon glyphicon-user"></span>退出登录</a></li>
		</ul>
	</div><!--/.sidebar-->
	
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li class="active">用户订单</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">用户订单详情</h1>
			</div>
		</div><!--/.row-->
		<div class="row" >
			<div class="col-lg-12">
				<div class="panel panel-default" >
					<div class="panel-heading">订单汇总</div>
					<div class="panel-body">
						<center>
						<table class="table">
						    <thead>
						    <tr>
						        <th class="jz">订单ID</th>
						        <th class="jz">用户ID</th>
						        <th class="jz">商品ID</th>
						        <th class="jz">商品名</th>
						        <th class="jz">商品数量</th>
						        <th class="jz">商品价格</th>
						        <th class="jz">商品图片</th>
						        <th class="jz">订单状态</th>
						        <th class="jz">修改订单状态</th>
						    </tr>
						    </thead>
						    <tbody>
						    <c:forEach items="${requestScope.order_list }" var="order">
									<form action="updatestatus?order_id=${order.order_id }" method="post">
										<tr>
											<td class="jz" style="height:50px;">${order.order_id }</td>
											<td class="jz">${order.order_uid }</td>
											<td class="jz">${order.order_gid }</td>
											<td class="jz">${order.order_gname }</td>
											<td class="jz">${order.order_number }</td>
											<td class="jz">${order.order_price}</td>
											<td class="jz"><img  class="img-responsive;display: block;max-width: 20%;height: auto;" src="images/${order.order_image}"/></td>
											<td class="jz">
												<select name="order_status" id="order_status">   
											        <option value="${order.order_status}">${order.order_status}</option>   
											        <option value="待发货">待发货</option>
											        <option value="已发货">已发货</option>   
											        <option value="正在配送">正在配送</option>   
											        <option value="待收货">待收货</option>    
											     </select>   
											</td>
											<td><input type="submit" value="修改订单状态" class="btn btn-primary"/></td>
										</tr>
									</form>
									
							</c:forEach>
						    </tbody>
						</table>
						</center>
					</div>
				</div>
			</div>
		</div><!--/.row-->
	</div>
		

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script>
		$('#calendar').datepicker({
		});

		!function ($) {
		    $(document).on("click","ul.nav li.parent > a > span.icon", function(){          
		        $(this).find('em:first').toggleClass("glyphicon-minus");      
		    }); 
		    $(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>
</body>
</html>