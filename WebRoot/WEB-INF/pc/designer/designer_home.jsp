<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-设计师首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="籽匠猫-设计师首页">
	<meta http-equiv="description" content="籽匠猫-设计师首页">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery.min.js"></script>
	<script type="text/javascript" src="pc/js/jquery.superslide.2.1.1.js"></script> -->
	<script type="text/javascript" src="pc/js/cascadeall.js"></script>
	<script type="text/javascript" src="pc/designer/designer_home.js"></script>
	<link rel="stylesheet" href="pc/css/style.css"/>
	<link rel="stylesheet" href="pc/css/sjs.css" />
	<script src="pc/js/lrtk20160517.js"></script>
  </head>
  
  <body onload="cascdeInit('','','')">
  
    <jsp:include page="../top.jsp">
		<jsp:param value="4" name="pageName"/>
	</jsp:include>
	
	<div class="ny_banner">
		<img src="pc/images3/sjs_banner.jpg" alt="" />
     </div>


 <div class="w1200">
 	<div class="liucheng-title">
			<span>定制流程</span>
			<p>用专业为每一位业主把好关</p>
	</div>
<div class="contentBox">
    <div class="proc">
        <div class="icon ico1"></div>
        <div class="turnto"></div>
        <div class="icon ico2"></div>
        <div class="turnto"></div>
        <div class="icon ico3"></div>
        <div class="turnto"></div>
        <div class="icon ico4"></div>
        <div class="turnto"></div>
        <div class="icon ico5"></div>
        <div class="turnto"></div>
        <div class="icon ico6"></div>
        <div class="turnto"></div>
        <div class="icon ico7"></div>
        <div class="turnto"></div>
        <div class="icon ico8"></div>
    </div>
    <div class="worlds">
        <span class="no_aee">免费报名</span><span>预约量尺</span><span>软装设计</span><span>方案研讨</span><span>提交订单</span><span>验收配送</span><span>安装摆样</span><span>售后服务</span>
    </div>
    <div class="cl"></div>
</div>
</div>


<div class="index_sejis1">
    	<div class="liucheng-title">
			<span>设计师团队</span>
			<p>客户的满意  是我们孜孜以求的目标</p>
		</div>
		<div class="index_sejis-con1">
			<div class="w1200 frgr">
				<div class="index_sejis-con_r">
					<ul class="team_box applist wrapfix" id="app_iphone_list">
					<!-- <li style="width:670px; height:100px; " class="">

			</li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户11111。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱1111111">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户222。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱22222222">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱222222222">
                <div class="red_kuang"></div>
            </a></li>
           <li style="width:328px; height:210px; " class=""></li>
            
		 	<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱568" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。999999" name="高级设计师 · 刘萱5689" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "><img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。88888" name="高级设计师 · 刘萱55" alt="高级设计师 · 刘萱5555">
                <div class="red_kuang"></div>
            </a></li>
            <li class="mouse_on"><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。777777" name="高级设计师 · 刘萱567" alt="高级设计师 · 刘萱222222">
                <div class="red_kuang"></div>
            </a></li>
            
			<li><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。555555" name="高级设计师 · 刘萱5555" alt="高级设计师 · 刘萱22222">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱568" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。999999" name="高级设计师 · 刘萱5689" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
            <li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。" name="高级设计师 · 刘萱568" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li>
			<li class=""><a href="#" target="_blank" class="des_img "> <img src="pc/images/sju.jpg" data-original="images/sju.jpg" conc="“想客户所想，思客户所思”是我的设计理念，以细致耐心的服务对待每一位客户。999999" name="高级设计师 · 刘萱5689" alt="高级设计师 · 刘萱">
                <div class="red_kuang"></div>
            </a></li> -->
			
					</ul>
					<div class="cl"></div>
        <div class="csfe appdetail">
            <div class="appdetail_w">
                 <div class="csfe1">
          			<a href="#" class="des_img appdetail_h">
            			<img width="315px;" height="430px;" src="" alt="高级设计师 · 刘萱567" class="seimh">
            		</a>
          		 </div>
          		 <div class="csfe2">
            		<div class="frwsw">
            			<p class="appdetail_v"></p>
            			<div class="dis"></div>
            			<div class="cl"></div>
            			<span></span>
            		</div>
              	 </div>
           	</div>
        </div>
				</div>

    <script>
    $(function(){

    $(".des_close").click(function(){
      $(".hide_div").hide();
    });
  });

  $(".team_box li").mousemove(function(){
  $(".team_box li").removeClass("mouse_on");
  $(this).addClass("mouse_on");

  }

)

    </script>
			</div>
		</div>
    </div>
<!-- 定制风格-->

<!-- 设计师免费服务-->

<div class="w1200">
	<div class="architect">
		<div class="liucheng-title">
			<span>设计师免费服务</span>
			<p>享受杍匠猫免费设计服务，轻松打造梦想家，就这么简单！</p>
		</div>
		<div class="architect_cin">
		<div class="archi1 fl">
		<form action="设计师-首页_submit" id="formda" accept-charset="utf-8">
			<div class="archi_top1">
				<div class="archi_top-l1">免费量尺设计</div>
				<div class="archi_top-l2">贴心服务让您高枕无忧</div>
			</div>
			<div class="archi_top2"><input type="text" name="name" id="" placeholder="您的姓名" /></div>
			<div class="archi_top3"><input type="text" name="phone" id="" maxlength="11" placeholder="预约号将发到您的手机" /></div>
			<div class="archi_top4">
				<div class="archi_top4_left fl">
					<select name="city" id="sel-provance" class="sen1"
							required="required" onchange="selectCity();">
					</select>
					<!-- <select name="shi" id="sel-city" class="sen2" required="required"
							onchange="selectcounty()">
					</select>
					<select
							style="display: none;" name="" id="sel-area" class="sen2"></select> -->
					<!-- <select name="" >
						<option value="">广东</option>
					</select> -->
				</div>
				<div class="archi_top4_left fl de_left">
					<select name="county" id="sel-city" class="sen2" required="required"
							onchange="selectcounty()">
					</select>
					<select
							style="display: none;" name="" id="sel-area" class="sen2"></select>
					<!-- <select name="" >
						<option value="">深圳</option>
					</select> -->
				</div>
				<div class="cl"></div>

			</div>
		<div class="archi_top5">
		* 请填写您的个人信息
		</div>
		<div class="archi_top6">
			<input type="button" id="submit" value="立即免费报名" />
		</div>
		<div class="archi_top7">注：我们至今为<span style="color:#fa791b;">888888</span>名客户提供免费专享服务</div>
		</form>
		</div>
	</div>
	<div class="archi2 fl">
		<img src="pc/images3/maoshu.png" alt="">
	</div>
	<div class="archi3 fl">
		<div class="archi3_title">
		最新预约成功客户
		</div>
<script src="pc/js/scroll.js" type="text/javascript" charset="utf-8" ></script>
<script type="text/javascript">
$(document).ready(function(){
	$('.list_l li:even').addClass('lieven');
})
$(function(){
	$("div.list_l").myScroll({
		speed:40, //数值越大，速度越慢
		rowHeight:32 //li的高度
	});
});
</script>


		<div class="list_l">
			<ul>
				<!-- <li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li>
				<li><a href="javascript:void(0);">武汉孙女士05月12日已申请上门量尺</a></li> -->
			</ul>
		</div>
	</div>
	<div class="cl"></div>
	</div>
</div>

<!-- 设计师免费服务-->
<!-- 客户实例-->
<div class="living">
<div class="w1200">
    <div class="liucheng-title">
            <span>客户实例</span>
            <p>万千家庭口碑见证 杍匠猫设计师为600万客户解决了多种家居问题</p>
    </div>
    <div class="liv_ul">
        <ul>
             <!-- <li>
                <div class="liv_ul1">
                   <a href="javascript:void(0);"> <img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>

              <li class="liv_ul-hoc">
                <div class="liv_ul1">
                   <a href="javascript:void(0);"> <img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>
              <li>
                <div class="liv_ul1">
                   <a href="javascript:void(0);"><img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>
                <li>
                <div class="liv_ul1">
                   <a href="javascript:void(0);"><img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>

              <li class="liv_ul-hoc">
                <div class="liv_ul1">
                    <a href="javascript:void(0);"><img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>
              <li>
                <div class="liv_ul1">
                   <a href="javascript:void(0);"> <img src="pc/images3/de_zha.jpg" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">28m<sup>2</sup>卧室</span> <span class=" fl ul2">林女士</span>
                        <div class="cl"></div>
                        <p>偏爱卡座式客餐厅，让用餐成为更高级的享受</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>喜欢卡座式餐桌，该怎么设计好？</p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>利用组合柜体设计的卡座简单实用，
                            卡座右方的餐边柜开辟出了实用的
                            收纳空间，餐厅搭配紧凑，整体性
                            强。合理实用的定制性柜体搭配清
                            新田园风的饰品，整个客餐厅更具
                            温馨感。</p>
                            <div class="dianz">1588</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="pc/images3/xiaofa.jpg" alt=""><span>范方芳</span>

                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li> -->

        </ul>
        <div class="cl"></div>
    </div>
</div>
</div>
<!-- 客户实例-->

<!-- 设计师对话-->
<div class="w1200">
    <div class="dialogue">
         <div class="liucheng-title">
            <span>对话设计师</span>
            <p>家装设计疑问尽管问，每秒钟都有热心设计师在线！</p>
        </div>
        <div class="Conver">
            <ul>
                <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">120.27.173.*(来自天津)2017-05-04 10:20:15</div>
                        <div class="Conver_right2">您好~~我这边想设计一间房~~后面是2.9米.前面是2.6米.宽5.2米,想问问怎么设计呢？</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">高级设计师&nbsp;   陈成辰&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;1588</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">您好！杍匠猫主营全屋家具的定制服务！根据您提供的尺寸，不知道您想要设计成书房呢？还是其
他？主要是看您这边的使用需求哦！建议您在官网上申请免费在线设计，只要提供具体户型图以及
其他个人基本资料,我们会有专业的设计师为您设计效果图和上门量尺设计的。 </div>
                    </div>
                </div>
                <div class="cl"></div>
                </li>
                
                <!-- <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">120.27.173.*(来自天津)2017-05-04 10:20:15</div>
                        <div class="Conver_right2">您好~~我这边想设计一间房~~后面是2.9米.前面是2.6米.宽5.2米,想问问怎么设计呢？</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">高级设计师&nbsp;   陈成辰&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;1588</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">您好！杍匠猫主营全屋家具的定制服务！根据您提供的尺寸，不知道您想要设计成书房呢？还是其
他？主要是看您这边的使用需求哦！建议您在官网上申请免费在线设计，只要提供具体户型图以及
其他个人基本资料,我们会有专业的设计师为您设计效果图和上门量尺设计的。 </div>
                    </div>
                </div>
                <div class="cl"></div>
                </li>
                
                <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">120.27.173.*(来自天津)2017-05-04 10:20:15</div>
                        <div class="Conver_right2">您好~~我这边想设计一间房~~后面是2.9米.前面是2.6米.宽5.2米,想问问怎么设计呢？</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">高级设计师&nbsp;   陈成辰&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;1588</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">您好！杍匠猫主营全屋家具的定制服务！根据您提供的尺寸，不知道您想要设计成书房呢？还是其
他？主要是看您这边的使用需求哦！建议您在官网上申请免费在线设计，只要提供具体户型图以及
其他个人基本资料,我们会有专业的设计师为您设计效果图和上门量尺设计的。 </div>
                    </div>
                </div>
                <div class="cl"></div>
                </li>
                
                <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">120.27.173.*(来自天津)2017-05-04 10:20:15</div>
                        <div class="Conver_right2">您好~~我这边想设计一间房~~后面是2.9米.前面是2.6米.宽5.2米,想问问怎么设计呢？</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">高级设计师&nbsp;   陈成辰&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;1588</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">您好！杍匠猫主营全屋家具的定制服务！根据您提供的尺寸，不知道您想要设计成书房呢？还是其
他？主要是看您这边的使用需求哦！建议您在官网上申请免费在线设计，只要提供具体户型图以及
其他个人基本资料,我们会有专业的设计师为您设计效果图和上门量尺设计的。 </div>
                    </div>
                </div>
                <div class="cl"></div>
                </li>
                
                <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">120.27.173.*(来自天津)2017-05-04 10:20:15</div>
                        <div class="Conver_right2">您好~~我这边想设计一间房~~后面是2.9米.前面是2.6米.宽5.2米,想问问怎么设计呢？</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">高级设计师&nbsp;   陈成辰&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;1588</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">您好！杍匠猫主营全屋家具的定制服务！根据您提供的尺寸，不知道您想要设计成书房呢？还是其
他？主要是看您这边的使用需求哦！建议您在官网上申请免费在线设计，只要提供具体户型图以及
其他个人基本资料,我们会有专业的设计师为您设计效果图和上门量尺设计的。 </div>
                    </div>
                </div>
                <div class="cl"></div>
                </li> -->

            </ul>
        </div>
        
        <div class="page  ">
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
                <div class="page_right3 fl"><input type="text" /></div>
                <div class="page_right4 fl">页</div>
                <div class="page_right5 fl"><input type="submit" value="确定" /></div>
            </div>
        </form>
         <div class="cl"></div>
        </div>
        
        
        <div class="dia-v">
        <form action="设计师-首页_submit" id="formco" accept-charset="utf-8">

            <div class="dia-v_left fl">
                <span>描述您的装修家居问题</span>
                <div class="Conver_left" style="">
                        <img src="pc/images3/cui_tou.png" name="head" alt="">
                </div>
                <a href="javascript:void(0);" onclick="">选择头像</a>
            </div>
            <div class="dia-v_right fr">
                <div class="dia-v_right_top">
                    <textarea name="content"></textarea>
                </div>
                <div class="dia-v_right_bottom">
                    <input type="button"  id="submittw" value="马上问专家" />
                </div>
            </div>
            <div class="cl"></div>
            </form>
        </div>
        
    </div>


</div>

<!-- 设计师对话-->

<!-- 尾部 -->
<jsp:include page="../bottom.jsp"/>
<!-- 尾部 -->

<script type="text/javascript">
(function(){

    var time = null;
    var list = $("#navlist");
    var box = $("#navbox");
    var lista = list.find("li");

    for(var i=0,j=lista.length;i<j;i++){
        if(lista[i].className == "now"){
            var olda = i;
        }
    }

    var box_show = function(hei){
        box.stop().animate({
            height:hei,
            opacity:1
        },400);
    }

    var box_hide = function(){
        box.stop().animate({
            height:0,
            opacity:0
        },400);
    }

    lista.hover(function(){
        lista.removeClass("now");
        $(this).addClass("now");
        clearTimeout(time);
        var index = list.find("li").index($(this));
        box.find(".cont").hide().eq(index).show();
        var _height = box.find(".cont").eq(index).height();
        box_show(_height)
    },function(){
        time = setTimeout(function(){
            box.find(".cont").hide();
            box_hide();
        },50);
        lista.removeClass("now");
        lista.eq(olda).addClass("now");
    });

    box.find(".cont").hover(function(){
        var _index = box.find(".cont").index($(this));
        lista.removeClass("now");
        lista.eq(_index).addClass("now");
        clearTimeout(time);
        $(this).show();
        var _height = $(this).height();
        box_show(_height);
    },function(){
        time = setTimeout(function(){
            $(this).hide();
            box_hide();
        },50);
        lista.removeClass("now");
        lista.eq(olda).addClass("now");
    });

})();
</script>
  
  </body>
</html>
