$(function(){
	$('.check_p img').on('click',function(){
		var zong_price = 0;
		var img_size = $('.check_p img').size();
		var bl_size = 0;
		var img_src = $(this).attr('src').trim();
		if(img_src.indexOf('checked_1.png') > -1){
			$(this).attr('src',img_src.replace('checked_1.png','checked_2.png'));
		}else if(img_src.indexOf('checked_2.png') > -1){
			$(this).attr('src',img_src.replace('checked_2.png','checked_1.png'));
		}
		
		$.each($('.check_p img'),function(i,v){
			var v_img_src = $(v).attr('src').trim();
			if(v_img_src.indexOf('checked_2.png') > -1){
				var html = $(v).parent().parent();
				var h = $(html).find('div.shopping_goods_money').text();
				zong_price = parseFloat(zong_price).mul(100).add(parseFloat(h.replaceAll('¥','')).mul(100)).div(100);
				bl_size++;
			}
		});
		
		if(parseInt(img_size) == parseInt(bl_size)){
			$('.check_all_img').attr('src',img_src.replace('checked_1.png','checked_2.png'));
		}else if(parseInt(img_size) > parseInt(bl_size)){
			$('.check_all_img').attr('src',img_src.replace('checked_2.png','checked_1.png'));
		}
		$('.selected_a_few_pieces').text(bl_size);
		$('.settlement_amount_span').text('¥'+zong_price);
	});
	
	$('.check_all_img').on('click',function(){
		var zong_price = 0;
		var selected = 0;
		var check_all = $(this).attr('src').trim();
		if(check_all.indexOf('checked_1.png') > -1){
			$('.check_p img').attr('src',check_all.replace('checked_1.png','checked_2.png'));
			$('.check_all_img').attr('src',check_all.replace('checked_1.png','checked_2.png'));
			$.each($('.check_p img'),function(i,v){
				var html = $(v).parent().parent();
				var h = $(html).find('div.shopping_goods_money').text();
				zong_price = parseFloat(zong_price).mul(100).add(parseFloat(h.replaceAll('¥','')).mul(100)).div(100);
			});
			selected = $('.check_p img').size();
		}else if(check_all.indexOf('checked_2.png') > -1){
			$('.check_p img').attr('src',check_all.replace('checked_2.png','checked_1.png'));
			$('.check_all_img').attr('src',check_all.replace('checked_2.png','checked_1.png'));
		}
		$('.selected_a_few_pieces').text(selected);
		$('.settlement_amount_span').text('¥'+zong_price);
	});
	
	$('.shopping_goods_num_jian').on('click',function(){
		var obj = xzobj(this);
		if(parseInt($('.shopping_goods_num_input',obj).val()) > 1){
			$('.shopping_goods_num_input',obj).val(parseInt($('.shopping_goods_num_input',obj).val()).sub(1));
			var price = parseFloat($('.shopping_goods_price',obj).text().replaceAll('¥',''));
			jieguo(obj,price);
		}
	});
	
	$('.shopping_goods_num_jia').on('click',function(){
		var obj = xzobj(this);
		var price = parseFloat($('.shopping_goods_price',obj).text().replaceAll('¥',''));
		$('.shopping_goods_num_input',obj).val(parseInt($('.shopping_goods_num_input',obj).val()).add(1));
		jieguo(obj,price);
	});
	
	$('.shopping_goods_caozuo').on('click',function(){
		var txt = $(this).attr('data-del');
		alert(txt);
		var html = $(this).parent();
		html.remove();
		var zong_price = 0;
		var selected = 0;
		$.each($('.check_p img'),function(i,v){
			var v_img_src = $(v).attr('src').trim();
			if(v_img_src.indexOf('checked_2.png') > -1){
				var html = $(v).parent().parent();
				var h = $(html).find('div.shopping_goods_money').text();
				zong_price = parseFloat(zong_price).mul(100).add(parseFloat(h.replaceAll('¥','')).mul(100)).div(100);
				selected++;
			}
		});
		$('.selected_a_few_pieces').text(selected);
		$('.settlement_amount_span').text('¥'+zong_price);
	});
	
	$('.del_all_a').on('click',function(){
		var bl_size = 0;
		$.each($('.check_p img'),function(i,v){
			var v_img_src = $(v).attr('src').trim();
			if(v_img_src.indexOf('checked_2.png') > -1){
				var html = $(v).parent().parent();
				html.remove();
				bl_size++;
			}
		});
		if(bl_size == 0){
			alert('你没有选中任何商品!');
			return;
		}
		$('.selected_a_few_pieces').text('0');
		$('.settlement_amount_span').text('¥0');
	});
});

function xzobj(bs){
	var obj = null;
	$.each($('.shopping_goods_div'),function(i,v){
		if($(v).attr('data-bs').equels($(bs).attr('data-bs'))){
			obj = $(v);
			return;
		}
	});
	return obj;
}

function jieguo(obj,price){
	var zong_price = 0;
	var selected = 0;
	var num = parseInt($('.shopping_goods_num_input',obj).val());
	$('.shopping_goods_money',obj).text('¥'+price.mul(100).mul(num).div(100));
	$.each($('.check_p img'),function(i,v){
		var v_img_src = $(v).attr('src').trim();
		if(v_img_src.indexOf('checked_2.png') > -1){
			var html = $(v).parent().parent();
			var h = $(html).find('div.shopping_goods_money').text();
			zong_price = parseFloat(zong_price).mul(100).add(parseFloat(h.replaceAll('¥','')).mul(100)).div(100);
			selected++;
		}
	});
	$('.selected_a_few_pieces').text(selected);
	$('.settlement_amount_span').text('¥'+zong_price);
}