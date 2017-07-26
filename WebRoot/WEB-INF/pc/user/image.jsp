<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String imageName = request.getParameter("imageName");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
#lwxfile {
	position: relative;
	bottom: -380px;
}
.file{margin: 0px auto;cursor:pointer;width:98px;height:34px;position:relative;display:block;background:#d0eeff;border:1px solid #99d3f5;border-radius:1px;text-align:center;overflow:hidden;color:#1e88c7;text-decoration:none;text-indent:0;line-height:38px}
.file input{width:98px;height:38px;position:absolute;font-size:100px;right:0;top:0;opacity:0;filter:alpha(opacity=0);cursor:pointer}
#Member_Avatar p img{
	width: 100%;
	height: 100%;
}
.messageCount{
	width: 24px;
	height: 24px;
	background-color: red;
	border:1px solid red;
	border-radius:50%;
	display: block;
	font-size: 12px;
	text-align: center;
	line-height: 24px;
	position: relative;
	right: 15px;
    top: -40px;
}
</style>
</head>

<body>
	<div id="Member_Top" class="Box wall">
		<a class="Set"><input type="file" id="lwxfile" name="ima"
			class="hidden" value="" /></a> <a class="Avatar"> <img
			src="/static_img/head/${user.head}" class="Avatar-img" /></a>
		<h1>
			<span>${user.name}</span><i class=""></i>
		</h1>
		<h4></h4>
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
												<input id="file_upload" type="file" name="file" accept="image/*">
											</a>
										</form>
										<!-- <a class="Btn-W de-vae" value="">上传</a>
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
		$(function(){
			loadFun();
			$("#file_upload").change(function() {
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
					f1.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = d;
					f2.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
					f2.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = d
				}
			});
			$(".file").on("change", "input[type='file']", function() {
				$('.submit_a').css("display", "inline-block");
				var a = $(this).val();
				if (a.indexOf("jpg") != -1 || a.indexOf("png") != -1) {
					$(".fileerrorTip").html("").hide();
					var b = a.split('\\');
					var c = b[b.length - 1];
					$(".showFileName").html(c)
				} else {
					if ($.trim($('#file_upload').val()) == "") {
						$(".showFileName").html("");
						$(".fileerrorTip").html("您未上传文件，或者您上传文件类型有误！").show();
						$('#yl1').removeAttr("src");
						$('#yl2').removeAttr("src");
						return false
					}
				}
			});
			
			$(".submit_a").on('click', function() {
				if ($.trim($('#file_upload').val()) != "") {
					var formData = new FormData();
					formData.append("imgFile", file);
					$.ajax({
						type: 'POST',
						data: formData,
						async: false,
						cache: false,
						contentType: false,
						processData: false,
						url: 'uploadFileUserHead',
						dataType: 'text',
						success: function(a) {
							$('.submit_a').hide();
							if (a === "SUCCESS") {
								alert("更换成功");
								location.href = 'reloadDate'+window.location.pathname.replace("/", "");
							} else if (a === "LOGIN") {
								alert("登录超时，请重新登录");
								location.href = 'admin-loginto'
							} else {
								alert("更换失败")
							}
						},
						error: function(a) {
							alert(a.status)
						}
					})
				} else {
					alert("请选择您要上传的图片")
				}
			})
		});
		function loadFun(){
			$.ajax({
				type : 'POST',
				async : false,
				url : 'getUserHomeData',
				data : {heuid:''},
				success : function(re){
					$('.signstr').text(re.sign);
					$('.followCount').text(re.follow);
					$('.fansCount').text(re.fans);
					$('.visitorCount').text(re.visitor);
					$('.messageCount').text(re.message);
				},error : function(re){
					alert(re.status);
				}
			});
		}
	</script>
	<!--侧边栏开始-->
	<aside class="Fl">

	<ul class="Box Cb Count" id="Member_Count">
		<li><a target="_self" href="to-user-follow"><b class="followCount">3</b><span>关注</span></a></li>
		<li><a target="_self" href="to-user-fans"><b class="fansCount">2</b><span>粉丝</span></a></li>
		<li><a target="_self" href="to-user-visitor"><b class="visitorCount">2</b><span>访客</span></a></li>
	</ul>
	<nav class="Box Member" name="Myself">
		<a class="index " data-tab="1" target="_self" href="to-user-index"><i></i>我的主页</a>
		<a class="msg" data-tab="2" target="_self" href="to-user-message_plhf"><i></i>消息通知<b class="messageCount">0</b></a>
		<a class="info " data-tab="3" target="_self" href="to-user-mydata"><i></i>我的资料</a>
		<a class="sez S " data-tab="4" target="_self" href="to-user-wallet"><i></i>我的钱包</a>
		<a class="fav " data-tab="5" target="_self" href="javascript:void(0);"><i></i>我的收藏</a>
		<a class="zsr " data-tab="6" target="_self" href="javascript:void(0);"><i></i>我的装修进度</a>
	</nav>
	</aside>
	<!--侧边栏结束-->
</body>
<script type="text/javascript">
  	var imageName = '<%=imageName %>';
  	$('.Member a').each(function(i,v){
  		if(imageName == "0"){
  			$(v).siblings().removeClass('S');
  			return;
  		}
  		if($(v).attr('data-tab') === imageName){
  			$(v).siblings().removeClass('S');
  			$(v).addClass('S');
  			return;
  		}
  	});
  </script>
</html>
