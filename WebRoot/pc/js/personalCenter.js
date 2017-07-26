$(function() {
	$('.wdgd').hide();
	$('.zxrj').hide();
	$('.zxfw').hide();
	$('.jfmf').hide();
	$(".article_page_div").createPage({
		pageCount : pc.apc,
		current : pc.acr,
		input_name : 'article_p',
		backFn : function(p) {
			if(!isNaN(p) && parseInt(p) > 0){
				var gType = 'article';
				/*$.each($('.pp'),function(i,v){
					if($(v).attr('class').indexOf('lll') > -1){
						gType = $(v).data('lu');
					}
				});*/
				alert(p);
				var para = {'gType' : gType,'start' : p,'size':12};
				$.post('seeMyCollectionByPage',para,function(re){
					if(re.status.isStatus() == -1){
						tsk('警告,你提交的数据中带有非法字符或html和js注入');
					}else if(re.status.isStatus() == 0){
						location.href = 'transferPagepersonalCenter,sc';
					}else if(re.status.isStatus() == 1){
						$('.article_ul li').remove();
						$('.article_page_div').beforeArticleHtml({re : re,type:'articleCollection'});
						pc.apc = re.countPage;
						pc.acr = re.start;
						//$('head').loadJs({file : 'pc/js/personalCenter.js'});
					}
				});
			}
		}
	});
	
	$(".designSketch_page_div").createPage({
		pageCount : pc.dpc,
		current : pc.dcr,
		input_name : 'designSketch_p',
		backFn : function(p) {
			if(!isNaN(p)){
				var para = {start : p};
				$.post('seeDesignSketchCollectionByPage',para,function(re){
					if(re.status.isStatus() == -1){
						tsk('警告,你提交的数据中带有非法字符或html和js注入！');
					}else if(re.status.isStatus() == 0){
						location.href = 'transferPagepersonalCenter';
					}else if(re.status.isStatus() == 1){
						$('.classification_content_div').remove();
						$('.designSketch_page_div').beforeDesignSketchHtml({re : re,type : 'designsketchCollection'});
						pc.dpc = re.countPage;
						pc.dcr = re.start;
						margJul('.classification_content_div');
					}
				});
			}
		}
	});
});
/*帖子*/
function articleJume(article){
	window.open("getArticle"+article+"Defailt");
}
function cancelCollection(v){
	var oldUrl = $(v).parent().parent().find('.img_a').attr('href');
	var newPar = oldUrl.substring("getDesignSketchDetailso".length,oldUrl.length);
	$.post('cancelDesignSketchCollection',{dsid:newPar},function(re){
		if("SUCCESS".equels(re)){
			$.each($('.designSketch .classification_content_div'),function(i,y){
				if($(y).find('.img_a').attr('href').indexOf(newPar) > -1){
					$(y).remove();
				}
			});
		}else if("LOGIN".equels(re)){
			location.href = 'transferPagepersonalCenter';
		}else if("FAIL".equels(re)){
			alert("网络有误！请稍后再试");
		}else if("ALERT".equels(re)){
			alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
		}
	});
}
function quxiao(v){
	if(!luckyIsok){
		luckyIsok = true;
		var cid = $(v).data('c');
		var params = {cid : cid};
		$.post('delMyCollection',params,function(re){
			if(testTwoStringToEquels(re,"SUCCESS")){
				$.each($('.article_ul li'),function(i,v){
					if(testTwoStringToEquels($(v).data('li'),cid)){
						$(v).remove();
					}
				});
			}else if(testTwoStringToEquels(re,"FAIL")){
				tsk("网络有误,请稍后再试");
			}else if(testTwoStringToEquels(re,"ALERT")){
				tsk("警告,你提交的数据中带有非法字符或html和js注入！");
			}else if(testTwoStringToEquels(re,"LOGIN")){
				location.href = 'transferPagepersonalCenter,sc';
			}
		});
		luckyIsok = false;
	}
}