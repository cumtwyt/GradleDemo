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
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="mindex"><span class="glyphicon glyphicon-pencil"></span>后台系统首页</a></li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>用户管理<span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-1">
					<li class="active">&emsp;&emsp;&emsp;<a href="showuser" class=""><span class="glyphicon glyphicon-pencil"></span>查看会员</a></li>
				</ul>
			</li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>书籍管理<span data-toggle="collapse" href="#sub-item-2" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-2">
					<li>&emsp;&emsp;&emsp;<a href="addbook"><span class="glyphicon glyphicon-pencil"></span>添加书籍</a></li>
					<li>&emsp;&emsp;&emsp;<a href="updatebook"><span class="glyphicon glyphicon-pencil"></span> 修改书籍</a></li>
					<li>&emsp;&emsp;&emsp;<a href="deletebook"><span class="glyphicon glyphicon-pencil"></span>删除书籍</a></li>
				</ul>
			</li>
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>订单管理<span data-toggle="collapse" href="#sub-item-3" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-3">
					<li>&emsp;&emsp;&emsp;<a href="order"><span class="glyphicon glyphicon-pencil"></span>查看订单</a></li>
				</ul>
			</li>
			
			<li>
				<a href="#"><span class="glyphicon glyphicon-pencil"></span>书籍分类管理<span data-toggle="collapse" href="#sub-item-4" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></a>
				<ul class="children collapse" id="sub-item-4">
					<li>&emsp;&emsp;&emsp;<a href="addclass"><span class="glyphicon glyphicon-pencil"></span>添加分类</a></li>
					<li>&emsp;&emsp;&emsp;<a href="updateclass"><span class="glyphicon glyphicon-pencil"></span> 修改分类</a></li>
					<li>&emsp;&emsp;&emsp;<a href="deleteclass"><span class="glyphicon glyphicon-pencil"></span>删除分类</a></li>
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
				<li class="active">用户注册会员统计</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">用户注册会员统计</h1>
			</div>
		</div><!--/.row-->
		<div class="row" >
			<div class="col-lg-12">
				<div class="panel panel-default" >
					<div class="panel-heading">会员汇总</div>
					<div class="panel-body">
						<table>
						    <thead>
						    <tr>
						        <th style="width:180px;">用户ID</th>
						        <th style="width:180px;">用户名</th>
						        <th style="width:180px;">性别</th>
						        <th style="width:180px;">年龄</th>
						        <th >联系方式</th>
						    </tr>
						    </thead>
						    <tbody>
						    <c:forEach items="${requestScope.user_list }" var="user">
								<tr>
									<td>${user.user_id }</td>
									<td>${user.user_name }</td>
									<td>${user.user_sex }</td>
									<td>${user.user_age }</td>
									<td>${user.user_tel }</td>
								</tr>
							</c:forEach>
						    </tbody>
						</table>
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