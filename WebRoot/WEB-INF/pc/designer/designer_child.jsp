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
    <title>籽匠猫-设计师内页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="籽匠猫-设计师内页">
	<meta http-equiv="description" content="籽匠猫-设计师内页">
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
	
	<!-- 设计师预约-->
<div class="order">
    <div class="order-in">
        <div class="w1200">
            <div class="order-in_left fl">
                <div class="order-in1">${designer.level }：${designer.dname }</div>
                <div class="order-in2" style="margin-top:20px;">所在地：${designer.address }</div>
                <div class="order-in2">擅长的风格：${designer.style }</div>
                <div class="order-in3">
                    <div class="order-in3_left fl">设计师理念：</div>
                    <div class="order-in3_right fl">${designer.idea }</div>
                      <div class="cl"></div>
                </div>
                <div class="order-in4">
                    <a href="javascript:void(0);">预约量尺设计</a>
                </div>
            </div>
            <div class="order-in_right fr">
                <img src="/static_img/designer_img/${designer.head }" alt="">    <!--pc/images3/scfr1.jpg  -->
            </div>
            <div class="cl"></div>
        </div>
    </div>
</div>
<!-- 设计师预约-->
<!-- 客户实例-->
<div class="living">
<div class="w1200">
    <div class="liucheng-title">
            <span>客户实例</span>
            <p>万千家庭口碑见证 杍匠猫设计师为600万客户解决了多种家居问题</p>
    </div>
    <div class="liv_ul">
        <ul>
        
        <c:forEach items="${dcs }" var="dc" varStatus="i">
        	<%-- <c:if test="${i.index == 1 || i.index == 4 || i.index == 7}" >
        	<li>
        	</c:if> --%>
        	<c:choose>
   				<c:when test="${i.index == 1 || i.index == 4 || i.index == 7}">
   					<li class="liv_ul-hoc"> 
   				</c:when>
   				<c:otherwise> 
   					<li>
   				</c:otherwise>
			</c:choose>
        	
                <div class="liv_ul1">
                   <a href="findDesignerByid?did=${designer.did }&dcid=${dc.dcid}"> <img src="/static_img/designer_case/img/${fn:substringBefore(dc.imgs,',')}" alt=""></a>
                </div>
                <div class="liv">
                    <div class="liv_ul2">
                        <span class="ul1 fl">${dc.size }m<sup>2</sup>${dc.family }</span> <span class=" fl ul2">${dc.name }</span>
                        <div class="cl"></div>
                        <p>
                        	<c:if test="${fn:length(dc.describe)>20 }">
                        		${fn:substring(dc.describe,0,17)}...
                        	</c:if>
                        	<c:if test="${fn:length(dc.describe)<=20 }">
                        		${dc.describe }
                        	</c:if>
						</p>
                    </div>
                    <div class="liv_ul3">
                        <span>客户需求</span>
                        <p>
                        	<c:if test="${fn:length(dc.important)>40 }">
                        		${fn:substring(dc.important,0,40)}...
                        	</c:if>
                        	<c:if test="${fn:length(dc.important)<=40 }">
                        		${dc.important }
                        	</c:if>
                        </p>
                    </div>
                    <div class="liv_ul4">
                        <div class="liv_ul4_left fl">
                            <span>设计师解决</span>
                             <p>
                             	<c:if test="${fn:length(dc.recollections)>70 }">
                        		${fn:substring(dc.recollections,0,70)}...
	                        	</c:if>
	                        	<c:if test="${fn:length(dc.recollections)<=70 }">
	                        		${dc.recollections }
	                        	</c:if>
                             </p>
                            <div class="dianz">${dc.follow }</div>
                        </div>
                        <div class="liv_ul4_right fr">
                            <img src="/static_img/designer_img/${designer.head }" alt=""><span>${designer.dname }</span>
                        </div>
                        <div class="cl"></div>
                    </div>
                </div>
            </li>
        
        </c:forEach>
        
        
        
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
            </li>

              <!-- <li class="liv_ul-hoc">
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
            <c:forEach items="${dparam }" var="dl" varStatus="i">
                <li>
                <div class="Conver1 fl">
                    <div class="Conver_left fl">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1">${dl.ip }.*(来自${dl.ipAddress })${dl.createDate }</div>
                        <div class="Conver_right2">${dl.content }</div>
                    </div>
                    <div class="cl"></div>
                </div>
                <div class="Conver2 fr">
                     <div class="Conver_left fr">
                        <img src="pc/images3/cui_tou.png" alt="">
                    </div>
                    <div class="Conver_right fl">
                        <div class="Conver_right1 fr frd">${dl.designer.level }&nbsp;   ${dl.designer.dname }&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${dl.designer.pularval }</div>
                        <div class="cl"></div>
                        <div class="Conver_right2 frdsrr">${dl.reply }</div>
                    </div>
                </div>
                <div class="cl"></div>
                </li>
               </c:forEach> 
               
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
        <form action="设计师-首页_submit" method="get" accept-charset="utf-8">


            <div class="dia-v_left fl">
                <span>描述您的装修家居问题</span>
                <div class="Conver_left" style="">
                        <img src="pc/images3/cui_tou.png" alt="">
                </div>
                <a href="javascript:;">选择头像</a>
            </div>
            <div class="dia-v_right fr">
                <div class="dia-v_right_top">
                    <textarea name=""></textarea>
                </div>
                <div class="dia-v_right_bottom">
                    <input type="submit" value="马上问专家" />
                </div>
            </div>
            <div class="cl"></div>
            </form>
        </div>
    </div>


</div>

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
