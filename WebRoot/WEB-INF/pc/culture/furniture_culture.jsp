<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-家居文化</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-家居文化">
<meta http-equiv="description" content="籽匠猫-家居文化">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<link rel="stylesheet" href="pc/css/style.css"/>
<script src="pc/js/lrtk20160517.js"></script>
</head>
<!-- onload="cascdeInit('','',''),cascdeInitTwo('','','')"  -->
<body id="topBody">
<!-- 头部 -->
<jsp:include page="../top.jsp">
	<jsp:param value="6" name="pageName"/>
</jsp:include>
<!-- 头部 -->

	<div class="ny_banner">
		<img src="pc/images/design.jpg" alt="" />
     </div>

<div class="title1">
  <div class="w1200">
    <div class="ny-title">
      <div class="ny-title-left fr">
        <ul>
          <li class="ny-title-left1"> <a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""> </a> </li>
          <li><a href="javascript:void(0);" title="家居文化">家居文化</a></li>
                </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">
        <ul>
          <li ><a href="javascript:void(0);" class="tit_hover" >杍匠文章  </a></li><li><a href="javascript:void(0);">杍匠潮流 </a></li><li><a href="javascript:void(0);">家居风水</a></li>        </ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>

<div class="w1200">
	<div class="recommend">
		<div class="recommend_left fl">
			<div class="recommend_left_img">
				<img src="pc/images/news-ri.jpg" alt="">
			</div>
			<div class="recommend_left_tex">
				<div class="recommend_left_zuix fl">
					<span class="fl">最新资讯</span>
					<a href="javascript:void(0);" class="fl">定制家居与成品家具对比 优势有哪些?</a>
					<div class="cl"></div>
					<p>开年以来，定制家居行业包括其间的橱柜、衣柜等细分行业已然通过强势的上市浪潮展现了这个
行业的发展前景，并在终端市场上用销量“碾压”着成品家具行业...</p>
				</div>
				<div class="recommend_left_zu fr">
						<div class="eft_zu_top">18</div>
						<div class="eft_zu_bottom">2017-05</div>
				</div>
				<div class="cl"></div>
			</div>
		</div>
		<div class="recommend_right fr">
			<dl>
				<dt>推荐文章</dt>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
				<dd><a href="javascript:void(0);">如何才能选到一款性价比高的沙发...</a></dd>
			</dl>
		</div>
		<div class="cl"></div>
	</div>
</div>
<div class="w1200">
	<div class="news_lie">
    <ul class="fl">
     <li class="nu_cur">
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
       <li>
     <a href="javascript:void(0);" target="_blank" title="">
        <div class="news_lie-img fl"> <img class="tbg" src="pc/images/thumb.jpg" alt="" title=""> </div>
        <div class="news_lie-tex fl"> <span>如何才能选到一款性价比高的沙发 90%的人选错了！</span>
          <p>目前很多家庭都比较爱个性化定制，以前那种传统的衣柜已经满足不了人们的需求了。这不当别人
还在研究产品的点线面，就以数百外的中国家庭为研究对象，遵循家庭的全生命周期规律.... </p>
        </div>
        <div class="news_lie-time fl">
          <div class="lie-time1">18</div>
          <div class="lie-time2">2017-05</div>
        </div>
        <div class="cl"></div>
        </a>
      </li>
      </ul>
        <div class="cl" style="height: 20px;"></div>

      <div class="page fr">
        <form action="#">
            <div class="page_left fl">
                <a href="javascript:void(0);" class="shang ">上一页</a>
                <a href="javascript:void(0);" class="cut de">1</a>
                <a href="javascript:void(0);" class="de">2</a>
                <a href="javascript:void(0);" class="de">3</a>
                <a href="javascript:void(0);" class="de">4</a>
                <a href="javascript:void(0);" class="de">5</a>
                <a href="javascript:;" class="diam">...</a>
                <a href="javascript:void(0);" class="de">18</a>
                <a href="javascript:void(0);" class="xia ">下一页</a>
            </div>
            <div class="page_right fl">
                <div class="page_right1 fl">共18页</div>
                <div class="page_right2 fl">到</div>
                <div class="page_right3 fl"><input type="text"></div>
                <div class="page_right4 fl">页</div>
                <div class="page_right5 fl"><input value="确定" type="submit"></div>
            </div>
        </form>
            <div class="cl"></div>
        </div>
        <div class="cl"></div>
</div>
</div>
<div class="cl"></div>

<!-- 定制风格-->
<!-- 尾部 -->
<jsp:include page="../bottom.jsp"/>
<!-- 尾部 -->
</body>
</html>