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
<title>籽匠猫-籽匠工艺</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-籽匠工艺">
<meta http-equiv="description" content="籽匠猫-籽匠工艺">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/yz.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<style type="text/css">
.yzz-type_top{
	height: 220px;
}
.yzz-type_top img:FIRST-CHILD{
	width: 100%;
	height: 100%;
}
.contextp{
	overflow:hidden;
	text-overflow:ellipsis;
	display:-webkit-box;
	-webkit-box-orient:vertical;
	-webkit-line-clamp:4;
}
</style>
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
          <li ><a href="to-technology-seed_technology" class="tit_hover" >杍匠工艺    </a></li>
          <li><a href="to-technology-owners"  > 业主晒家    </a></li>
          <li><a href="to-technology-classic_case">经典案例</a></li></ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>

<div class="w1200">
	<div class="yzzhs">
		<div class="yzzh1">杍匠工艺</div>
	</div>
	<div class="yzz_ti">
		<ul>
		    <li class="yzz_ti-hover" data-bs="0">视频工艺</li>
		    <li data-bs="1">图文工艺</li>
		</ul>
	</div>
	<script>
  $(document).ready(function(){
        $(".yzz_ti  li ").click(function(){
	        $(".yzz_ti  li ").eq($(this).index()).addClass("yzz_ti-hover").siblings().removeClass('yzz_ti-hover');
	        //$(".yzz-type").hide().eq($(this).index()).show();
	        jume(1,10,$(this).attr('data-bs'));
        });
    });
    </script>

	<div class="yzz-type technologydiv">
		<ul class="technologyul">
		    
		</ul>
		<div class="cl"></div>
	</div>
	<div class="cl"></div>
</div>


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
<script type="text/javascript">
$(function(){
	jume(1,10,0);
});
function jume(start,size,param){
	var json = {
		start : start,
		size : size,
		param : param
	};
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getTechnologyData',
		data : json,
		success : function(re){
			var strVar = "<h1 style=\"text-align: center;\">暂时未有工艺文章</h1>";
			if(re != null){
				if(re.status === 200 && re.dataCount > 0){
					strVar = "";
					$.each(re.list,function(i,v){
					    strVar += "<li class=\"technology_li "+(i%3==0?'no-margin-left':'')+"\" data-bs=\""+v.tid+"\"><a href=\"javascript:void(0);\">";
					    strVar += "<div class=\"yzz-type_top\">";
					    strVar += "<img src=\""+v.cover+"\" alt=\"\" class=\"hie_moe\">";
					    if(v.type === 0){
						    strVar += "<img src=\"pc/images3/boer.png\" alt=\"\" class=\"boer\">";
					    }
					    strVar += "<\/div>";
					    strVar += "<div class=\"yzz-type_bootom\">";
					    strVar += "<h4>"+v.title+"<\/h4>";
					    strVar += "<p class=\"contextp\">"+v.cunContent+"<\/p><span>查看详情<\/span><\/div><\/a><\/li>";
					});
				}
			}
			$('.technologyul').html(strVar);
			$('.page_p').remove();
			$('.technologydiv').append('<p class="page_p"></p>');
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
			$('.technology_li').bind('click',function(){
				var datat = $(this).attr('data-bs');
				var json = {
						param : "Browse",
						shid : datat
				};
				$.post('addTechnologyAllCount',json,function(re){
					location.href = 'getTechnologyDetailed'+param+'?sid='+datat; 
				});
			});
		},error : function(re){
			alert(re.status);
		}
	});
}
</script>
</html>
