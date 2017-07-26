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
<title>籽匠猫-籽匠工艺管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-籽匠工艺管理">
<meta http-equiv="description" content="籽匠猫-籽匠工艺管理">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<script type="text/javascript" src="pcadmin/technology/js/show_technology.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css" />
<link rel="stylesheet" href="pcadmin/community/css/show_post.css" />
<link href="pc/jPlayer/dist/skin/pink.flag/css/jplayer.pink.flag.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="pc/jPlayer/lib/jquery.min.js"></script>
<script type="text/javascript" src="pc/jPlayer/dist/jplayer/jquery.jplayer.min.js"></script>
</head>

<body>
	<div class="error_mask error_opacity none"></div>
  	<div class="error_content none">
  		<div style="height: 36px;"><img src="pcadmin/community/images/close.png" style="position:absolute;right: 10px;cursor: pointer;" class="close"/></div>
		<div id="jp_container_1" style="margin:0px auto" class="jp-video jp-video-360p"
			role="application" aria-label="media player">
			<div class="jp-type-single">
				<div id="jquery_jplayer_1" class="jp-jplayer"></div>
				<div class="jp-gui">
					<div class="jp-video-play">
						<button class="jp-video-play-icon" role="button" tabindex="0">play</button>
					</div>
					<div class="jp-interface">
						<div class="jp-progress">
							<div class="jp-seek-bar">
								<div class="jp-play-bar"></div>
							</div>
						</div>
						<div class="jp-current-time" role="timer" aria-label="time">&nbsp;</div>
						<div class="jp-duration" role="timer" aria-label="duration">&nbsp;</div>
						<div class="jp-details">
							<div class="jp-title" aria-label="title">&nbsp;</div>
						</div>
						<div class="jp-controls-holder">
							<div class="jp-volume-controls">
								<button class="jp-mute" role="button" tabindex="0">mute</button>
								<button class="jp-volume-max" role="button" tabindex="0">max
									volume</button>
								<div class="jp-volume-bar">
									<div class="jp-volume-bar-value"></div>
								</div>
							</div>
							<div class="jp-controls">
								<button class="jp-play" role="button" tabindex="0">play</button>
								<button class="jp-stop" role="button" tabindex="0">stop</button>
							</div>
							<div class="jp-toggles">
								<button class="jp-repeat" role="button" tabindex="0">repeat</button>
								<button class="jp-full-screen" role="button" tabindex="0">full
									screen</button>
							</div>
						</div>
					</div>
				</div>
				<div class="jp-no-solution">
					<span>Update Required</span> To play the media you will need to
					either update your browser to a recent version or update your <a
						href="http://get.adobe.com/flashplayer/" target="_blank">Flash
						plugin</a>.
				</div>
			</div>
		</div>
		<div class="contentdiv"></div>
  	</div>
	<div id="show_technology_div">
		<table width="100%" class="title_table">
			<caption>
				<!-- <h1>待审核拍客列表</h1> -->
				<div class="listpaike">
					<span class="current" data-sh="0">工艺视频</span>
					<span data-sh="1">图文工艺</span>
				</div>
				<div class="clear"></div>
			</caption>
			<tr height="32px" align="center" bgcolor="#ccc">
				<td width="25%" class="td-title">发表时间</td>
				<td width="25%" class="td-title">标题</td>
				<td width="25%" class="td-title">作者</td>
				<td width="25%" class="td-title">操作</td>
			</tr>
		</table>
		
		<table width="100%" id="tabledata">
    	</table>
	</div>
</body>
<script type="text/javascript">
$(function(){
	$('.close').on('click',function(){
		$('.error_mask,.error_content,#video1').hide();
	});
});
</script>
</html>