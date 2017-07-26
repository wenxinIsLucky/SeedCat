<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <link rel="icon" href="pc/img/ymkj.ico" type="image/x-icon">
    <meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<title>籽匠猫-500</title>
	<style type="text/css">
		*{
			margin:0;
			padding:0;
		}
		.img_div,.div{
			width: 100%;
			position: absolute;
			min-width: 1200px;
		}
		.img_div img{
			width: 100%;
			height: 100%;
			position: fixed;
		}
		.content_div{
			background:rgba(0,0,0,0.6);
		   	background:#000\9;/*CSS Hack,只能对ie9以下浏览器ie6,ie7,ie8有效，否侧		ie10,FF,Cherome会失去透明效果*/
		   	filter:Alpha(opacity=60);/*只对ie7,ie8有效*/
		   	width: 900px;
		   	position: relative;
		   	margin-top:200px;
		   	margin-left: auto;
		   	margin-right: auto;
		   	height: 460px;
		   	border-radius:10px;
		}
		.text_div{
			width: 80%;
			margin-left: auto;
		   	margin-right: auto;
			top:10px;
			position: relative;
		}
		h1{
			color:#fff;
			text-shadow:2px 3px 2px red;
			font-size: 80px;
		}
		h2{
			color:#fff;
			font-size: 40px;
			margin-left: 30px;
		}
		span{
			color: #fff;
			font-weight: bold;
			font-size: 36px;
			margin-top: 20px;
			display: block;
			margin-left: 10px;
		}
		a{
			color: #ff4200;
			text-decoration: none;
		}
		.bottom_div{
			position: relative;
			margin-top:40px;
			margin-left: auto;
		   	margin-right: auto;
		   	width: 50%;
		}
		.bottom_div p{
			color:#fff;
			text-align: center;
		}
		.logo_div{
			position: relative;
			z-index: 99;
			width: 900px;
			margin-left: auto;
		   	margin-right: auto;
			top:20px;
		}
		.ll{
			width: 142px;
			display: inline-block;
		}
		.cc{
			display: inline-block;
			margin-left: 200px;
		}
		.rr{
			display: inline-block;
			margin-left: 200px;
		}
		.rr p,.cc p{
			color:red;
		}
		.rr p{
			display: inline-block;
		}
		.rr img{
			vertical-align:top;
		}
		.buttom_div{
			width: 260px;
			text-align: center;
			height: 80px;
			line-height: 80px;
			border-radius:10px;
			background-color: d63129;
			font-size: 40px;
			font-weight: bold;
			color:#fff;
			margin-top: 30px;
			cursor: pointer;
		}
		.img_500{
			margin-top:-280px;
			margin-left: 400px;
			width: 50%;
		}
	</style>
  </head>
  <body>
  	<div class="div">
  		<div class="img_div">
	  		<img alt="" src="pc/images/500.png">
	  	</div>
  		<div class="logo_div">
  			<div class="ll">
				<img src="pc/images/logo.png" />
			</div>
			<div class="cc">
				<P>★ 全国百姓放心柏菲雅家居</P>
				<P>★ 深圳市家居中心</P>
				<P>★ 中国家庭健康家居热卖</P>
			</div>
			<div class="rr">
				<img src="pc/images/zcym1.png" />
				<P>
					客户服务热线<br /> 4006007272
				</P>
			</div>
  		</div>
	  	<div class="content_div">
	  		<div class="text_div">
	  			<h1>Page</h1>
	  			<h2>Not Found</h2>
	  			<span>数据被劫持啦，请返回…</span>
	  			<div class="buttom_div" onclick="javascript:location.href='<%=basePath%>getIndex';">返回首页</div>
	  			<img class="img_500" src="pc/images/500_n.png">
	  		</div>
	  	</div>
	  	<div class="bottom_div">
	  		<p>柏菲雅地址：深圳市观澜悦兴路59号、市内乘公交车精英小学站下车向前走50米即到</p>
	  		<p>电话热线:400-653-0210 专业设计师在线QQ:138836120 139936120 133656120</p>
	  		<p>本网站信息仅供参考，不能作为依据，本网站院内图片及商标权属柏菲雅所有，未经授权请勿复制及转载 </p>
	  	</div>
  	</div>
  </body>
</html>
