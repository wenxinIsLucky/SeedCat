$(function(){
	loadMyPost(1,10);
	$('.post_tab_p_div li').bind('click',function(){
		$(this).siblings().removeAttr('class');
		$(this).addClass('public_curr_a_click');
		var fp = $(this).find('a').data('post');
		var showB = "";
		if(testTwoStringToEquels(fp,"mypost")){
			showB = "one";
			$('.post_content_ul_two').hide();
			$('.post_content_ul_three').hide();
			var tj = $('.post_content_ul_'+showB).find('li').html();
			if(typeof(tj) == "undefined"){
				loadMyPost(1,10);
			}
		}else if(testTwoStringToEquels(fp,"mycomment")){
			showB = "two";
			$('.post_content_ul_one').hide();
			$('.post_content_ul_three').hide();
			var tj = $('.post_content_ul_'+showB).find('.post_content_ul_div').html();
			if(typeof(tj) == "undefined"){
				loadComment(0,1,10);
			}
		}else if(testTwoStringToEquels(fp,"receivedComment")){
			showB = "three";
			$('.post_content_ul_one').hide();
			$('.post_content_ul_two').hide();
			var tj = $('.post_content_ul_'+showB).find('.post_content_ul_div').html();
			if(typeof(tj) == "undefined"){
				loadComment(1,1,10);
			}
		}
		$('.post_content_ul_'+showB).show();
	});
});

function loadMyPost(start,size){
	$.post(urls+'getArticlesByPage',{'start':start,'size':size},function(re){
		if(re.status == 404){
			location.href=urls+'transferPagepersonalCenter';
			return;
		}else if(re.status == 500){
			tsk("警告,你提交的数据中带有非法字符或html和js注入！");
			return;
		}else if(re.status == 200){
			var strVar = "";
			$('.post_content_ul_one li').remove();
			$.each(re.list,function(i,v){
				strVar += "<li>";
				var tstit = v.isSystem==1?'官方发帖':v.isFp==1?'精品帖子':v.isTop==1?'置顶':'';
				var imgr = v.isSystem==1?'back-img back-pos-guan':v.isFp==1?'back-img back-pos-jing':v.isTop==1?'back-img back-pos-top':'';
				strVar += "<span title=\""+tstit+"\" class=\""+imgr+" back-span img0\"></span>";
				strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.aid+"Defailt")+"\" class=\"post_content_title\" title=\""+v.title+"\">"+v.title+"<\/a>";//<y class=\"post_content_num\">回复(13)<\/y>
				strVar += "<span class=\"post_content_date\">"+v.createDate.substring(0,10)+"<\/span>";
				strVar += "<\/li>";
			});
			$('.myPost_page_div_one').before(strVar);
		}
	});
}

function loadComment(type,start,size){
	$.post(urls+'findPostRemindersByPage',{'type':type,'start':start,'size':size},function(re){
		if(re.status == 404){
			location.href=urls+'transferPagepersonalCenter';
			return;
		}else if(re.status == 500){
			tsk("警告,你提交的数据中带有非法字符或html和js注入！");
			return;
		}
		var strVar = "";
		var count = 0;
		if(type==0){
			$('.post_content_ul_div').remove();
			$.each(re.list,function(i,v){
			    strVar += "<div class=\"post_content_ul_div\">";
			    strVar += "<p class=\"post_content_ul_div_one\">";
			    strVar += "<span class=\"post_content_ul_div_p_one\">回复<\/span><span class=\"post_content_ul_div_p_two\">"+v.createDate.substring(0,10)+"<\/span>";
			    strVar += "<\/p>";
			    strVar += "<div class=\"post_content_ul_div_centen\">";
			    strVar += "<p>";
			    strVar += "<img src=\""+urls+"pc/img/yh_0.png\"/>";
			    strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.wzid+"Defailt#floor"+v.floor)+"\" class=\"post_content_title\">"+v.myContent+"<\/a>";
			    strVar += "<img src=\""+urls+"pc/img/yh_1.png\"/>";
			    strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.wzid+"Defailt#floor"+v.floor)+"\" class=\"post_content_hf\">回复<\/a>";
			    strVar += "<\/p>";
			    strVar += "<\/div>";
			    strVar += "<div class=\"post_content_ul_div_bottom\">";
			    strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.wzid+"Defailt")+"\" class=\"post_content_bottom\">"+v.title+"<\/a>";
			    //strVar += "<a href=\"javascript:void(0);\" class=\"post_content_hf\">回复(176)<\/a>";
			    strVar += "<\/div>";
			    strVar += "<\/div>";
			    count = v.countNum;
			});
			$('.myPost_page_div_two').before(strVar);
			$(".myPost_page_div_two").createPage({
				pageCount : count,
				current : start,
				input_name : "my_comment",
				backFn : function(p) {
					loadComment(0,p,10);
				}
			});
		}else if(type==1){
			$('.post_content_ul_div_three').remove();
			$.each(re.list,function(i,v){
				strVar += "<div class=\"post_content_ul_div_three\">";
			    strVar += "<div class=\"post_content_ul_div_centen\">";
			    strVar += "<p>";
			    strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.wzid+"Defailt#floor"+v.floor)+"\" class=\"post_content_bottom\">"+v.content+"<\/a>";
			    strVar += "<\/p>";
			    strVar += "<span class=\"post_content_ul_div_p_three\">"+v.createDate.substring(0,10)+"<\/span>";
			    strVar += "<\/div>";
			    strVar += "<div class=\"post_content_ul_div_bottom_three\">";
			    strVar += "<span class=\"post_bottom_three_title_span\">"+v.hfType+"：“<\/span>";
			    strVar += "<a target=\"_blank\" href=\""+(urls+"getArticle"+v.wzid+"Defailt")+"\" class=\"post_000\">"+v.title+"<\/a>";
			    strVar += "<span class=\"post_bottom_three_title_span\">”<\/span>";
			    strVar += "<\/div>";
			    strVar += "<\/div>";
			    count = v.countNum;
			});
			$('.myPost_page_div_three').before(strVar);
			if(count > 0){
				$(".myPost_page_div_three").createPage({
					pageCount : count,
					current : start,
					input_name : "my_receivedComment",
					backFn : function(p) {
						loadComment(1,p,10);
					}
				});
			}
		}
	});
}