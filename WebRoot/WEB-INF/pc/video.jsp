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
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css" href="pc/video/css/reset.css" />
<link rel="stylesheet" href="pc/video/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="pc/video/css/willesPlay.css" />
<script src="pc/video/js/jquery-1.11.3.min.js" type="text/javascript"
	charset="utf-8"></script>
<script src="pc/video/js/willesPlay.js" type="text/javascript" charset="utf-8"></script>
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div id="willesPlay">
					<div class="playHeader">
						<div class="videoName">Tara - 懂的那份感觉</div>
					</div>
					<div class="playContent">
						<div class="turnoff">
							<ul>
								<li><a href="javascript:;" title="喜欢"
									class="glyphicon glyphicon-heart-empty"></a></li>
								<li><a href="javascript:;" title="关灯"
									class="btnLight on glyphicon glyphicon-sunglasses"></a></li>
								<li><a href="javascript:;" title="分享"
									class="glyphicon glyphicon-share"></a></li>
							</ul>
						</div>
						<video width="100%" height="100%" id="playVideo"> <source
							src="http://localhost:8080/static_img/post/video/1498120333855f8001eea-64c4-4492-b249-82241a8e3a82.mp4"
							type="video/mp4"></source> 当前浏览器不支持 video直接播放，点击这里下载视频： <a
							href="/">下载视频</a> </video>
						<div class="playTip glyphicon glyphicon-play"></div>
					</div>
					<div class="playControll">
						<div class="playPause playIcon"></div>
						<div class="timebar">
							<span class="currentTime">0:00:00</span>
							<div class="progress">
								<div
									class="progress-bar progress-bar-danger progress-bar-striped"
									role="progressbar" aria-valuemin="0" aria-valuemax="100"
									style="width: 0%"></div>
							</div>
							<span class="duration">0:00:00</span>
						</div>
						<div class="otherControl">
							<span class="volume glyphicon glyphicon-volume-down"></span> <span
								class="fullScreen glyphicon glyphicon-fullscreen"></span>
							<div class="volumeBar">
								<div class="volumewrap">
									<div class="progress">
										<div class="progress-bar progress-bar-danger"
											role="progressbar" aria-valuemin="0" aria-valuemax="100"
											style="width: 8px;height: 40%;"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>

	<div style="text-align:center;clear:both;">
		<script src="pc/video/gg_bd_ad_720x90.js" type="text/javascript"></script>
		<script src="pc/video/follow.js" type="text/javascript"></script>
	</div>
</body>
</html>
