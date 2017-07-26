$(function(){
	jumeFunction();
	
	$('.userinfo_left_div_ul li a').on('click',function(){
		$(this).parent().siblings().find('a').removeClass('current_a');
		$(this).addClass('current_a');
		var data_c = $(this).attr('data-c');
		if("myFootPrint".equels(data_c)){
			$('.userinfo_content_center_div').appendMallFootPrint();
			$('html').loadJs({file:'appliance/js/myFootPrint.js'});
		}else if("order".equels(data_c)){
			$('.userinfo_content_center_div').appendMallOrder();
			$('html').loadJs({file:'appliance/js/order.js'});
		}else if("address".equels(data_c)){
			$('.userinfo_content_center_div').appendMallAddress();
			$('html').loadJs({file:'appliance/js/mall_address.js'});
			cascdeInit('','','');
		}else if("collection".equels(data_c)){
			$('.userinfo_content_center_div').appendMallCollection();
			$('html').loadJs({file:'appliance/js/mall_collection.js'});
		}
	});
	
	$('.userinfo_content_order_title_ul li').on('click',function(){
		$(this).siblings().removeClass('current_li');
		$(this).addClass('current_li');
	});
});

function jumeFunction(){
	if("myFootPrint".equels(lucky)){
		$('.userinfo_content_center_div').appendMallFootPrint();
		$('html').loadJs({file:'appliance/js/myFootPrint.js'});
	}else if("order".equels(lucky)){
		$('.userinfo_content_center_div').appendMallOrder();
		$('html').loadJs({file:'appliance/js/order.js'});
	}else if("address".equels(lucky)){
		$('.userinfo_content_center_div').appendMallAddress();
		$('html').loadJs({file:'appliance/js/mall_address.js'});
		cascdeInit('','','');
	}else if("collection".equels(lucky)){
		$('.userinfo_content_center_div').appendMallCollection();
		$('html').loadJs({file:'appliance/js/mall_collection.js'});
	}
}