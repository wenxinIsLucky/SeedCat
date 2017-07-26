$(function(){
	$(".xgt__page_div").createPage({
		pageCount : f_p.xpc,
		current : f_p.xcr,
		input_name : 'xgt_v',
		backFn : function(p) {
			if(!footpringIs){
				footpringIs = true;
				if(!isNaN(p)){
					var params = {
							gType : 'designsketch',
							size : 6,
							start : p
					};
					$.post('seeMyFootPrintPage',params,function(re){
						footpringIs = false;
						if(re.status.isStatus() == -1){
							tsk('警告,你提交的数据中带有非法字符或html和js注入！');
						}else if(re.status.isStatus() == 0){
							location.href = 'transferPagepersonalCenter,zj';
						}else if(re.status.isStatus() == 1){
							$('.xgt_ .classification_content_div').remove();
							$('.xgt__page_div').beforeDesignSketchHtml({re : re,type : 'designsketchFootPrint'});
							f_p.xpc = re.countPage;
							f_p.xcr = re.start;
							margJul('.xgt_ .classification_content_div');
						}
					});
				}
			}
		}
	});
	
	
	$(".article__page_div").createPage({
		pageCount : f_p.apc,
		current : f_p.acr,
		input_name : 'article_v',
		backFn : function(p) {
			if(!isNaN(p)){
				var params = {
						gType : 'article',
						size : 12,
						start : p
					};
				$.post('seeMyFootPrintPage',params,function(re){
					if(re.status.isStatus() == -1){
						tsk('警告,你提交的数据中带有非法字符或html和js注入！');
					}else if(re.status.isStatus() == 0){
						location.href = 'transferPagepersonalCenter,zj';
					}else if(re.status.isStatus() == 1){
						$('.article_ .classification_content_div').remove();
						$('.article__page_div').beforeArticleHtml({re : re,type : 'articleFootPrint'});
						f_p.apc = re.countPage;
						f_p.acr = re.start;
					}
				});
			}
		}
	});
});

function cancelFootPrintDsg(v){
	if(!footpringIs){
		footpringIs = true;
		var fid = $(v).attr('class');
		$.post('delMyFootPrint',{fid:fid},function(re){
			footpringIs = false;
			if("SUCCESS".equels(re)){
				$.each($('.xgt_ .classification_content_div'),function(i,vv){
					if(parseInt($(vv).find('.'+fid).attr('class')) == parseInt(fid)){
						$(vv).remove();
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
}

function cancelFootPrintArticle(v){
	if(!footpringIs){
		footpringIs = true;
		var fid = $(v).data('article');
		$.post('delMyFootPrint',{fid:fid},function(re){
			footpringIs = false;
			if("SUCCESS".equels(re)){
				$.each($('.article_ .article_ul_fp .article_li_fp'),function(i,vv){
					if(parseInt($(vv).find('.article_scjl_a_fp').data('article')) == parseInt(fid)){
						$(vv).remove();
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
}