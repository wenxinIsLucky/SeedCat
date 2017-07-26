<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>籽匠猫-VR管理</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="籽匠猫-VR管理">
	<meta http-equiv="description" content="籽匠猫-VR管理">
	<script src="pc/js/jquery-2.1.1.min.js"></script>
	<script type="text/javascript" src="pc/js/liwenxin.js"></script>
	<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
	<link href="pcadmin/coltd/css/address.css" rel="stylesheet" />
	<style type="text/css">
	select{
		width: 90%;
		height: 36px;
	}
	.file{margin: 0px auto;cursor:pointer;width:98px;height:34px;position:relative;display:block;background:#d0eeff;border:1px solid #99d3f5;border-radius:1px;text-align:center;overflow:hidden;color:#1e88c7;text-decoration:none;text-indent:0;line-height:38px}
.file input{width:98px;height:38px;position:absolute;font-size:100px;right:0;top:0;opacity:0;filter:alpha(opacity=0);cursor:pointer}
#Member_Avatar p img{
	width: 100%;
	height: 100%;
}
	</style>
  </head>
  
  <body>
    <div id="addressdivzong">
    	<div id="addaddressdiv">
    		<form action="" id="form">
    			<table width="100%" class="title_table">
    				<caption>
    					<h1>添加VR</h1>
    				</caption>
					<tr align="center">
						<td width="15%" class="td-title" align="right">VR标题</td>
						<td width="85%" class="td-title"><input type="text" name="title"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">VR类型</td>
						<td width="85%" class="td-title">
							<select name="type">
								<option value="0">家装案例</option>
								<option value="1">红木案例</option>
							</select>
						</td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">VR链接</td>
						<td width="85%" class="td-title"><input name="url" type="text"/></td>
					</tr>
					<tr align="center">
						<td width="15%" class="td-title" align="right">封面</td>
						<td width="85%" class="td-title">
								<a href="javascript:;" class="file" style="cursor: pointer;">选择封面
									<input id="file_upload" type="file" name="imgFile" accept="image/*">
								</a>
						</td>
					</tr>
					<tr align="center">
						<td width="100%" colspan="2" class="td-title" align="center">
							<p class="P1">
								<img id="yl1" name="cover" src="pc/user/images/noavatar_big.gif" />
							</p>
						</td>
					</tr>
					<tr align="center" style="margin-top: 20px;">
						<td width="100%" colspan="2" class="td-title" align="center">
							<input type="button" value="保存" class="baocun">
						</td>
					</tr>
				</table>
    		</form>
    	</div>
    	<div di="showaddressdiv">
    		<table width="100%" class="title_table">
				<tr height="40px" align="center" bgcolor="#ccc">
					<td width="20%" class="td-title">VR标题</td>
					<td width="20%" class="td-title">封面</td>
					<td width="20%" class="td-title">VR类型</td>
					<td width="20%" class="td-title">VR链接</td>
					<td width="20%" class="td-title">操作</td>
				</tr>
			</table>
			<table width="100%" class="show_table">
				<tr height="40px" align="center" bgcolor="#fff">
					<td width="25%" class="td-title" data-name="name">深圳籽匠猫总部</td>
					<td width="25%" class="td-title" data-name="phone">135XXXXXXXX</td>
					<td width="25%" class="td-title" data-name="chuanzhen">0800-XXXX-XXXX</td>
					<td width="25%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="1">编辑</a>
						<a href="javascript:void(0);" class="deleA" data-bs="1">删除</a>
					</td>
				</tr>
				
				<tr height="40px" align="center" bgcolor="#fff">
					<td width="20%" class="td-title" data-name="name">北京籽匠猫分公司</td>
					<td width="20%" class="td-title" data-name="phone">135XXXXXXXX</td>
					<td width="20%" class="td-title" data-name="chuanzhen">0800-XXXX-XXXX</td>
					<td width="20%" class="td-title">
						<a href="javascript:void(0);" class="editA" data-bs="2">编辑</a>
						<a href="javascript:void(0);" class="deleA" data-bs="2">删除</a>
					</td>
				</tr>
			</table>
    	</div>
    </div>
  </body>
  <script type="text/javascript">
  	var isLucky = false;
  	var array = new Array();
  	var file = null;
  	$(function(){
  		jume(1,10,3);
  		
  		$("#file_upload").change(function() {
			var a = $(this);
			var b = a[0];
			file = this.files[0];
			var c = window.URL || window.webkitURL;
			var d;
			var e = $("#yl1");
			if (b && b.files && b.files[0]) {
				d = c.createObjectURL(b.files[0]);
				e.attr('src', d);
			} else {
				d = a.val();
				var f1 = document.getElementById("yl1");
				f1.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
				f1.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = d;
			}
		});
		$(".file").on("change", "input[type='file']", function() {
			$('.submit_a').css("display", "inline-block");
			var a = $(this).val();
			if (a.indexOf("jpg") != -1 || a.indexOf("png") != -1) {
				$(".fileerrorTip").html("").hide();
				var b = a.split('\\');
				var c = b[b.length - 1];
				$(".showFileName").html(c)
			} else {
				if ($.trim($('#file_upload').val()) == "") {
					$(".showFileName").html("");
					$(".fileerrorTip").html("您未上传文件，或者您上传文件类型有误！").show();
					$('#yl1').removeAttr("src");
					return false
				}
			}
		});
  		
		eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}("$('.G').y('u',8(){2(w()&&!6){6=V;o c=E F();o b=\"P\";2(R($(\"7[4='9']\").3(\"h-m\"))!=\"K\"){$('#n').5('<7 4=\"S\" q=\"W\" Y=\"'+$(\"7[4='9']\").3(\"h-m\")+'\"/>');b=\"Z\"}2($('#r').3('s').x('/t/')>-1){c.5(\"z\",$('#r').3('s'));b=\"A\"}c.5(\"B\",C);$.D($('#n 7'),8(i,v){c.5($(v).3('4'),$(v).k())});c.5($(\"l\").3('4'),$(\"l\").k());$.H({q:'I',h:c,J:0,L:0,M:0,N:0,9:b,O:8(a){6=0;2(a===\"Q\"){e.p='T-U'}f 2(a.g===X){d(a.j);e.10()}f 2(a.g===11){e.p=a.9}f{d(a.j)}},12:8(a){6=0;d(a.g)}})}});",
				62,65,"false  if attr name append isLucky input function url    alert location else status data  msg val select bs form var href type yl1 src static_img click  yz indexOf on cover updVrPojoDataQ imgFile file each new FormData baocun ajax POST async undefined cache contentType processData success addVrPojoData LOGIN typeof vid admin loginto true hidden 200 value updVrPojoData reload 404 error".split(" "),0,{}));
  	});
  	eval(function(d,e,a,c,b,f){b=function(a){return(a<e?"":b(parseInt(a/e)))+(35<(a%=e)?String.fromCharCode(a+29):a.toString(36))};if(!"".replace(/^/,String)){for(;a--;)f[b(a)]=c[a]||b(a);c=[function(a){return f[a]}];b=function(){return"\\w+"};a=1}for(;a--;)c[a]&&(d=d.replace(new RegExp("\\b"+b(a)+"\\b","g"),c[a]));return d}("3 P(){$.s($('.F t'),3(i,v){j c={};$.s($(v).1w('2'),3(a,b){c[$(b).5('1-4')]=$(b).5('1-9')});S[i]=c})}3 1v(d,e,f){j g={1u:d,1t:e,1s:f};$.N({k:'Q',R:q,l:'1p',1:g,U:3(b){j c='<V 1o=\"9-Z: 10;\">\u6682\u65f6\u672a\u67091n\u6848\u4f8b</V>';7(b!=H){7(b.u===J&&b.1j>0){c='';$.s(b.1g,3(i,v){c+='<t 18=\"17\" Z=\"10\" 1l=\"#1A\">';c+='<2 p=\"n%\" h=\"2-8\" 1-4=\"8\" 1-9=\"'+v.8+'\">'+v.8+'</2>';c+='<2 p=\"n%\" h=\"2-8\" 1-4=\"B\" 1-9=\"'+v.B+'\"><C D=\"'+v.B+'\"/></2>';c+='<2 p=\"n%\" h=\"2-8\" 1-4=\"k\" 1-9=\"'+v.k+'\">'+(v.k==0?'\u5bb6\u88c5\u6848\u4f8b':'\u7ea2\u6728\u6848\u4f8b')+'</2>';c+='<2 p=\"n%\" h=\"2-8\" 1-4=\"l\" 1-9=\"'+v.l+'\">'+v.l+'</2>';c+='<2 p=\"n%\" h=\"2-8\">';c+='<a E=\"W:X(0);\" h=\"Y\" 1-6=\"'+v.G+'\">\u7f16\u8f91</a>';c+='<a E=\"W:X(0);\" h=\"11\" 1-6=\"'+v.G+'\">\u5220\u9664</a>';c+='</2></t>'})}}$('.F').16(c);$('.Y').13('14',3(){12($(w).y().y(),$(w).5('1-6'))});$('.11').13('14',3(){j o=w;7(19(\"\u786e\u8ba4\u5220\u9664\")){$.N({k:'Q',R:q,l:'1a',1:{G:$(w).5('1-6')},U:3(a){7(a===\"1b\"){1c.E='1d-1e'}1f 7(a!=H){m(a.1h);7(a.u===J){$(o).y().y().1i()}}},K:3(a){m(a.u)}})}});P()},K:3(a){m(a.u)}})}3 1k(){j a=15;$.s($('#1m x[k=\"9\"]'),3(i,v){7($.A($(v).r()).1q<=0){m('\u4e0d\u5141\u8bb8\u4e3a\u7a7a');$(v).1r();a=q;z a}});7($.A($('#L').r())==\"\"&&a&&I($(\"x[4='l']\").5(\"1-6\"))==\"T\"){m(\"\u8bf7\u9009\u62e9\u60a8\u8981\u4e0a\u4f20\u7684\u56fe\u7247\");a=q;z a}7(I($(\"#M\").5(\"1-6\"))!=\"T\"&&$('#M').5('D').1x('/1y/')<0&&$.A($('#L').r())==\"\"&&a){m(\"\u8bf7\u9009\u62e9\u60a8\u8981\u4e0a\u4f20\u7684\u56fe\u7247\");a=q;z a}z a}3 12(a,b){j c=$('.F t').1z(a);$.s(S[c],3(i,v){$('x[4=\"'+i+'\"]').r(v);$('x[4=\"'+i+'\"]').5('1-6',b);$('O[4=\"'+i+'\"]').r(v);$('O[4=\"'+i+'\"]').5('1-6',b);$('C[4=\"'+i+'\"]').5('D',v);$('C[4=\"'+i+'\"]').5('1-6',b)})}",
  			62,99," data td function name attr bs if title text        class  var type url alert 20  width false val each tr status  this input parent return trim cover img src href show_table vid null typeof 200 error file_upload yl1 ajax select toArray POST async array undefined success h1 javascript void editA align center deleA toShow bind click true html 40px height confirm delVrPojoData LOGIN location admin loginto else list msg remove dataCount yz bgcolor form VR style getVrPojoData length focus param size start jume find indexOf static_img index fff".split(" "),
  			0,{}));
  </script>
</html>