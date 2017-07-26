$(function(){
	$('.sfy').on('click',function(){
		var cla = $(this).attr('class');
		var imgSrc = $(this).find('img').attr('src');
		if(cla.indexOf('user') > -1){
			$(this).find('img').attr('src',imgSrc.replace('user_1.png','user_2.png'));
			$('.kf').find('img').attr('src',$('.kf').find('img').attr('src').replace('kf_2.png','kf_1.png'));
		}else if(cla.indexOf('kf') > -1){
			$(this).find('img').attr('src',imgSrc.replace('kf_1.png','kf_2.png'));
			$('.user').find('img').attr('src',$('.user').find('img').attr('src').replace('user_2.png','user_1.png'));
		}else if(cla.indexOf('ll') > -1){
			$('.user').find('img').attr('src',$('.user').find('img').attr('src').replace('user_2.png','user_1.png'));
			$('.kf').find('img').attr('src',$('.kf').find('img').attr('src').replace('kf_2.png','kf_1.png'));
		}
		$(this).siblings().find('div.name_div').removeClass('current_color');
		$(this).find('div.name_div').addClass('current_color');
	});
});