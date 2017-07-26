<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String index = request.getParameter("index");
%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <base href="<%=basePath%>">
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>后台登录</title>
  <link rel="stylesheet" href="pcadmin/login/css/style.css">
  <script src="pc/js/jquery-2.1.1.min.js"></script>
</head>
<body>
  <section class="container">
    <div class="login">
      <h1>www.zijmao.com</h1>
      <form method="post" action="index.html">
        <p><input type="text" id="id" value="" placeholder="账号"></p>
        <p><input type="password" id="password" value="" placeholder="密码"></p>
        <p><input type="text" style="width: 140px;vertical-align: 0.8rem;" id="yzm" placeholder="验证码"><img style="cursor: pointer;" class="himg" onclick="hztp1();" src="getVerificationStream"></p>
        <p class="submit"><input style="cursor: pointer;" type="button" value="登录" onclick="login()"></p>
      </form>
    </div>

  </section>
<script>
var lock = false;
var index = <%=index%>;
$(function() {
	if(top.location!=self.location){
		top.location = self.location;
	}
	$("#id").focus();
	$("#id,#password,#yzm").on('keyup', function(a) {
		if (a.keyCode == 13) {
			login();
		}
	});
});

eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}('2 E(){8=m;3 b=$("#n").7();3 c=$("#d").7();4(q()){4(!8){8=m;$.v({w:"B",z:"y",x:{C:b,d:c,l:l},p:2(a){8=6;4(a.F===N){A.H.G="t-t-l"}h{9(a.M);j()}}})}}h{j()}}2 q(){8=6;4($.g($("#n").7())==""){9("\u8bf7\u586b\u5199\u8d26\u53f7");$("#n").f();5 6}4($.g($("#d").7())==""){9("\u5bc6\u7801\u4e0d\u80fd\u4e3a\u7a7a");$("#d").f();5 6}4($.g($(\'#e\').7())==""){9("\u8bf7\u8f93\u5165\u9a8c\u8bc1\u7801");$("#e").f();5 6}3 a=k($.g($(\'#e\').7()));4("D"!=a){9("\u9a8c\u8bc1\u7801\u9519\u8bef\uff0c\u8bf7\u91cd\u65b0\u8f93\u5165");$("#e").f();5 6}5 m}2 j(){3 a=$(".u");3 b=a.o("s");$(".u").o("s",r(b))}2 r(a){3 b=(I J()).K();3 c=a.L(0,a.i(\'?\')>-1?a.i(\'?\'):a.O);4((a.i("&")>=0)){c=c+"\u00d7P="+b}h{c=c+"?Q="+b}5 c}2 k(b){3 c="";$.v({z:\'y\',w:\'k\',R:6,x:{S:b},T:\'U\',p:2(a){c=a},V:2(a){c="W"}});5 c}',
		59,59,"  function var if return false val lock alert    password yzm focus trim else indexOf hztp1 verificationCode index true id attr success yz gburl src admin himg ajax url data POST type window loginAdmin account SUCCESS login status href location new Date valueOf substring msg 200 length tamp timestamp async inputCode dataType text error FAIL".split(" "),0,{}));
</script>
 
</body>
</html>
