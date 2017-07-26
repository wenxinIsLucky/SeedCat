$(function(){
	var parentParam = '';
	var findParam = '';
	$('.appliance_classification_type_div_one .appliance_classification_type_ul li').on('click',function(){
		//$('.appliance_classification_type_div_one').addClass('current_div_one');
		//$('.appliance_classification_type_div_two').addClass('current_div_two');
		$(this).siblings().removeClass('current_li');
		$(this).siblings().find('a').removeClass('a_color');
		$(this).addClass('current_li');
		$(this).find('a').addClass('a_color');
		$('.appliance_classification_type_div_two .appliance_classification_type_ul li a').removeClass('a_color');
		parentParam = $(this).find('a').text().trim();
		findParam = '';
		alert(parentParam);
	});
	
	$('.appliance_classification_type_div_two .appliance_classification_type_ul li a').on('click',function(){
		$(this).parent().siblings().find('a').removeClass('a_color');
		$(this).addClass('a_color');
		findParam = $(this).text().trim();
		alert(parentParam+"--"+findParam);
	});
});