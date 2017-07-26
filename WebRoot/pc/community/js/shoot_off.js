$(function(){
	jume(1,10);
});

function jume(start,size){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'findCommunityData',
		data : {examine:1,start:start,size:size,type:2},
		success : function(re){
			var strVar = "<h1>找不到你需要的帖子</h1>";
			if(re != null){
				if(re.list.length > 0){
					strVar = "";
					$.each(re.list,function(i,v){
						strVar+="<li class=\""+(i%2==0?"":"pis")+"\">";
						strVar+="<div class=\"Paikew-img\" style=\"position:relative;\">";
						strVar+="<div class=\"content_div\" style=\"display: none;\">"+v.title+"<\/div>";
						strVar+="<img src=\""+v.cover+"\" alt=\"\"/>";
						strVar+="<\/div>";
						strVar+="<div class=\"mijy_bj\" style=\"display: none;\" data-t=\""+v.cid+"\">";
						strVar+="<a href=\"javascript:void(0);\">";
						strVar+="<div class=\"mijy_border\">";
						strVar+="<div class=\"mijy_bj1\"><div class=\"mijy_bj1-c\"><\/div><\/div>";
						strVar+="<div class=\"mijy_bj2\"><div class=\"mijy_bj2-c\"><\/div><\/div>";
						strVar+="<div class=\"mijy_bj3\"><div class=\"mijy_bj3-c\"><\/div><\/div>";
						strVar+="<div class=\"mijy_bj4\"><div class=\"mijy_bj4-c\"><\/div><\/div>";
						strVar+="<\/div>";
						strVar+="<\/a>";
						strVar+="<\/div>";
						strVar+="<div class=\"Paikew-tex\">";
						strVar+="<div class=\"Paikew-tex-left fl\"><img src=\"/static_img/head/"+v.user.head+"\" alt=\"\"><span>"+v.user.name+"<\/span><div class=\"cl\"><\/div><\/div>";
						strVar+="<div class=\"Paikew-tex-righ fr\">";
						strVar+="<img src=\"pc/images2/xinf.png\"alt=\"\"><span>"+v.zan+"<\/span><div class=\"cl\"><\/div>";
						strVar+="<\/div>";
						strVar+="<\/div>";
						strVar+="<\/li>";
					});
				}
			}
			$('.post-Paikew').html(strVar);
			$('.page_p').remove();
			$('.bos_left').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'shoot_off-input',
					backFn : function(p){
						jume(p,re.size);
					}
	            });
			}
			$('.post-Paikew li').live('mouseenter',function(){
				$(this).find('.mijy_bj,.content_div').show();
			}).live('mouseleave',function(){
				$(this).find('.mijy_bj,.content_div').hide();
			});
			$('.mijy_bj').bind('click',function(){
				var datat = $(this).attr('data-t');
				var param = {
						param : "Browse",
						inwzid : datat
				};
				$.post('addCommunityAll',param,function(re){
					location.href='getCommunity/'+datat;
				});
			});
		},error : function(re){
			alert("数据正在完善");
		}
	});
}