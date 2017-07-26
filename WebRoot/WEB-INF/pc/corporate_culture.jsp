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
<title>籽匠猫-企业文化</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-企业文化">
<meta http-equiv="description" content="籽匠猫-企业文化">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<link rel="stylesheet" href="pc/css/style.css"/>
<script src="pc/js/lrtk20160517.js"></script>
</head>
<!-- onload="cascdeInit('','',''),cascdeInitTwo('','','')"  -->
<body id="topBody">
<jsp:include page="top.jsp">
	<jsp:param value="9" name="pageName"/>
</jsp:include>

	<div class="ny_banner">
		<img src="pc/images/about_banner.jpg" alt="" />
     </div>

<div class="title1">
  <div class="w1200">
    <div class="ny-title">
      <div class="ny-title-left fr">
        <ul>
          <li class="ny-title-left1"> <a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""> </a> </li>
          <li><a href="javascript:void(0);" title="关于我们">关于我们 </a></li>
          <li class="ny-title-left3"><img src="pc/images/jit.png" alt=""></li>
           <li class="ny-title-left4"> 公司介绍 </li>
        </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">
        <ul>
          <li >
          	<a href="toCorporateCulturePage#gsjj" class="tit_hover" >公司简介   </a></li>
          	<li><a href="toCorporateCulturePage#qywh">企业文化  </a></li><li><a href="toCorporateCulturePage#jrwm">加入我们</a></li> 
          	<li><a href="toCorporateCulturePage#lxfs">联系方式</a></li>       </ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>
	<a name="gsjj"></a>

<div class="about_title">

	<span>公司简介</span>
	<div class="about_height"></div>
</div>
<div class="about_mvc">
	<img src="pc/images/shipin.jpg" alt="" onclick="iVideo();" style="cursor: pointer;">
</div>

<div id="ivideo_bg" style="display: none;"></div>
<div id="ivideo_play" style="display: none;">
  <div id="ivideo_plays">
    <video width="800" height="450"  controls="controls"  id="video1">
      <source src="pc/images/testvideo.flv" type="video/mp4" />
      <source src="pc/images/testvideo.flv" type="video/ogg" />
      <source src="pc/images/testvideo.flv" type="video/webm" />
      <object data="images/testvideo.flv" width="800" height="450">
        <embed src="pc/images/testvideo.flv" width="800" height="450" />
      </object>
    </video>
  </div>
  <span onclick="$('#ivideo_bg,#ivideo_play').hide();"></span></div>
<script type="text/javascript">
function iVideo(){
  $("#ivideo_bg,#ivideo_play").show();
}
</script>


<div class="w1200">
<div class="about_zx">
	<div class="about_zx_top">${corporates.content}</div>


	<div class="about_zx_bottom">
		     <div class="poster-main" id="carousel" data-setting='{
                            "width":1000,
                            "height":300,
                            "posterWidth":600,
                            "posterHeight":300,
                            "scale":0.8,
                            "speed":1000,
                            "autoPlay":true,
                            "delay":3000,
                            "verticalAlign":"middle"
                            }'>
               <div class="poster-btn poster-prev-btn"></div>
               <ul class="poster-list">
               <c:forEach items="${fn:split(corporates.imgs,',')}" var="img">
	                <li class="poster-item"><a href="#"><img src="${img}" alt="" width="100%" height="100%" /></a></li>
               </c:forEach>
               </ul>
               <div class="poster-btn poster-next-btn"></div>
          </div>

	</div>
</div>
</div>

 <div class="qiy">
<div class="w1200">
	<a name="qywh"></a>

<div class="about_title">
	<span>企业文化</span>

	<div class="about_height"></div>
</div>

    <ul>
		   <li class="no_dji">
        <div class="qiy_img"> <img src="pc/images/2017051366568.jpg" alt=""><span>公司目标</span> </div>
        <div class="qiy_tex">

          <div class="note">${corporates.mubiao}</div>
        </div>
      </li>
      <li>
        <div class="qiy_img"> <img src="pc/images/2017051361759.jpg" alt=""><span>企业主旨</span> </div>
        <div class="qiy_tex">

          <div class="note">${corporates.zongzhi}</div>
        </div>
      </li>

      <li>
        <div class="qiy_img"> <img src="pc/images/2017051364409.jpg" alt=""><span>经营理念</span> </div>
        <div class="qiy_tex">

          <div class="note">${corporates.idea}</div>
        </div>
      </li>
      <div class="cl"></div>
      <a name="rrzz"></a>
    </ul>
    <div class="cl"></div>
  </div>
</div>

<div class="about_form">
	<a name="jrwm"></a>

	<div class="about_title">
	<span style="color:#fff">加入我们</span>

	<div class="about_height"></div>
	</div>
	<div class="w1200">
		<div class="about_js">
			杍匠猫装修网 —— 创于2017年，是集研发、生产、营销、服务为一体的大型综合性家具企业，通过精益求精的经营理念，成为中国家具行业的领军品牌。<br/>
现因公司业务发展的需求，面向社会招聘人才。愿有志之士，加入我们的团队。
		</div>
		<div class="about_yx">
			给杍匠猫发简历：zjmao@888.com
		</div>
		<div class="about_title">
		<span style="color:#fff">申请加盟表</span>
		<div class="about_height"></div>
		</div>
		<div class="tj_form">
		<form action="">
				<dl>
					<dd class="font_fist">
						<span class="fl">姓名：</span>
						<input type="text" name="" class="fl">
						<div class="cl"></div>
					</dd>
					<dd class="font_fist">
						<span class="fl">手机：</span>
						<input type="text" name="" class="fl">
						<div class="cl"></div>
					</dd>
					<dd class="font_two">
						<div class="font_two_left fl">
							<select name=""  class="font_two_l">
								<option value="">加盟省份</option>
								<option value="">加盟省份</option>

							</select>
						</div>
						<div class="font_two_left fr">
							<select name=""  class="font_two_l">
								<option value="">加盟城市</option>
								<option value="">加盟城市</option>

							</select>
						</div>
						<div class="cl"></div>
					</dd>
						<div class="cl"></div>

					<dd class="de_si">
						<select name=""  class="font_two_r">
								<option value="">加盟项目</option>
								<option value="">加盟项目</option>

							</select>
					</dd>
					<dd class="min_siu">
						<input type="submit" value="提交加盟意向" />
					</dd>
				</dl>
				</form>
		</div>
	</div>
</div>
</div>

<div class="about_lianxi">
	<a name="lxfs"></a>

	<div class="about_title">
	<span>联系方式</span>

	<div class="about_height"></div>
	</div>
	<div class="w1200">
	<div class="about_lianxi_left fl">
		<c:forEach items="${corporates.coltdAddresses}" var="address">
			<c:if test="${address.isMr == 1}">
				<dl>
					<dt>${address.name}</dt>
					<dd class="dl_fost">
						<div class="anxi_lef fl"><img src="pc/images/xi1.jpg" alt=""></div>
						<div class="abxi_rih fl">地址：${address.address}</div>
						<div class="cl"></div>
					</dd>
					<dd class="dl_fost">
						<div class="anxi_lef fl"><img src="pc/images/xi2.jpg" alt=""></div>
						<div class="abxi_rih fl">邮编：${address.youbian}</div>
						<div class="cl"></div>
					</dd>
					<dd class="dl_fost">
						<div class="anxi_lef fl"><img src="pc/images/xi3.jpg" alt=""></div>
						<div class="abxi_rih fl">电话：${address.phone}</div>
						<div class="cl"></div>
					</dd>
					<dd class="dl_fost">
						<div class="anxi_lef fl"><img src="pc/images/xi4.jpg" alt=""></div>
						<div class="abxi_rih fl">传真：${address.chuanzhen}</div>
						<div class="cl"></div>
					</dd>
					<dd class="dl_fost">
						<div class="anxi_lef fl"><img src="pc/images/xi5.jpg" alt=""></div>
						<div class="abxi_rih fl">邮箱：${address.email}</div>
						<div class="cl"></div>
					</dd>
				</dl>
			</c:if>
		</c:forEach>
	</div>

	<div class="about_lianxi_right fr">
		<jsp:include page="ditu.jsp"/>
	</div>
	<div class="cl"></div>

	<div class="juj"><img src="pc/images/juj.jpg" alt=""></div>

	<div class="about_ries">
		<c:forEach items="${corporates.coltdAddresses}" var="address">
			<c:if test="${address.isMr != 1}">
				<dl >
					<dt>${address.name}</dt>
					<dd>地址：${address.address}</dd>
					<dd>邮编：${address.youbian}</dd>
					<dd>电话：${address.phone}</dd>
					<dd>传真：${address.chuanzhen}</dd>
					<dd>邮箱：${address.email}</dd>
				</dl>
			</c:if>
		</c:forEach>
		<div class="cl"></div>
	</div>
	</div>

</div>
<!-- 定制风格-->
<!-- 尾部 -->
<jsp:include page="bottom.jsp"/>
<!-- 尾部 -->

<script src="pc/js/Carousel.js"></script>

<script type="text/javascript">
        $(function(){
            Carousel.init($("#carousel"));
            $("#carousel").init();
        });
    </script>
</body>
</html>