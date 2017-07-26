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
    
    <title>籽匠猫-家装定制</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
	<link rel="stylesheet" href="pc/css/style.css" />
	<script type="text/javascript" src="pc/js/jquery.min.js"></script>
	<script src="pc/js/lrtk20160517.js"></script>
	<script type="text/javascript" src="pc/js/jquery.superslide.2.1.1.js"></script>
	<script type="text/javascript" src="pc/yingzhuang/jzCustomDetail.js"></script>

  </head>
  
  <body>
  	<jsp:include page="../../pc/top.jsp"></jsp:include>
  	
  	<div class="title">
	<div class="w1200">
		<div class="ny-title">
			<div class="ny-title-left fl">
				<ul>
					<li class="ny-title-left1">
					<a href="javascript:void(0)">
					<img src="pc/images/shouye.png" alt="">
					</a>
					</li>
					<li class="ny-title-left2"><a href="javascript:void(0)">家装套餐   </a></li>
					<li class="ny-title-left3"><img src="pc/images/jit.png" alt=""></li>
					<li class="ny-title-left4"> 建材解说</li>
				</ul>
				<div class="cl">
				</div>
			</div>
			<div class="ny-title-right fr">
				<ul class="tit-fr">
				<c:forEach items="${jps }" var="jp" varStatus="i">
					<li><a href="showJzPackages?jpid=${jp.jpid }" class="${jp.jpid == jpid?'tit_hover':'' }">${jp.jpname }  </a></li><%-- --%>
					<!-- <li><a href="javascript:void(0)" >  超值版     </a></li>
					<li><a href="javascript:void(0)"> 豪华版    </a></li> -->
				</c:forEach>	
				</ul>
				<div class="cl">
				</div>
			</div>
			<div class="cl">
			</div>
		</div>
	</div>
</div>

<div class="w1200">
	<div class="jiar">
		<div class="jiar-top">
			<span class="jiar-top1">${jp.jpname }</span><span class="jiar-top2">${jp.jpstartprice }/m<sup>2</sup>
		</div>
		<div class="jiar-bottom">
			【家装套餐】${jp.jptype }  包设计/主材/施工
		</div>
	</div>
</div>
<div class="unxun-fw">
	<ul class="ed-fw">
	
		<c:forEach items="${jp.jz_config }" var="jc" varStatus="i">
		<li class="des" style="${i.index eq 0?'display: block;':''}"><img width="1920" height="638" src="/static_img/yz_img/${jc.jcimg }" alt=""></li><!-- /static_img/rz_img/${jc.jcimg } -->
		</c:forEach>
	</ul>
	<ul class="ed-le">
		<c:forEach items="${jp.jz_config }" var="jc" varStatus="i">
		<li class="${i.index eq 0?'no-margin-left ed_hover':''}" >
		<div class="ed-le_top">
			<img src="pc/images/xg${i.index+1 }.png" alt="">
		</div>
		<div class="ed-le_bottom">
			${jc.jcname }
		</div>
		</li>
		</c:forEach>
		<!-- <li>
		<div class="ed-le_top">
			<img src="pc/images/xg2.png" alt="">
		</div>
		<div class="ed-le_bottom">
			客厅
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg3.png" alt="">
		</div>
		<div class="ed-le_bottom">
			餐厅
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg4.png" alt="">
		</div>
		<div class="ed-le_bottom">
			主卧
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg5.png" alt="">
		</div>
		<div class="ed-le_bottom">
			次卧
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg6.png" alt="">
		</div>
		<div class="ed-le_bottom">
			书房
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg7.png" alt="">
		</div>
		<div class="ed-le_bottom">
			厨房
		</div>
		</li>
		<li>
		<div class="ed-le_top">
			<img src="pc/images/xg8.png" alt="">
		</div>
		<div class="ed-le_bottom">
			卫生间
		</div>
		</li> -->
	</ul>
	<div class="cl">
	</div>
</div>
<script>
  $(document).ready(function(){
        $(".ed-le li").click(function(){
        $(".ed-le li").eq($(this).index()).addClass("ed_hover").siblings().removeClass('ed_hover');
        $(".des").hide().eq($(this).index()).show();
        });
    });
    </script>
<div class="w1200">
	<div class="zhuti1 lin_liu">
		<div class="zhuti1_left fl">
			<div class="zhuti1_leti ">
				设计主题
			</div>
			<div class="cl">
			</div>
			<dl class="juk">
				<dt>相关词</dt>
				<c:forEach items="${fn:split(jp.words,',') }" var="word">
				<dd>${word }</dd>
				<!-- <dd>前卫&nbsp;  时尚 </dd>
				<dd>简约 &nbsp; 小清新 </dd> -->
				</c:forEach>
			</dl>
		</div>
		<div class="zhuti1_right fl">
			<div class="i1_right_le fl">
				${jp.jpname }
			</div>
			<div class="i1_right_rt fr">
				【家装套餐 起步价】 
				<span>${jp.jpstartprice }/m<sup>2</sup></span>
			</div>
			<div class="cl">
			</div>
			<div class="i1_right-txt ">
			${jp.describe }
			<!-- 这套充满绿色气息的客厅主要用了绿色和白色作为装饰，营造出一种舒适的氛围。使房子
的每个角落都透露出温馨的感觉。植物的点缀，既可以起到净化空气，改善室内环境的作
用，还让整栋房子生机盎然。现代设计追求的是空间的实用性和灵活性。空间的利用率达
到最高。简洁和实用是现代简约风格的基本特点。 -->
			</div>
		</div>
		<div class="cl">
		</div>
	</div>
</div>
<div class="w1200">
	<div class="ruand">
		<div class="ruand_left fl">
			<div class="zhuti1_leti zhu_rt">
				配置详情
			</div>
			<ul class="ruand_ul">
				<c:forEach items="${jp.jz_config }" var="jc" varStatus="i">
				<li class="${i.index==0?'ruand_ul_hover':'' }">${jc.jcname }</li>
				<!-- <li>客厅</li>
				<li>餐厅</li>
				<li>主卧</li>
				<li>次卧</li>
				<li>书房 </li>
				<li>厨房</li>
				<li>卫生间</li> -->
				</c:forEach>
			</ul>
		</div>
		<div class="urld fl">
		
		<c:forEach items="${jp.jz_config }" var="jc" varStatus="i">
			<div class="ruand_right " style="${i.index==0?'display:block;':''}">
				<div class="ruand_right-img ">
					<img width="761" heigth="391" src="/static_img/yz_img/${jc.jcimg }" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
					<c:forEach items="${jm }" var="jm" varStatus="i">
					<c:if test="${jc.jcid == jm.jcid }">
						<li>
						<div class="rij_jian_l fl">
							${jm.jmname }
						</div>
						<div class="rij_jian_r fl">
				    		标配：${jm.materialinfo }
							<br>
				    		说明：${jm.materialexplain }
						</div>
						<div class="cl">
						</div>
						</li>
						</c:if>
					</c:forEach>	
						

						<!-- <li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li> -->
						
						
					</ul>
				</div>
			</div>
		</c:forEach>
			
			<!-- <div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板2
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div>
			<div class="ruand_right ">
				<div class="ruand_right-img fl">
					<img src="pc/images/xhuj.jpg" alt="">
				</div>
				<div class="cl">
				</div>
				<div class="rij_jian">
					<ul>
						<li>
						<div class="rij_jian_l fl">
							地面板1
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							地面板
						</div>
						<div class="rij_jian_r fl">
				    		标配：强化木复合地板或瓷砖地面，面积不限；
							<br>
				    		说明：均为正铺；水泥砂浆找平厚度40mm以内面积不限，超出40mm部分属于增配，费用另计。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
						<li>
						<div class="rij_jian_l fl">
							门槛石
						</div>
						<div class="rij_jian_r fl">
				    		标配：石材门槛，展开宽度200mm以内，长度1200mm以内；
							<br>
				    		说明：均含加工磨边及安装；如原有门槛石不做更换处理。
						</div>
						<div class="cl">
						</div>
						</li>
					</ul>
				</div>
			</div> -->
			<div class="zhumin fr">
				注：套餐内不含入户门及门套、窗套、窗帘盒、包垭口、灯具照明及安装，不设阳台门槛；选配或增配都可能延长工期，详情咨询业务经理。
			</div>
		</div>
		<div class="cl">
		</div>
		<script>
  $(document).ready(function(){
        $(".ruand_ul li").click(function(){
        $(".ruand_ul li").eq($(this).index()).addClass("ruand_ul_hover").siblings().removeClass('ruand_ul_hover');
        $(".ruand_right").hide().eq($(this).index()).show();
        });
    });
    </script>
	</div>
	<div class="jiji fr">
		<div class="jiji-tit">
					立即预约 享受优惠
		</div>
		<div class="jina-img">
			<img src="pc/images/yuyun.png" alt="">
		</div>
		<div class="zhurx">
			服务热线：400-8888-888
		</div>
		<form action="家装套装2_submit" id="formbc" accept-charset="utf-8">
			<div class="yuyou">
				<div class="yuyou_l fl">
					<input type="text" name="bname"  id="" placeholder="您的姓名"/>
				</div>
				<div class="yuyou_l fl fe-imf">
					<input type="text" name="bphone" vali="number" id="" placeholder="您的手机" maxlength="11"/>
				</div>
				<div class="yuyou_t fl">
					<input type="button" id="bespoke" value="马上预约"/>
				</div>
				<div class="cl">
				</div>
			</div>
		</form>
	</div>
	<div class="cl">
	</div>
</div>
  	
    <jsp:include page="../../pc/bottom.jsp"></jsp:include>
  </body>
</html>
