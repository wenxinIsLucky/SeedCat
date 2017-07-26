<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-社区话题</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-社区话题">
<meta http-equiv="description" content="籽匠猫-社区话题">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/sq.css" />
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<script src="pc/js/lrtk20160517.js"></script>
<script type="text/javascript" src="pc/community/js/topic.js"></script>
<style type="text/css">
.l-vn2 {
	padding-top: 8px;
}

.l-vn2 img {
	width: 68px;
	height: 68px;
	border-radius: 50%;
}

.l-vn4 {
	text-align: center;
	font-size: 18px;
	color: #fff;
	position: absolute;
	bottom: 7px;
	left: 235px;
}

.date {
	margin-right: 5px;
	vertical-align: middle;
}
.lu_jl{
	position: absolute;
	right: 10px;
	height: 30px;
	z-index: 1;
}
.fl{
	color:#fff !important;
}
.htimg{
	width: 100%;
	height: 316px;
}
</style>
</head>
<body id="topBody">
	<jsp:include page="../top.jsp">
		<jsp:param value="8" name="pageName" />
	</jsp:include>
	<div class="bbs-top">
		<div class="w1200">
			<div class="bbs-top_left fl">
				<ul>
					<!--  <li>
                    <img src="pc/images2/bbs_top1.png" alt="">
                    <span>今日: 1588   </span>
                </li>
                 <li>
                    <img src="pc/images2/bbs_top2.png" alt="">
                    <span>昨日: 2588   </span>
                </li> -->
					<li><img src="pc/images2/bbs_top3.png" alt=""> <span>
							帖子: 15888 </span></li>
					<li><img src="pc/images2/bbs_top4.png" alt=""> <span>
							会员: 218888 </span></li>

				</ul>
				<div class="cl"></div>
			</div>
			<div class="bbs-top_right fr">
				<a href="to-community-post"><div class="bbs-top_right1 fl">发表拍客</div></a>
				<!-- <a href="javascript:void(0);"><div class="bbs-top_right2 fl"><span>签到</span><p>签到18888人</p></div></a> -->
				<div class="cl"></div>
			</div>
			<div class="cl"></div>
		</div>
	</div>

	<div class="title1">
		<div class="w1200">
			<div class="ny-title">
				<div class="ny-title-left fr">
					<ul>
						<li class="ny-title-left1"><a href="javascript:void(0);"><img
								src="pc/images/shouye.png" alt=""> </a></li>
						<li><a href="javascript:void(0);" title="关于我们">杍匠社区 </a></li>

					</ul>
					<div class="cl"></div>
				</div>
				<div class="ny-title-right fl">
					<ul>
						<li><a href="to-community-community_home">社区首页 </a></li>
						<li><a href="javascript:void(0);" class="tit_hover"> 社区话题
						</a></li>
						<li><a href="to-community-shoot_off">社区拍客</a></li>
					</ul>
					<div class="cl"></div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
	</div>
	<div class="bbs_con">
		<div class="w1200">
			<div class="bos_left fl">
				<ul class="lin-rt">
					<li>
						<div class="lu_jl">
							<div class="bbs_lie_right-bo4 fr">
								<img src="pc/images2/hfb.png" alt="" style="width: 20px" class="fl">
								<span class="fl">188</span>
								<div class="cl"></div>
							</div>

							<div class="bbs_lie_right-bo3 fr">
								<img src="pc/images2/llb.png" alt="" style="width: 20px" class="fl">
								<span class="fl">1588</span>
							</div>
						</div>
						<a href="javascript:void(0);"> <img
							src="pc/images2/huodon-0ghy.jpg" alt=""
							style="position: absolute;top:0px;">
							<div class="lin_bj">
								<div class="l-vn">
									<div class="l-vn1">WWW.ZIJMAO.COM</div>
									<div class="l-vn2">
										<img src="pc/community_user/images/ia_ligo_logo.png" />
									</div>
									<div class="l-vn3">说出你装修的故事说出你装修的故事说出你装修的故事说出你装修的故事</div>
									<div class="l-vn4">2017-06-25</div>
								</div>
							</div>
					</a></li>
					
				</ul>
				<!-- <div class="page">
					<form action="#">
						<div class="page_left fl">
							<a href="javascript:void(0);" class="shang ">上一页</a> <a
								href="javascript:void(0);" class="cut de">1</a> <a
								href="javascript:void(0);" class="de">2</a> <a
								href="javascript:void(0);" class="de">3</a> <a
								href="javascript:void(0);" class="de">4</a> <a
								href="javascript:void(0);" class="de">5</a> <a
								href="javascript:;" class="diam">...</a> <a
								href="javascript:void(0);" class="de">18</a> <a
								href="javascript:void(0);" class="xia ">下一页</a>
						</div>
						<div class="page_right fl">
							<div class="page_right1 fl">共18页</div>
							<div class="page_right2 fl">到</div>
							<div class="page_right3 fl">
								<input type="text">
							</div>
							<div class="page_right4 fl">页</div>
							<div class="page_right5 fl">
								<input value="确定" type="submit">
							</div>
						</div>
					</form>
					<div class="cl"></div>
				</div> -->
			</div>
			<div class="bbs_con_right fr">
				<div class="bbs_cttit">
					<span>热门活动</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>
				<div class="bbs_cttit_lie">
					<ul>
						<li><a href="javascript:void(0);"><img
								src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img
								src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img
								src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img
								src="pc/images2/nieguan.png" alt=""></a></li>

					</ul>
				</div>
				<div class="bbs_cttit">
					<span>热帖推荐</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>

				<div class="hot-post">
					<ul>
						<li><span class="post_civil1">1</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil2">2</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil3">3</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil4">4</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil4">5</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil4">6</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil4">7</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>
						<li><span class="post_civil4">8</span><a
							href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
							<div class="cl"></div></li>

					</ul>
				</div>
				<script type="text/javascript">

$(".hot-post li").hover(function(){
    $(this).find('p').show();

  },function(){
    $(this).find('p').hide();

  });
</script>
				<div class="bbs_cttit">
					<span>关注我们</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>
				<div class="sotp-bs">
					<div class="sotp-bs_left fl">
						<img src="pc/images2/post-logo.png" alt="">
					</div>
					<div class="sotp-bs_right fr">
						<span>官方微博</span> <a href="javascript:void(0);"><img
							src="pc/images2/xin-img.jpg" alt=""></a>
					</div>
					<div class="cl"></div>
				</div>
				<div class="sotp-bwx">
					<div class="sotp_left fl">
						<img src="pc/images2/post_weix.jpg" alt="">
					</div>
					<div class="sotp_right fr">
						<span>官方微博</span> <a href="javascript:;">扫一扫</a>
					</div>
					<div class="cl"></div>
				</div>
			</div>
			<div class="cl"></div>
		</div>
	</div>

	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp" />
	<!-- 尾部 -->

	<script src="pc/js/Carousel.js"></script>

	<script type="text/javascript">
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();
		});
	</script>
</body>
</html>