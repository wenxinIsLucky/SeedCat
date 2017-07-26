(function($){
	/**
	 * 显示收藏的帖子html
	 */
	/*$.fn.beforeArticleHtml = function(options){
		var obj = this;
		//obj.empty()
		var html = '<div class="articleCollection_div">';
		
		$.each(options.re.list,function(i,v){
			html += '<div data-div="'+$.trim(v.cid)+'" class="one_zong_article_div"><div class="date_div_palan">';
			html += '<span>'+v.createDate.substring(0,10)+'</span></div>';
			html += '<div class="content_article_div"><img onclick="articleJume(\''+$.trim(v.article.aid)+'\');" alt="封面" src="'+urls+'pc/images/'+v.article.head+'">';
			var title = v.article.title.length > 24 ? v.article.title.substring(0,22)+'...' : v.article.title;
			html += '<p title="'+v.article.title+'" onclick="articleJume(\''+$.trim(v.article.aid)+'\');">'+title+'</p>';
			html += '</div><div class="qx_div_button" data-c="'+v.cid+'">取消收藏</div></div>';
		});
		
		html += '</div>';
		obj.before(html);
	};*/
	
	$.fn.beforeArticleHtml = function(options){
		var obj = this;
		//obj.empty()
		var html = '';
		if("articleCollection".equels(options.type)){
			html += '<ul class="article_ul">';
		}else if("articleFootPrint".equels(options.type)){
			html += '<ul class="article_ul_fp">';
		}
		$.each(options.re.list,function(i,v){
			var tstit = v.article.isSystem==1?'官方发帖':v.article.isFp==1?'精品帖子':v.article.isTop==1?'置顶':'';
			var imgr = v.article.isSystem==1?'back-img back-pos-guan':v.article.isFp==1?'back-img back-pos-jing':v.article.isTop==1?'back-img back-pos-top':'';
			if("articleCollection".equels(options.type)){
				html += '<li data-li="'+$.trim(v.cid)+'"><span title="'+tstit+'" class="'+imgr+' back-span img0"></span><a target="_blank" href="getArticle'+$.trim(v.article.aid)+'Defailt">'+v.article.title+'</a><span data-c="'+v.cid+'" onclick="quxiao(this);" class="qx_span">取消收藏</span><span class="rq_span">'+v.createDate.substring(0,10)+'</span></li>';
			}else if("articleFootPrint".equels(options.type)){
				var strVar = "";
				html += "<li class=\"article_li_fp\"><span title=\""+tstit+"\" class=\""+imgr+" back-span img0\"></span><a href=\"javascript:void(0);\">"+v.article.title+"<\/a><span class=\"article_scjl_a_fp\" data-article=\""+$.trim(v.fid)+"\" onclick=\"cancelFootPrintArticle(this);\">删除记录<\/span><span class=\"article_sj_fp\">"+v.createDate.substring(0,10)+"<\/span><\/li>";
			}
		});
		
		html += '</ul>';
		obj.before(html);
	};
	
	/**
	 * 显示收藏的效果图html
	 */
	$.fn.beforeDesignSketchHtml = function(options){
		var obj = this;
		//obj.empty()
		var strVar = "";
		
		$.each(options.re.list,function(i,v){
			strVar += "<div class=\"classification_content_div\"><div class=\"classification_img_div\">";
			strVar += "<a target=\"_blank\" href=\"getDesignSketchDetailso"+$.trim(v.designSketch.dsid)+"\" class=\"img_a\">";
			var srcs = v.designSketch.imgs.split(',');
			strVar += "<img src=\"pc/img/"+srcs[0]+"\"/>";
			strVar += "<\/a>";
			strVar += "<div class=\"fc_rq_div\"><y>"+v.createDate.substring(0,10)+"</y></div>";
			strVar += "<div class=\"fc_qx_div\">";
			if("designsketchFootPrint".equels(options.type)){
				strVar += "<a href=\"javascript:void(0);\" onclick=\"cancelFootPrintDsg(this);\" class=\""+$.trim(v.fid)+"\">删除记录</a></div>";
			}else if("designsketchCollection".equels(options.type)){
				strVar += "<a href=\"javascript:void(0);\" onclick=\"cancelCollection(this);\">取消收藏</a></div>";
			}
			strVar += "<a target=\"_blank\" href=\"getDesignSketchDetailso"+$.trim(v.designSketch.dsid)+"\" class=\"classification_txt_a\">"+v.designSketch.title+"<\/a>";
			strVar += "<span>"+v.designSketch.imgCount+"张<\/span>";
			strVar += "<\/div><\/div>";
		});
		
		obj.before(strVar);
	};
	
	/**
	 * 分页拼接效果图列表页面
	 */
	$.fn.appendDesignSketchHtml = function(options){
		var obj = this;
		obj.empty();
		var strVar = "";
		if(options.list.length != 0){
			$('.typeNone').hide();
			
			$.each(options.list,function(i,v){
				strVar += "<div class=\"classification_content_div\"><div class=\"classification_img_div\">";
				strVar += "<a target=\"_blank\" href=\"getDesignSketchDetails"+v.dsid+"\">";
				var srcs = v.imgs.split(',');
				strVar += "<img src=\"pc/img/"+srcs[0]+"\"/>";
				strVar += "<\/a>";
				strVar += "<a target=\"_blank\" href=\"getDesignSketchDetails"+v.dsid+"\" class=\"classification_txt_a\">"+v.title+"<\/a>";
				strVar += "<span>"+v.imgCount+"张<\/span>";
				strVar += "<\/div><\/div>";
			});
		}else{
			$('.typeNone').show();
		}
		obj.append(strVar);
	};
	
	/**
	 * 拼接搜索页面商品的html
	 */
	$.fn.appendSearchHtml = function(options){
		var obj = this;
		obj.empty();
		var strVar = "";
		if(options.list.length != 0){
			$.each(options.list,function(i,v){
				strVar += "<div class=\"classification_content_div left\"><div class=\"classification_img_div\">";
				strVar += "<a target=\"_blank\" href=\"goodsDesc/"+v.gid+"\">";
				var srcs = v.heads.split(',');
				strVar += "<img src=\"pc/img/"+srcs[0]+"\"/>";
				strVar += "<\/a>";
				strVar += "<a target=\"_blank\" href=\"goodsDesc/"+v.gid+"\" class=\"classification_txt_a\">"+v.gName+"<\/a>";
				strVar += "<\/div><\/div>";
			});
		}else{

		}
		obj.append(strVar);
	};
	
	/**
	 * 分类查看Classification拼接
	 */
	$.fn.appendClassificationHtml = function(options){
		var obj = this;
		obj.empty();
		var strVar = "";
		if(options.list == null || options.list == 'null'){
			alert('小伙子你不老实啊~v~');
		}
		if(options.list.length != 0){
			$.each(options.list,function(i,v){
				strVar += "<div class=\"classification_content_div\">";
			    strVar += "<div class=\"classification_img_div\">";
			    strVar += "<a href=\"goodsDesc/"+v.gid+"\" target=\"_blank\">";
			    var imgs = v.heads.split(',');
			    strVar += "<img src=\"pc/img/"+imgs[0]+"\"/>";
			    strVar += "<\/a>";
			    strVar += "<a href=\"goodsDesc/"+v.gid+"\" target=\"_blank\" class=\"classification_txt_div\">"+v.gName+"<\/a>";
			    strVar += "<\/div>";
			    strVar += "<\/div>";
			});
		}else{
			alert('该条件下没有商品');
		}
	    obj.append(strVar);
	}
})(jQuery);
/**
 * 判断状态
 */
Number.prototype.isStatus = function(){
	var result = -1;
	if(parseInt(this) == 200){
		result = 1;
	}else if(parseInt(this) == 404){
		result = 0;
	}else if(parseInt(this) == 500){
		result = -1;
	}
	return result;
};