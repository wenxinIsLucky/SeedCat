<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-软装定制-申请装修表</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-软装定制-申请装修表">
<meta http-equiv="description" content="籽匠猫-软装定制-申请装修表">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/ruanzhuang/css/rz.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script src="pc/js/lrtk20160517.js"></script>
<script type="text/javascript" src="pc/js/jquery.superslide.2.1.1.js"></script>
<script type="text/javascript" src="pc/js/cascadeall.js"></script>
<script type="text/javascript" src="pc/ruanzhuang/js/rz_table.js"></script>
</head>

<body onload="cascdeInit('','','')">
	<jsp:include page="../top.jsp">
		<jsp:param value="2" name="pageName"/>
	</jsp:include>
	<div class="title">
		<div class="w1200">
			<div class="ny-title">
				<div class="ny-title-left fl">
					<ul>
						<li class="ny-title-left1"><a href="javascript:void(0)">
								<img src="pc/images/shouye.png" alt="">
						</a></li>
						<li class="ny-title-left2"><a href="javascript:void(0)">家居软装
						</a></li>
						<li class="ny-title-left3"><img src="pc/images/jit.png"
							alt=""></li>
						<li class="ny-title-left4">定制流程</li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="ny-title-right fr">
					<ul>
						<li><a href="to-ruanzhuang-rzCustom">定制流程 </a></li>
						<li><a href="to-ruanzhuang-rzCustom">定制风格 </a></li>
						<li><a href="javascript:void(0)" class="tit_hover"> 申请装修表
						</a></li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
	</div>
	<div class="w1200">
		<div class="shiq">申请装修表</div>
		<div class="biangenh">
			<div class="biange fl">
				<form action="_submit" id="form2" accept-charset="utf-8">
					<dl class="ange">
						<dd>
							<div class="ange_left fl">所在地区：</div>
							<div class="ange_right fl">
								<select name="sheng" id="sel-provance" class="sen1"
									required="required" onchange="selectCity();"></select> <select
									name="shi" id="sel-city" class="sen2" required="required"
									onchange="selectcounty()"></select> <select
									style="display: none;" name="" id="sel-area" class="sen2"></select>
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">软装户型：</div>
							<div class="ange_right fl">
								<select name="layout" class="sen3">
									<option value="一房一厅">一房一厅</option>
									<option value="二房一厅">二房一厅</option>
									<option value="三房一厅">三房一厅</option>
									<option value="四房一厅">四房一厅</option>
								</select>
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">装修面积：</div>
							<div class="ange_right fl fes">
								<input vali="number" type="text" name="has" id="" />
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">选择风格：</div>
							<div class="ange_right fl">
								<select name="style" class="sen3">
									<option value="古典风格软装">古典风格软装</option>
									<option value="古典风格软装">欧美风格软装</option>
									<option value="古典风格软装">日韩风格软装</option>
								</select>
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">&nbsp;&nbsp;&nbsp;联系人：</div>
							<div class="ange_right fl fes">
								<input type="text" name="contacts" id="" />
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">联系方式：</div>
							<div class="ange_right fl fes">
								<input type="text" name="phone" id="" maxlength="11"/>
							</div>
							<div class="cl"></div>
						</dd>
						<dd>
							<div class="ange_left fl">备注说明：</div>
							<div class="ange_right fl fes defw">
								<textarea name="mes"></textarea>
							</div>
							<div class="cl"></div>
						</dd>
					</dl>
					<div class="subku">
						<input type="button" id="sub-but" value="提交" />
					</div>
				</form>
			</div>
			<div class="biange_right fl">
				<div class="biange_rig">
					<span>测算面积：</span>
					<p>
						房产证中的建筑面积+赠送面积，此数据仅作为测算,<br /> 不作为合同面积的依据；
					</p>
				</div>
			</div>
			<div class="cl"></div>
		</div>
	</div>
	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp"/>
	<!-- 尾部 -->
	<script type="text/javascript">
		jQuery(".softSilde").slide({
			effect : "fold",
			autoPlay : false,
			delayTime : 700,
			interTime : 7000
		});
		$(function() {
			$(".softSilde .bd ul li").find(".fdtips i").addClass("addshow");
			$(".fdtips i").hover(function() {
				$(this).next().fadeIn();
			})
			$(".fdtips .closefdson").click(function() {
				$(this).parent().fadeOut();
			})
			$(".fdson").mouseleave(function() {
				$(this).fadeOut();
			})
		})
	</script>
</body>
</html>
