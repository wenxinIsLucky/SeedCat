<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-我的主页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的主页">
<meta http-equiv="description" content="籽匠猫-我的主页">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script src="pc/user/js/jquery.min.js"></script>
<script type="text/javascript">
if(top.location!=self.location){
	top.location = self.location;
}
</script>
<link href="pc/user/css/common.min.css" rel="stylesheet">
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
#lwxfile {
	position: relative;
	bottom: -380px;
}

.file {
	margin: 0px auto;
	cursor: pointer;
	width: 98px;
	height: 34px;
	position: relative;
	display: block;
	background: #d0eeff;
	border: 1px solid #99d3f5;
	border-radius: 1px;
	text-align: center;
	overflow: hidden;
	color: #1e88c7;
	text-decoration: none;
	text-indent: 0;
	line-height: 38px
}

.file input {
	width: 98px;
	height: 38px;
	position: absolute;
	font-size: 100px;
	right: 0;
	top: 0;
	opacity: 0;
	filter: alpha(opacity = 0);
	cursor: pointer
}

#Member_Avatar p img {
	width: 100%;
	height: 100%;
}

.messageCount {
	width: 24px;
	height: 24px;
	background-color: red;
	border: 1px solid red;
	border-radius: 50%;
	display: block;
	font-size: 12px;
	text-align: center;
	line-height: 24px;
	position: relative;
	right: 15px;
	top: -40px;
}

.levelh4 {
	color: #ffb267 !important;
}
</style>
</head>

<body>
	<div class="Wrap">
		<jsp:include page="../top.jsp">
			<jsp:param value="8" name="pageName" />
		</jsp:include>

		<div class="ierhua_cr">
			<div class="w1200">
				<div class="ierhua">
					<ul>
						<li><a href="javascript:void(0);">商城会员中心</a></li>
						<li><a href="javascript:void(0);" class="ierhua_hiv">个人中心</a></li>
					</ul>
				</div>
			</div>
		</div>
		<main class="Cb RR_TE">
		<p class="Bread Hide">
			<a class="First" target="bb" href="to-community-community_home">
				杍匠社区 <s></s>
			</a><span class="topspan">我的主页<u></u><s></s></span>
		</p>

		<!-- 背景 -->
		<div id="Member_Top" class="Box wall">
			<a class="Set"><input type="file" id="lwxfile" name="ima"
				class="hidden" value="" /></a> <a class="Avatar"> <img
				src="/static_img/head/${user.head}" class="Avatar-img" /></a>
			<h1>
				<span>${user.name}</span><i class="sexi" class=""></i>
			</h1>
			<h4 class="levelh4"></h4>
			<p style="font-size: 16px;color:#fff;" class="signstr">我就是我，不一样的烟火</p>
			<p class="MT10"></p>
			<p class="Bot TAr">
				<button class="Btn-W MR10">取消</button>
				<button>保存</button>
			</p>
		</div>
		<div class="dou-if">
			<div class="dou">

				<div id="Member_Avatar" class="Box dorn">
					<dl>
						<dt>
							<a class="Close">×</a>头像设置
						</dt>
						<dd>
							<form>
								<table>
									<tr>
										<td colspan="2"><div class="Pic"></div></td>
									</tr>
									<tr>
										<td colspan="2" class="dri_uy">
											<form id="form1" runat="server">
												<a href="javascript:;" class="file" style="cursor: pointer;">修改头像
													<input id="file_upload" type="file" name="file"
													accept="image/*">
												</a>
											</form> <!-- <a class="Btn-W de-vae" value="">上传</a>
											<input type="file" name="ima" class="hidden1" value="上传" /> -->
										</td>
									</tr>
									<tr>
										<td colspan="2">预览</td>
									</tr>
									<tr>
										<td><p class="P1">
												<img id="yl1" src="pc/user/images/noavatar_big.gif" />
											</p></td>
										<td><p class="P2">
												<img id="yl2" src="pc/user/images/noavatar_big.gif" />
											</p></td>
									</tr>
									<tr>
										<td>120PX</td>
										<td>60PX</td>
									</tr>
									<tr>
										<td class="PT20" colspan="2"><button type="reset"
												class="Btn-W MR10">取消</button>
											<button type="button" class="submit_a">确定</button></td>
									</tr>
								</table>
								<input type="hidden" name="x" /> <input type="hidden" name="y" />
								<input type="hidden" name="w" /> <input type="hidden" name="h1" /><input
									type="hidden" name="u1" />
							</form>
						</dd>
					</dl>
				</div>
			</div>
		</div>

		<script type="text/javascript">
			var file = null;
			$(".Avatar-img").click(function() {
				$("#Member_Avatar").show();
			});
			$(".Close").click(function() {
				$("#Member_Avatar").hide();
			});
			$(".MR10").click(function() {
				$("#Member_Avatar").hide();
			});
			$(function() {
				loadFun();
				$("#file_upload")
						.change(
								function() {
									var a = $(this);
									var b = a[0];
									file = this.files[0];
									var c = window.URL || window.webkitURL;
									var d;
									var e = $("#yl1");
									var g = $("#yl2");
									if (b && b.files && b.files[0]) {
										d = c.createObjectURL(b.files[0]);
										e.attr('src', d);
										g.attr('src', d);
									} else {
										d = a.val();
										var f1 = document.getElementById("yl1");
										var f2 = document.getElementById("yl2");
										f1.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
										f1.filters
												.item("DXImageTransform.Microsoft.AlphaImageLoader").src = d;
										f2.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
										f2.filters
												.item("DXImageTransform.Microsoft.AlphaImageLoader").src = d
									}
								});
				$(".file").on(
						"change",
						"input[type='file']",
						function() {
							$('.submit_a').css("display", "inline-block");
							var a = $(this).val();
							if (a.indexOf("jpg") != -1
									|| a.indexOf("png") != -1) {
								$(".fileerrorTip").html("").hide();
								var b = a.split('\\');
								var c = b[b.length - 1];
								$(".showFileName").html(c)
							} else {
								if ($.trim($('#file_upload').val()) == "") {
									$(".showFileName").html("");
									$(".fileerrorTip").html(
											"您未上传文件，或者您上传文件类型有误！").show();
									$('#yl1').removeAttr("src");
									$('#yl2').removeAttr("src");
									return false
								}
							}
						});

				$(".submit_a").on(
						'click',
						function() {
							if ($.trim($('#file_upload').val()) != "") {
								var formData = new FormData();
								formData.append("imgFile", file);
								$.ajax({
									type : 'POST',
									data : formData,
									async : false,
									cache : false,
									contentType : false,
									processData : false,
									url : 'uploadFileUserHead',
									dataType : 'text',
									success : function(a) {
										$('.submit_a').hide();
										if (a === "SUCCESS") {
											alert("更换成功");
											location.href = 'reloadDate'
													+ window.location.pathname
															.replace("/", "");
										} else if (a === "LOGIN") {
											alert("登录超时，请重新登录");
											location.href = 'admin-loginto'
										} else {
											alert("更换失败")
										}
									},
									error : function(a) {
										alert(a.status)
									}
								})
							} else {
								alert("请选择您要上传的图片")
							}
						});
				$('.Member a').on('click', function() {
					$(this).siblings().removeClass('S');
					$(this).addClass('S');
					$('.topspan').html($(this).text() + "<u></u><s></s>");
				});
				$('.Count a').on('click', function() {
					$('.Member a').removeClass('S');
				});
			});
			function loadFun() {
				$.ajax({
					type : 'POST',
					async : false,
					url : 'getUserHomeData',
					data : {
						heuid : ''
					},
					success : function(re) {
						$('.signstr').text(re.sign);
						$('.followCount').text(re.follow);
						$('.fansCount').text(re.fans);
						$('.visitorCount').text(re.visitor);
						$('.messageCount').text(re.message);
						$('.sexi').addClass(
								re.container.sex == '0' ? 'Female'
										: re.container.sex == '1' ? 'Male'
												: '0');
						$('.levelh4').text(
								'LV' + re.container.lel + '.'
										+ re.container.grade);
						$('.mylel').val(re.container.lel);
						$('.mygrade').val(re.container.grade);
						$('.mysex').val(re.container.sex);
						$('.myday').val(re.container.day);
						$('.mysheng').val(re.container.sheng);
						$('.myshi').val(re.container.shi);
						$('.mysignature').val(re.container.signature);
						$('.mynumber').val(re.container.number);
					},
					error : function(re) {
						alert(re.status);
					}
				});
			}
		</script> <!--侧边栏开始--> <aside class="Fl">

		<ul class="Box Cb Count" id="Member_Count">
			<li><a target="bb" href="to-user-follow"><b
					class="followCount">3</b><span>关注</span></a></li>
			<li><a target="bb" href="to-user-fans"><b class="fansCount">2</b><span>粉丝</span></a></li>
			<li><a target="bb" href="to-user-visitor"><b
					class="visitorCount">2</b><span>访客</span></a></li>
		</ul>
		<nav class="Box Member" name="Myself"> <a class="index S"
			data-tab="1" target="bb" href="to-user-home"><i></i>我的主页</a> <a
			class="tiez " data-tab="3" target="bb" href="to-user-mypost"><i></i>我的拍客
			<input type="hidden" class="mylel" /> <input type="hidden"
			class="mygrade" /> <input type="hidden" class="mysex" /> <input
			type="hidden" class="myday" /> <input type="hidden" class="mysheng" />
			<input type="hidden" class="myshi" /> <input type="hidden"
			class="mysignature" /> <input type="hidden" class="mynumber" /> </a> <a
			class="hajj " data-tab="3" target="bb" href="to-user-mysun"><i></i>我的晒家</a>
		<a class="msg" data-tab="2" target="_self" href="to-user-message"><i></i>消息通知<b
			class="messageCount">0</b></a> <a class="info " data-tab="3" target="bb"
			href="to-user-mydata"><i></i>我的资料</a> <a class="sez " data-tab="4"
			target="bb" href="to-user-wallet"><i></i>我的钱包</a> <a class="fav "
			data-tab="5" target="bb" href="to-user-mycollection"><i></i>我的收藏</a>
		<a class="zsr " data-tab="6" target="bb" href="to-user-myrenovation"><i></i>我的装修进度</a>
		</nav> </aside> <!--侧边栏结束--> <!-- 背景 -->


		<div class="Right" style="margin-bottom: 50px;">
			<!--动态列表开始-->
			<iframe id="iframe" name="bb" frameborder="0" width="100%" height="100%" onLoad="iFrameHeight()" src="to-user-home"></iframe>
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
		</div>
		</main>
	</div>
	<jsp:include page="../bottom.jsp" />
</body>
</html>
