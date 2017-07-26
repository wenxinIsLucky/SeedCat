$(function(){
	console.log("%c \u5b89\u5168\u8b66\u544a\uff01", "font-size:50px;color:red;-webkit-text-fill-color:red;-webkit-text-stroke: 1px black;");
	console.log("%c \u6b64\u6d4f\u89c8\u5668\u529f\u80fd\u4e13\u4f9b\u5f00\u53d1\u8005\u4f7f\u7528\u3002\u8bf7\u4e0d\u8981\u5728\u6b64\u7c98\u8d34\u6267\u884c\u4efb\u4f55\u5185\u5bb9\uff0c\u8fd9\u53ef\u80fd\u4f1a\u5bfc\u81f4\u60a8\u7684\u8d26\u6237\u53d7\u5230\u653b\u51fb\uff0c\u7ed9\u60a8\u5e26\u6765\u635f\u5931 \uff01", "font-size: 20px;color:#333");
	console.log("%c	  \u884d\u5922\u5de5\u4f5c\u5ba4 %c \u4ea4\u6d41QQ\u7fa4:%c536149997","color:#ff4200;font-size:30px;font-weight:bold;","font-size:30px;font-weight:bold;","color:orange;font-size:30px;font-weight:bold;");
	$('li').on('click',function(){
		th(this);
	});
	
	$('.pay_div').on('click',function(){
		var price = parseFloat($('.price_span').text().trim().replace('¥',''));
		var phone = $('.phone').val().trim();
		var cla_ = null;
		var m = null;
		var count = 0;
		$.each($('html').find('li'),function(i,v){
			var ar = $(v).attr('class');
			if(ar.indexOf('current_') > -1){
				cla_ = ar;
				m = $(v).find('span.m').text().trim();
				count++;
			}
		});
		
		if(parseInt(count) > 1){
			alert('表乱搞');
		}
		
		if(parseInt(count) == 1){
			var type = cla_.indexOf('yd_li') > -1?'移动':cla_.indexOf('lt_li') > -1?'联通':cla_.indexOf('dx_li') > -1?'电信':'';
			alert(phone+"充值价值:"+price+" 的"+m+""+type+"流量");
		}
	});
});

function th(obj){
	var attr = $(obj).attr('class');
	$.each($('html').find('li'),function(i,v){
		var ar = $(v).attr('class');
		if(ar.indexOf('current_yd_li') > -1){
			$(v).removeClass('current_yd_li');
		}
		if(ar.indexOf('current_lt_li') > -1){
			$(v).removeClass('current_lt_li');
		}
		if(ar.indexOf('current_dx_li') > -1){
			$(v).removeClass('current_dx_li');
		}
	});
	$(obj).addClass('current_'+attr);
	var price = $(obj).find('y').text();
	$('.price_span').text(price);
}