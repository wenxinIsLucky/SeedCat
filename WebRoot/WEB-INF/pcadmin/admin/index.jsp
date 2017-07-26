<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!-- <link rel="icon" href="page/images/ymkj.ico" type="image/x-icon"> -->
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
<title>籽匠猫-后台管理</title>
<script src="pc/js/jquery-2.1.1.min.js"></script>
<!-- Bootstrap Styles-->
<link href="pcadmin/assets/css/bootstrap.css" rel="stylesheet" />
<!-- FontAwesome Styles-->
<link href="pcadmin/assets/css/font-awesome.css" rel="stylesheet" />
<!-- Custom Styles-->
<link href="pcadmin/assets/css/custom-styles.css" rel="stylesheet" />
<link href="pcadmin/assets/css/liwenxin.css" rel="stylesheet" />
<script src="pc/js/liwenxin.js"></script>
<script src="pcadmin/admin/js/index.js"></script>
<style type="text/css">
.ban_zhen_div {
	height: 100%;
	width: 100%;
	position: fixed;
	_position: absolute;
	top: 0;
	z-index: 1000;
}

.none {
	display: none;
}

.current {
	background-color: #E5EBF2;
}

.black {
	color: #000;
}
</style>

</head>
<body>
	<div id="wrapper">
		<nav class="navbar navbar-default top-navbar" role="navigation">
			<div class="navbar-header">

				<a class="navbar-brand" href="javascript:void(0);">籽匠猫</a>
			</div>
		</nav>
		<!--/. NAV TOP  -->
		<nav class="navbar-default navbar-side" role="navigation">
			<div class="sidebar-collapse">

				<ul class="nav" id="main-menu">

					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>软装套餐管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-ruanzhuang-addrz_package" target="bb" class="userlist">添加软装套餐</a></li>
							<li class="p"><a href="admin-ruanzhuang-showrz_package" target="bb" class="userlist">软装套餐列表</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>家装套餐管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-yingzhuang-addjz_package" target="bb" class="userlist">添加家装套餐</a></li>
							<li class="p"><a href="admin-yingzhuang-showjz_package" target="bb" class="userlist">家装套餐列表</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>设计师管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-designer-add_designer" target="bb" class="userlist">新增设计师</a></li>
							<li class="p"><a href="admin-designer-show_designer" target="bb" class="userlist">设计师列表</a></li>
							<li class="p"><a href="admin-designer-upd_dialogue" target="bb" class="userlist">设计师对话管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>籽匠工艺管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-technology-technologypost" target="bb" class="userlist">添加籽匠工艺</a></li>
							<li class="p"><a href="admin-technology-classic_casepost" target="bb" class="userlist">添加经典案例</a></li>
							<li class="p"><a href="admin-technology-vradd" target="bb" class="userlist">VR管理</a></li>
							<li class="p"><a href="admin-technology-show_technology" target="bb" class="userlist">籽匠工艺管理</a></li>
							<li class="p"><a href="admin-technology-show_sun" target="bb" class="userlist">业主晒家管理</a></li>
							<li class="p"><a href="admin-technology-show_classic_case" target="bb" class="userlist">经典案例管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>家居文化管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-culture-post" target="bb" class="userlist">添加文章</a></li>
							<li class="p"><a href="admin-culture-home_culture" target="bb" class="userlist">文章管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>籽匠社区管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-community-post" target="bb" class="userlist">添加社区话题</a></li>
							<li class="p"><a href="admin-community-show_post_ht" target="bb" class="userlist">社区话题列表</a></li>
							<li class="p"><a href="admin-community-show_post" target="bb" class="userlist">社区拍客管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>申请表管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-application-home" target="bb" class="userlist">简洁申请表管理</a></li>
							<li class="p"><a href="admin-application-ruanzhuang" target="bb" class="userlist">软装申请表管理</a></li>
							<li class="p"><a href="javascript:void(0);" target="bb" class="userlist">加盟申请表管理</a></li>
							<li class="p"><a href="admin-application-yingzhuang" target="bb" class="userlist">硬装预约定制管理</a></li>
							<li class="p"><a href="admin-application-designer_apply" target="bb" class="userlist">免费设计服务申请管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>关于公司管理<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-coltd-address" target="bb" class="userlist">地址管理</a></li>
							<li class="p"><a href="admin-coltd-coltd_culture" target="bb" class="userlist">公司文化管理</a></li>
						</ul>
					</li>
					
					<li class="active">
						<a href="javascript:void(0)" class="sp">
							<i class="fa fa-sitemap"></i>设置<span class="fa arrow"></span>
						</a>
						<ul class="nav nav-second-level collapse in" style="display: none;">
							<li class="p"><a href="admin-setup-img" target="bb" class="userlist">轮播图管理</a></li>
						</ul>
					</li>

					<li class="active">
						<a href="cancellationAdmin">
							<i class="fa fa-sitemap"></i>退出系统
						</a>
					</li>
				</ul>
			</div>

		</nav>
		<!-- /. NAV SIDE  -->
		<div id="page-wrapper" region="center" >
			<div id="page-inner"  region="center"><!-- admin-technology-vradd -->
				<iframe src="admin-admin-none" name="bb" id="iframe"  frameborder="0" onLoad="iFrameHeight()" width="100%" height="800px"></iframe>
				<script type="text/javascript">
					function iFrameHeight() {
						var ifm = document.getElementById("iframe");
						var subWeb = document.frames ? document.frames["iframe"].document
								: ifm.contentDocument;
						if (ifm != null && subWeb != null) {
							ifm.height = subWeb.body.scrollHeight;
						}
					}
				</script>
				<!-- <iframe name="page" width="100%" height="100%" style="border: 0px;"></iframe> -->
			</div>
			<!-- /. PAGE INNER  -->
			
		</div>
		<!-- /. PAGE WRAPPER  -->
	</div>
	<!-- /. WRAPPER  -->
	<!-- JS Scripts-->
	<!-- jQuery Js -->
	<!-- Bootstrap Js -->
	<!-- <script src="pcadmin/assets/js/bootstrap.min.js"></script> -->
	<!-- Metis Menu Js -->
	<script src="pcadmin/assets/js/jquery.metisMenu.js"></script>
	<!-- Custom Js -->
	<!-- <script src="pcadmin/assets/js/custom-scripts.js"></script> -->
</body>

<script type="text/javascript">
$(function(){
	
	$("iframe").load(function() {
		$(this).height($(document).height()-200);
	});
	
});

</script>
</html>
