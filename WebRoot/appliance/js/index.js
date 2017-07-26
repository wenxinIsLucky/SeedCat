$(function(){
	var time;
	$('.div_one_left_bottom').on('mouseenter',function(){
		var v = this;
		clearTimeout(time);
		time = setInterval(function(){
			if($(v).find('img').attr('src').indexOf('bottom.png') > -1){
				$(v).find('img').attr('src',$(v).find('img').attr('src').replace('bottom.png','top.png'));
			}
			var contentHeight = $('.div_one_left_center').height();
			$('.appliance_index_div_one_left').css({'height':contentHeight+75+"px"});
		},200);
	});
	$('.div_one_left_bottom').on('mouseleave',function(){
		clearTimeout(time);
	});
	$('.div_one_left_bottom').on('click',function(){
		if($(this).find('img').attr('src').indexOf('top.png') > -1){
			$(this).find('img').attr('src',$(this).find('img').attr('src').replace('top.png','bottom.png'));
		}
		$('.appliance_index_div_one_left').css({'height':"403px"});
	});
});