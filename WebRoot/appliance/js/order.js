$(function(){
	$('.userinfo_order_page').createPage({
		pageCount : 5,
		current : 1,
		input_name : 'userinfo_order',
		backFn : function(p){
			
		}
	});
	
	$('.userinfo_content_order_title_ul li').on('click',function(){
		$(this).siblings().removeClass('current_li');
		$(this).addClass('current_li');
	});
	
	$('.no_a,.delete_a').on('click',function(){
		var v = this;
		var obj = $(v).parent().parent().parent();
		obj.remove();
	});
	
	$('.tx_a').on('click',function(){
		alert('我们已将消息发送给卖家，请您耐心等候');
	});
	
	$('.enter_a').on('click',function(){
		alert('确认收货');
	});
	
	$('.ok_a').on('click',function(){
		alert('确认付款');
	});
	
	$('.see_a').on('click',function(){
		alert('查看物流情况');
	});
});