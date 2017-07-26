<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-图文工艺详情</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-图文工艺详情">
<meta http-equiv="description" content="籽匠猫-图文工艺详情">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/yz.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<style type="text/css">
.yzan{
	background: url(pc/images/xin_2.jpg) no-repeat left !important;
}
.yshouc{
	background: url(pc/images/wixin.jpg) no-repeat -81px 0px !important;
	background-size:110px 32px !important;
}
</style>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="5" name="pageName" />
	</jsp:include>

	<div class="title1">
		<div class="w1200">
			<div class="ny-title">
				<div class="ny-title-left fr">
					<ul>
						<li class="ny-title-left1"><a href="javascript:void(0);"><img
								src="pc/images/shouye.png" alt=""> </a></li>
						<li><a href="javascript:void(0);" title="杍匠工艺  ">杍匠工艺 </a></li>
						<li class="ny-title-left3"><img src="pc/images/jit.png" alt=""></li>
						<li class="ny-title-left4">图文工艺</li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="ny-title-right fl">
					<ul>
			          <li ><a href="to-technology-seed_technology"  class="tit_hover">杍匠工艺    </a></li>
			          <li><a href="to-technology-owners" > 业主晒家    </a></li>
			          <li><a href="to-technology-classic_case">经典案例</a></li>
			         </ul>
					<div class="cl"></div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
	</div>

	<div class="w1200">

		<div class="culture">
			<div class="culture_left fl">
				<div class="culture_left_title">
					<h2>${technology.title}</h2>
					<ul>
						<li>发布时间：${fn:substring(technology.createDate,0,10)}</li>
						<li>| 作者：${technology.author} |</li>
						<li>点击：${technology.browse} |</li>
						<li class="danzd ${technology.fid==0?'':'yzan'}" data-t="${technology.tid}" style="cursor: pointer;">点赞（${technology.zan}）</li>
						<li class="shouc ${technology.ccid==0?'':'yshouc'}" data-t="${technology.tid}" style="cursor: pointer;">收藏（${technology.collection}）</li>
					</ul>
				</div>

				<div class="culture-con" style="width: 100%;">
					${technology.content}
				</div>
				<div class="cul_shzng">
					<div class="cul_shzng1 fl">
						上一篇：<a href="javascript:void(0);" data-t="${technology.parentId}" data-bs="${technology.type}" title="${technology.parentTitle}">${fn:substring(technology.parentTitle,0,20)}</a>
					</div>
					<!-- <div class="cul_shzng2 fl">
						<div class="share">
							<div class="bshare-custom icon-medium">
								<a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博"
									class="bshare-sinaminiblog"></a><a title="分享到腾讯微博"
									class="bshare-qqmb"></a><a title="分享到网易微博"
									class="bshare-neteasemb"></a><a title="更多平台"
									class="bshare-more bshare-more-icon more-style-addthis"></a>
							</div>
							<script type="text/javascript" charset="utf-8"
								src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script>
							<script type="text/javascript" charset="utf-8"
								src="http://static.bshare.cn/b/bshareC0.js"></script>
						</div>
					</div> -->
					<div class="cul_shzng1 fr">
						下一篇：<a href="javascript:void(0);" data-t="${technology.nextId}" data-bs="${technology.type}" title="${technology.nextTitle}">${fn:substring(technology.nextTitle,0,20)}</a>
					</div>
					<div class="cl"></div>
				</div>
			</div>

			<!-- 右侧 start-->
			<jsp:include page="right.jsp"/>
			<!-- 右侧 end-->

		</div>
	</div>

	<!-- 定制风格-->

	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp" />
	<!-- 尾部 -->
</body>
<script type="text/javascript">
		$(function() {
			var width = $('.culture-con').width();
			$.each($('.culture-con').find('img'),function(i,v){
				if($(v).width() > width){
					$(v).width(width);
				}
			});
			
			$('.cul_shzng1 a').on('click',function(){
				var datat = $(this).attr('data-t');
				var type = $(this).attr('data-bs');
				var param = {
						param : "Browse",
						shid : datat
				};
				$.post('addTechnologyAllCount',param,function(re){
					location.href = 'getTechnologyDetailed'+type+'?sid='+datat; 
				});
			});
			
			$('.danzd').on('click',function(){
				var datat = $(this).attr('data-t');
				var param = {
						param : "ZAN",
						shid : datat
				};
				if($(this).attr('class').indexOf('yzan') < 0){
					addNumber(param);	
				}
			});
			$('.shouc').on('click',function(){
				var datat = $(this).attr('data-t');
				var param = {
						param : "COLLECTIONTECHNOLOGY",
						shid : datat
				};
				if($(this).attr('class').indexOf('yshouc') < 0){
					addNumber(param);	
				}
			});
		});
		
		function addNumber(json){
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addTechnologyAllCount',
				data : json,
				dataType : "text",
				success : function(re){
					if(re === "LOGIN"){
						location.href='to-login';
					}else if(re === "SUCCESS"){
						location.reload();
					}else{
						if(msg != ""){
							alert(msg);
						}
					}
				},error : function(re){
					alert(re.status);
				}
			});
		}
	</script>
</html>
