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
<title>籽匠猫-公司文化</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-公司文化">
<meta http-equiv="description" content="籽匠猫-公司文化">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/sq.css" />
<script src="pc/js/jquery.min.js"></script>
<script src="pc/js/lrtk20160517.js"></script>
<style>
#error_mask {
	background-color: #ccc;
	height: 100%;
	width: 100%;
	position: fixed;
	_position: absolute;
	top: 0;
	opacity: 0.1;
	filter: alpha(opacity = 10);
	z-index: 9999999;
}
.clear {
	clear: both;
}

.none {
	display: none;
}

.file {
	margin-top: 20px;
	cursor: pointer;
	width: 98px;
	height: 38px;
	position: relative;
	display: block;
	background: #d0eeff;
	border: 1px solid #99d3f5;
	border-radius: 1px;
	text-align: center;
	overflow: hidden;
	color: #1e88c7;
	text-decoration: none;
	text-indent: 0;
	line-height: 38px;
	cursor: pointer;
	width: 98px;
	height: 38px;
	position: relative;
	display: block;
	background: #d0eeff;
	border: 1px solid #99d3f5;
	border-radius: 1px;
	text-align: center;
	overflow: hidden;
	color: #1e88c7;
	text-decoration: none;
	text-indent: 0;
	line-height: 38px
}

.file input {
	width: 98px;
	height: 38px;
	position: absolute;
	font-size: 100px;
	right: 0;
	top: 0;
	opacity: 0;
	filter: alpha(opacity = 0);
	cursor: pointer
}
.showmsg{
	width: 300px;
	height: 100px;
	position: fixed;
	top:0;
	left:0;
	right:0;
	bottom:0;
	margin:auto;
	z-index: 999999999;
	text-align: center;
	color:#88DD4B;
	font-size: 16px;
	font-weight: bold;
}
.imgsdiv{
	width: 100%;
}
.imgsdiv img{
	width: 33%;
	float: left;
	height: 300px;
	margin-bottom: 20px;
}
.contentdiv{
	width: 80%;
	margin: 50px auto;
	color:#000;
	font-size: 20px;
}
.sanbuqudiv{
	width: 80%;
	margin: 50px auto;
	color:#000;
}
.sanbuqudiv span{
	font-size: 26px;
}
.sanbuqudiv p{
	font-size: 20px;
	margin: 20px 0px 0px 20px;
}
.editdiv{
	width: 200px;
	height: 60px;
	line-height: 60px;
	text-align: center;
	border:1px solid #fa791b;
	border-radius:10px;
	background-color:#fa791b;
	font-size: 24px;
	font-weight: bold;
	color:#fff;
	margin: 0px auto;
	cursor: pointer;
	margin-bottom: 50px;
}
.publish_tit_right input{
	width: 770px;
	height: 36px;
	line-height: 36px;
}
msg{
	color:#fa791b;
	font-size: 12px;
}
</style>
</head><!-- none -->
<body id="topBody">
	<div id="error_mask" class="none"></div>
	<div class="showmsg none">正在添加...</div>
	<div class="clear"></div>
	<jsp:include page="../top.jsp">
		<jsp:param value="8" name="pageName" />
	</jsp:include>
	<script type="text/javascript" charset="utf-8">
		window.UEDITOR_HOME_URL = location.protocol + '//' + document.domain
				+ (location.port ? (":" + location.port) : "") + "/ueditor/";
	</script>
	<script type="text/javascript" charset="utf-8"
		src="ueditor/ueditor.config.js"></script>
	<script type="text/javascript" charset="utf-8"
		src="ueditor/ueditor.all.min.js">
		
	</script>
	<script type="text/javascript" charset="utf-8"
		src="ueditor/lang/zh-cn/zh-cn.js"></script>

	<div class="publish showcoltd none">
        <div class="videodiv" style="margin:0px auto;width:1024px;">
        	<video name="videoElement" class="centeredVideo" controls autoplay width="1024" height="576">
	            Your browser is too old which doesn't support HTML5 video.
	        </video>
        </div>
        
        <div class="contentdiv">
			        杍匠猫装修网 —— 创于2017年，是集研发、生产、营销、服务为一体的大型综合性家具企业，通过精益求精的经营理念与“全心全意为消费者 服务”的服务宗旨。成为中国家具行业的领军品牌，具有强大的品牌优势和良好质量口碑。凭借“追求梦想，对话世界”的企业理念，已经成为 中国家具行业领军企业。一句“您想要的效果，猫叔全知道”深深的阐述了百强家具的上乘品质。公司以“诚信经营”、“精益求精”为生产理 念，以“全心全意为消费者服务”作为企业宗旨，成为中国环保家具品牌，深受消费者信赖。
			杍匠猫装修网 —— 创于2017年，是集研发、生产、营销、服务为一体的大型综合性家具企业，通过精益求精的经营理念与“全心全意为消费者 服务”的服务宗旨。成为中国家具行业的领军品牌，具有强大的品牌优势和良好质量口碑。凭借“追求梦想，对话世界”的企业理念，已经成为 中国家具行业领军企业。一句“您想要的效果，猫叔全知道”深深的阐述了百强家具的上乘品质。公司以“诚信经营”、“精益求精”为生产理 念，以“全心全意为消费者服务”作为企业宗旨，成为中国环保家具品牌，深受消费者信赖。
        </div>
        
        <div class="imgsdiv">
        	<img src="pc/img/1.jpg"/>
        	<img src="pc/img/2.jpg"/>
        	<img src="pc/img/3.jpg"/>
        </div>
        
        <div class="clear"></div>
        <div class="sanbuqudiv">
        	<div class="gsmubiaodiv">
        		<span>公司目标</span>
        		<p>杍匠猫装修网 www.zjmao.com致力于成为中国家装行业引领品牌</p>
        	</div>
        	<div class="qyzongzhidiv">
        		<span>企业宗旨</span>
        		<p>本公司以创新为基础，品质为保障，实现先做人后做事的经营理念。</p>
        	</div>
        	<div class="jyliniandiv">
        		<span>经营理念</span>
        		<p>以顾客为上帝为服务宗旨，力求完美，打造品质服务一体化优良管理。</p>
        	</div>
        </div>
        
        <div class="editdiv">编辑</div>
	</div>

	<div class="publish addcoltd " style="margin-top: 40px;">
		<div class="w1200" style="width: 880px;">
			<div class="publish_ti">编辑公司文化</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">公司简介视频链接</div>
				<div class="publish_tit_right fl">
					<input type="text" name="url" />
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">公司简介+公司图片</div>
				<div class="cl"></div>
			</div>
			<div class="publish_cin" style="margin-top: 20px;">
				<script id="editor" type="text/plain" style="width:880px;height:500px;">
			</script>
			</div>
			
			<div class="publish_tit" style="margin-top: 20px;">
				<div class="publish_tit_left fl">公司目标</div>
				<div class="publish_tit_right fl">
					<input type="text" name="mubiao"  maxlength="66"/>
					<msg>最长66个字</msg>
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">企业宗旨</div>
				<div class="publish_tit_right fl">
					<input type="text" name="zongzhi" maxlength="66"/>
					<msg>最长66个字</msg>
				</div>
				<div class="cl"></div>
			</div>
			<div class="publish_tit">
				<div class="publish_tit_left fl">经营理念</div>
				<div class="publish_tit_right fl">
					<input type="text" name="idea"  maxlength="66"/>
					<msg>最长66个字</msg>
				</div>
				<div class="cl"></div>
			</div>

		</div>

		<div class="publish_c">
			<input type="button" style="margin: 0px auto;" name="" class="fabiao"
				value="发表">
		</div>
	</div>
	</div>
	
	<div style="display: none;" id="ycdiv"></div>

	<script type="text/javascript">
		//实例化编辑器
		//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
		var ue = UE.getEditor('editor');
	</script>
	<!-- 定制风格-->

	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp" />
	<!-- 尾部 -->

	<script src="pc/js/Carousel.js"></script>

	<script type="text/javascript">
		var isLucky = false;
		$(function() {
			Carousel.init($("#carousel"));
			$("#carousel").init();
			
			jume();
			
			$('.editdiv').on('click',function(){
				$('.showcoltd').hide();
				$('.addcoltd').show();
				var speed=200;//滑动的速度
		        parent.$('body,html').animate({ scrollTop: 0 }, speed);
		        return false;
			});

			$('.fabiao').on('click', function() {
				var d = UE.getEditor('editor').getContent();
				var e = $('input[name="url"]').val();
				var g = $('input[name="mubiao"]').val();
				var h = $('input[name="zongzhi"]').val();
				var i = $('input[name="idea"]').val();
				$('#ycdiv').html(d);
				var f = "/static_img/post/images/default.png";
				$.each($('#ycdiv').find('img'), function(i, v) {
					if (i === 0) {
						f = $(v).attr('src');
						return
					}
				});
				if ($.trim(e).length <= 0) {
					alert("请填写连接");
					$('input[name="url"]').focus();
					return false
				}
				if ($.trim(d).length <= 0) {
					alert("请填写内容");
					UE.getEditor('editor').focus();
					return false
				}
				if ($.trim(g).length <= 0) {
					alert("请填写目标");
					$('input[name="mubiao"]').focus();
					return false
				}
				if ($.trim(h).length <= 0) {
					alert("请填写宗旨");
					$('input[name="zongzhi"]').focus();
					return false
				}
				if ($.trim(i).length <= 0) {
					alert("请填写理念");
					$('input[name="idea"]').focus();
					return false
				}
				if(!isLucky){
					isLucky = true;
					$.ajax({
						type: "POST",
						url: "editCorporateCultureData",
						data: {
							"url": e,
							"content": d,
							"mubiao": g,
							"zongzhi": h,
							"idea": i
						},
						timeout: 20000,
						beforeSend: function(a) {
							$("#error_mask,.showmsg").show();
							$(".showmsg").text("正在添加，请稍候...")
						},
						success: function(a) {
							isLucky = false;
							if (a.status === 200) {
								alert(a.msg);
								setTimeout(function() {
									location.reload()
								}, 1000)
							} else {
								$(".showmsg").text(a.msg);
								$("#error_mask,.showmsg").hide()
							}
							$("#error_mask,.showmsg").hide()
						},
						error: function(a, b, c) {
							isLucky = false;
							$(".showmsg").text("状态：" + b + "；出错提示：" + c);
							$("#error_mask,.showmsg").hide()
						}
					})
				}
			});
		});
		
		function jume(){
			$.ajax({
				type : 'POST',
				async : false,
				url : 'getCorporateCultureData',
				success : function(re){
					if(re != null){
						$('.centeredVideo');//视频
						$('.contentdiv').html(re.content);
						var img = re.imgs.split(',');
						var imghtml = '';
						$.each(img,function(i,v){
							imghtml+='<img src="'+v+'"/>';
						});
						$('.imgsdiv').html(imghtml);
						$('.gsmubiaodiv p').text(re.mubiao);
						$('.qyzongzhidiv p').text(re.zongzhi);
						$('.jyliniandiv p').text(re.idea);
						
						$('input[name="url"]').val(re.url);
						ue.ready(function() {//编辑器初始化完成再赋值  
							ue.setContent(imghtml+""+re.content);  //赋值给UEditor  
						});
						$('input[name="mubiao"]').val(re.mubiao);
						$('input[name="zongzhi"]').val(re.zongzhi);
						$('input[name="idea"]').val(re.idea);
					}
				},error : function(re){
					alert(re.status);
				}
			});
		}
	</script>
</body>
</html>