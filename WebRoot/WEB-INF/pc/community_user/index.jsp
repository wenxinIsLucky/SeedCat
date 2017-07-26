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
<title>籽匠猫-主页社区</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-主页社区">
<meta http-equiv="description" content="籽匠猫-主页社区">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico" type="image/x-icon">
<link href="pc/community_user/css/common.min.css" rel="stylesheet">
<script src="pc/community_user/js/jquery.min.js"></script>
</head>
<body id="topBody">
<!-- 头部 -->
<jsp:include page="../top.jsp">
	<jsp:param value="8" name="pageName"/>
</jsp:include>
<!-- 头部 -->

<!--我的主页-->

<main class="Cb RR_TE">
    <p class="Bread Hide"><a class="First" target="_self" href="javascript:void(0);"> 杍匠社区  <s></s></a><span>我的主页<u></u><s></s></span></p>
    <div id="Member_Top" class="Box wall" ">
      <a class="Set"><input type="file" name="ima" class="hidden" value="" /></a>
      <a class="Avatar"> <img src="pc/community_user/images/noavatar_big.gif"  class="Avatar-img" /></a>
      <h1><span>杍匠丿猫</span><i class=""></i></h1>
      <h4></h4>
      <p class="MT10"></p>
      <p class="Bot TAr"><button class="Btn-W MR10" >取消</button><button >保存</button></p>
    </div>
     <div class="dou-if">
    <div class="dou">

    <div id="Member_Avatar" class="Box dorn">
      <dl>
        <dt><a class="Close">×</a>头像设置</dt>
        <dd>
          <form >
            <table>
              <tr>
                <td colspan="2"><div class="Pic"></div></td>
              </tr>
              <tr>
                <td colspan="2" class="dri_uy"><a class="Btn-W de-vae" value="">上传</a><input type="file" name="ima" class="hidden1" value="上传" /></td>
              </tr>
              <tr>
                <td colspan="2">预览</td>
              </tr>
              <tr>
                <td><p class="P1"><img src="pc/community_user/images/noavatar_big.gif" /></p></td>
                <td><p class="P2"><img src="pc/community_user/images/noavatar_big.gif" /></p></td>
              </tr>
              <tr>
                <td>120PX</td>
                <td>60PX</td>
              </tr>
              <tr>
                <td class="PT20" colspan="2"><button type="reset" class="Btn-W MR10" >取消</button><button type="submit">确定</button></td>
              </tr>
            </table>
            <input type="hidden" name="x" /> <input type="hidden" name="y" /> <input type="hidden" name="w" /> <input type="hidden" name="h1" /><input type="hidden" name="u1" />
          </form>
        </dd>
      </dl>
    </div>
     </div>
     </div>

<script type="text/javascript">
  $(".Avatar-img").click(function(){
  $("#Member_Avatar").show();
});
  $(".Close").click(function(){
  $("#Member_Avatar").hide();
});
  $(".MR10").click(function(){
  $("#Member_Avatar").hide();
});
</script>



  <!--侧边栏开始-->
  <aside class="Fl">

<ul class="Box Cb Count" id="Member_Count">
  <li><a target="_self" href="javascript:void(0);"><b>3</b><span>关注</span></a></li>
  <li><a target="_self" href="javascript:void(0);"><b>2</b><span>粉丝</span></a></li>
  <li><a target="_self" href="javascript:void(0);"><b>2</b><span>访客</span></a></li>
</ul>
<nav class="Box Member" name="Myself">
  <a class="index S" target="_self" href="javascript:void(0);"><i></i>我的主页</a>
  <a class="msg" target="_self" href="javascript:void(0);"><i></i>消息通知</a>
  <a class="info " target="_self" href="javascript:void(0);"><i></i>我的资料</a>
  <a class="reply " target="_self" href="javascript:void(0);"><i></i>评论回复</a>
  <a class="fav " target="_self" href="javascript:void(0);"><i></i>收藏的帖子</a>
</nav>
  </aside>
  <!--侧边栏结束-->
<div class="Right">
    <!--动态列表开始-->
    <dl class="Box" >
      <dt>我的动态（<span>2</span>）</dt>
      <dd class="Trends">
      <ul class="BT0 MT0">
          <li class="Ava">
            <a class="Avatar" href="/member-71675768-1">
              <img src="pc/community_user/images/noavatar_big.gif" alt="杍匠丿猫" style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
              <i class="Dn"></i>
            </a>
          </li>
          <li class="Top">
            <a class="Name" href="/member-71675768-1">杍匠丿猫</a>
            <span class="Group">Lv1.幼儿园O粉</span>
          </li>
          <li class="Tail">3小时前&nbsp; 来自&nbsp;网页端</li>
          <li class="Des">
            <h2><a href="javascript:void(0);"></a></h2>
            <p>6的很[表情]<a type="1" class="C3fcab8" href=" #" >@OPPO</a> </p>
          </li>
          <li class="Bot">
            <span class="View"><i></i>1</span>
            <a class="Forward"><i></i>0</a>
            <a class="Reply" ><i></i>0</a>
            <a class="Praise 0" ><i></i>0</a>
          </li>
      </ul>
        <ul class="" aj-id="99178010">
          <li class="Ava">
            <a class="Avatar" href="javascript:void(0);">
              <img src="pc/community_user/images/noavatar_big.gif" alt="杍匠丿猫" style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
              <i class="Dn"></i>
            </a>
          </li>
          <li class="Top">
            <a class="Name" href="javascript:void(0);">杍匠丿猫</a>
            <span class="Group">Lv1.幼儿园O粉</span>
          </li>
          <li class="Tail">3小时前&nbsp; 来自&nbsp;网页端</li>
          <li class="Des">
            <h2><a href="javascript:void(0);"></a></h2>
            <p>bucuo</p>
          </li>
          <li class="For ">
            <a href="javascript:void(0);">
            <span><img src="pc/community_user/images/jpg_w200.jpg" alt="" style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%; position: absolute; top: 0px; left: -3.15789px; width: auto; height: 100%;"></span>
            </a>
            <h3>@AU33</h3>
            <p><a type="3" class="C3fcab8" href="javascript:void(0);">#和闺蜜在一起#</a>[表情][表情][表情][表情]</p>
          </li>

          <li class="Bot">
            <span class="View"><i></i>0</span>
            <a class="Forward" ><i></i>0</a>
            <a class="Reply" ><i></i>1</a>
            <a class="Praise 0" ><i></i>0</a>
          </li>
        </ul></dd>
    </dl><p class="aj-loading hide"></p><div class="Page Box Dn"></div>
  </div>
</main>

</div>

<!-- 尾部 -->
<jsp:include page="bottom.jsp"></jsp:include>
<!-- 尾部 -->
</body>
</html>