$(function(){
	//$('.sp').eq(0).next().show();
	$('.sp').on('click',function(){
		var obj = $(this).next();
		if(obj.is(':hidden')){
			obj.show();
		}else{
			obj.hide();
		}
	});
	$('.p').on('click',function(){
		$('.p').removeClass('current');
		$('.p').find('a').css('color','#fff');
		$(this).addClass('current');
		$(this).find('a').css('color','black');
	});
});