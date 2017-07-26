var fhValue = "";
$(function(){
	showComment(1);
	$('.zan_li').on('click',function(){
		if(zan===0){
			addJume("ZAN","","");
		}
	});
	$('.cai_li').on('click',function(){
		if(cai===0){
			addJume("CAI","","");
		}	
	});
	$('.huifu_li').on('click',function(){
		if(!isLo){
			ue.focus();
			ue.ready(function() {//编辑器初始化完成再赋值 
				$('#fastposteditor').attr('data-rt',0);
				ue.setContent("");  //赋值给UEditor 
			}); 
		}else{
			location.href='to-login';
		}
	});
	$('.forj').on('click',function(){
		var context = ue.getContent();
		if ($.trim(context).length <= 0) {
			alert("请填写内容");
			return;
		}
		alert(context.replace(fhValue,""));
		addJume("REPLY","发表回复出错，请稍后再试",context.replace(fhValue,""));
	});
	$('.shoucang_li').on('click',function(){
		if(shoucang===0){
			addJume("COLLECTIONPOST","收藏有误，请稍后再试","");
		}
	});
});
function addJume(param,msg,context){
	var json = {
			param : param,
			inwzid : $('.wzid').val(),
			incontext : context,
			replyType : $('#fastposteditor').attr('data-rt'),
			incid : $('#fastposteditor').attr('data-cd')
	};
	$.ajax({
		type : 'POST',
		async : false,
		url : 'addCommunityAll',
		data : json,
		dataType : "text",
		success : function(re){
			if(re === "LOGIN"){
				location.href='to-login';
			}else if(re === "SUCCESS"){
				location.reload();
			}else{
				if(msg != ""){
					alert(msg);
				}
			}
		},error : function(re){
			alert(re.status);
		}
	});
}

function showComment(start){
	var json = {
			wzid : $('.wzid').val(),
			start : start
	};
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getByArticleComment',
		data : json,
		success : function(re){
			var strVar = "";
			$.each(re.list,function(i,v){
				$.each(v,function(k,vv){
					if(vv.length > 1){
						strVar += "<div class=\"fore_poi\"><div class=\"fore_poi_left fl\">";
						strVar += "<img src=\"/static_img/head/"+vv[vv.length-1].user.head+"\" alt=\"\"><\/div>";
						strVar += "<div class=\"vsd\"><img src=\"pc/images2/v.jpg\" alt=\"\"><\/div>";
						strVar += "<div class=\"fore_poi_right fl\"><div class=\"poi1\">";
						strVar += "<div class=\"poi1_left fl\">"+vv[vv.length-1].user.name+"发表于"+vv[vv.length-1].createDate+" <\/div>";
						var floor = vv[vv.length-1].floor==1?'沙发':vv[vv.length-1].floor==2?'板凳':vv[vv.length-1].floor==3?'地板':vv[vv.length-1].floor+"楼";
						strVar += "<div class=\"poi1_right fr\"  id=\""+("floor"+vv[vv.length-1].floor)+"\" title=\""+(vv[vv.length-1].floor+"楼")+"\">"+floor+"<\/div>";
						strVar += "<div class=\"cl\"><\/div><\/div>";
						strVar += "<div class=\"poi2\">";
						$.each(vv,function(ii,kv){
							if(ii != vv.length-1){
								strVar += "<fieldset><legend>引用 <a href=\""+(location.href+"#floor"+kv.floor)+"\" style=\"color:#fa791b;\">"+kv.floor+"楼<\/a></legend><p>"+kv.context+"<\/p></fieldset>";
							}else{
								strVar += "<p style=\"display: block;\">"+kv.context+"<\/p>";
								
							}
						});
						strVar += "<\/div><div class=\"poi5\"><div class=\"poi5_one fl\">";
						strVar += "<a href=\"javascript:void(0);\" class=\"child_node_a\" data-cd=\""+vv[vv.length-1].cid+"\" data-name=\""+vv[vv.length-1].user.name+"\">回复<\/a><\/div>";
						//strVar += "<div class=\"poi5_two fl\"><a href=\"\">举报<\/a><\/div>";
						strVar += "<div class=\"cl\"><\/div><\/div>";
						strVar += "<div class=\"poi6\">来自 杍匠猫官网 <\/div><\/div><div class=\"cl\"> <\/div><\/div>";
					}else{
						$.each(vv,function(ii,kv){
							strVar += "<div class=\"fore_poi\"><div class=\"fore_poi_left fl\">";
							strVar += "<img src=\"/static_img/head/"+kv.user.head+"\" alt=\"\"><\/div>";
							strVar += "<div class=\"vsd\"><img src=\"pc/images2/v.jpg\" alt=\"\"><\/div>";
							strVar += "<div class=\"fore_poi_right fl\"><div class=\"poi1\">";
							strVar += "<div class=\"poi1_left fl\">"+kv.user.name+"发表于"+kv.createDate+" <\/div>";
							var floor = kv.floor==1?'沙发':kv.floor==2?'板凳':kv.floor==3?'地板':kv.floor+"楼";
							strVar += "<div class=\"poi1_right fr\" id=\""+("floor"+kv.floor)+"\" title=\""+(kv.floor+"楼")+"\">"+floor+"<\/div>";
							strVar += "<div class=\"cl\"><\/div><\/div>";
							strVar += "<div class=\"poi2\">";
							strVar += "<p>"+kv.context+"<\/p><\/div>";
							strVar += "<div class=\"poi5\"><div class=\"poi5_one fl\">";
							strVar += "<a href=\"javascript:void(0);\" class=\"child_node_a\" data-cd=\""+kv.cid+"\" data-name=\""+kv.user.name+"\">回复<\/a><\/div>";
							//strVar += "<div class=\"poi5_two fl\"><a href=\"\">举报<\/a><\/div>";
							strVar += "<div class=\"cl\"><\/div><\/div>";
							strVar += "<div class=\"poi6\">来自 杍匠猫官网 <\/div><\/div><div class=\"cl\"> <\/div><\/div>";
						});
					}
				});
			});
			
			$('#comment_div').html(strVar);
			$('.page_p').remove();
			$('#comment_div').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'communtiyInfo-input',
					backFn : function(p){
						showComment(p);
					}
	            });
			}
			$('.child_node_a').bind('click',function(){
				var obj = this;
				if(!isLo){
					ue.focus();
					ue.ready(function() {//编辑器初始化完成再赋值  
						var def = "回复 "+$(obj).attr('data-name')+":";
						fhValue = def;
						ue.setContent(def);  //赋值给UEditor 
						$('#fastposteditor').attr('data-rt',1);
						$('#fastposteditor').attr('data-cd',$(obj).attr('data-cd'));
					});  
				}else{
					location.href='to-login';
				}
			});
		},error : function(re){
			alert(re.status);
		}
	});
}