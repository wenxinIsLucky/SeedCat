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
<title>籽匠猫-他的访客</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="籽匠猫-他的访客">
<meta http-equiv="description" content="籽匠猫-他的访客">
<link rel="icon" href="pc/img/ymkj.ico" mce_href="pc/img/ymkj.ico"
	type="image/x-icon">
<link href="pc/user/css/common.min.css" rel="stylesheet">
<script src="pc/user/js/jquery.min.js"></script>
<script src="pc/js/liwenxin.js"></script>
<link rel="stylesheet" href="pc/css/liwenxin2.css"/>
<!--[if lte IE 8]>
	<script>'abbr article aside audio bdi canvas data datalist details dialog figcaption figure footer header hgroup main mark meter nav output picture progress section summary template subline time video'.replace(/\w+/g,function(n){document.createElement(n)});</script>
	<![endif]-->
</head>

<body>
	<div class="Wrap">
		<div class="Right">
			<dl class="Box">
				<dt>他的访客</dt>
				<dd class="Friends">
					<ul class="visitorul">

						<li class="Cb" aj-id="66033944"><a class="Follow "
							uid="66033944">关注</a> <a class="Avatar" href="javascript:void(0);"> <img
								src="pc/user/images/small1.jpg" alt="赵月思540"
								style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
								<i class="Dn"></i>
						</a>
							<h2>
								<a href="javascript:void(0);">赵月思540</a> <i class="0"></i> <span class="Group">Lv0.初生O粉</span>
							</h2>
							<p class="C999"></p></li>
						<li class="Cb" aj-id="71439631"><a class="Follow "
							uid="71439631">关注</a> <a class="Avatar" href="javascript:void(0);"> <img
								src="pc/user/images/small2.jpg" alt="姐Q1434663485"
								style="background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;">
								<i class="Dn"></i>
						</a>
							<h2>
								<a href="javascript:void(0);">姐Q1434663485</a> <i class="Female"></i> <span
									class="Group">Lv0.初生O粉</span>
							</h2>
							<p class="C999">不爱那么多，只爱一点点。</p></li>
					</ul>
					<p class="aj-loading hide"></p>
					<div class="Page Box Dn"></div>
				</dd>
			</dl>
		</div>
	</div>
	<!-- BEGIN FOOTER -->
</body>
<script type="text/javascript">
$(function(){
	jume(1,10);
});

function jume(start,size){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getVisitorData',
		data : {heuid:'${user.uid}',uid:parent.$(".useruid").val(),start:start,size:size},
		success : function(re){
			var strVar = "";
			if(re != null){
				if(re.status==200){
					if(re.countPage != 0){
						$.each(re.list,function(i,v){
						    strVar += "<li class=\"Cb\" aj-id=\"66033944\">";
						    if('${user.uid}' != v.visitor.uid){
								strVar += "<a class=\"Follow "+(v.isGz==1?'Followed':'')+"\" onclick=\"goFollow(\'"+v.visitor.uid+"\',"+v.isGz+","+v.fid+")\" >"+(v.isGz==1?'已关注':'关注')+"<\/a>";
							}
						    strVar += "<a class=\"Avatar\" href=\"javascript:void(0);\" onclick=\"goVisitor('"+v.visitor.uid+"')\">";
						    strVar += "<img src=\"/static_img/head/"+v.visitor.head+"\" alt=\""+v.visitor.name+"\" style=\"background: rgba(0, 0, 0, 0) none repeat scroll 0% 0%;\">";
						    strVar += "<i class=\"Dn\"><\/i><\/a>";
						    strVar += "<h2>";
						    strVar += "<a href=\"javascript:void(0);\" onclick=\"goVisitor('"+v.visitor.uid+"')\">"+v.visitor.name+"<\/a><i class=\""+(v.visitor.sex=='0'?'Female':v.visitor.sex=='1'?'Male':'0')+"\"><\/i><span class=\"Group\">Lv"+v.visitor.lel+"."+v.visitor.grade+"<\/span>";
						    strVar += "<\/h2>";
						    strVar += "<p class=\"C999\"><\/p><\/li>";
						});
					}
				}else if(re.status === 404){
					location.href=re.url;
				}
			}
			$('.visitorul').html(strVar);
			$('.page_p').remove();
			$('.visitorul').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'hevisitor-input',
					backFn : function(p){
						jume(p,re.size);
					}
	            });
			}
		},error : function(re){
			alert(re.status);
		}
	});
}

function goFollow(heuid,type,f){
	if(parseInt(type) === 1){
		toFollow(heuid,f);
	}else{
		$.ajax({
			type : 'POST',
			async : false,
			url : 'addFollowData',
			data : {'follow.uid':heuid},
			success : function(re){
				if(re.status === 200){
					location.reload();
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
}

function toFollow(heuid,fid){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'delFollowData',
		data : {'follow.uid':heuid,fid:fid},
		success : function(re){
			if(re.status === 200){
				alert(re.msg);
				location.reload();
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

function goVisitor(heuid){
	if('${user.uid}' != heuid){
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
	}else{
		location.href = 'to-user-index';
	}
}
</script>
</html>
