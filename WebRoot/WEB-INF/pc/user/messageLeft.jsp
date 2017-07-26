<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String messageName = request.getParameter("messageName");
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
</style>
</head>

<body>
	<div id="Member_Top" class="Box wall"">
		<a class="Set"><input type="file" id="lwxfile" name="ima"
			class="hidden" value="" /></a> <a class="Avatar"> <img
			src="pc/user/images/noavatar_big.gif" class="Avatar-img" /></a>
		<h1>
			<span>杍匠丿猫</span><i class=""></i>
		</h1>
		<h4></h4>
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
									<td colspan="2" class="dri_uy"><a class="Btn-W de-vae"
										value="">上传</a><input type="file" name="ima" class="hidden1"
										value="上传" /></td>
								</tr>
								<tr>
									<td colspan="2">预览</td>
								</tr>
								<tr>
									<td><p class="P1">
											<img src="pc/user/images/noavatar_big.gif" />
										</p></td>
									<td><p class="P2">
											<img src="pc/user/images/noavatar_big.gif" />
										</p></td>
								</tr>
								<tr>
									<td>120PX</td>
									<td>60PX</td>
								</tr>
								<tr>
									<td class="PT20" colspan="2"><button type="reset"
											class="Btn-W MR10">取消</button>
										<button type="submit">确定</button></td>
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
		$(".Avatar-img").click(function() {
			$("#Member_Avatar").show();
		});
		$(".Close").click(function() {
			$("#Member_Avatar").hide();
		});
		$(".MR10").click(function() {
			$("#Member_Avatar").hide();
		});
	</script>
	<!--侧边栏开始-->
  	<aside class="Fl">
        <nav class="Box Member" name="Myself">
        	<a class="reply " name="reply" target="_self" href="javascript:history.go(-1);"><img src="pc/user/images/fh.png" style="margin-right: 32px;"/>返回</a>
	        <a class="reply " data-tab="1" name="reply" target="_self" href="to-user-message_plhf"><i></i>评论回复</a>
	        <a class="praise " data-tab="2" target="_self" href="to-user-message_zan"><i></i>赞</a>
	        <a class="system S" data-tab="3" target="_self" href="to-user-message_sys"><i></i>系统消息</a>
    	</nav>
  	</aside>
  <!--侧边栏结束-->
</body>
<script type="text/javascript">
  	var messageName = '<%=messageName %>';
  	$('.Member a').each(function(i,v){
  		if($(v).attr('data-tab') === messageName){
  			$(v).siblings().removeClass('S');
  			$(v).addClass('S');
  			return;
  		}
  	});
  </script>
</html>
