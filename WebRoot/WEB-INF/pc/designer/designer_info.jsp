<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-设计师详情</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="籽匠猫-设计师详情">
	<meta http-equiv="description" content="籽匠猫-设计师详情">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<script type="text/javascript" src="pc/js/jquery.min.js"></script>
	<link rel="stylesheet" href="pc/css/style.css"/>
	<link rel="stylesheet" href="pc/css/sjs.css" />
	<script src="pc/js/lrtk20160517.js"></script>
  </head>
  
  <body>
  
    <jsp:include page="../top.jsp">
		<jsp:param value="4" name="pageName"/>
	</jsp:include>
	
	<div class="title1">
  <div class="w1200">
    <div class="ny-title">
      <div class="ny-title-left fl">
        <ul>
          <li class="ny-title-left1"> <a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""> </a> </li>
          <li><a href="javascript:void(0);" title="杍匠工艺  ">设计师      </a></li>
          <li class="ny-title-left3"><img src="pc/images/jit.png" alt=""></li>
           <li class="ny-title-left4"> 设计师案例展示        </li>
        </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">

      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>

<div class="colour">
    <div class="w1200">
       <div class="colour_left fl">
       <div class="prev1" id="prev1"></div>
                <div class="next1" id="next1"></div>
            <div class="ban" id="demo1">
				<c:forEach items="${dgdata.designer_case }" var="dc" varStatus="i">
					<c:set value="${fn:split(dc.imgs,',') }" var="imgs"/>
				</c:forEach>
                <div class="ban2" id="ban_pic1">
                    <ul class="sef">
                    	<c:forEach items="${imgs }" var="img" varStatus="i">
                    	 <li><a href="javascript:;"><img src="/static_img/designer_case/img/${img }"  alt=""></a></li>
                    	</c:forEach>
                       
                        <!-- <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li> -->
                    </ul>
                </div>
                <div class="min_pic">
                    <div class="num clearfix" id="ban_num1">
                        <ul class="ysu">
                        <c:forEach items="${imgs }" var="img" varStatus="i">
                        	<li><a href="javascript:;"><img src="/static_img/designer_case/img/${img }"  alt=""></a></li>
                        </c:forEach>
                        
                        <!--<li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li>
                        <li><a href="javascript:;"><img src="pc/images3/dert.jpg"  alt=""></a></li> -->
                        </ul>
                    </div>
                </div>
            </div>
       </div>
<script src="pc/js/pic_tab.js"></script>
<script type="text/javascript">
$('#demo1').banqh({
    box:"#demo1",//总框架
    pic:"#ban_pic1",//大图框架
    pnum:"#ban_num1",//小图框架
    prev_btn:"#prev_btn1",//小图左箭头
    next_btn:"#next_btn1",//小图右箭头
    pop_prev:"#prev2",//弹出框左箭头
    pop_next:"#next2",//弹出框右箭头
    prev:"#prev1",//大图左箭头
    next:"#next1",//大图右箭头
    pop_div:"#demo2",//弹出框框架
    pop_pic:"#ban_pic2",//弹出框图片框架
    pop_xx:".pop_up_xx",//关闭弹出框按钮
    mhc:".mhc",//朦灰层
    autoplay:true,//是否自动播放
    interTime:5000,//图片自动切换间隔
    delayTime:400,//切换一张图片时间
    pop_delayTime:400,//弹出框切换一张图片时间
    order:0,//当前显示的图片（从0开始）
    picdire:true,//大图滚动方向（true为水平方向滚动）
    mindire:true,//小图滚动方向（true为水平方向滚动）
    min_picnum:5,//小图显示数量
    pop_up:true//大图是否有弹出框
})
</script>
	<c:forEach items="${dgdata.designer_case }" var="dc" varStatus="i">
       <div class="colour_right fr">
           <div class="colour-top">
               <div class="colour-top1 fl">${dc.dctitle }</div>
               <div class="colour-top2 fl">型号：${dc.model }</div>
               <div class="colour-top3 fr"> ${dc.follow }</div>
               <div class="cl"></div>
           </div>
           <div class="colour-con">
               <dl>
                   <dt>客户需求</dt>
                   <dd>姓名：${dc.name }</dd>
                   <dd>楼盘名称：${dc.floorname }</dd>
                   <dd>所在区域：${dc.addres }</dd>
                   <dd>重点设计空间：${dc.family }</dd>
                   <dd>喜好的风格：${dc.likestyle }</dd>
                   <dd>喜欢的颜色：${dc.likecolor }</dd>
                   <dd>使用者年龄：${dc.age }</dd>
                   <dd>地面材料：${dc.ground }</dd>
               </dl>
           </div>
           <div class="colour-bot">
               <span>重点空间设计需求：</span>
               <p>${dc.demand }</p>
           </div>
           <div class="colour-min">
               <a href="javascript:void(0);" class="colour-min1 fl">预约量尺寸</a>
               <a href="javascript:;" class="colour-min2 fr">关注</a>
               <div class="cl"></div>

           </div>
       </div>
       <c:set value="${dc.recollections }" var="gy"/>
       <c:set value="${dc.details }" var="xgt"/>
       <c:set value="${fn:split(dc.imgs,',') }" var="imgs" />
       
     </c:forEach>
       
       <div class="cl"></div>
    </div>


</div>

<div class="w1200">
    <div class="design">设计感言</div>

    <div class="hai_desing">
            <div class="order-in_left fl">
                <div class="order-in1">${dgdata.level }：${dgdata.dname }</div>
                <div class="order-in2" style="margin-top:20px;">所在地：${dgdata.address }</div>
                <div class="order-in2">擅长的风格：${dgdata.style }</div>
                <div class="order-in3">
                    <div class="order-in3_left fl">设计师理念：</div>
                    <div class="order-in3_right fl">${dgdata.idea }</div>
                      <div class="cl"></div>
                </div>
                <div class="order-in4">
                    <a href="javascript:void(0);">预约TA设计</a>
                </div>
            </div>
            <div class="order-in_right fr">
                <img src="/static_img/designer_img/${dgdata.head }" alt="">
            </div>
            <div class="cl"></div>
        </div>
            <div class="hai_jian">
                <p>${gy }   </p>
            </div>


</div>

<div class="w1200">
      <div class="design">设计效果图</div>

      <div class="effect">
      ${xgt }
        <!-- <ul>
            <li><img src="pc/images3/cesiu.jpg" alt=""></li>
            <li><img src="pc/images3/cesiu.jpg" alt=""></li>
            <li><img src="pc/images3/cesiu.jpg" alt=""></li>
        </ul> -->
      </div>
</div>

<!-- 定制风格-->

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
