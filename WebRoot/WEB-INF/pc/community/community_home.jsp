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
<title>籽匠猫-社区首页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-社区首页">
<meta http-equiv="description" content="籽匠猫-社区首页">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<link rel="stylesheet" href="pc/css/style.css"/>
<link rel="stylesheet" href="pc/css/sq.css" />
<script src="pc/js/lrtk20160517.js"></script>
</head>
<!-- onload="cascdeInit('','',''),cascdeInitTwo('','','')"  -->
<body id="topBody">
<jsp:include page="../top.jsp">
		<jsp:param value="8" name="pageName"/>
	</jsp:include>
    <div class="ny_banner">
        <img src="pc/images2/babnn1.jpg" alt="" />
     </div>
    <!-- <div class="bbs-top">
        <div class="w1200">
        <div class="bbs-top_left fl">
            <ul>
                <li>
                    <img src="pc/images2/bbs_top1.png" alt="">
                    <span>今日: 1588   </span>
                </li>
                 <li>
                    <img src="pc/images2/bbs_top2.png" alt="">
                    <span>昨日: 2588   </span>
                </li>
                 <li>
                    <img src="pc/images2/bbs_top3.png" alt="">
                    <span>   帖子: 15888     </span>
                </li>
                 <li>
                    <img src="pc/images2/bbs_top4.png" alt="">
                    <span>    会员: 218888 </span>
                </li>

            </ul>
            <div class="cl"></div>
        </div>
        <div class="bbs-top_right fr">
            <a href="javascript:void(0);"><div class="bbs-top_right1 fl">发表帖子</div></a>
            <a href="javascript:void(0);"><div class="bbs-top_right2 fl"><span>签到</span><p>签到18888人</p></div></a>
            <div class="cl"></div>
        </div>
        <div class="cl"></div>
        </div>
    </div> -->

<div class="title1">
  <div class="w1200">
    <div class="ny-title">
      <div class="ny-title-left fr">
        <ul>
          <li class="ny-title-left1"> <a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""> </a> </li>
          <li><a href="javascript:void(0);" title="关于我们">杍匠社区  </a></li>

        </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">
        <ul>
          <li ><a href="javascript:void(0);" class="tit_hover" >社区首页     </a></li>
          <li><a href="to-community-topic" >  社区话题 </a></li> 
          <li><a href="to-community-shoot_off">社区拍客</a></li>       </ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>
<div class="bbs_con" style="margin-top:50px;">
<div class="w1200">
<div class="bos_left fl">
    <div class="bos-letie" style="margin-top:0px">
        <span>精华推荐</span>
        <img src="pc/images2/weidianxia.jpg" alt="">
    </div>
    <div class="custom-made1">
        <ul>
            <li class="cur_cse ">
                <div class="custom-made-left fl" >
                    <a href="javascript:void(0);"><img src="pc/images2/made.jpg" alt=""></a>
                </div>
                <div class="custom-made-right fr">
                    <h4><a href="javascript:void(0);">定制家居与成品家具对比 优势有哪些?</a></h4>
                    <div class="custom1 fl"><a href="javascript:void(0);"><img src="pc/images2/custom1.jpg" alt=""  class="fl"><span class="fl">漂洋过海来看你 </span></a><div class="cl"></div></div>
                    <div class="custom2 fl"><img src="pc/images2/custom2.jpg" alt="" class="fl"><span class="fl">2888</span><div class="cl"></div></div>
                    <div class="custom3 fl"><img src="pc/images2/custom3.jpg" alt="" class="fl"><span class="fl">1888</span><div class="cl"></div></div>
                    <div class="cl"></div>
                    <p>定制家居行业包括其间的橱柜、衣柜等细分行业已然通过强势的上市浪潮
展现了这个行业的发展前景，并在终端市场上用销量“碾压”着成品家具
行业。为什么定制家居的魅力如此之大，和成品家具相比。</p>
                    <div class="Read-More">
                        <a href="javascript:void(0);">Read More</a>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="cl"></div>
            </li>
            <li class="cur_cse no_boder">
                <div class="custom-made-left fl">
                    <a href="javascript:void(0);"><img src="pc/images2/made.jpg" alt=""></a>
                </div>
                <div class="custom-made-right fr">
                    <h4><a href="javascript:void(0);">定制家居与成品家具对比 优势有哪些?</a></h4>
                    <div class="custom1 fl"><a href="javascript:void(0);"><img src="pc/images2/custom1.jpg" alt=""  class="fl"><span class="fl">漂洋过海来看你 </span></a><div class="cl"></div></div>
                    <div class="custom2 fl"><img src="pc/images2/custom2.jpg" alt="" class="fl"><span class="fl">2888</span><div class="cl"></div></div>
                    <div class="custom3 fl"><img src="pc/images2/custom3.jpg" alt="" class="fl"><span class="fl">1888</span><div class="cl"></div></div>
                    <div class="cl"></div>
                    <p>定制家居行业包括其间的橱柜、衣柜等细分行业已然通过强势的上市浪潮
展现了这个行业的发展前景，并在终端市场上用销量“碾压”着成品家具
行业。为什么定制家居的魅力如此之大，和成品家具相比。</p>
                    <div class="Read-More">
                        <a href="javascript:void(0);">Read More</a>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="cl"></div>
            </li>

        </ul>
    </div>
         <div class="bos-letie">
        <span>热门话题</span>
        <img src="pc/images2/weidianxia.jpg" alt="">
        </div>
        <div class="custom-made3">
            <ul>
                <li class="no_m-left">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                    <a href="javascript:void(0);">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                        </a>
                    </div>
                </li>
                <li class="">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                    <a href="javascript:void(0);">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                        </a>
                    </div>

                </li>
                <li class="">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                    <a href="javascript:void(0);">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                        </a>
                    </div>
                </li>
                <li class="no_m-left">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                    <a href="javascript:void(0);">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                        </a>
                    </div>
                </li>
                <li class="">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                    </div>
                </li>
                 </li>
                <li class="">
                    <img src="pc/images2/custom-made3.jpg" alt="" class="ami-img">
                    <div class="ami">
                        <div class="ami-top"><img src="pc/images2/views.png" alt=""><span>888</span></div>
                        <p>不仅红木家具所使用的优质木材，精美的
装饰...</p>
                        <div class="amin-a"><a href="javascript:void(0);" class="amin_more">查看全文</a></div>
                    </div>
                </li>
            </ul>
            <div class="cl"></div>
        </div>
</div>
<script type="text/javascript">

$(".custom-made3 li").hover(function(){
    $(this).find('.ami').show();

  },function(){
    $(this).find('.ami').hide();

  });
</script>
<div class="bbs_con_right fr">
<div class="bbs-top_right " style="padding-top:0px;">
            <a href="to-community-post"><div class="bbs-top_right1 fl">发表拍客</div></a>
            <!-- <a href="javascript:void(0);"><div class="bbs-top_right2 fl"><span>签到</span><p>签到18888人</p></div></a> -->
            <div class="cl"></div>
        </div>
        <div class="cl"></div>
    <!-- <div class="bbs_cttit" >
        <span>热门标签</span>
        <img src="pc/images2/bbs_xian.png" alt="">
    </div>
    <div class="bbs_bianqs">
            <ul>
                <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                 <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                 <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                 <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                 <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                 <li class="no_m-left"><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
                <li ><a href="javascript:void(0);">家居软装</a></li>
            </ul>
            <div class="cl"></div>
    </div> -->
    <div class="bbs_cttit">
        <span>热帖推荐</span>
        <img src="pc/images2/bbs_xian.png" alt="">
    </div>

    <div class="hot-post">
        <ul>
            <li><span class="post_civil1">1</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil2">2</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil3">3</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil4">4</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil4">5</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil4">6</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil4">7</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>
            <li><span class="post_civil4">8</span><a href="javascript:void(0);" title="">红木家具中雕刻技术知多少？</a><div class="cl"></div><p>中国红木家具蕴含着较高的鉴赏和收藏的价值
不仅红木家具所使用的优质木材，精美的装饰
艺术也为其增添了独特韵味。</p></li>

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
        <span>关注我们</span>
        <img src="pc/images2/bbs_xian.png" alt="">
    </div>
    <div class="sotp-bs">
        <div class="sotp-bs_left fl"><img src="pc/images2/post-logo.png" alt=""></div>
        <div class="sotp-bs_right fr">
            <span>官方微博</span>
            <a href=""><img src="pc/images2/xin-img.jpg" alt=""></a>
        </div>
        <div class="cl"></div>
    </div>
    <div class="sotp-bwx">
        <div class="sotp_left fl"><img src="pc/images2/post_weix.jpg" alt=""></div>
        <div class="sotp_right fr">
                <span>官方微博</span>
            <a href="javascript:;">扫一扫</a>
        </div>
        <div class="cl"></div>
    </div>
</div>
<div class="cl"></div>
 <div class="bbs_cttit" >
        <span>家居拍客</span>
        <img src="pc/images2/bbs_xian1.png" alt=""  style="display:block;width:1200px;height: 1px;">
    </div>

<div class="bos_paike">
        <ul>
            <li class=""><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>
            <li class="ni_mij"><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>
            <li class=""><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>
             <li class=""><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>
            <li class="ni_mij"><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>
            <li class=""><img src="pc/images2/peike.jpg" alt="">
                <div class="bos_pa-bj">
                    北欧极简风格
                    <div class="os_pa">
                        <div class="mijy_bord">
                            <div class="mijy1"><div class="mijy1-c"></div></div>
                            <div class="mijy2"><div class="mijy2-c"></div></div>
                            <div class="mijy3"><div class="mijy3-c"></div></div>
                            <div class="mijy4"><div class="mijy4-c"></div></div>
                        </div>
                     </div>
                </div>
            </li>

        </ul>
        <div class="cl"></div>
</div>
</div>

</div>
<script type="text/javascript">

$(".bos_paike li").hover(function(){
    $(this).find('.bos_pa-bj').show();

  },function(){
    $(this).find('.bos_pa-bj').hide();

  });
</script>

<!-- 尾部 -->
<jsp:include page="../bottom.jsp"/>
<!-- 尾部 -->

<script src="pc/js/Carousel.js"></script>

<script type="text/javascript">
        $(function(){
            Carousel.init($("#carousel"));
            $("#carousel").init();
        });
    </script>
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