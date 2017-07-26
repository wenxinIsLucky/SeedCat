<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String pageName = request.getParameter("pageName");
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>籽匠猫-头部</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="籽匠猫-头部">
	<meta http-equiv="description" content="籽匠猫-头部">

  </head>
  
  <body>
    <div class="header">
		<div class="header-top">
			<div class="head_con">
				<div class="head_con_left fl">
					<div class="head_con_le fl"></div>
					<div class="head_con_rt fl"></div>
					<div class="cl"></div>
				</div>

				<div class="head_con_right fr">
					<!-- <div class="head_con_right1 fl">
						<ul>
							<li><a href="javascript:void(0)"><img src="pc/images/top_qq.png" alt="" /></a></li>
							<li><a href="javascript:void(0)"><img src="pc/images/top_wx.png" alt="" /></a></li>
							<li><a href="javascript:void(0)"><img src="pc/images/top_xl.png" alt="" /></a></li>
						</ul>
					</div> -->
					<div class="head_con_right2 fl">
						<ul>
							<c:choose>
								<c:when test="${empty user}">
									<li><a href="to-login">登录</a></li>
									<li><a href="to-register">注册</a></li>
									<li><a href="to-login">会员中心</a></li>
									<li class="dhuw"><a href="to-login" class="no_border-right">购物车</a> <div class="shu">0</div></li>
								</c:when>
								<c:otherwise>
									<li><a href="to-user-index" style="margin-top: -8px;">
											<img src="/static_img/head/${user.head}" style="width: 25px;height: 25px;border-radius:50%;vertical-align: middle;"/>
											${user.name}
										</a>
									</li>
									<li><a href="cancellation">注销</a></li>
									<li class="dhuw"><a href="javascript:void(0);" class="no_border-right">购物车</a> <div class="shu">0</div></li>
								</c:otherwise>
							</c:choose>
						</ul>
					</div>
					<div class="cl"></div>
				</div>
			</div>
		</div>
		<div class="cl"></div>
		<div class="w1200">
			<div class="header_bottom">

				<div class="header_bottom1 fl">
					<img src="pc/images/head_logo.png" alt="" />
				</div>
				<div class="header_bottom2 fl">
					<form action="" id="form">
					<div class="header_bottom2_left fl">
						<input type="text"  placeholder="请输入搜索关键词"/>
					</div>
					<div class="header_bottom2_right fl">
						搜索
					</div>
					<div class="cl"></div>
					</form>
				</div>
				<div class="header_bottom3 fr">
					400-8888-888
				</div>
				<div class="cl"></div>
			</div>
			<div class="head_nav">
				<ul class="navfouce">
					<li><a href="to-index" data-tab="1">首页</a></li>
					<li><a href="to-ruanzhuang-rzCustom" data-tab="2">家居软装</a>
						<dl class="xiala">
	                        <dd><a href="javascript:void(0);">红木定制</a></dd>
	                        <dd><a href="javascript:void(0);">百变定制</a></dd>
	                        <dd><a href="javascript:void(0);">全屋定制</a></dd>
	                        <dd><a href="javascript:void(0);">定制攻略</a></dd>
	                      </dl>
					</li>
					<li><a href="to-yingzhuang-jzCustom" data-tab="3">家装套餐 </a>
						<dl class="xiala">
	                        <dd><a href="javascript:void(0);">效果图</a></dd>
	                        <dd><a href="javascript:void(0);">装修攻略</a></dd>
	                        <dd><a href="javascript:void(0);">设计与报价</a></dd>
	                        <dd><a href="javascript:void(0);">建材城</a></dd>
	                      </dl>
					</li>
					<li><a href="to-designer-designer_home" data-tab="4">设计师</a></li>
					<li><a href="to-technology-seed_technology" data-tab="5">杍匠工艺</a></li>
					<li><a href="to-culture-furniture_culture" data-tab="6">家居文化</a></li>
					<li><a href="go-index" data-tab="7">杍匠商城 </a></li>
					<li><a href="to-community-community_home" data-tab="8">杍匠社区</a></li>
					<li><a href="toCorporateCulturePage" data-tab="9">关于我们</a></li>
				</ul>
				<div class="cl"></div>

			</div>
		</div>
	</div>
	<script type="text/javascript">

$(".navfouce li").hover(function(){
    $(this).find('.xiala').stop().slideDown();

  },function(){
    $(this).find('.xiala').stop().slideUp();

  });
</script>
  </body>
  <script type="text/javascript">
  	var pageName = '<%=pageName %>';
  	$('.head_nav ul li a').each(function(i,v){
  		if($(v).attr('data-tab') === pageName){
  			$(v).siblings().removeClass('head_nav_hover');
  			$(v).addClass('head_nav_hover');
  			return;
  		}
  	});
  </script>
</html>
