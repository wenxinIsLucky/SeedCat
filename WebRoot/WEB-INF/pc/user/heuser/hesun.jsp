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
<title>籽匠猫-我的晒家</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的晒家">
<meta http-equiv="description" content="籽匠猫-我的晒家">
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
				<dt>他的晒家</dt>

				<div class="sj-poxiu">
					<ul class="hesunul">
						<!-- <li>
							<div class="po_con">
								<div class="sj-poxiu-img fl">
									<a href="javascript:void(0);"><img src="pc/user/images/shaj.jpg" alt=""></a>
								</div>
								<div class="sj-poxiu_right fr">
									<a href="javascript:void(0);"><h4>张小姐的三居室欧式豪华风格装修</h4> <span>2017-04-05</span>
										<p>大家都知道买房子不容易，尤其是现在的年轻人和工薪阶层，那么在拿到属于自己的
											房子后自然，那么在拿到属于自己的房子后自然......</p></a>
								</div>
								<div class="cl"></div>
							</div>
						</li>
						<li>
							<div class="po_con">
								<div class="sj-poxiu-img fl">
									<a href="javascript:void(0);"><img src="pc/user/images/shaj.jpg" alt=""></a>
								</div>
								<div class="sj-poxiu_right fr">
									<a href="javascript:void(0);"><h4>张小姐的三居室欧式豪华风格装修</h4> <span>2017-04-05</span>
										<p>大家都知道买房子不容易，尤其是现在的年轻人和工薪阶层，那么在拿到属于自己的
											房子后自然，那么在拿到属于自己的房子后自然......</p></a>
								</div>
								<div class="cl"></div>
							</div>
						</li>
						<li>
							<div class="po_con">
								<div class="sj-poxiu-img fl">
									<a href="javascript:void(0);"><img src="pc/user/images/shaj.jpg" alt=""></a>
								</div>
								<div class="sj-poxiu_right fr">
									<a href="javascript:void(0);"><h4>张小姐的三居室欧式豪华风格装修</h4> <span>2017-04-05</span>
										<p>大家都知道买房子不容易，尤其是现在的年轻人和工薪阶层，那么在拿到属于自己的
											房子后自然，那么在拿到属于自己的房子后自然......</p></a>
								</div>
								<div class="cl"></div>
							</div>
						</li> -->

					</ul>
				</div>
			</dl>
			<p class="aj-loading hide"></p>
			<div class="Page Box Dn"></div>
		</div>
	</div>
	<!-- BEGIN FOOTER -->
</body>
<script type="text/javascript">
	$(function(){
		jume(1,10);
	});
	function jume(start,size){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'getSunHomeData',
			data : {start:start,size:size,param:parent.$('.useruid').val()},
			success : function(re){
				if(re!=null){
					if(re.status===200 && re.list.length > 0){
						var strVar = "";
						$.each(re.list,function(i,v){
						    strVar += "<li style=\"position: relative;\" data-t=\""+v.shid+"\" class=\""+(v.examine==0?'notsh':'mijy_bj')+"\">";
						    if(v.examine==0){
						    	strVar += "<div class=\"showmsg\">正在审核中...</div>";
						    }
						    strVar += "<div class=\"po_con\"><div class=\"sj-poxiu-img fl\"><a href=\"javascript:void(0);\"><img src=\""+v.cover+"\" alt=\"\"/></a></div>";
						    strVar += "<div class=\"sj-poxiu_right fr\">";
						    strVar += "<a href=\"javascript:void(0);\"><h4>"+v.title+"</h4> <span>"+v.createDate.substring(1,10)+"</span>";
						    strVar += "<p class=\"contextp\">"+v.cunContent+"</p></a>";
						    strVar += "</div><div class=\"cl\"></div></div></li>";
						});
						$('.hesunul').html(strVar);
						$('.page_p').remove();
						$('.hesunul').append('<p class="page_p"></p>');
						if(re.countPage > 1){
							$('.page_p').createPage({
								pageCount : re.countPage,
								current : re.start,
								input_name : 'hesun-input',
								backFn : function(p){
									jume(p,re.size);
								}
				            });
						}
						$('.mijy_bj').bind('click',function(){
							var datat = $(this).attr('data-t');
							var param = {
									param : "Browse",
									shid : datat
							};
							$.post('addSunHomeAllCount',param,function(re){
								window.open('getSunHomeDetailed/'+datat); 
							});
						});
					}else if(re.status===404){
						location.href = re.url;
					}else{
						$('.sj-poxiu').removeClass();
						$('.hesunul').html("<p style=\"text-align: center;font-size: 22px;background-color: #f0f0f0;\">他很懒，还没有发表任何拍客</p>");
					}
				}
			},error : function(re){
				alert(re.status);
			}
		});
	};
</script>
</html>
