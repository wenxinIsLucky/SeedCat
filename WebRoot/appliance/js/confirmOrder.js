$(function(){
	$('.confirmOrder_address_div').on('click',function(){
		$(this).siblings().removeClass('current_address_div');
		$(this).siblings().find('l').addClass('none');
		$(this).siblings().find('u').addClass('none');
		$(this).siblings().find('div.triangle-bottomright').addClass('none');
		$(this).siblings().find('lwx.szxs').addClass('none');
		
		$(this).addClass('current_address_div');
		$(this).find('l').removeClass('none');
		$(this).find('u').removeClass('none');
		$(this).find('div.triangle-bottomright').removeClass('none');
		$(this).find('lwx').removeClass('none');
	});
	
	$('.szxs').on('click',function(){
		var data_de = $(this).attr('data-de');
		$('lwx.default').text('设为默认');
		$('lwx.default').addClass('szxs none');
		$('lwx.default').removeClass('default');
		
		$(this).text('默认地址');
		$(this).addClass('default');
		$(this).removeClass('szxs');
		alert(data_de);
	});
	
	$('.confirmOrder_address_div u').on('click',function(){
		var obj = $(this).parent();
		var lwx_attr = $('lwx',obj).attr('data-de');
		var lwx_class = $('lwx',obj).attr('class');
		
		var sheng = $('sheng',obj).text();
		var shi = $('shi',obj).text();
		var qu = $('qu',obj).text();
		var info = $('info',obj).text();
		var phone = $('phone',obj).text();
		var name = $('name',obj).text();
		$('.mask_content_title_span').text('修改地址');
		$('.add_p').text('修改收货地址');
		$('.mask_div').removeClass('none');
		publicTag(info,name,phone);
		if(lwx_class.indexOf('default') > -1){
			$('.check_p_two img').attr('src',$('.check_p_two img').attr('src').replace('checked_1.png','checked_2.png'));
		}
		cascdeInit(sheng,shi,qu);
	});
	
	$('.new_address_div_button').on('click',function(){
		$('.mask_content_title_span').text('创建地址');
		$('.add_p').text('新增收货地址');
		$('.mask_div').removeClass('none');
		
		publicTag('','','');
		
		cascdeInit('北京市','','');
	});
	
	$('close').on('click',function(){
		$('.mask_div').addClass('none');
	});
	
	$('.check_p_two img').on('click',function(){
		var v = $(this);
		var src = $(v).attr('src');
		if(src.indexOf('checked_1.png') > -1){
			$(v).attr('src',src.replace('checked_1.png','checked_2.png'));
		}else if(src.indexOf('checked_2.png') > -1){
			$(v).attr('src',src.replace('checked_2.png','checked_1.png'));
		}
	});
	
	$('.bc_div_button').on('click',function(){
		alert('保存');
	});
});

function publicTag(info,name,phone){
	$('textarea[name="info"]').text(info);
	$('input[name="name"]').val(name);
	$('input[name="phone"]').val(phone);
	$('.check_p_two img').attr('src',$('.check_p_two img').attr('src').replace('checked_2.png','checked_1.png'));
}