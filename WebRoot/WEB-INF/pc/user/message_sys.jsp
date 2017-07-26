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
<title>籽匠猫-消息通知-系统消息</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-消息通知-系统消息">
<meta http-equiv="description" content="籽匠猫-消息通知-系统消息">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css" />
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
.hideshowdiv {
	width: 96%;
	margin: 0px auto;
	line-height: 26px;
	display: none;
}

.FS16 {
	cursor: pointer;
}

.weidu {
	color: red;
	font-size: 12px;
	float: right;
}
</style>
</head>

<body>
	<!--动态列表开始-->
	<dl class="Box">
		<dt class="Hide">系统消息(<span class="countMessage"></span>)</dt>
		<dd>
			<div class="Trends Oh">
				<!-- <ul>
					<li class="FS16">恭喜您完成了新手第一拍任务<span class="weidu">未读</span></li>
					<div class="hideshowdiv">恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖</div>
					<li class="C999">刚刚</li>
				</ul>
				<ul>
					<li class="FS16">恭喜您完成了上传头像任务，得到10个O币和10个糖<span class="weidu">未读</span></li>
					<div class="hideshowdiv">恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖</div>
					<li class="C999">刚刚</li>
				</ul>
				<ul>
					<li class="FS16">恭喜您升级到Lv2.小学生O粉，再接再厉向Lv3.初中生O粉进军吧！加油！<span
						class="weidu">未读</span></li>
					<div class="hideshowdiv">恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖恭喜您完成了新手第一拍任务，得到10个O币和10个糖
						恭喜您完成了新手第一拍任务，得到10个O币和10个糖</div>
					<li class="C999">刚刚</li>
				</ul> -->

			</div>

		</dd>
	</dl>
</body>
<script type="text/javascript">
	$(function() {
		jume(1, 10);
	});
	function jume(start, end) {
		$.ajax({
			type : 'POST',
			async : false,
			url : 'myMessages',
			data : {
				start : start,
				end : end
			},
			success : function(re) {
				if (re != null && re.list.length > 0) {
					var strVar = "";
					$.each(re.list, function(i, v) {
						strVar += "<ul><li class=\"FS16\" mid=\""+v.mid+"\" state=\""+v.state+"\" scope=\""+v.scope+"\">" + v.title
								+ "<span class=\"weidu\">"
								+ (v.state === 0 ? '未读' : '') + "</span></li>";
						strVar += "<div class=\"hideshowdiv\">" + v.context
								+ "</div>";
						strVar += "<li class=\"C999\">"
								+ v.createDate.getDateDiff() + "</li></ul>";
					});
					$('.countMessage').text(re.dataCount);
					$('.Trends').html(strVar);
					$('.page_p').remove();
					$('.Trends').append('<p class="page_p"></p>');
					if (re.countPage > 1) {
						$('.page_p').createPage({
							pageCount : re.countPage,
							current : re.current,
							input_name : 'messsys-input',
							backFn : function(p) {
								jume(p, re.size);
							}
						});
					}
					$('.FS16').bind('click', function() {
						var obj = this;
						if ($(obj).next().is(':hidden')) {
							$('.hideshowdiv').hide(1000);
							$(obj).next().show(1000);
							parent.iFMrameHeight();
							var mid = $(obj).attr("mid"); 
							var state = $(obj).attr("state");
							var scope = $(obj).attr("scope");
							if(parseInt(state) === 0){
								//点击查看后台修改状态
								$.post('updateMessageState',{mid:mid,state:state,scope:scope}, function(re) {
									if(null != re){
										if(re === 1){
											$(obj).find('span.weidu').empty();
											$(obj).attr("state",1);
										}else{
											alert("状态已读失败");
										}
									}
								}); 
							 }
						} else {
							$(obj).next().hide(500);
							parent.iFMrameHeight();
						}
					});
				}
			},
			error : function(re) {
				alert(re.status);
			}
		});
	};
</script>
</html>
