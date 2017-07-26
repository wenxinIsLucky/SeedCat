$(document).ready(function () {
	var top = $('.goodsDetailed_content_div_bottom_title').offset().top;
	$(window).scroll(function () {
		console.log($(window).scrollTop()+"/"+top);
		if($(window).scrollTop() > top){
			$('.goodsDetailed_content_div_bottom_title').addClass('top_fixed');
			$('.bottom_title_right').removeClass('none');
		}else{
			$('.goodsDetailed_content_div_bottom_title').removeClass('top_fixed');
			$('.bottom_title_right').addClass('none');
		}
	});
});
$(function(){
	$('.fd img').imgMagnifier({
		showTag : '.fd_show',
		background_img : 'appliance/images/dian.png',
		size : 200
	});
	
	$('.goods_num_jian').on('click',function(){
		if(parseInt($('.goods_num_input').val()) > 1){
			$('.goods_num_input').val(parseInt($('.goods_num_input').val()).sub(1));
		}
	});
	
	$('.goods_num_jia').on('click',function(){
		if(parseInt($('.goods_num_input').val()) < 99999){
			$('.goods_num_input').val(parseInt($('.goods_num_input').val()).add(1));
		}
	});
	
	$('.imgs_div ul li').on('mousemove',function(){
		$(this).siblings().find('img').removeClass('current_img');
		$(this).find('img').addClass('current_img');
		$('.fd img').attr('src',$(this).find('img').attr('src'));
	});
	
	$('.div_a_sc').hover(function(){
		var dat = $(this).find('span').attr('data-span');
		if(parseInt(dat) == 0){
			$(this).find('img').attr('src',$(this).find('img').attr('src').replace('wjx_1.png','wjx_2.png'));
			$(this).find('span').removeClass('color_baaa99').addClass('color_4200');
		}
	},function(){
		var dat = $(this).find('span').attr('data-span');
		if(parseInt(dat) == 0){
			$(this).find('img').attr('src',$(this).find('img').attr('src').replace('wjx_2.png','wjx_1.png'));
			$(this).find('span').removeClass('color_4200').addClass('color_baaa99');
		}
	});
	
	$('.div_a_sc').on('click',function(){
		$(this).find('img').attr('src',$(this).find('img').attr('src').replace('wjx_1.png','wjx_2.png'));
		$(this).find('span').removeClass('color_baaa99').addClass('color_4200');
		$(this).find('span').text('已收藏');
		$(this).find('span').attr('data-span','1');
	});
	
	$('.goods_button_addShoppingCart').on('click', addProduct);
	
	$('.bottom_title_right').on('click',function(){
		 var speed=200;//滑动的速度
	     $('body,html').animate({ scrollTop: 0 }, speed);
	     return false;
	});
});
function addProduct(event) {
	var offset = $(".shoppingCart_a").offset();
	//抛物线图片，可自行更改
	var src = $('.fd').find('img').attr('src');
	flyer = $('<img src="'+src+'" style="width:80px;height:80px;" />');
	flyer.fly({
		start : {
			left : event.pageX,
			top : event.pageY
		},
		end : {
			left : offset.left,
			top : offset.top,
			//抛物线完成后留在页面上的图片大小
			width : 0,
			height : 0
		}
	});
	//去后台去购物车中的种类
	var text = parseInt($('.lucky_lwx').text());
	var num = text += 1;
	$('.lucky_lwx').text(num);
}