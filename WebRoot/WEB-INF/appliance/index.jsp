<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>建材家电城</title>
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<link rel="stylesheet" href="pc/css/style.css" />
	<script type="text/javascript" src="pc/js/jquery.min.js"></script>
  	<script src="pc/js/lrtk20160517.js"></script>
  </head>
  
  <body>
    <jsp:include page="../pc/top.jsp">
		<jsp:param value="7" name="pageName"/>
	</jsp:include>

<div class="sc_banner">
<script type="text/javascript" src="pc/js/slider.js"></script>

    <div id="demo01" class="flexslider">
      <ul class="slides">

        <li><a class="img"><img src="pc/images/scbann.jpg" /></a></li>
        <li><a class="img"><img src="pc/images/scbann.jpg" /></a></li>
        <li><a class="img"><img src="pc/images/scbann.jpg" /></a></li>

      </ul>
    </div>

<script type="text/javascript">
$(function(){

  $('#demo01').flexslider({
    animation: "slide",
    direction:"horizontal",
    easing:"swing"
  });


});
</script>
</div>
<div class="w1200">
<div class="sc_zuixin">
    <div class="sc_zuixin_left fl">
       <a href="javascript:void(0)"> <img src="pc/images/sc_zuix.jpg" alt=""></a>
    </div>
    <div class="sc_zuixin_right fl">


<div id="sc-CSSBox">
    <ul id="sc-CSSContent">
        <li style="background:url('pc/images/sc_zx1.jpg') no-repeat; background-size:100% 100%"><a href="too-goods_info" target="_blank">
                <div class="tentcon">
                    <div class="tentcon_top" style="background:#8ad3dc;">感恩首推</div>
                    <div class="tentcon_bottom">
                        美式古典床
                        <span>￥3366</span>
                    </div>
                    <div class="tentcon_go">
                        <img src="pc/images/go.png" alt="">
                    </div>
                </div>
        </a></li>
         <li style="background:url('pc/images/sc_zx1.jpg') no-repeat; background-size:100% 100%"><a href="too-goods_info" target="_blank">
                <div class="tentcon">
                    <div class="tentcon_top" style="background:#8ad3dc;">感恩首推</div>
                    <div class="tentcon_bottom">
                        美式古典床
                        <span>￥3366</span>
                    </div>
                    <div class="tentcon_go">
                        <img src="pc/images/go.png" alt="">
                    </div>
                </div>
        </a></li>
         <li style="background:url('pc/images/sc_zx1.jpg') no-repeat; background-size:100% 100%"><a href="too-goods_info" target="_blank">
                <div class="tentcon">
                    <div class="tentcon_top" style="background:#8ad3dc;">感恩首推</div>
                    <div class="tentcon_bottom">
                        美式古典床
                        <span>￥3366</span>
                    </div>
                    <div class="tentcon_go">
                        <img src="pc/images/go.png" alt="">
                    </div>
                </div>
        </a></li>
         <li style="background:url('pc/images/sc_zx1.jpg') no-repeat; background-size:100% 100%"><a href="too-goods_info" target="_blank">
                <div class="tentcon">
                    <div class="tentcon_top" style="background:#8ad3dc;">感恩首推</div>
                    <div class="tentcon_bottom">
                        美式古典床
                        <span>￥3366</span>
                    </div>
                    <div class="tentcon_go">
                        <img src="pc/images/go.png" alt="">
                    </div>
                </div>
        </a></li>

    </ul>
    <div class="cl"></div>
</div>
<script src="pc/js/MSClass.js" type="text/javascript"></script>

</div>
</div>
    <div class="cl"></div>
</div>
</div>
<div class="w1200">
<div class="sc_tg">
      <div class="sc_tg-left fl">团购专区</div>
      <div class="sc_tg-right fr">
        <div id="sc-LeftButton"></div>
        <div id="sc-RightButton"></div>
      </div>
      <div class="cl"></div>
</div>
<div class="sc_tuan">
        <ul>
            <li>
                <div class="sc_tuan_top"><img src="pc/images/sc_d1.jpg" alt=""></div>
                <h4>现代风格 新贵之选 1.8米真皮软体床</h4>
                <div class="sc_tuan_bottom">
                    <span class="sc_tuan_bottom1 fl">优惠价：￥2188</span>
                    <div class="sc_tuan_bottom2 fl">原价：￥3200</div>
                    <div class="cl"></div>
                </div>
                <a href="too-goods_info">立即参团</a>
            </li>
            <li>
                <div class="sc_tuan_top"><img src="pc/images/sc_d1.jpg" alt=""></div>
                <h4>现代风格 新贵之选 1.8米真皮软体床</h4>
                <div class="sc_tuan_bottom">
                    <span class="sc_tuan_bottom1 fl">优惠价：￥2188</span>
                    <div class="sc_tuan_bottom2 fl">原价：￥3200</div>
                    <div class="cl"></div>
                </div>
                <a href="too-goods_info">立即参团</a>
            </li>
            <li>
                <div class="sc_tuan_top"><img src="pc/images/sc_d1.jpg" alt=""></div>
                <h4>现代风格 新贵之选 1.8米真皮软体床</h4>
                <div class="sc_tuan_bottom">
                    <span class="sc_tuan_bottom1 fl">优惠价：￥2188</span>
                    <div class="sc_tuan_bottom2 fl">原价：￥3200</div>
                    <div class="cl"></div>
                </div>
                <a href="too-goods_info">立即参团</a>
            </li>
            <li>
                <div class="sc_tuan_top"><img src="pc/images/sc_d1.jpg" alt=""></div>
                <h4>现代风格 新贵之选 1.8米真皮软体床</h4>
                <div class="sc_tuan_bottom">
                    <span class="sc_tuan_bottom1 fl">优惠价：￥2188</span>
                    <div class="sc_tuan_bottom2 fl">原价：￥3200</div>
                    <div class="cl"></div>
                </div>
                <a href="too-goods_info">立即参团</a>
            </li>
        </ul>
        <div class="cl"></div>
</div>
</div>
<script type="text/javascript">
new Marquee(
{
    MSClass   : ["sc-CSSBox","sc-CSSContent"],
    Direction : 2,
    PrevBtnID : "sc-LeftButton",
    NextBtnID : "sc-RightButton",
    Step      : 0.3,
    Width     : 1009,
    Height    : 152,
    Timer     : 20,
    DelayTime : 3000,
    WaitTime  : 3,
    ScrollStep: 256,
    SwitchType: 0,
    AutoStart : true,
});
</script>
<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #fc7f1c url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#c75800;">1F</span>餐厅家具
            </div>
            <div class="sc_jiaju1_bottom jiaj1">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a href="too-goods_info" class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a href="too-goods_info" class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a href="too-goods_info" class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top" onclick="javascript:location.href='too-goods_info';">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top" onclick="javascript:location.href='too-goods_info';">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li onclick="javascript:location.href='too-goods_info';">
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li onclick="javascript:location.href='too-goods_info';">
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li onclick="javascript:location.href='too-goods_info';">
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li onclick="javascript:location.href='too-goods_info';">
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>


<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #dfa70f url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#b68500;">2F</span>客厅家具
            </div>
            <div class="sc_jiaju1_bottom jiaj2">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>



<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #5eaee9 url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#207ec3;">3F</span>卧室家具
            </div>
            <div class="sc_jiaju1_bottom jiaj3">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>

<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #a67459 url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#7d4f36;">4F</span>书房家具
            </div>
            <div class="sc_jiaju1_bottom jiaj4">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>

<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #f07767 url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#d04533;">5F</span>儿童房家具
            </div>
            <div class="sc_jiaju1_bottom jiaj5">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>

<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #5dcc87 url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#28ac5a;">6F</span>家居电器
            </div>
            <div class="sc_jiaju1_bottom jiaj6">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>

<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #de83ce url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#ba5daa;">7F</span>窗帘
            </div>
            <div class="sc_jiaju1_bottom jiaj7">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>

<div class="w1200">
    <div class="sc_jiaju">
        <div class="sc_jiaju1 fl">
            <div class="sc_jiaju1_top" style="background: #7ec242 url(pc/images/SCFR1.png)  no-repeat 95% 10px;">
                    <span style="background:#66a52e;">8F</span>家居饰品
            </div>
            <div class="sc_jiaju1_bottom jiaj8">
                <ul>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>
                    <li class="fl"><a href="javascript:void(0)">实木餐桌</a></li>
                    <li class="fr"><a href="javascript:void(0)">折叠餐桌</a></li>

                </ul>
                <div class="cl"></div>
                <div class="scimg">
                    <img src="pc/images/sc_zz.png" alt="">
                </div>
            </div>
        </div>
        <div class="sc_jiaju2 fl">
        <div class="demo02" class="flexslider">
        <ul class="slides">

        <li><a class="img1" ><img src="pc/images/jiand.png" /> <div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>
        <li><a class="img1"><img src="pc/images/jiand.png" /><div class="inft-tex">
水曲柳乳白实木餐桌 <span>￥2588.00</span>
        </div></a></li>

      </ul>
    </div>
        </div>
        <div class="sc_jiaju3 fl">
            <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>
             <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
            </div>

        </div>
        <div class="cl"></div>
    </div>
    <div class="sc_jiaps">
        <ul>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>
            <li>
                <div class="sc_jiaju3_top">
                    <div class="sc_jiaju3-img">
                        <img src="pc/images/sc_yuanz.png" alt="">
                    </div>
                    <div class="sc_jiaju3-tex">
                                原木精品 小户型之选 全实木餐桌
                                <span>¥1750.00</span>
                    </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
    </div>
</div>
<script type="text/javascript">
$(function(){

  $('.demo02').flexslider({
    animation: "slide",
    direction:"horizontal",
    easing:"swing"
  });


});
</script>

<div style="height: 80px;">

</div>
<!-- 尾部 -->
<jsp:include page="../pc/bottom.jsp"/>
<!-- 尾部 -->
</html>
