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
<title>籽匠猫-消息通知-评论回复</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-消息通知-评论回复">
<meta http-equiv="description" content="籽匠猫-消息通知-评论回复">
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
			<dl>
				<dt class="Tab Box">
					<a href="javascript:void(0);" target="_self" class="communityp S">评论</a> <a
						href="javascript:void(0);" target="_self" class="communityh">回复</a>
				</dt>
				<dd class="Trends Message Box">
					<!-- <div>
						<ul class="">
							<li class="Ava"><a class="Avatar" href="javascript:void(0);">
									<img src="pc/user/images/noavatar_big.gif" alt="杍匠丿猫"
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
							</a></li>
							<li class="Top"><a class="Name" href="javascript:void(0);">杍匠丿猫</a>
								<span class="Group">Lv1.幼儿园O粉</span></li>
							<li class="Tail">4小时前</li>
							<li class="Des">66666666</li>
							<li class="For"><a name="link" href="javascript:void(0);">
									<span> <img src="pc/user/images/jpg_w200.jpg" alt=""
										style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -3.15789px; width: auto; height: 100%;">
								</span>
							</a>
								<h3>
									<a type="1" class="C3fcab8" href="javascript:void(0);"
										uid="65716289">@AU33</a>
								</h3>
								<p>
									<a type="3" class="C3fcab8" href="javascript:void(0);">#和闺蜜在一起#</a>[表情][表情][表情][表情]
								</p></li>
						</ul>
					</div> -->
				</dd>
			</dl>
</body>
<script type="text/javascript">
$(function(){
	jume(0);
	$('.communityp').on('click',function(){
		$('.communityh').removeClass('S');
		$(this).addClass('S');
		jume(0);
		parent.iFMrameHeight();
	});
	$('.communityh').on('click',function(){
		$('.communityp').removeClass('S');
		$(this).addClass('S');
		jume(1);
		parent.iFMrameHeight();
	});
});

function jume(type){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'findPostRemindersByPage',
		data : {
			type : type,
			start : 1,
			size : 10
		},
		success : function(re) {
			if(re != null && re.list.length > 0){
				var strVar = "";
				$.each(re.list,function(i,v){
					 strVar += "<ul class=\"\" aj-id=\"99178010\">";
					 strVar += "<li class=\"Ava\"><a class=\"Avatar "+('${user.uid}'===v.yuid?'':'toVisitor')+"\" data-uid=\""+v.yuid+"\" href=\"javascript:void(0);\"><img src=\"/static_img/head/"+v.yhead+"\" alt=\""+v.yname+"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;\">";
					 strVar += "<i class=\"Dn\"><\/i><\/a><\/li>";
					 strVar += "<li class=\"Top\"><a class=\"Name "+('${user.uid}'===v.yuid?'':'toVisitor')+"\" data-uid=\""+v.yuid+"\" href=\"javascript:void(0);\">"+v.yname+"<\/a><\/li>";
					 strVar += "<li class=\"Des\">";
					 strVar += "<h2><a href=\"javascript:void(0);\"><\/a><\/h2>";
					 strVar += "<p>"+v.content+"<\/p><\/li>";
					 strVar += "<li class=\"For \"><a href=\"javascript:void(0);\" data-t=\""+v.wzid+"\" data-floor=\""+v.floor+"\" class=\"mijy_bj\"><span><img src=\""+v.cover+"\" alt=\"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -3.15789px; width: auto; height: 100%;\"><\/span>";
					 strVar += "<\/a><p>";
					 strVar += "<a type=\"3\" class=\"C3fcab8\" href=\"javascript:void(0);\" data-t=\""+v.wzid+"\"  data-floor=\""+v.floor+"\" class=\"mijy_bj\">#"+v.title+"#<\/a>";
					 strVar += "<\/p><\/li>";
					 strVar += "<li class=\"Tail\">"+v.createDate.getDateDiff()+"&nbsp; 来自&nbsp;"+v.system+"<\/li>";
					 strVar += "<\/ul>";
				});
				$('.Trends').html(strVar);
				$('.page_p').remove();
				$('.Trends').append('<p class="page_p"></p>');
				if(re.list[0].countPage > 1){
					$('.page_p').createPage({
						pageCount : re.list[0].countPage,
						current : re.current,
						input_name : 'uhome-input',
						backFn : function(p){
							jume(p,re.size);
						}
		            });
				}
				$('.mijy_bj').bind('click',function(){
					var datat = $(this).attr('data-t');
					var floor = $(this).attr('data-floor');
					var param = {
							param : "Browse",
							inwzid : datat
					};
					$.post('addCommunityAll',param,function(re){
						window.open('getCommunity/'+datat+'#floor'+floor); 
					});
				});
				$('.toVisitor').bind('click',function(){
					goVisitor($(this).attr('data-uid'));
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
