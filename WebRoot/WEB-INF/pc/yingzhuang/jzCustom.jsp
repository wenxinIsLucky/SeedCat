<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-家装套餐</title>
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
<script type="text/javascript" src="pc/yingzhuang/jzCustom.js"></script>
</head>

<body>
	<jsp:include page="../top.jsp">
		<jsp:param value="3" name="pageName"/>
	</jsp:include>
	

	<div class="ny_banner">
		<img src="pc/images/banner2.jpg" alt="" />
     </div>

<div class="jianzuo1">
  <div class="w1200">
  	<div class="zuo_tit">一站式整体家装  &nbsp;省钱省心更省力</div>
  	<ul class="zuo_ui">
  	    <li class="no_mager"><img src="pc/images/bao1.png" alt=""></li>
  	    <li><img src="pc/images/bao2.png" alt=""></li>
  	    <li><img src="pc/images/bao3.png" alt=""></li>
  	</ul>
  	<div class="cl"></div>
  	<div class="mao_p">
		<span class="mao_p1">毛坯到精装 </span><span class="mao_p2">666 </span><span class="mao_p3"> 元/m<sup>2</sup>起  </span>
		<div class="cl"></div>
  	</div>
  	<div class="cki"><a href="showJzPackages?jpid=jp_49e3dbd0558a478db6f4cddd6e550e2f">查看详情</a></div>
  </div>
</div>
<div class="jianzuo2">
<div class="w1200">
	<div class="jianzuo2_tex">
			<span>全屋环保，才是真的环保</span>
			<p>产品都环保≠全屋环保<br>
				特定空间下的产品甲醛释放总量<br>
				才是决定全屋是否环保的根本因素<br>
				所有的产品都环保，也不代表全屋是环保的
			</p>
	</div>
	<div class="cl"></div>
</div>
</div>
<div class="jianzuo3">
<div class="w1200">
		<div class="jianzuo3_tit">
			<span>36项标准施工节点</span>
			<p>超出预期的人性化关怀</p>
		</div>



<div class="process">
             <div class="process-top">
                 <ul>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>1</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">现场交底</div>
                            <div class="process-top_r2">开工前</div>
                        </div>
                        </a>
                     </li>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>2</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">瓷砖复尺和地漏位置确认</div>
                            <div class="process-top_r2">开工前</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>3</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">橱柜点位确认</div>
                            <div class="process-top_r2">开工前</div>
                        </div>
                        </a>
                     </li>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>4</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">开工进场、第一步标准放线</div>
                            <div class="process-top_r2">第3天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>5</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">材料进场</div>
                            <div class="process-top_r2">第3天</div>
                        </div>
                        </a>
                     </li>
                      <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>6</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">水电开槽</div>
                            <div class="process-top_r2">第4天</div>
                        </div>
                        </a>
                     </li>
                      <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>7</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">水电改造开工</div>
                            <div class="process-top_r2">第4天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                        <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>8</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">门洞修整</div>
                            <div class="process-top_r2">第6天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>9</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">门槛石测量下单</div>
                            <div class="process-top_r2">第8天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>10</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">室内门复尺</div>
                            <div class="process-top_r2">第8天</div>
                        </div>
                        </a>
                     </li>
                 </ul>
                 <div class="cl"></div>
            </div>

   <div class="process-top" style="display:none">
                 <ul>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>11</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">首次隐蔽验收</div>
                            <div class="process-top_r2">第9天</div>
                        </div>
                        </a>
                     </li>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>12</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">水电工程验收</div>
                            <div class="process-top_r2">第10天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>13</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">瓦工进场前第二步放线</div>
                            <div class="process-top_r2">第12天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>14</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">瓷砖配送</div>
                            <div class="process-top_r2">第12天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>15</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">瓦工开工</div>
                            <div class="process-top_r2">第13天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>16</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">门槛石进场&安装</div>
                            <div class="process-top_r2">第13天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>17</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">橱柜复尺</div>
                            <div class="process-top_r2">第17天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>18</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">防水工程</div>
                            <div class="process-top_r2">第17天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>19</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">陶粒回填</div>
                            <div class="process-top_r2">第19天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>20</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">防水工程验收</div>
                            <div class="process-top_r2">第22天</div>
                        </div>
                        </a>
                     </li>
                 </ul>
                 <div class="cl"></div>
            </div>
            <div class="process-top" style="display:none">
                 <ul>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>21</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">地漏安装</div>
                            <div class="process-top_r2">第23天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>22</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">第三步放线</div>
                            <div class="process-top_r2">第25天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>23</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">木工项目开工</div>
                            <div class="process-top_r2">第25天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>24</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">木饰面背景墙验收</div>
                            <div class="process-top_r2">第32天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>25</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">木工工程验收</div>
                            <div class="process-top_r2">第35天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>26</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">瓷砖铺贴与瓷砖验收</div>
                            <div class="process-top_r2">第35天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>27</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">油漆项目开工</div>
                            <div class="process-top_r2">第36天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>28</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">油漆项目验收</div>
                            <div class="process-top_r2">第45天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>29</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">集成吊顶安装</div>
                            <div class="process-top_r2">第54天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>30</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">卫浴洁具安装</div>
                            <div class="process-top_r2">第54天</div>
                        </div>
                        </a>
                     </li>
                 </ul>
                 <div class="cl"></div>
            </div>
            <div class="process-top" style="display:none">
                 <ul>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>31</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">卫浴五金安装</div>
                            <div class="process-top_r2">第54天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>32</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">橱柜安装</div>
                            <div class="process-top_r2">第54天</div>
                        </div>
                        </a>
                     </li>
                     <li>
                     <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>33</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">室内门安装</div>
                            <div class="process-top_r2">第56天</div>
                        </div>
                        </a>
                     </li>
                     <li><a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>34</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">地板安装</div>
                            <div class="process-top_r2">第56天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>35</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">水电、家具安装及调试</div>
                            <div class="process-top_r2">第58天</div>
                        </div>
                        </a>
                     </li>
                      <li>
                      <a href="javascript:void(0);">
                         <div class="process-top_l fl">
                            <div class="process-top-vi">第<span>36</span>个工序
                            </div>
                        </div>
                        <div class="process-top_r fl">
                            <div class="process-top_r1">工程竣工总验收</div>
                            <div class="process-top_r2">第60天</div>
                        </div>
                        </a>
                     </li>

                 </ul>
                 <div class="cl"></div>
            </div>
            <div class="process-bottom">
                <ul>
                    <li class="process-bottom-hover">水电阶段[0~11天]</li>
                    <li>泥木阶段[12~35]</li>
                    <li>油漆阶段[36~53天]</li>
                    <li>竣工阶段[54~60天]</li>
                </ul>
                <div class="cl"></div>
            </div>
        </div>
</div>
</div>
<script>
  $(document).ready(function(){
        $(".process-bottom ul li").click(function(){
        $(".process-bottom ul li").eq($(this).index()).addClass("process-bottom-hover").siblings().removeClass('process-bottom-hover');
        $(".process-top").hide().eq($(this).index()).show();

        });
    });
    </script>


<div class="jianzuo4">
	<div class="w1200">
		<div class="ianzuo_cf">
			<div class="ianzuo_cf_l fl">
				<img src="pc/images/zhus.jpg" alt="">
			</div>
			<div class="ianzuo_cf_r fr">
				<h3>666元套餐 &nbsp; 极致人性</h3>
				<span>爱自在，要舒适，尊重本性即为人生</span>
				<p>一切的人性需求都是为了生活的自在，舒适，如鱼得水般的畅爽。
超出预期的人性化关怀，让家成为你最想待的地方， 设计师深度
研究中国人的生活习惯，给你默契的感受， 人性化设计遍布全屋，
9大空间配置，12项工艺关怀，24项产品关怀，36项暖心设计...</p>
				<a href="to-yingzhuang-jzCustom2">查看详情</a>
			</div>
			<div class="cl"></div>
		</div>

		<div class="ianzuo_cf" style="display:none">
			<div class="ianzuo_cf_l fl">
				<img src="pc/images/zhus.jpg" alt="">
			</div>
			<div class="ianzuo_cf_r fr">
				<h3>666元套餐 &nbsp; 极致人性11</h3>
				<span>爱自在，要舒适，尊重本性即为人生</span>
				<p>一切的人性需求都是为了生活的自在，舒适，如鱼得水般的畅爽。
超出预期的人性化关怀，让家成为你最想待的地方， 设计师深度
研究中国人的生活习惯，给你默契的感受， 人性化设计遍布全屋，
9大空间配置，12项工艺关怀，24项产品关怀，36项暖心设计...</p>
				<a href="javascript:void(0);">查看详情</a>
			</div>
			<div class="cl"></div>
		</div>
		<div class="ianzuo_cf" style="display:none">
			<div class="ianzuo_cf_l fl">
				<img src="pc/images/zhus.jpg" alt="">
			</div>
			<div class="ianzuo_cf_r fr">
				<h3>666元套餐 &nbsp; 极致人性22</h3>
				<span>爱自在，要舒适，尊重本性即为人生</span>
				<p>一切的人性需求都是为了生活的自在，舒适，如鱼得水般的畅爽。
超出预期的人性化关怀，让家成为你最想待的地方， 设计师深度
研究中国人的生活习惯，给你默契的感受， 人性化设计遍布全屋，
9大空间配置，12项工艺关怀，24项产品关怀，36项暖心设计...</p>
				<a href="javascript:void(0);">查看详情</a>
			</div>
			<div class="cl"></div>
		</div>

		<div class="jisu">
			<ul>
			    <li class="jisu_hover">
			    	<div class="jisu-left fl"><img src="pc/images/jujs1.jpg" alt=""></div>
			    	<div class="jisu-right fl">
			    	<span class="jisu-right1">666元/m<sup>2</sup>起 </span>
			    	<span class="jisu-right2">极致人性</span>
			    	</div>
			    </li>
			     <li class="hy">
			    	<div class="jisu-left fl"><img src="pc/images/jujs1.jpg" alt=""></div>
			    	<div class="jisu-right fl">
			    	<span class="jisu-right1">666元/m<sup>2</sup>起 </span>
			    	<span class="jisu-right2">极致人性</span>
			    	</div>
			    </li>
			     <li>
			    	<div class="jisu-left fl"><img src="pc/images/jujs1.jpg" alt=""></div>
			    	<div class="jisu-right fl">
			    	<span class="jisu-right1">666元/m<sup>2</sup>起 </span>
			    	<span class="jisu-right2">极致人性</span>
			    	</div>
			    </li>
			 <!--    <li></li>
			    <li></li> -->
			</ul>
		</div>
	</div>
</div>
	<script>

  $(document).ready(function(){
        $(".jisu li").click(function(){
        $(".jisu li").eq($(this).index()).addClass("jisu_hover").siblings().removeClass('jisu_hover');
        $(".ianzuo_cf").hide().eq($(this).index()).show();

        });
    });
    </script>

<div class="jianzuo5">
	<div class="jianzuo3_tit">
		<span>十足好料 &nbsp;  名品大牌</span>
		<p>来自全球  &nbsp;  为你所享</p>
	</div>
	<div class="w1200">
		<div class="anzuo_type">
			<div class="fl anzuo_typ-h">主材品牌 </div>
			<div class="fr"> 辅材品牌 </div>
		</div>
		<div class="cl"></div>

		<div class="zhu_lde">
			<ul>
			    <li class="no_mager"><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li class="no_mager"><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>


			</ul>
			<div class="cl"></div>
		</div>
		<div class="zhu_lde" style="display: none;">
			<ul>
			    <li class="no_mager"><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li class="no_mager"><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>
			    <li><img src="pc/images/kele.jpg" alt=""></li>



			</ul>
			<div class="cl"></div>
		</div>
	</div>
</div>
<div class="cl"></div>
<script>

  $(document).ready(function(){
        $(".anzuo_type div").click(function(){
        $(".anzuo_type div").eq($(this).index()).addClass("anzuo_typ-h").siblings().removeClass('anzuo_typ-h');
        $(".zhu_lde").hide().eq($(this).index()).show();

        });
    });
    </script>

    <div class="jianzuo6">
		<div class="w1200">
		<div class="wki">
		<div class="jianzuo6_tit">
				<span>个性化的多元设计</span>
				<p>满足你的个性需求</p>
		</div>
		<div class="jueimg">
			<img src="pc/images/aaa.png" alt="">
			<span class="de1">添加LED射灯</span>
			<span class="de2">油漆调色</span>
			<span class="de3">贴墙纸</span>
			<span class="de4">窗帘盒</span>
			<span class="de5">石膏平面吊顶</span>
		</div>
		<div class="chade"><a href="javascript:void(0);">查看更多</a></div>
		</div>
		</div>
    </div>


<div class="zhix zhixss">
  	<div class="w1200">
  		<div class="zhix_left fl">
  			<div class="zhix_co">
  			<div class="zhix_left_tit">
  				<div class="zhix_left_tit_left fl">
  					业主自拍 <span class="despan">深入了解杍匠猫标准化家装</span>
  				</div>
  				<div class="zhix_left_tit_right fr">
  					<a href="javascript:void(0);"><img src="pc/images/genduo.png" alt="" /></a>
  				</div>
  				<div class="cl"></div>
  				<div class="zhix_shipin">
  				 <video width="580" height="330"  controls="controls"  id="video1">
			      <source src="/static_img/Video/371497889534315.mp4" type="video/mp4" />
			      <source src="/static_img/Video/371497889534315.mp4" type="video/ogg" />
			      <source src="/static_img/Video/371497889534315.mp4" type="video/webm" />
			      <object data="/static_img/Video/371497889534315.mp4" width="580" height="330">
			        <embed src="/static_img/Video/371497889534315.mp4" width="580" height="330" />
      				</object>
    				</video>
					
  				</div>
  				<div class="kong">
  					<ul>

  					    <li><a href="javascript:void(0);"><img src="pc/images/shij1.jpg" alt=""></a></li>
  					    <li class="niOki"><a href="javascript:void(0);"><img src="pc/images/shij1.jpg" alt=""></a></li>
  					    <li><a href="javascript:void(0);"><img src="pc/images/shij1.jpg" alt=""></a></li>


  					</ul>
  				</div>
  			</div>
  		</div>
  		</div>
        <style type="text/css" media="screen">
            .soe_right1 p{overflow: hidden;

text-overflow: ellipsis;

white-space: nowrap;}
        </style>
  		<div class="zhix_right fr">
  			<div class="zhix_left_tit_left fl">
  					业主感言
  				</div>
  				<div class="zhix_left_tit_right fr">
  					<a href="javascript:void(0);"><img src="pc/images/genduo.png" alt="" /></a>
  				</div>
  				<div class="cl"></div>
  				<div id="scrollDiv" class="dwscc">
		        <ul>
		            <li>
		            <div class="soe_left fl"><a href="javascript:void(0);"><img src="pc/images/pai2.png" alt=""></a></div>
		            <div class="soe_right soe_right1 fr">
		                <a href="javascript:void(0);"><h4>周先生的二居室田园式风格装修</h4></a>
		                <span>2017-04-08</span>
		                <p>大家都知道买房子不容易，尤其是现在的年轻人和工
薪阶层，那么在拿到属于自己的房子后自然.</p>
		            </div>
		            <div class="cl"></div>
		            </li>
		              <li>
		            <div class="soe_left fl"><a href="javascript:void(0);"><img src="pc/images/pai2.png" alt=""></a></div>
		            <div class="soe_right soe_right1 fr">
		                <a href="javascript:void(0);"><h4>周先生的二居室田园式风格装修</h4></a>
		                <span>2017-04-08</span>
		                <p>大家都知道买房子不容易，尤其是现在的年轻人和工
薪阶层，那么在拿到属于自己的房子后自然.</p>
		            </div>
		            <div class="cl"></div>
		            </li>
		            <li>
		            <div class="soe_left fl"><a href="javascript:void(0);"><img src="pc/images/pai2.png" alt=""></a></div>
		            <div class="soe_right soe_right1 fr">
		                <a href="javascript:void(0);"><h4>周先生的二居室田园式风格装修</h4></a>
		                <span>2017-04-08</span>
		                <p>大家都知道买房子不容易，尤其是现在的年轻人和工
薪阶层，那么在拿到属于自己的房子后自然.</p>
		            </div>
		            <div class="cl"></div>
		            </li>
		            <li>
		            <div class="soe_left fl"><a href="javascript:void(0);"><img src="pc/images/pai2.png" alt=""></a></div>
		            <div class="soe_right soe_right1 fr">
		                <a href="javascript:void(0);"><h4>周先生的二居室田园式风格装修</h4></a>
		                <span>2017-04-08</span>
		                <p>大家都知道买房子不容易，尤其是现在的年轻人和工
薪阶层，那么在拿到属于自己的房子后自然.</p>
		            </div>
		            <div class="cl"></div>
		            </li>


		        </ul>
    		</div>
    </div>
    <div class="jie fr">
          <div class="jie_r fl" id="spec-bottom"><img src="pc/images/xa.png" alt="" /></div>

          <div class="jie_l fl" id="spec-top"><img src="pc/images/shag.png" alt="" /></div>

    </div>

  		</div>
  		<div class="cl"></div>
  	</div>
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

<script type='text/javascript'>
seajs.use(['jquery', 'app/autoappoint', 'ywj/msg', 'www/zhenpin', 'jquery/cookie'], function($, autoappoint, msg, zhenpin){
    $appointForm = $('form[data-auto-appoint-tag]');

    autoappoint({
        on_success: function(message, data){

            $('.verify-popup').hide();
            $('.verify-popup-mask').hide();
            $('input[name="captcha"]').val('');
            if($('[name="quote_position"]').val() == 1) {
                $.cookie('mobile_quote', $('.zhenpin-quote input[name="mobile"]').val());
                $('.zhenpin-quote .price-result').removeClass('mtlarge');
                $('.zhenpin-quote .auth-code').remove();
                $('.zhenpin-quote .captchaBox').hide();
                $('form[data-auto-appoint-tag]').removeClass("need-verify-form");

                $type_quote = $('input[name="type_quote"]').val();
                $area_quote = $('.zhenpin-quote input[name="measure_area"]').val();
                $area_status = $('.zhenpin-quote input[name="house_type"]:checked').val();
                if($area_status == 2){
                    $area_quote = $area_quote * 0.8;
                }
                $.ajax({
                    type: 'post',

                    data: {'type_quote': $type_quote,'area_quote' : $area_quote},
                    success: function (data) {
                        $('.price-result3 .price').html(data);
                        $('.price-result3').siblings('.price-tip').fadeIn(200);

                        if($('input[name="type_quote"]').val() == 'A'){
                            $('input[name="quote_a"]').val(data);
                        }else if($('input[name="type_quote"]').val() == 'B'){
                            $('input[name="quote_b"]').val(data);
                        }
                        $.ajax({
                            type: "post",

                            data: {'can_msg': $('.zhenpin-quote input[name="mobile"]').val(),'can_tag':'2017WEBzhenpin'},
                            success: function (data) {
                            },
                            error: function (data) {
                                return false;
                            }
                        });
                    },
                    error: function (data) {
                        return false;
                    }
                });
            }else if($("[name='quote_position']").val() == 2){
                $.cookie('mobile_quote', $('.group-quote input[name="mobile"]').val());
                $area_quote = $('#zpj-quoteForm3 input[name="measure_area"]').val();
                $area_status = $('#zpj-quoteForm3 input[name="house_type"]:checked').val();
                if($area_status == 2){
                    $area_quote = $area_quote * 0.8;
                }
                var A_type=$('input[name="A_type"]').val();
                var B_type=$('input[name="B_type"]').val();
                var C_type=$('input[name="C_type"]').val();
                var C_type_num=$('input[name="C_type_num"]').val();
                var C2_type=$('input[name="C2_type"]').val();
                var C2_type_num=$('input[name="C2_type_num"]').val();
                var D_type=$('input[name="D_type"]').val();
                $('.group-quote .auth-code').remove();
                $('.group-quote .captchaBox').hide();
                $('form[data-auto-appoint-tag]').removeClass("need-verify-form");
                $.ajax({
                    type: 'post',

                    data: {'area_quote' : $area_quote,'A_type' : A_type,'B_type' : B_type,'C_type' : C_type,'C2_type' : C2_type,'D_type' : D_type,'C_type_num':C_type_num,'C2_type_num':C2_type_num},
                    success: function (data) {
                        $('.price-result2 .price').html(data);
                        $('.price-result2').siblings('.price-tip').fadeIn(200);
                        $.ajax({
                            type: "post",

                            data: {'can_msg': $('.group-quote input[name="mobile"]').val(),'can_tag':'2017WEBzhenpin'},
                            success: function (data) {
                            },
                            error: function (data) {
                                return false;
                            }
                        });
                    },
                    error: function (data) {
                        return false;
                    }
                });
            }else{
                msg.show(message, 'succ');
            }

        },

        on_error:function(message, code, data){
            msg.show(message, 'err');

            if($("[name='quote_position']").val() == 0 || $("[name='quote_position']").val() == ''){
                if(data.error=='captcha'){
                    $('.verify-popup, .verify-popup-mask').show();
                    $('input.name_hid').val(data.name);
                    $('input.mobile_hid').val(data.mobile);
                    $('input.stores_hid').val(data.stores);
                    $('input.city_hid').val(data.city);
                }
            }else{
                if(data.error=='captcha'){
                    $('.captchaBox').show();
                    $appointForm.addClass("need-verify-form");
                }else{
                    $appointForm.removeClass("need-verify-form");
                }
            }
        }
    });
    //首页跳转过来对应TAB展开
    var href =  window.location.href.split('/');
    var pageId = href.pop() - 1;
    var handle = function(obj){
        obj.eq(pageId).addClass("active").removeClass("disactive").siblings().removeClass("active").addClass("disactive");
    };
    handle($(".zpj-tab li"));
    handle($(".zpj-tab-con > li"));
    window.onload=function(){
        var location = window.location.href;
        var includedText = "/id/";
        var tabStrNum = location.indexOf(includedText);//指定字符串首次出现的位置
        var newUrl = location.substr(0,tabStrNum);
        var stateObject = {};
        var title = "zpj-index";
        history.pushState(stateObject,title,newUrl);
        if(pageId >= 0){
            $('html, body').scrollTop('750');
        }
    };
});
</script>
</body>
</html>
