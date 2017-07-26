$(function() {
	// 汇总
	$('li a').on('click', function() {
		// 获取当前点击元素的class
		var cls = $(this).attr('class');
		// 删除当前元素的curr_a样式
		$('.' + cls).removeClass('curr_a');
		// 添加当前元素curr_a样式
		$(this).addClass('curr_a');
		//存id
		var cbl = null;
		// 定义一个变量 用来接收当前点击的哪个大类
		var isParam = 0;
		if (cls.stringToEquels("kj")) {// 如果点击的是空间则进入方法体内
			isParam = 1;
			cbl = $(this).data('cl');
			getMeunValue(gsid);
		} else if (cls.stringToEquels("gn")) {// 如果点击的是功能则进入方法体内
			isParam = 2;
			cbl = $(this).data('cl');
		} else if (cls.stringToEquels("fg")) {// 如果点击的是风格则进入方法体内
			isParam = 3;
			cbl = $(this).data('cl');
		} else if (cls.stringToEquels("mj")) {// 如果点击的是面积则进入方法体内
			isParam = 4;
			cbl = $(this).data('cl');
		} /*else if (cls.stringToEquels("jg")) {// 如果点击的是价格则进入方法体内
			isParam = 5;
			jgv = $(this).data('cl');
		}*/
		// 往上添加当前点击的元素值
		$('.param' + isParam).attr('data-id',cbl);
		$('.param' + isParam).text("> " + $(this).text());
		/*
		 * var params = {start : 1,gsid : gsid,gtid : gtid,gmid : gmid};
		 * $.post('getDesignSketchByPage',params,function(re){
		 * if(re.status.isStatus() == -1){ alert("警告,你提交的数据中带有非法字符,请重新输入");
		 * return false; }else if(re.status.isStatus() == 1){
		 * $('.classification_content_zong_div').appendDesignSketchHtml(re);
		 * margJul(); } });
		 */
	});
	
	$('.price_bottom').on('click',function(){
		jisuanPrice();
		paramValue(1);
	});
	$('.min_price,.max_price').on('keyup',function(event){
		var key = event.keyCode;
		if(key == 13){
			jisuanPrice();
			paramValue(1);
		}
	});
	
	$('._zong_div a').on('click',function(){
		paramValue(1);
	});
});

function paramValue(page){
	var param1 = $('.param1').attr('data-id');
	var param2 = $('.param2').attr('data-id');
	var param3 = $('.param3').attr('data-id');
	var param4 = $('.param4').attr('data-id');
	var param5 = $('.param5').text().replaceAll(">","").replaceAll("元","");
	alert(param1+"--"+param2+"--"+param3+"--"+param4+"--"+param5);
	var params = appendAxajParam(param1,param4,param2,param3,param5,page);
	$.post('flipSee',params,function(re){
		$('.classification_content_zong_div').appendClassificationHtml(re);
		margJul();
		/*$.each(re.list,function(i,v){
			alert(i+"--"+v.gName);
		});*/
	});
	/*$.each(appendAxajParam(param1,param4,param2,param3,param5,1),function(i,v){
		alert(i+"--"+v);
	});*/
}

function jisuanPrice(){
	var min_price = $('.min_price').val();
	var max_price = $('.max_price').val();
	var min = min_price.trim().length==0?0:min_price;
	var max= max_price.trim().length==0?0:max_price;
	var price_value = min;
	if(max>0)
		price_value+="-"+max;
	$('.param5').text("> " + price_value+"元");
}

function getMeunValue(type) {
	alert(type);
	$.post('getMenuContent', {
		type : type
	}, function(re) {
		var gn = "";
		var fg = "";
		var mj = "";
		$.each(re.list, function(i, v) {
			$.each(v.goodsFunctions, function(k, va) {
				gn += '<li><a class="gn" href="javascript:void(0);" data-cl="'
						+ va.gfid + '">' + va.gfName + '</a></li>';
			});
		});
		$.each(re.list, function(i, v) {
			$.each(v.goodsStyles, function(k, va) {
				fg += '<li><a class="fg" href="javascript:void(0);" data-cl="'
						+ va.gtid + '">' + va.gtName + '</a></li>';
			});
		});
		$.each(re.list, function(i, v) {
			$.each(v.goodsMeasures, function(k, va) {
				mj += '<li><a class="mj" href="javascript:void(0);" data-cl="'
						+ va.gmid + '">' + va.gmName + 'm²</a></li>';
			});
		});
		$('.gn_zong_div .right_zong_div ul').empty().append(gn);
		$('.fg_zong_div .right_zong_div ul').empty().append(fg);
		$('.mj_zong_div .right_zong_div ul').empty().append(mj);
		$('.jg').removeClass('curr_a');
		$('.param2').empty();
		$('.param3').empty();
		$('.param4').empty();
		$('.param5').empty();
		$('head').loadJs({file:'pc/js/classification.js'});
	});
}

function appendAxajParam(gsid,gmid,gfid,gtid,price,startSize){
	var gmids = gmid.split('-');
	var min_gmid = gmids.length > 1?gmids[0]:gmid.trim().length>0?gmid:0;
	var max_gmid = gmids.length > 1?gmids[1]:0;
	
	var prices = price.split('-');
	var startPrice = prices.length > 1?prices[0]:price.trim().length>0?price:0;
	var endPrice = prices.length > 1?prices[1]:0;
	var ajaxParam = {
			gsid : gsid.trim().length>0?gsid:0,
			gmid : min_gmid,
			maxGmid : max_gmid,
			gfid : gfid.trim().length>0?gfid:0,
			gtid : gtid.trim().length>0?gtid:0,
			startPrice : startPrice,
			endPrice : endPrice,
			orderBy : 1,
			startSize : startSize,
			size : 12,
			type : 1
	};
	return ajaxParam;
}