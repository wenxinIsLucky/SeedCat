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
<title>籽匠猫-社区详情</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-社区详情">
<meta http-equiv="description" content="籽匠猫-社区详情">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/sq.css" />
<link rel="stylesheet" href="pc/css/liwenxin2.css" />
<script src="pc/js/lrtk20160517.js"></script>
<style type="text/css">
.none{
	display: none;
}
.e182ee{
	background-color: #e182ee !important;
}
.e182ee a,.e182ee p{
	color:#fff !important;
}
.5badff{
	background-color: #5badff;
}
</style>
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
					<!-- <li><img src="pc/images2/bbs_top1.png" alt=""> <span>今日:
							1588 </span></li>
					<li><img src="pc/images2/bbs_top2.png" alt=""> <span>昨日:
							2588 </span></li> -->
					<li><img src="pc/images2/bbs_top3.png" alt=""> <span>
							帖子: 15888 </span></li>
					<li><img src="pc/images2/bbs_top4.png" alt=""> <span>
							会员: 218888 </span></li>

				</ul>
				<div class="cl"></div>
			</div>
			<div class="bbs-top_right fr">
				<a href="to-community-post"><div class="bbs-top_right1 fl">发表拍客</div></a> 
				<!-- <a href="javascript:void(0);"><div
						class="bbs-top_right2 fl">
						<span>签到</span>
						<p>签到18888人</p>
					</div></a> -->
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
						 <li ><a href="to-community-community_home"  >社区首页     </a></li>
				          <li><a href="to-community-topic" class="${community.type ==1?'tit_hover':''}">  社区话题 </a></li> 
				          <li><a href="to-community-shoot_off" class="${community.type ==2?'tit_hover':''}">社区拍客</a></li> 
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
				<div class="post-view">
					<div class="post-view-top">
						<ul>
							<li>
								<div class="bbs_lie_left fl">
									<img src="/static_img/head/${community.user.head}" alt="">
								</div>
								<div class="bbs_lie_right fl">
									<div>
										<div class="bbs_lie_right-t fl">
											<span>${community.title}</span>
											<img src="pc/images2/shu1.png" title="有图帖子" alt="有图帖子" class="${community.cover == '/static_img/post/images/default.png'?'none':''}">
											<img src="pc/images2/shu2.png" title="精贴" alt="精贴" class="${community.isAdd == 0?'none':''}" >
											<img src="pc/images2/shu3.png" alt="" class="none">
											<img src="pc/images2/shu4.png" title="有评论帖子" alt="有评论帖子" class="${community.reply == 0?'none':''}">
										</div>
										<!-- <div class="bbs_ke fr">
											<a href="javascript:void(0);"><img src="pc/images2/dayi1.png" alt=""></a> <a
												href="javascript:void(0);"><img src="pc/images2/dayi2.png" alt=""></a> <a
												href="javascript:void(0);"><img src="pc/images2/dayi3.png" alt=""></a> <a
												href="javascript:void(0);"><img src="pc/images2/dayi5.png" alt=""></a>
										</div> -->
										<div class="cl"></div>
									</div>
									<div class="bbs_lie_right-bo">
										<div class="bbs_lie_right-bo1 fl">
											<img src="pc/images2/chua1.png" alt="" class="fl"><span
												class="fl">${community.user.name}</span>
											<div class="cl"></div>
										</div>
										<div class="bbs_lie_right-bo2 fl">
											<img src="pc/images2/chua2.png" alt="" class="fl"><span
												class="fl">${community.createDate}</span>
											<div class="cl"></div>
										</div>
										<div class="bbs_lie_right-bo4 fr">
											<img src="pc/images2/hf.png" alt="" style="width: 20px" class="fl"><span
												class="fl">${community.reply}</span>
											<div class="cl"></div>
										</div>

										<div class="bbs_lie_right-bo3 fr">
											<img src="pc/images2/ll.png" alt="" style="width: 20px" class="fl"><span
												class="fl">${community.browse}</span>
										</div>
									</div>

								</div>
								<div class="cl"></div>

							</li>
						</ul>
					</div>
					<div class="bbs-con" style="width:100%;">
						${community.content}
					</div>
					<input type="hidden" class="wzid" value="${community.cid}"/>
					<!-- <div class="bbs_youke">
						<span>游客，如果您要查看本帖隐藏内容请</span><a href="javascript:void(0);">回复</a>
					</div> -->
					<div class="bbs_zhuti"><!-- 本主题由 System 于 2017-5-28 18:04 加入精华 --></div>
					<div class="bbs_like">
						<div class="bbs_like_left fl">
							<ul>
								<li class="no_m-left huifu_li"><a href="javascript:void(0);"><img
										src="pc/images2/line_bs1.png" alt="" class="fl"><span
										class="fl"> 回复</span>
									<div class="cl"></div></a></li>
								<li class="zan_li"><a href="javascript:void(0);"><img src="pc/images2/z_${community.fid==0?1:2}.png"
										alt="" class="fl"><span class="fl"> 赞${community.zan}</span>
									<div class="cl"></div></a></li>
								<li class="cai_li"><a href="javascript:void(0);"><img src="pc/images2/c_${community.sid==0?1:2}.png"
										alt="" class="fl"><span class="fl"> 踩${community.cai}</span>
									<div class="cl"></div></a></li>
								<%-- <li class=""><a href="javascript:void(0);"><img src="pc/images2/sc_1.png"
										alt="" class="fl" style="width: 20px;margin-top: -1px;"><span class="fl"> 收藏${community.collection}</span>
									<div class="cl"></div></a></li> --%>
							</ul>
							<div class="cl"></div>
						</div>
						<div class="bbs_like_right fr">
							<img src="pc/images2/line_bs5.png" alt="" class="fl"> <span
								class="fl">来自 杍匠猫官网</span>
							<div class="cl"></div>
						</div>
						<div class="cl"></div>
					</div>

					<div class="huifu">
						<ul>
							<li class="huifu1 huifu_li"><a href="javascript:void(0);"><p>回复</p> <span>${community.reply}</span>
							</a></li>
							<li class="huifu2 shoucang_li ${community.ccid==0?'':'e182ee'}"><a href="javascript:void(0);">
									<p>收藏</p> <span>${community.collection}</span>
							</a></li>
							<!-- <li class="huifu3"><a href="javascript:void(0);">
									<p>分享</p> <span>31</span>
							</a></li> -->
						</ul>
						<div class="cl"></div>

					</div>
					<div class="ciny-r"></div>
					<div id="comment_div"></div>
				</div>
				<div id="fastposteditor" style="width: 815px;" data-rt="0" data-cd="">
					<c:choose>
						<c:when test="${empty user}">
							<div class="tedt mtn">
								<div class="bar">
									<span class="y"> <a href="javascript:void(0);" onclick="">高级模式</a>
									</span>
									<!-- <script src="data/cache/seditor.js?201706091638"
										type="text/javascript"></script> -->
									<div class="fpd">
										<a href="javascript:;" title="文字加粗" class="fbld">B</a> <a
											href="javascript:;" title="设置文字颜色" class="fclr"
											id="fastpostforecolor">Color</a> <a id="fastpostimg"
											href="javascript:;" title="图片" class="fmg">Image</a> <a
											id="fastposturl" href="javascript:;" title="添加链接" class="flnk">Link</a>
										<a id="fastpostquote" href="javascript:;" title="引用" class="fqt">Quote</a>
										<a id="fastpostcode" href="javascript:;" title="代码" class="fcd">Code</a>
										<a href="javascript:;" class="fsml" id="fastpostsml">Smilies</a>
									</div>
								</div>
								<div class="area">
									<div class="pt hm">
										您需要登录后才可以回帖 <a href="to-login" class="xi2">登录</a> | <a
											href="to-register" class="xi2">注册</a>
									</div>
								</div>
							</div>
						</c:when>
						<c:otherwise>
							<script type="text/javascript" charset="utf-8">
								window.UEDITOR_HOME_URL = location.protocol + '//' + document.domain
										+ (location.port ? (":" + location.port) : "") + "/ueditor/";
							</script>
							<script type="text/javascript" charset="utf-8" src="ueditor/ueditor.configtwo.js"></script>
							<script type="text/javascript" charset="utf-8" src="ueditor/ueditor.all.min.js"></script>
							<script type="text/javascript" charset="utf-8" src="ueditor/lang/zh-cn/zh-cn.js"></script>
							<script id="editor" type="text/plain" style="width:815px;height:200px;"></script>
							<script type="text/javascript">
								//实例化编辑器
								//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
								var ue = UE.getEditor('editor');
							</script>
							<div>
								<div class="fabai fr">
									<label for="fastpostrefresh" class="fl">
									<!-- <input id="fastpostrefresh" class="pc" type="checkbox">回帖后跳转到最后一页</label> -->
									<input type="button" value="发表回复" class="fl forj">
								</div>
								<div class="cl"></div>
							</div>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
			<div class="bbs_con_right fr">
				<div class="bbs_cttit">
					<span>热门活动</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>
				<div class="bbs_cttit_lie">
					<ul>
						<li><a href="javascript:void(0);"><img src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img src="pc/images2/nieguan.png" alt=""></a></li>
						<li><a href="javascript:void(0);"><img src="pc/images2/nieguan.png" alt=""></a></li>

					</ul>
				</div>
				<div class="bbs_cttit">
					<span>热帖推荐</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>

				<div class="hot-post">
					<ul>
						<li><span class="post_civil1">1</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil2">2</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil3">3</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil4">4</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil4">5</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil4">6</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil4">7</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>
						<li><span class="post_civil4">8</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a>
						<div class="cl"></div>
							<p>中国红木家具蕴含着较高的鉴赏和收藏的价值 不仅红木家具所使用的优质木材，精美的装饰 艺术也为其增添了独特韵味。</p></li>

					</ul>
				</div>
				<script type="text/javascript">
					$(".hot-post li").hover(function() {
						$(this).find('p').show();

					}, function() {
						$(this).find('p').hide();

					});
					var zan = ${community.fid};
					var cai = ${community.sid};
					var shoucang = ${community.ccid};
					var isLo = ${empty user};
				</script>
				<div class="bbs_cttit">
					<span>关注我们</span> <img src="pc/images2/bbs_xian.png" alt="">
				</div>
				<div class="sotp-bs">
					<div class="sotp-bs_left fl">
						<img src="pc/images2/post-logo.png" alt="">
					</div>
					<div class="sotp-bs_right fr">
						<span>官方微博</span> <a href="javascript:void(0);"><img src="pc/images2/xin-img.jpg"
							alt=""></a>
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
			var width = $('.bbs-con').width();
			$.each($('.bbs-con').find('img'),function(i,v){
				if($(v).width() > width){
					$(v).width(width);
				}
			});
		});
	</script>

	<script src="pc/community/js/info.js"></script>
</body>
</html>