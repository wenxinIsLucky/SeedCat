var isLucky = false;
$(function(){
	$('.ybjerp11 span').bind('click',function(){
		$(this).siblings().removeClass('curr_dangci');
		$(this).addClass('curr_dangci');
	});
	$('.ybjerp12').bind('click',function(){
		if(!isLucky){
			isLucky = true;
			$.each($('.ybjerp11').find('span'),function(i,v){
				if("curr_dangci".stringToEquels($(v).attr('class'))){
					$('input[name="level"]').val($(v).text());
				}
			});
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addDegAndQtnResult',
				data : $('#form').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if("SUCCESS".stringToEquels(re)){
						alert("填写资料成功!稍后将会将报价发送给您的手机!");
						location.reload();
					}else if("FAIL".stringToEquels(re)){
						alert("网络有误！请稍后再试");
					}else if("ALERT".stringToEquels(re)){
						alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
					}
				},error : function(re){
					isLucky = false;
				}
			});
		}
	});
	
	$('input[name="mj"]').bind('keyup afterpaste',function(){
		var c = $(this).val().replace(/\D/g,'');
		$(this).val(c);
		var v = $(this).val().substring(0,1);
		if(parseInt(v) == 0){
			$(this).val('');
		}
	});
});