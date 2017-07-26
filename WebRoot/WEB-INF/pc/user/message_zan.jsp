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
<title>籽匠猫-消息通知-赞</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-消息通知-赞">
<meta http-equiv="description" content="籽匠猫-消息通知-赞">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
</head>

<body>
	<!--动态列表开始-->
	<dl class="Box">
		<dt class="Hide">被赞(3)</dt>
		<dd>
			<div class="Trends Oh">
				<!-- <ul>
					<li class="FS16"><a class="Ss">枝江丿猫</a>攒了你一下</li>
					<li class="C999">刚刚</li>
				</ul>
				<ul>
					<li class="FS16"><a class="Ss">咖啡丿猫</a>攒了你一下</li>
					<li class="C999">12个小时前</li>
				</ul>
				<ul>
					<li class="FS16"><a class="Ss">枝江丿猫</a>攒了你一下</li>
					<li class="C999">昨天</li>
				</ul> -->

			</div>

		</dd>
	</dl>
</body>
<script type="text/javascript">
$(function(){
	jume(1,10);
});
function jume(start,size){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getFabulousData',
		data : {
			start : start,
			size : size
		},
		success : function(re) {
			if (re != null && re.list.length > 0) {
				var strVar = "";
				$.each(re.list, function(i, v) {
					strVar += "<ul><li class=\"FS16\">";
					var name = "您";
					if('${user.uid}'===v.uid){
						strVar += "您自己";
						name = "您自己";
					}else{
						strVar += "<a class=\"Ss\" onclick=\"goVisitor('"+v.uid+"')\">"+v.name+"</a>";
					}
					strVar += "在<a class=\"Ss mijy_bj\" data-t=\""+v.cid+"\">#"+v.title+"#</a>挠了"+name+"一下</li><li class=\"C999\">"	+ v.createDate.getDateDiff() + "</li></ul>";
				});
				$('.Trends').html(strVar);
				$('.page_p').remove();
				$('.Trends').append('<p class="page_p"></p>');
				if (re.countPage > 1) {
					$('.page_p').createPage({
						pageCount : re.countPage,
						current : re.start,
						input_name : 'messzan-input',
						backFn : function(p) {
							jume(p, re.size);
						}
					});
				}
				$('.mijy_bj').bind('click',function(){
					var datat = $(this).attr('data-t');
					var param = {
							param : "Browse",
							inwzid : datat
					};
					$.post('addCommunityAll',param,function(re){
						window.open('getCommunity/'+datat); 
					});
				});
			}
		},
		error : function(re) {
			alert(re.status);
		}
	});
};
function goVisitor(heuid){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'addVisitorData',
		data : {'main.uid':heuid},
		success : function(re){
			if(re.status === 200){
				location.href = re.url;
			}else if(re.status === 404){
				location.href = re.url;
			}else{
				alert(re.msg);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}
</script>
</html>
