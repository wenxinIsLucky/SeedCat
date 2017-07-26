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
<title>籽匠猫-经典案例</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-经典案例">
<meta http-equiv="description" content="籽匠猫-经典案例">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/yz.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<style type="text/css">
.indexTyg2 li{
	height:300px;
}
</style>
<script type="text/javascript">
$(function(){
	jume(1,10,0);
});
function jume(start,size,param){
	vrjume(start,size,param);
	var json = {
		start : start,
		size : size,
		param : param
	};
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getClassic_caseData',
		data : json,
		success : function(re){
			var strVar = '<h1 style="text-align: center;">暂时未有案例</h1>';
			if(re != null){
				if(re.status === 200 && re.dataCount > 0){
					strVar = '';
					$.each(re.list,function(i,v){
					    strVar += '<li class="classiccase_li '+(i%3==0?'no_mj':'')+'" data-bs="'+v.ccid+'"><a href="javascript:void(0);">';
					    strVar += '<img src="pc/images/tyg2.jpg"><div class="indexTygText1">'+v.title+'</div><div class="indexTygText2">';
					    strVar += '<div class="indexTygBack2">&nbsp;</div>';
					    var price = parseInt(v.price)/10000;
					    strVar += '<h2>'+v.title+'</h2><em>总价: '+parseFloat(price).toFixed(2)+'万</em><hr>';
					    strVar += '<p>一站式整体家装  <br>省钱省心更省力</p>';
					    strVar += '<b><img src="pc/images/yuan_j.png" alt=""/></b></div></a></li>';
					});
				}
			}
			$('.classiccaseul').html(strVar);
			$('.page_p').remove();
			$('.indexTyg2').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'show_mysun-input',
					backFn : function(p){
						jume(p,re.size,param);
					}
	            });
			}
			$('.classiccase_li').bind('click',function(){
				var datat = $(this).attr('data-bs');
				var json = {
						param : "Browse",
						shid : datat
				};
				$.post('addClassic_caseAllCount',json,function(re){
					location.href = 'getClassic_caseDetailed'+param+'?sid='+datat; 
				});
			});
		},error : function(re){
			alert(re.status);
		}
	});
}

function vrjume(start,size,param){
	var json = {
			start : start,
			size : size,
			param : param
		};
		$.ajax({
			type : 'POST',
			async : false,
			url : 'getVrPojoData',
			data : json,
			success : function(re){
				var strVar = '<h1 style="text-align: center;">暂时未有VR</h1>';
				if(re != null){
					if(re.status === 200 && re.dataCount > 0){
						strVar = '';
						$.each(re.list,function(i,v){
						    strVar += '<li class="poster-item"><a target="_blank" href="'+v.url+'"><img src="'+v.cover+'" alt="" width="100%" height="100%" /></a></li>';
						});
					}
				}
				$('.poster-list').html(strVar);
				Carousel.init($("#carousel"));
	            $("#carousel").init();
			},error : function(re){
				alert(re.status);
			}
		});
}
</script>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="5" name="pageName"/>
	</jsp:include>

	<div class="ny_banner">
		<img src="pc/images3/owner_banner.jpg" alt="" />
     </div>

<div class="title1">
  <div class="w1200">
    <div class="ny-title">
      <div class="ny-title-left fr">
        <ul>
          <li class="ny-title-left1"> <a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""> </a> </li>
          <li><a href="javascript:void(0);" title="杍匠工艺">杍匠工艺 </a></li>

        </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">
        <ul>
          <li ><a href="to-technology-seed_technology" >杍匠工艺    </a></li>
          <li><a href="to-technology-owners" > 业主晒家    </a></li>
          <li><a href="to-technology-classic_case"  class="tit_hover">经典案例</a></li></ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>

<div class="w1200">

	<div class="zuirn-type" style="margin-top: 20px;">
		<ul>
		    <li class="zuirn-type-hover" data-bs="0" style="cursor: pointer;">家装案例</li>
		    <li data-bs="1" style="cursor: pointer;">红木案例</li>
		</ul>
		<div class="cl"></div>
	</div>
	<div class="zuirn-min1">
		<div class="poster-main pose" id="carousel" data-setting='{
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
                <li class="poster-item"><a href="#"><img src="pc/images3/zahung.jpg" alt="" width="100%" /></a></li>
                <li class="poster-item"><a href="#"><img src="pc/images3/zahung.jpg" alt="" width="100%" /></a></li>
                <li class="poster-item"><a href="#"><img src="pc/images3/zahung.jpg" alt="" width="100%" /></a></li>
                <li class="poster-item"><a href="#"><img src="pc/images3/zahung.jpg" alt="" width="100%" /></a></li>
                <li class="poster-item"><a href="#"><img src="pc/images3/zahung.jpg" alt="" width="100%" /></a></li>

               </ul>
               <div class="poster-btn poster-next-btn"></div>
          </div>
	</div>
	<script>
  $(document).ready(function(){
        $(".zuirn-type  li ").click(function(){
	        $(".zuirn-type  li ").eq($(this).index()).addClass("zuirn-type-hover").siblings().removeClass('zuirn-type-hover');
	        jume(1,10,$(this).attr('data-bs'));
        });
    });
    </script>
	<div class="mn_ti">VR全景体验</div>


<div class="indexTyg2 dr_hui">
	<ul class="classiccaseul">
		
	</ul>
	<div class="cl"></div>
</div>
<div class="cl">
</div>
</div>

	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp"/>
	<!-- 尾部 -->
	<script src="pc/js/Carousel.js"></script>

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
