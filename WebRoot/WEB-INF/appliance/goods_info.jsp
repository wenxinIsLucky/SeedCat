<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>商品详情</title>
	<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
	<link rel="stylesheet" href="pc/css/style.css" />
	<script type="text/javascript" src="pc/js/jquery.min.js"></script>
  	<script src="pc/js/lrtk20160517.js"></script>
  </head>
  
  <body>
    <jsp:include page="../pc/top.jsp">
		<jsp:param value="7" name="pageName"/>
	</jsp:include>

<div class="fitment">
    <div class="w1200">
        <ul>
            <li><a href="javascript:void(0);"><img src="pc/images/shouye.png" alt=""></a></li>
            <li>杍匠商城 </li>
            <li><img src="pc/images/right_de.png" alt=""></li>
            <li class="delelect">
                <select name="">
                    <option value="">餐厅家具</option>
                </select>
            </li>
            <li><img src="pc/images/right_de.png" alt=""></li>
            <li class="delelect">
                <select name="">
                    <option value="">餐厅家具</option>
                </select>
            </li>
            <li><img src="pc/images/right_de.png" alt=""></li>
            <li class="dle_hov">家具名称</li>
        </ul>
        <div class="cl"></div>
    </div>
</div>


<div class="w1200">
	<div class="goods_xq">

        <div class="goods_xq_left fl">
			<div id="magnifier">
			    <div class="small-box">
			      <img src="pc/images/small_1.jpg" alt="#">
			      <span class="hover"></span>
			    </div>
			    <div class="thumbnail-box">
			      <a href="javascript:;" class="btn btn-prev"></a>
			      <a href="javascript:;" class="btn btn-next"></a>
			      <div class="list">
			        <ul class="wrapper">
			          <li class="item item-cur" data-src="pc/images/small_1.jpg"><img src="pc/images/thumbnail_1.jpg" alt="#"></li>
			          <li class="item" data-src="pc/images/small_2.jpg"><img src="pc/images/thumbnail_2.jpg" alt="#"></li>
			          <li class="item" data-src="pc/images/small_3.jpg"><img src="pc/images/thumbnail_3.jpg" alt="#"></li>
			          <li class="item" data-src="pc/images/small_4.jpg"><img src="pc/images/thumbnail_4.jpg" alt="#"></li>
			          <li class="item" data-src="pc/images/small_5.jpg"><img src="pc/images/thumbnail_5.jpg" alt="#"></li>
			          <li class="item" data-src="pc/images/small_6.jpg"><img src="pc/images/thumbnail_6.jpg" alt="#"></li>
			        </ul>
			      </div>
    		</div>
		    <div class="big-box">
		      <img src="pc/images/big_1.jpg" alt="#">
		    </div>
  		</div>
  <script src="pc/js/magnifier.js"></script>
  <script>
    $(function () {

      $('#magnifier').magnifier();

    });
  </script>


<script src="pc/js/JQRadio.js"></script>
<script>$(function() {$("#radio01").JQRadio({});});</script>
        </div>
        <div class="goods_xq_right fr">
			<div class="goods_xq_ri1">
				<h3>[凯撒豪庭] 欧式田园 尊贵—永恒不变 精致雕花1.3米实木圆餐桌</h3>
				<span>编号：ZJM-CT-123456789</span>
			</div>
			<div style="height: 71px;">

			</div>
			<div class="goods_xq_ri2">
				<div class="goods_xq_r_vi1 fl">本商城价：</div>
				<div class="goods_xq_r_vi2 fl">￥</div>
				<div class="goods_xq_r_vi3 fl">2888.00</div>
				<div class="goods_xq_r_vi4 fr"><span class="goods_xq_r_vi11">158件</span><span class="goods_xq_r_vi22">已售</span></div>
				<div class="goods_xq_r_vi4 fr"><span class="goods_xq_r_vi11">118人</span><span class="goods_xq_r_vi22">评论</span></div>
				<div class="cl"></div>
			</div>
			<div class="goods_xq_ri3">
				【母亲节为爱置家】贴心转盘设计方便实用，精致雕花大气典雅！5.13日-5.14日自营商品
  满6000直减500享五包！还可换购超值爆款，数量有限抢完即止！更有0元抽iPhone 7！
			</div>
			<div class="goods_xq_ri4">
				<div class="goods_xq_ri4_left fl">配送 </div>
				<div class="goods_xq_ri4_right fl">
					<select name="" >
						<option value="">广东省深圳市龙华新区</option>
					</select>
				</div>
				<div class="goods_xq_ri4_eg fl">
					<a href="javascript:void(0);"> 查看运费</a>
				</div>
				<div class="cl"></div>
			</div>
			<div class="goods_xq_ri5">
				<div class="goods_xq_ri5_left fl">类型 </div>
				<div class="goods_xq_ri5_right fl">
					<div class="radio_box" id="radio01">
						<input type="hidden" value="" class="radioVal" name="" />
						<ul class="de">
							<li  class="selected">经典爆款1.8米</li>
							<li >经典爆款1.8米</li>
							<li >经典爆款1.8米</li>
							<li >经典爆款1.8米</li>
							<li >经典爆款1.8米</li>
						<div class="cl"></div>

						</ul>
					</div>
				</div>
				<div class="cl"></div>
			</div>
		<div class="goods_xq_ri6">
        	<div class="goods_xq_ri6_left fl">规格</div>
        	<div class="goods_xq_ri6_right fl">总尺寸：直径1300*高780mm；转盘：直径800*高30mm</div>
        	<div class="cl"></div>
        </div>
        <div class="goods_xq_ri7">
			<div class="goods_xq_ri71 fl">数量 </div>
			<div class="goods_xq_ri72 fl">
				<div class="q_ri7_left fl">1</div>
				<div class="q_ri7_right fl">
					<div class="q_ri7_ri-top"></div>
					<div class="q_ri7_ri-bot"></div>
				</div>
				<div class="cl"></div>
			 </div>
			 <div class="goods_xq_ri73 fl">
			 	<a href="javascript:void(0);">立即购买</a>
			 </div>
			 <div class="goods_xq_ri74 fl"><a href="javascript:void(0);"><img src="pc/images/jiabu1.png" alt=""></a></div>

			<div class="cl"></div>
        </div>
        <div class="goods_xq_ri8">
			<div class="goods_xq_ri8_left fl">分享到 </div>
			<div class="goods_xq_ri8_right fl">
        <div class="bshare-custom icon-medium"><a title="分享到QQ空间" class="bshare-qzone"></a><a title="分享到新浪微博" class="bshare-sinaminiblog"></a><a title="分享到人人网" class="bshare-renren"></a><a title="分享到腾讯微博" class="bshare-qqmb"></a><a title="分享到网易微博" class="bshare-neteasemb"></a><a title="更多平台" class="bshare-more bshare-more-icon more-style-addthis"></a></div>
        <script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/buttonLite.js#style=-1&amp;uuid=&amp;pophcol=2&amp;lang=zh"></script><script type="text/javascript" charset="utf-8" src="http://static.bshare.cn/b/bshareC0.js"></script>
      	</div>
      	<div class="cl"></div>
        </div>
        <div class="goods_xq_ri9">
        	<div class="goods_xq_ri9_left fl">服务承诺 </div>
        	<div class="goods_xq_ri9_right fl">
        		<ul>
        		    <li>45天退换 </li>
        		    <li> 质保一年 </li>
        		    <li>贵就赔 </li>
        		    <li class="suoiin">支付说明</li>
        		</ul>
        		<div class="dri">
        			<a href="javascript:void(0);"> 支付宝</a>
        			<a href="javascript:void(0);"> 支付宝</a>
        			<a href="javascript:void(0);"> 支付宝</a>
        			<div class="cl"></div>
        		</div>
        	</div>
        	<div class="cl"></div>
        </div>
        </div>
        <div class="cl"></div>

    </div>
</div>

<script type="text/javascript">
	$(".suoiin").click(function(){
  $(".dri").toggle();
});
</script>
<div class="w1200">
<div class="goods_x">
   <div class="dapei">
     <ul>
         <li class="dapei1 dapei_hover">优惠套餐</li>
         <li class="dapei2 dapei1">人气搭配<img src="pc/images/hot.gif" alt=""  /></li>
         <li class="dapei3"></li>
     </ul>
     <div class="cl"></div>
   </div>
   <script>
  $(document).ready(function(){
        $(".dapei  li").click(function(){
        $(".dapei  li").eq($(this).index()).addClass("dapei_hover").siblings().removeClass('dapei_hover');
        $(".dapei-con").hide().eq($(this).index()).show();

        });
    });
    </script>
   <div class="dapei-con">
		<div class="dapei-tit">优惠套装一</div>
		<div class="dapei-ul">
			<div class="dapei-ul_left fl">
				<div class="dapei-ul_left1 fl"><a href="javascript:void(0);"><img src="pc/images/dapei-ul_left1.jpg" alt=""><p>高档桤木脚 纯天然植物纤维布艺转角沙发（1+2+右贵</p><span>¥6800</span></a></div>
				<div class="dapei-ul_left2 fl"><img src="pc/images/jiasr.jpg" alt=""></div>
				<div class="dapei-ul_left1 fl"><a href="javascript:void(0);"><img src="pc/images/dapei-ul_left1.jpg" alt=""><p>高档桤木脚 纯天然植物纤维布艺转角沙发（1+2+右贵</p><span>¥6800</span></a></div>
				<div class="cl"></div>
			</div>
			<div class="dapei-ul_right fr">
				<p>客厅套装客厅套装客厅套装客厅套装客厅套装客厅套装装客厅套装装客厅套装</p>
				<div class="dapei-ul_rjiai">
					<span class="pe1 fl">套餐价：</span><span class="pe2 fl">¥8546.00</span>
				</div>
				<a href="javascript:void(0);">购买套装</a>
			</div>
			<div class="cl"></div>
		</div>
   </div>

   <div class="dapei-con" style="display:none;">
		<div class="dapei-tit">优惠套装二</div>
		<div class="dapei-ul">
			<div class="dapei-ul_left fl">
				<div class="dapei-ul_left1 fl"><a href="javascript:void(0);"><img src="pc/images/dapei-ul_left1.jpg" alt=""><p>高档桤木脚 纯天然植物纤维布艺转角沙发（1+2+右贵</p><span>¥6800</span></a></div>
				<div class="dapei-ul_left2 fl"><img src="pc/images/jiasr.jpg" alt=""></div>
				<div class="dapei-ul_left1 fl"><a href="javascript:void(0);"><img src="pc/images/dapei-ul_left1.jpg" alt=""><p>高档桤木脚 纯天然植物纤维布艺转角沙发（1+2+右贵</p><span>¥6800</span></a></div>
				<div class="cl"></div>
			</div>
			<div class="dapei-ul_right fr">
				<p>客厅套装客厅套装客厅套装客厅套装客厅套装客厅套装装客厅套装装客厅套装</p>
				<div class="dapei-ul_rjiai">
					<span class="pe1 fl">套餐价：</span><span class="pe2 fl">¥8546.00</span>
				</div>
				<a href="javascript:void(0);">购买套装</a>
			</div>
			<div class="cl"></div>
		</div>
   </div>
</div>
</div>

<div class="w1200">
 <div class="cai_goods">
	<div class="cai_goods_left fl">
		<div class="coods_l">
			<div class="coods_l_title">猜您喜欢</div>
		</div>
		<div class="coods_con">
			<ul>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>
			    	<div class="paimin">1</div>
			    	</a>
			    </li>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>
			    	<div class="paimin">2</div>

			    	</a>
			    </li>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>
			    	<div class="paimin">3</div>

			    	</a>
			    </li>

			</ul>
		</div>
	</div>
	<div class="cai_goods_right fr">
		<div class="goods_right_type">
			<ul>
			    <li class="right_type_hover">商品详情</li>
			    <li>规格参数</li>
			    <li>评价<span style="color:#fa791b">（111）</span></li>

			    <li>服务保障</li>
			</ul>
			<div class="cl"></div>
		</div>
		  <script>
  $(document).ready(function(){
        $(".goods_right_type  li").click(function(){
        $(".goods_right_type  li").eq($(this).index()).addClass("right_type_hover").siblings().removeClass('right_type_hover');
        $(".goor_con").hide().eq($(this).index()).show();

        });
    });
    </script>
		<div class="goor_con">
			     <table class="goor_aaat">

                    <tr>
                        <td >商品编号：CFJ-TJ-002-TZ1</td>
                        <td>    商品材质：其他材质</td>
                        <td>    商品品牌：卡富亚</td>
                    </tr>

            </table>
            <img src="pc/images/sse.jpg" alt="">

		</div>
		<div class="goor_con" style="display:none">
			<dl class="goor_cha">
                <dt>商品信息</dt>
                <dd>型号： CFJ-TJ-002-TZ1</dd>
                <dd>风格： 现代风格</dd>
                <dd>包件： 5件</dd>
                <dd>体积： 1.92m³</dd>
            </dl>
		</div>

		<div class="goor_con" style="display:none">
			<div class="pingrun_top">
                <div class="pingrun_top_left fl"><div class="pingrun_top_le1"><span >5.0</span>分<img src="pc/images/wixin.jpg" alt="" /></div></div>
                <div class="pingrun_top_con fl">
                    <table class="baoyih">
                            <tr>
                                <td class="pos_fis">满意  </td>
                                <td>
                                <div class="nuitn">
                                </div>
                                </td>
                                <td >99.7% </td>
                            </tr>
                            <tr>
                                <td class="pos_fis">一般  </td>
                                <td>
                                <div class="nuitn1">
                                </div>
                                </td>
                                <td>0.2% </td>
                            </tr>
                            <tr>
                                <td class="pos_fis">不满意  </td>
                                <td>
                                <div class="nuitn1">
                                </div>
                                </td>
                                <td>0.1% </td>
                            </tr>

                    </table>
                </div>
                <div class="pingrun_top_right"></div>
                <div class="cl"></div>
                <div class="pind">
                        <ul>
                            <li class="pind-hover">全部评价(13)</li>
                            <li>满意(13)</li>
                            <li>一般(0)</li>
                            <li>不满意(0)</li>
                        </ul>
                </div>
                <div class="pind-lc" >
                    <ul>
                        <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>

                    </ul>
                    <div class="page ">
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
                </div>
                <div class="pind-lc" style="display:none">
                    <ul>
                        <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验111
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>

                    </ul>
                    <div class="page ">
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
                </div>
                <div class="pind-lc" style="display:none">
                    <ul>
                        <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>

                    </ul>
                    <div class="page ">
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
                </div>
                <div class="pind-lc" style="display:none">
                    <ul>
                        <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>
                          <li class="poc_l">
                            <div class="pind-lc_left fl">
                                <img src="pc/images/level4.gif" alt="">
                                <p>13860282***</p>
                                <div>
                                   <span>龙岩</span> 黄金会员
                                </div>
                            </div>
                            <div class="pind-lc_right fl">
                                <div class="pind-lc1">
                                    <div class="pind-lc1_le fl"><img src="pc/images/wixin.jpg" alt=""  class="fl" /><span class="fl">5分</span><div class="cl"></div></div>
                                    <div class="pind-lc1_ft fr">2017-03-06 13:45:07发布“宏宝城”</div>
                                    <div class="cl"></div>
                                </div>
                                <div class="pind-lc2">
                                        导购很热情，网上领券体验店购买划算又放心，服务态度挺不错，比较划算，不错的购物体验
                                </div>
                                <div class="pind-lc3">
                                    <ul class="fl">
                                        <li class="no_mian"><img src="pc/images/xjiuj.jpg" alt="" /></li>
                                        <li><img src="pc/images/xjiuj.jpg" alt="" /></li>

                                    </ul>
                                    <div class="fr pinh">
                                        有用(5)
                                    </div>
                                </div>

                            </div>
                            <div class="cl"></div>
                        </li>

                    </ul>
                    <div class="page ">
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
                </div>
                      <script>
  $(document).ready(function(){
        $(".pind  li").click(function(){
        $(".pind  li").eq($(this).index()).addClass("pind-hover").siblings().removeClass('pind-hover');
        $(".pind-lc").hide().eq($(this).index()).show();

        });
    });
    </script>
            </div>
		</div>

		<div class="goor_con" style="display:none">
            <div class="goocr">
    			  <div class="ping_song">配送服务</div>
                  <div class="ping_song1">我们提供体验馆配送、物流点自提、快递运输三种配送方式，您可根据需求选择最合适的配送服务。</div>
                  <div class="ping_table">
                     <table class="service-list"  cellspacing="0" cellpadding="0">
                    <tbody><tr>
                        <th width="123"><img src="pc/images/zham.png" alt="" style="margin-left:20px;"></th>
                        <th width="152"><span class="s wliu"></span></th>
                        <th width="152"><span class="s shuo"></span></th>
                        <th width="152"><span class="s slou"></span></th>
                        <th width="152"><span class="s az"></span></th>
                        <th width="152"><span class="s shou"></span></th>
                    </tr>
                    <tr class="diff">
                        <td><strong>体验馆配送</strong></td>
                        <td><span class="yes"></span></td>
                        <td><span class="yes"></span></td>
                        <td><span class="yes"></span></td>
                        <td><span class="yes"></span></td>
                        <td><span class="yes"></span></td>
                    </tr>
                    <tr>
                        <td><strong>物流点自提</strong></td>
                        <td><span class="yes yes1"></span></td>
                        <td><span class="no"></span></td>
                        <td><span class="no"></span></td>
                        <td><span class="no"></span></td>
                        <td><span class="yes yes1"></span></td>
                    </tr>
                    <tr class="diff">
                        <td><strong>快递运输</strong></td>
                        <td><span class="yes"></span></td>
                        <td><span class="yes"></span></td>
                        <td><span class="no"></span></td>
                        <td><span class="no"></span></td>
                        <td><span class="yes"></span></td>
                    </tr>
                </tbody>
                  </div>
                  <div class="ping_song2">
                      <table class="transfer-list"><tbody><tr>
                    <td>
                        <div class="item">
                            <div class="icon icon1"><span></span></div>
                            <h4>体验馆配送——贴心</h4>
                            <p>我们建议您选择体验馆配送安装，体验馆负责安排物流运输、送货、专业安装整个流程：</p>
                            <div class="ol">1、<div>如无法使用电梯，须人力搬运，从第4层起将收取一定的搬运费；</div></div>
                            <div class="ol">2、<div>收货地点存在特殊情况（如垄断搬运服务、电梯或楼道太小、房门太窄、施工故障、道     路修建、小区不支持货车进入或停留等）请事先向客服或体验馆工作人员说明。</div></div>
                        </div>
                    </td>
                    <td><div class="line"></div></td>
                    <td>
                        <div class="item">
                            <div class="icon icon2"><span></span></div>
                            <h4>物流点自提——方便</h4>
                            <p>货物将从发货地送到您所在城市的物流点，需要您到指定的物流点自提。物流点提货时请注意携带收货人本人身份证原件，如需他人代收请提前告知具体签收注意事项。详见<a href="##" target="_blank" title="收货指南" class="red">《收货指南》</a>。</p>
                        </div>
                    </td>
                    <td><div class="line"></div></td>
                    <td>
                        <div class="item">
                            <div class="icon icon3"><span></span></div>
                            <h4>快递运输——快捷</h4>
                            <p>由快递公司送货到您所留的收货地址楼下。请您务必在签收前当场拆包检查，如有购买多件商品请一定拆开清点件数，拆包后如发现商品损坏请当场拒收并及时与我们联系，商品货损与总件数以您签收为准，如果条件允许请您拍照取证。</p>
                        </div>
                    </td>
                </tr></tbody></table>
                  </div>
                  <div class="ping_song">贴心包装</div>
                  <div class="ping_song4">
                      <img src="pc/images/s-package.jpg" alt="">
                  </div>
                  <div class="ping_song">售后服务</div>
                  <div class="ping_song5 after-service">
                      <table><tbody><tr>
                    <td>
                        <div class="item">
                            <div class="icon icon1"><span></span></div>
                            <h4>商品质保</h4>
                            <p>所有商品，美乐乐将严格按照国家三包法等有关法律、法规为您提供质保服务。家具类产品、木地板产品、定制门产品、灯饰 照明类、厨卫装修类、五金工具类和五金电器类产品：1年，详情请见<a href="##" target="_blank" title="家具保修" class="red">《家具保修》</a>，<a href="javascript:void(0);" target="_blank" title="建材保修政策" class="red">《建材保修政策》</a>；瓷砖和墙纸无质保期。</p>
                        </div>
                    </td>
                    <td><div class="line"></div></td>
                    <td>
                        <div class="item">
                            <div class="icon icon2"><span></span></div>
                            <h4>退货和流程</h4>
                            <p>美乐乐为您提供最长时限为<a href="##" target="_blank" title="45天的无理由退换货" class="red">45天的无理由退换货</a>，根据商品品牌、品类不同会有所差异。如需退换货，请先将需要退换货信息反馈给美乐乐订单跟踪人员，我们接到信息后会及时联系您处理。详情请见<a href="##" target="_blank" title="退货和流程" class="red">《退货和流程》</a>。</p>
                        </div>
                    </td>
                </tr></tbody></table>
                  </div>
                  <div class="ping_song">常见问题解答</div>

                  <div class="ping_song6">
                      <div class="ping_song-title">
                          <ul>
                              <li class="ping_song-hover">商品相关<span>|</span></li>
                              <li>物流配送<span>|</span></li>
                              <li>售后问题<span>|</span></li>
                              <li>付款相关</li>
                          </ul>
                      </div>
                  </div>
                  <div class="ping_song7">
                      <ul>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>


                      </ul>
                  </div>
                   <div class="ping_song7" style="display:none;">
                      <ul>
                          <li>
                              <span>2网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>2网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>2网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>


                      </ul>
                  </div>
                  <div class="ping_song7" style="display:none;">
                      <ul>
                          <li>
                              <span>333网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>


                      </ul>
                  </div>
                  <div class="ping_song7" style="display:none;">
                      <ul>
                          <li>
                              <span>444网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>
                          <li>
                              <span>网上的所有产品体验馆是否都有实物展示？</span>
                              <p>由于体验馆受面积限制，挑选了最有代表性的商品进行展出，您可就近亲临当地体验馆，实地感受家具的品质及做工。</p>
                          </li>


                      </ul>
                  </div>
              <script>
  $(document).ready(function(){
        $(".ping_song-title  li").click(function(){
        $(".ping_song-title  li").eq($(this).index()).addClass("ping_song-hover").siblings().removeClass('ping_song-hover');
        $(".ping_song7").hide().eq($(this).index()).show();

        });
    });
    </script>

            </div>
		</div>

		<div class="kennei">
			<div class="dapei">
				<ul>
				    <li class="dapei1 dapei_hover">可能你还喜欢</li>
				    <li class="dapei4"></li>
				    </ul>
    			 <div class="cl"></div>
  			</div>
  			<div class="coods_con cood">
			<ul>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>

			    	</a>
			    </li>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>


			    	</a>
			    </li>
			    <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>

			    	</a>
			    </li>
			     <li><a href="javascript:void(0);">
			    	<img src="pc/images/dapei-ul_left1.jpg" alt="">
			    	<p>人气爆款 栅栏式简约设计 臻选美国进口白杨木</p>
			    	<span class="coods_con1 fl" style="color:#fa791b">¥2250</span>
			    	<span class="coods_con2 fr">已售 <span style="color:#fa791b">41453</span></span>
			    	<div class="cl"></div>

			    	</a>
			    </li>

			</ul>
			<div class="cl"></div>
		</div>
		</div>
	</div>
	<div class="cl"></div>
 </div>
</div>
<!-- 尾部 -->
<jsp:include page="../pc/bottom.jsp"/>
<!-- 尾部 -->
</html>
