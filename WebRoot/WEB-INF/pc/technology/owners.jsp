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
<title>籽匠猫-业主晒家</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-业主晒家">
<meta http-equiv="description" content="籽匠猫-业主晒家">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link rel="stylesheet" href="pc/css/style.css" />
<link rel="stylesheet" href="pc/css/yz.css" />
<script type="text/javascript" src="pc/js/jquery.min.js"></script>
<script type="text/javascript" src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<style type="text/css">
.contextp{
	overflow:hidden;
	text-overflow:ellipsis;
	display:-webkit-box;
	-webkit-box-orient:vertical;
	-webkit-line-clamp:2;
}
</style>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="5" name="pageName"/>
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
          <li><a href="javascript:void(0);" title="杍匠工艺">杍匠工艺 </a></li>

        </ul>
        <div class="cl"></div>
      </div>
      <div class="ny-title-right fl">
        <ul>
          <li ><a href="to-technology-seed_technology" >杍匠工艺    </a></li>
          <li><a href="to-technology-owners"  class="tit_hover"> 业主晒家    </a></li>
          <li><a href="to-technology-classic_case">经典案例</a></li></ul>
        <div class="cl"></div>
      </div>
      <div class="cl"></div>
    </div>
  </div>
</div>

<div class="w1200">
	<div class="yzzhs">
		<div class="yzzh1">业主晒家</div>
		<div class="yzzh2">晒家分享  业主真实装修案例晒家</div>
	</div>

	<div class="owner">
		<ul class="ownersul">
		    
		</ul>
		<!-- <div class="cl"></div>

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
        </div> -->
         <div class="cl"></div>

	</div>
</div>


	<!-- 尾部 -->
	<jsp:include page="../bottom.jsp"/>
	<!-- 尾部 -->
	<script src="pc/js/Carousel.js"></script>

<script type="text/javascript">
        $(function(){
            Carousel.init($("#carousel"));
            $("#carousel").init();
            
            jume(1,10);
        });
        function jume(start,size){
        	$.ajax({
        		type : 'POST',
        		async : false,
        		url : 'getSunHomeDataPage',
        		data : {param:1,start:start,size:size},
        		success : function(re){
        			var strVar = '<h1 style=\"text-align: center;\">暂时未有晒家</h1>';
        			if(re != null){
        				if(re.status===200 && re.list.length > 0){
        					strVar = '';
        					$.each(re.list,function(i,v){
        						strVar+='<li class="fl ownersli"><div class="owner_left fl">';
        						strVar+='<a href="javascript:void(0);"><img src="'+v.cover+'" data-t="'+v.shid+'"></a>';
        						strVar+='</div><div class="owner_right fl">';
        						strVar+='<a href="javascript:void(0);"><h4 data-t="'+v.shid+'">'+v.title+'</h4></a>';
        						strVar+='<span>'+v.createDate.substring(0,10)+'</span>';
        						strVar+='<p class="contextp">'+v.cunContent+'</p></div><div class="cl"></div></li>';
        					});
        				}
        			}
        			$('.ownersul').html(strVar);
        			$('.page_p').remove();
        			$('.owner').append('<p class="page_p"></p>');
        			if(re.countPage > 1){
        				$('.page_p').createPage({
        					pageCount : re.countPage,
        					current : re.start,
        					input_name : 'show_mysun-input',
        					backFn : function(p){
        						jume(p,re.size);
        					}
        	            });
        			}
        			$('.ownersli img,.ownersli h4').on('click',function(){
        				var datat = $(this).attr('data-t');
        				var param = {
        						param : "Browse",
        						shid : datat
        				};
        				$.post('addSunHomeAllCount',param,function(re){
        					location.href = 'getSunHomeDetailed/'+datat; 
        				});
        			});
        		},error : function(re){
        			alert(re.status);
        		}
        	});
        }
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
