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
<title>籽匠猫-我的拍客</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的拍客">
<meta http-equiv="description" content="籽匠猫-我的拍客">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
.contextp{
	overflow:hidden;
	text-overflow:ellipsis;
	display:-webkit-box;
	-webkit-box-orient:vertical;
	-webkit-line-clamp:2;
}
.showmsg{
	width: 300px;
	height: 100px;
	position: absolute;
	top:0;
	left:0;
	right:0;
	bottom:0;
	margin:auto;
	z-index: 999999999;
	text-align: center;
	color:red;
	font-size: 16px;
	font-weight: bold;
	background-color: #fff;
	line-height: 100px;
}
</style>
</head>

<body>
	<div class="Wrap">
		<div class="Right">
			<!--动态列表开始-->
			<dl class="Box">
				<dt>我的拍客</dt>
				<div class="bbs-top_right">
					<div class="fl"></div>
					<div class="bbs-top_right1 fr">
						<a target="bb" href="to-user-post">发表拍客</a>
					</div>
					<div class="cl"></div>
				</div>
				<dd class="Trends">

					<!-- <ul class="BT0 MT0">
						<li class="Ava"><a class="Avatar" href="javascript:void(0);"> <img
								src="pc/user/images/69_avatar_small.jpg" alt="元气少女bling"
								style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
								<i class="1"></i>
						</a></li>
						<li class="Top"><a class="Name" href="javascript:void(0);">元气少女bling</a> <span
							class="Group">Lv8.硕士生O粉</span></li>
						<li class="Tail">18小时前&nbsp; 来自&nbsp;网页端</li>
						<li class="Des">
							<h2>
								<a href="javascript:void(0);">【软件分享】炫酷动态桌面瞬间提升手机逼格~</a>
							</h2>
							<p class="contextp">新买的R11看腻了静态的壁纸，想来试试更高逼格的动态壁纸吗？一款软件满足你。超多资源
								---------------------------------------------------今天给大家推荐的这款软件拥有超多的动态壁纸资源，分类也十分详细。
								如何开启 ------------------...</p>
						</li>
						<li class="Pic "><a href="javascript:void(0);"> <span class="N0"><img
									src="pc/user/images/shouji1.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N1"><img src="pc/user/images/shouji2.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N2"><img src="pc/user/images/shouji3.jpg" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -9.88764px; width: auto; height: 100%;"></span></a>
						</li>
						<li class="Bot"><span class="View"><i></i>3418</span> <a
							class="Forward"><i></i>12</a> <a class="Reply"><i></i>787</a> <a
							class="Praise Praised"><i></i>1002</a></li>
					</ul>
					<ul class="BT0 MT0">
						<li class="Ava"><a class="Avatar" href="javascript:void(0);"> <img
								src="pc/user/images/69_avatar_small.jpg" alt="元气少女bling"
								style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
								<i class="1"></i>
						</a></li>
						<li class="Top"><a class="Name" href="javascript:void(0);">元气少女bling</a> <span
							class="Group">Lv8.硕士生O粉</span></li>
						<li class="Tail">18小时前&nbsp; 来自&nbsp;网页端</li>
						<li class="Des">
							<h2>
								<a href="javascript:void(0);">【软件分享】炫酷动态桌面瞬间提升手机逼格~</a>
							</h2>
							<p>新买的R11看腻了静态的壁纸，想来试试更高逼格的动态壁纸吗？一款软件满足你。超多资源
								---------------------------------------------------今天给大家推荐的这款软件拥有超多的动态壁纸资源，分类也十分详细。
								如何开启 ------------------...</p>
						</li>
						<li class="Pic "><a href="javascript:void(0);"> <span class="N0"><img
									src="pc/user/images/shouji1.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N1"><img src="pc/user/images/shouji2.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N2"><img src="pc/user/images/shouji3.jpg" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -9.88764px; width: auto; height: 100%;"></span></a>
						</li>
						<li class="Bot"><span class="View"><i></i>3418</span> <a
							class="Forward"><i></i>12</a> <a class="Reply"><i></i>787</a> <a
							class="Praise Praised"><i></i>1002</a></li>
					</ul> -->
				</dd>

			</dl>
		</div>
	</div>
	<!-- BEGIN FOOTER -->
</body>
<script type="text/javascript">
	$(function(){
		jume(1,10);
		$('.notsh').on('mousedown', function(e) {
			if (1 === e.which){
				e.preventDefault();
			}
		});
	});
	
	function jume(start,size){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'findCommunityMyData',
			data : {start:start,size:size},
			success : function(re){
				if(re!=null){
					if(re.status===200 && re.list.length > 0){
						var strVar = "";
						$.each(re.list,function(i,v){
						    strVar += "<ul class=\"BT0 MT0 "+(v.examine==0?'notsh':'')+"\">";
						    if(v.examine==0){
						    	strVar += "<div class=\"showmsg\">正在审核中...</div>"
						    }
						    strVar += "<li class=\"Ava\"><a class=\"Avatar\" href=\"javascript:void(0);\"><img src=\"/static_img/head/"+v.user.head+"\" alt=\""+'${user.name}'+"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;\">";
						    strVar += "<i class=\"1\"><\/i><\/a><\/li>";
						    strVar += "<li class=\"Top\"><a class=\"Name\" href=\"javascript:void(0);\">"+'${user.name}'+"<\/a><\/li>";
						    strVar += "<li class=\"Tail\">"+v.createDate.getDateDiff()+"&nbsp; 来自&nbsp;"+v.system+"<\/li>";
						    strVar += "<li class=\"Des\"><h2>";
						    strVar += "<a href=\"javascript:void(0);\" data-t=\""+v.cid+"\" class=\""+(v.examine==0?'':'mijy_bj')+"\">"+v.title+"<\/a>";
						    strVar += "<\/h2><p class=\"contextp\">"+v.cunContext+"";
						    strVar += "<\/p><\/li>";
						    strVar += "<li class=\"Pic \"><a href=\"javascript:void(0);\" data-t=\""+v.cid+"\" class=\""+(v.examine==0?'':'mijy_bj')+"\">";
						    var imgs = v.cunimg.split(',');
						    var l = imgs.length > 3 ? 3 :imgs.length;
						    for(var k = 0; k < l; k++){
							    strVar += "<span class=\"N0\"><img src=\""+imgs[k]+"\" alt=\"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;\"><\/span>";
						    }
						    strVar += "<\/a><\/li>";
						    strVar += "<li class=\"Bot\"><span class=\"View\"><i><\/i>"+v.browse+"<\/span><a class=\"Reply\"><i><\/i>"+v.reply+"<\/a><\/li>";
						    strVar += "<\/ul>";
						});
						$('.Trends').html(strVar);
						$('.page_p').remove();
						$('.Trends').append('<p class="page_p"></p>');
						if(re.countPage > 1){
							$('.page_p').createPage({
								pageCount : re.countPage,
								current : re.start,
								input_name : 'mypost-input',
								backFn : function(p){
									jume(p,re.size);
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
					}else if(re.status===404){
						location.href = re.url;
					}else{
						$('.Trends').html("<h2 style=\"text-align: center;font-size: 20px;\">您还未发表任何拍客，请前去发布吧</h2>");
					}
				}
			},error : function(re){
				alert(re.status);
			}
		});
	}
</script>
</html>
