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
<title>籽匠猫-我的资料</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的资料">
<meta http-equiv="description" content="籽匠猫-我的资料">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/cascadeall.js"></script>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
</head>

<body>
	<div class="Wrap">
		<div class="Right">
			<dl class="Box">
				<dt>账户信息</dt>
				<dd class="member-info">
					<table>
						<tr class="Dn">
							<th>账号</th>
							<td>${user.account}</td>
						</tr>
						<tr class="Dn">
							<th>用户名</th>
							<td>${user.name}</td>
						</tr>
						<tr>
							<th>用户ID</th>
							<td>${user.uid}</td>
						</tr>
						<tr>
							<th>昵称</th>
							<td id="member_info_nickname">${user.name}</td>
						</tr>
					</table>
				</dd>
			</dl>
			<dl class="Box">
				<dt>积分等级</dt>
				<dd class="member-info">
					<table>
						<tr>
							<th>猫币</th>
							<td class="henumber">0</td>
						</tr>
						<tr>
							<th>等级</th>
							<td class="helevel">Lv1.幼儿园O粉</td>
						</tr>
					</table>
				</dd>
			</dl>
			<dl class="Box">
				<dt>个人资料</dt>
				<dd class="member-info">
					<table>
						<tr>
							<th>性别</th>
							<td class="hesex">保密</td>
						</tr>
						<tr>
							<th>生日</th>
							<td class="heday"></td>
						</tr>
						<tr>
							<th>城市</th>
							<td class="headdress">&nbsp;</td>
						</tr>
						<tr>
							<th>个性签名</th>
							<td class="hesignature"></td>
						</tr>
					</table>
				</dd>
			</dl>
			<p class="MB20 TAr">
				<button id="member_info_btn">修改资料</button>
			</p>
		</div>


		<div class="forw">

			<div id="member_info_edit" class="Box dorn">
				<dl>
					<dt>
						<a class="Close dert">×</a>个人资料
					</dt>
					<dd class="member-info">
						<form accept-charset="utf-8" id="form">

							<table>
								<tr>
									<th>昵称</th>
									<td><input type="text" class="Text" name="name"
										value="${user.name}"></td>
								</tr>
								<tr>
									<th>性别</th>
									<td><input type="radio" name="sex" value="1" />
										&nbsp;男 &nbsp; &nbsp; <input type="radio" readonly="readonly" name="sex" value="2" /> &nbsp;女</td>
								</tr>

								<tr>
									<th>生日</th>
									<td><input type="text" name="day" class="Text"></td>
								</tr>
								<tr>
									<th>城市</th>
									<td><label class="Select MB10"> <select
											name="sheng" id="sel-provance" required="required" onchange="selectCity();">
												<option value="">请选择</option>
												<option value="">1</option>
										</select>
									</label><br /> <label class="Select MB10"> <select required="required"
									onchange="selectcounty()" id="sel-city" name="shi">
												<option value="">请选择</option>
												<option value="">1</option>
										</select>
									</label></td><select
									style="display: none;" name="" id="sel-area" class="sen2"></select>
								</tr>
								<tr>
									<th>个性签名</th>
									<td><input type="text" class="Text" name="signature"
										value="" maxlength="50"></td>
								</tr>
								<tr>
									<td colspan="2" align="right"><input type="button" id="submit" value="提交"></td>
								</tr>
							</table>
						</form>
					</dd>
				</dl>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var isLucky = false;
		$("#member_info_btn").click(function() {
			$("#member_info_edit").show();
		});
		$(".dert").click(function() {
			$("#member_info_edit").hide();
		});
		$(function(){
			$('.henumber').text(parent.$('.mynumber').val());
			$('.helevel').text("LV"+parent.$('.mylel').val()+"."+parent.$('.mygrade').val());
			$('.hesex').text(parent.$('.mysex').val()==1?'男':'女');
			$('.heday').text(parent.$('.myday').val().substring(0,10));
			$('.headdress').text(parent.$('.mysheng').val()+"-"+parent.$('.myshi').val());
			$('.hesignature').text(parent.$('.mysignature').val());
			
			$('input[type="radio"][name="sex"][value="'+parent.$('.mysex').val()+'"]').attr("checked",true);
			$('input[name="day"]').val(parent.$('.myday').val().substring(0,10));
			cascdeInit(parent.$('.mysheng').val(),parent.$('.myshi').val(),'');
			$('input[name="signature"]').val(parent.$('.mysignature').val());
			
			$('#submit').on('click',function(){
				if($.trim($('input[name="name"]').val()) == ""){
					alert('昵称不能为空');
					$('input[name="name"]').focus();
					return false;
				}
				if($.trim($('input[name="name"]').val()) == ""){
					alert('昵称不能为空');
					$('input[name="name"]').focus();
					return false;
				}
				if($.trim($('input[name="name"]').val()) == ""){
					alert('昵称不能为空');
					$('input[name="name"]').focus();
					return false;
				}
				if(!isLucky){
					isLucky = true;
					$.ajax({
						type : 'POST',
						async : false,
						url : 'updUserInfo',
						data : $('#form').serialize(),
						success : function(re){
							isLucky = false;
							if(re.status === 200){
								alert(re.msg);
								parent.loadFun();
								location.reload();
							}else if(re.status === 404){
								location.href = re.url;
							}else{
								alert(re.msg);
							}
						},error : function(re){
							isLucky = false;
							alert(re.status);
						}
					});
				}
			});
		});
	</script>
	<!-- BEGIN FOOTER -->
</body>
</html>
