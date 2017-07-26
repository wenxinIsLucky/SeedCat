<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>籽匠猫-我的收藏</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-我的收藏">
<meta http-equiv="description" content="籽匠猫-我的收藏">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
<style type="text/css">
.myanlidiv,.myxgtdiv{
	display: none;
}
.contextp{
	overflow:hidden;
	text-overflow:ellipsis;
	display:-webkit-box;
	-webkit-box-orient:vertical;
	-webkit-line-clamp:2;
}
.showmsg{
	width: 300px;
	height: 100px;
	position: absolute;
	top:0;
	left:0;
	right:0;
	bottom:0;
	margin:auto;
	z-index: 999999999;
	text-align: center;
	color:red;
	font-size: 16px;
	font-weight: bold;
	background-color: #fff;
	line-height: 100px;
}
</style>
</head>

<body>
	<div class="Wrap">
		<div class="Right">
			<dl class="Box">
				<dt>
					<a href="javascript:void(0);" class="boa Boxhover" data-bs="1">收藏的拍客 </a> 
					<a href="javascript:void(0);" class="juj_a  boa" data-bs="2"> 收藏的效果图</a>
					<a href="javascript:void(0);" class="boa" data-bs="3"> 收藏的案例</a>
				</dt>
				<!-- 拍客 -->
				<dd class="Trends mypostdiv">
					<ul class="BT0 MT0">
						<li class="Ava"><a class="Avatar" href="javascript:void(0);"> <img
								src="pc/user/images/69_avatar_small.jpg" alt="元气少女bling"
								style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
								<i class="1"></i>
						</a></li>
						<li class="Top"><a class="Name" href="javascript:void(0);">元气少女bling</a> <span
							class="Group">Lv8.硕士生O粉</span>
							<p class="Drop">
								<a class="More"></a> <span> <a class="Follow "><i></i>关注</a>
									<a class="Favorite Favorited"><i></i>已收藏</a> <a class="Report"><i></i>举报</a>
								</span>
							</p></li>
						<li class="Tail">18小时前&nbsp; 来自&nbsp;网页端</li>
						<li class="Des">
							<h2>
								<a href="javascript:void(0);">【软件分享】炫酷动态桌面瞬间提升手机逼格~</a>
							</h2>
							<p>新买的R11看腻了静态的壁纸，想来试试更高逼格的动态壁纸吗？一款软件满足你。超多资源
								---------------------------------------------------今天给大家推荐的这款软件拥有超多的动态壁纸资源，分类也十分详细。
								如何开启 ------------------...</p>
						</li>
						<li class="Pic "><a href="javascript:void(0);"> <span class="N0"><img
									src="pc/user/images/shouji1.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N1"><img src="pc/user/images/shouji2.gif" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;"></span>
								<span class="N2"><img src="pc/user/images/shouji3.jpg" alt=""
									style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -9.88764px; width: auto; height: 100%;"></span></a>
						</li>
						<li class="Bot"><span class="View"><i></i>3418</span> <a
							class="Forward"><i></i>12</a> <a class="Reply"><i></i>787</a> <a
							class="Praise Praised"><i></i>1002</a></li>
					</ul>
				</dd>
				
				<!-- 我的效果图 -->
				<div class="daijin myxgtdiv">
			        <dl id="vertical">
			            <dt >
			                <div class="bhxt">
			                    <a href="javascript:void(0);"  class="bhxt-a">
			                        <img class="later" src="pc/user/images/98734.jpg" data-original="images/98734.jpg" alt="6㎡  " />
			                        <div class="info" >
			                            <img class="later" src="pc/user/images/yu.jpg"  /></div>
			                    </a>
			                </div>
			                <h3><a href="javascript:void(0);" target="_blank">6㎡  </a></h3>
			                    <div style="position:relative;">
			                        <a class="s_gz " href="javascript:void(0)"><i></i><span id="zan_">1454</span></a>
			                        <a class="s_tyd" href="javascript:void(0);"  ><i></i>体验配套方案</a>
			                    </div>
			             </dt>
			
			            <dt style="margin-right:0;float:right;">
			                <div class="bhxt">
			                    <a href="javascript:void(0);"  class="bhxt-a">
			                        <img class="later" src="pc/user/images/98734.jpg" data-original="images/98734.jpg"  />
			                        <div class="info" >
			                        <img class="later" src="pc/user/images/yu.jpg" /></div></a></div>
			                        <h3><a href="javascript:void(0);">7㎡门窗相对 平窗 1扇门</a></h3>
			                      <div style="position:relative;">
			                            <a class="s_gz " href="javascript:void(0)"><i></i><span id="zan_">1570</span></a>
			                            <a class="s_tyd" href="javascript:void(0);"><i></i>体验配套方案</a>
			                    </div>
			            </dt>
			             <dt >
			                <div class="bhxt">
			                    <a href="javascript:void(0);"  class="bhxt-a">
			                        <img class="later" src="pc/user/images/98734.jpg" data-original="images/98734.jpg" alt="6㎡  " />
			                        <div class="info" >
			                            <img class="later" src="pc/user/images/yu.jpg"  /></div>
			                    </a>
			                </div>
			                <h3><a href="javascript:void(0);" target="_blank">6㎡  </a></h3>
			                    <div style="position:relative;">
			                        <a class="s_gz " href="javascript:void(0)"><i></i><span id="zan_">1454</span></a>
			                        <a class="s_tyd" href="javascript:void(0);"  ><i></i>体验配套方案</a>
			                    </div>
			             </dt>
			
			            <dt style="margin-right:0;float:right;">
			                <div class="bhxt">
			                    <a href="javascript:void(0);"  class="bhxt-a">
			                        <img class="later" src="pc/user/images/98734.jpg" data-original="images/98734.jpg"  />
			                        <div class="info" >
			                        <img class="later" src="pc/user/images/yu.jpg" /></div></a></div>
			                        <h3><a href="javascript:void(0);">7㎡门窗相对 平窗 1扇门</a></h3>
			                      <div style="position:relative;">
			                            <a class="s_gz " href="javascript:void(0)"><i></i><span id="zan_">1570</span></a>
			                            <a class="s_tyd" href="javascript:void(0);"><i></i>体验配套方案</a>
			                    </div>
			            </dt>
			
			            <div class="cl"></div>
			
			        </dl>
			<script type="text/javascript">
			 var size = $("#vertical dt").size();
			 var m = size;
			 var pid = 0;
			 var n = 0;
			 var turn,turn1,turn2;
			 var i=0,a=0,b=0;
			
			 var arrayObj = new Array(2,7,0,5,3,1,6,2,5,7,4,3,7,5,2,4,6,7);//创建一个数组
			  function fanpai(target){
			     target.eq(pid).find('a').find('img').eq(0).stop().animate({'width':0},300,function(){
			        $(this).hide().next().show();
			        $(this).next().animate({'width':"100%"},300);
			        $(this).next().find('img').animate({'width':"100%"},300);
			
			      });
			
			      target.eq(pid).siblings('dt').find('a').find('.info').animate({'width':0},300,function(){
			        $(this).find('img').animate({'width':0},300);
			        $(this).hide().prev().show();
			        $(this).prev().animate({'width':"100%"},300);
			      });
			  }
			   function add_on(a,b){
			            pid=a
			        fanpai(b);
			
			  };
			       turn=setInterval(function(){
			
			            add_on(arrayObj[i],$('#vertical dt'));
			
			
			          i++;
			        if(i>=17){
			          i=0;
			        }
			
			     },4000);
			var turns = function(c,d){
			  c.mouseenter(function(){
			
			     $(this).siblings('dt').find('a').find('.info').animate({'width':0},300,function(){
			        $(this).find('img').animate({'width':0},300);
			        $(this).hide().prev().show();
			        $(this).prev().animate({'width':"100%"},300);
			      });
			
			    $(this).find('img').eq(0).stop().animate({'width':0},300,function(){
			        $(this).hide().next().show();
			        $(this).next().animate({'width':"100%"},300);
			        $(this).next().find('img').animate({'width':"100%"},300);
			    });
			
			    clearInterval(d);
			
			  });
			}
			$('#vertical').mousemove(function(){
			   clearInterval(turn);
			});
			   $('#vertical').mouseleave(function(){
			    i=a;
			       turn=setInterval(function(){
			               add_on(arrayObj[i],$('#vertical dt'));
			         i++;
			         if(i>=17){i=0; }
			     },4000);
			  });
			
			turns($('#vertical dt'),turn);
			</script>
			
			      </div>
			      
			      <!-- 我的案例 -->
			      <div class="daijin myanlidiv">
			        <div class="anli_geren">
			          <div class="case_bd">
			        <ul class="clearfix">
			                    <li class="fl">
			                <a href="http://sjq.homekoo.com/forum.php?mod=viewthread&amp;tid=103486" target="_blank">
			                    <img src="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" data-url="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" alt="http://sjq.homekoo.com" height="228" width="306">
			                </a>
			                <div class="case_txt">
			                    <div class="case_ti">玄关加客餐厅</div>
			                    <div class="case_info"><span>320</span>人气/ <span>36</span>评论 / <span>2650</span>浏览</div>
			                    <div class="case_designer clearfix">
			                        <div class="designer_img">
			                            <img src="http://wx.qlogo.cn/mmopen/FdNRHDlYWeys9SfZlyIXicjFR7F7oWEQEibQlXAibvNn8HoCLlj16BQBR7rvbmf3IicTibBiclYaIVl5XqgEwu1XAooDVaOOcBjeEW/0" alt="http://sjq.homekoo.com" height="46" width="46">
			                        </div>
			                        <div class="designer_tx">
			                            <div>设计师：<span>刘翠丽</span></div>
			                            <div class="rq">
			                                <i "></i>人气值：<span id="dp_10">320</span>
			                            </div>
			                            <div class="al">
			                                <em></em>完成案例：<span>87</span>
			                            </div>
			                        </div>
			
			                    </div>
			                        <div class="cl"></div>
			
			                </div>
			            </li>
			                <li class="fr">
			                <a href="http://sjq.homekoo.com/forum.php?mod=viewthread&amp;tid=103486" target="_blank">
			                    <img src="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" data-url="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" alt="http://sjq.homekoo.com" height="228" width="306">
			                </a>
			                <div class="case_txt">
			                    <div class="case_ti">玄关加客餐厅</div>
			                    <div class="case_info"><span>320</span>人气/ <span>36</span>评论 / <span>2650</span>浏览</div>
			                    <div class="case_designer clearfix">
			                        <div class="designer_img">
			                            <img src="http://wx.qlogo.cn/mmopen/FdNRHDlYWeys9SfZlyIXicjFR7F7oWEQEibQlXAibvNn8HoCLlj16BQBR7rvbmf3IicTibBiclYaIVl5XqgEwu1XAooDVaOOcBjeEW/0" alt="http://sjq.homekoo.com" height="46" width="46">
			                        </div>
			                        <div class="designer_tx">
			                            <div>设计师：<span>刘翠丽</span></div>
			                            <div class="rq">
			                                <i "></i>人气值：<span id="dp_10">320</span>
			                            </div>
			                            <div class="al">
			                                <em></em>完成案例：<span>87</span>
			                            </div>
			                        </div>
			
			                    </div>
			                        <div class="cl"></div>
			
			                </div>
			            </li>
			                 <li class="fl">
			                <a href="http://sjq.homekoo.com/forum.php?mod=viewthread&amp;tid=103486" target="_blank">
			                    <img src="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" data-url="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" alt="http://sjq.homekoo.com" height="228" width="306">
			                </a>
			                <div class="case_txt">
			                    <div class="case_ti">玄关加客餐厅</div>
			                    <div class="case_info"><span>320</span>人气/ <span>36</span>评论 / <span>2650</span>浏览</div>
			                    <div class="case_designer clearfix">
			                        <div class="designer_img">
			                            <img src="http://wx.qlogo.cn/mmopen/FdNRHDlYWeys9SfZlyIXicjFR7F7oWEQEibQlXAibvNn8HoCLlj16BQBR7rvbmf3IicTibBiclYaIVl5XqgEwu1XAooDVaOOcBjeEW/0" alt="http://sjq.homekoo.com" height="46" width="46">
			                        </div>
			                        <div class="designer_tx">
			                            <div>设计师：<span>刘翠丽</span></div>
			                            <div class="rq">
			                                <i "></i>人气值：<span id="dp_10">320</span>
			                            </div>
			                            <div class="al">
			                                <em></em>完成案例：<span>87</span>
			                            </div>
			                        </div>
			
			                    </div>
			                        <div class="cl"></div>
			
			                </div>
			            </li>
			                <li class="fr">
			                <a href="http://sjq.homekoo.com/forum.php?mod=viewthread&amp;tid=103486" target="_blank">
			                    <img src="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" data-url="http://img1.homekoocdn.com/html/sys/images2017/2017_05/22221.jpg" alt="http://sjq.homekoo.com" height="228" width="306">
			                </a>
			                <div class="case_txt">
			                    <div class="case_ti">玄关加客餐厅</div>
			                    <div class="case_info"><span>320</span>人气/ <span>36</span>评论 / <span>2650</span>浏览</div>
			                    <div class="case_designer clearfix">
			                        <div class="designer_img">
			                            <img src="http://wx.qlogo.cn/mmopen/FdNRHDlYWeys9SfZlyIXicjFR7F7oWEQEibQlXAibvNn8HoCLlj16BQBR7rvbmf3IicTibBiclYaIVl5XqgEwu1XAooDVaOOcBjeEW/0" alt="http://sjq.homekoo.com" height="46" width="46">
			                        </div>
			                        <div class="designer_tx">
			                            <div>设计师：<span>刘翠丽</span></div>
			                            <div class="rq">
			                                <i "></i>人气值：<span id="dp_10">320</span>
			                            </div>
			                            <div class="al">
			                                <em></em>完成案例：<span>87</span>
			                            </div>
			                        </div>
			
			                    </div>
			                        <div class="cl"></div>
			
			                </div>
			            </li>
			
			                </ul>
			                <div class="cl"></div>
			    </div>
			        </div>
			      </div>
			</dl>
			<p class="aj-loading hide"></p>
			<div class="Page Box Dn"></div>
		</div>
	</div>
	<!-- BEGIN FOOTER -->
</body>
<script type="text/javascript">
$(function(){
	$('.boa').on('click',function(){
		$(this).siblings().removeClass('Boxhover');
		$(this).addClass('Boxhover');
		var bs = $(this).attr('data-bs');
		if(bs === '1'){
			$('.myanlidiv,.myxgtdiv').hide();
			$('.mypostdiv').show();
			jume('POST',1,10,'mypostdiv');
		}else if(bs === '2'){
			$('.mypostdiv,.myanlidiv').hide();
			$('.myxgtdiv').show();
			//jume('POST',1,10,'myxgtdiv');
		}else if(bs === '3'){
			$('.mypostdiv,.myxgtdiv').hide();
			$('.myanlidiv').show();
			//jume('POST',1,10,'myanlidiv');
		}
	});
	jume('POST',1,10,'mypostdiv');
});

function jume(type,start,size,clName){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getCommunityControllerData',
		data : {type:type,start:start,size:size},
		success : function(re){
			if(re!=null){
				if(re.status===200){
					var strVar = "";
					$.each(re.list,function(i,v){
					    strVar += "<ul class=\"BT0 MT0 \">";
					    strVar += "<li class=\"Ava\"><a class=\"Avatar "+('${user.uid}'===v.uid?'':'toVisitor')+"\" data-uid=\""+v.uid+"\" href=\"javascript:void(0);\"><img src=\"/static_img/head/"+v.user.head+"\" alt=\""+v.user.name+"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;\">";
					    strVar += "<i class=\"1\"><\/i><\/a><\/li>";
					    strVar += "<li class=\"Top\"><a class=\"Name "+('${user.uid}'===v.uid?'':'toVisitor')+"\" data-uid=\""+v.uid+"\" href=\"javascript:void(0);\">"+v.user.name+"<\/a><\/li>";
					    strVar += "<li class=\"Tail\">"+v.createDate.getDateDiff()+"&nbsp; 来自&nbsp;"+v.system+"<\/li>";
					    strVar += "<li class=\"Des\"><h2>";
					    strVar += "<a href=\"javascript:void(0);\" data-t=\""+v.cid+"\" class=\"mijy_bj\">"+v.community.title+"<\/a>";
					    strVar += "<\/h2><p class=\"contextp\">"+v.community.cunContext+"<\/p><\/li>";
					    if(v.community.cunimg!=""){
						    strVar += "<li class=\"Pic \"><a href=\"javascript:void(0);\" data-t=\""+v.cid+"\" class=\"mijy_bj\">";
						    var imgs = v.community.cunimg.split(',');
						    var l = imgs.length > 3 ? 3 :imgs.length;
						    for(var k = 0; k < l; k++){
							    strVar += "<span class=\"N0\"><img src=\""+imgs[k]+"\" alt=\"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -10px; width: auto; height: 100%;\"><\/span>";
						    }
						    strVar += "<\/a><\/li>";
					    }
					    strVar += "<li class=\"Bot\"><span class=\"View\"><i><\/i>"+v.community.browse+"<\/span><a class=\"Reply\"><i><\/i>"+v.community.reply+"<\/a><a class=\"Praise Praised\"><i><\/i>"+v.community.zan+"<\/a><\/li>";
					    strVar += "<\/ul>";
					});
					$('.'+clName).html(strVar);
					$('.page_p').remove();
					$('.'+clName).append('<p class="page_p"></p>');
					if(re.countPage > 1){
						$('.page_p').createPage({
							pageCount : re.countPage,
							current : re.start,
							input_name : 'mycollection-input',
							backFn : function(p){
								jume(type,p,re.size);
							}
			            });
					}
					$('.mijy_bj').bind('click',function(){
						var datat = $(this).attr('data-t');
						var param = {
								param : "Browse",
								inwzid : datat
						};
						$.post('addCommunityAll',param,function(re){
							window.open('getCommunity/'+datat); 
						});
					});
					$('.toVisitor').bind('click',function(){
						goVisitor($(this).attr('data-uid'));
					});
				}else if(re.status===404){
					location.href = re.url;
				}
			}
		},error : function(re){
			alert(re.status);
		}
	});
};
function goVisitor(heuid){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'addVisitorData',
		data : {'main.uid':heuid},
		success : function(re){
			if(re.status === 200){
				location.href = re.url;
			}else if(re.status === 404){
				location.href = re.url;
			}else{
				alert(re.msg);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}
</script>
</html>