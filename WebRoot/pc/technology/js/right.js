var isLucky = false;
$(function(){
	$('.tij_sub').on('click',function(){
		var name = $.trim($('input[name="name"]').val());
		var phone = $.trim($('input[name="phone"]').val());
		if(name.length <= 0){
			alert('请填写您的称呼');
			$('input[name="name"]').focus();
			return false;
		}
		if(phone.length <= 0){
			alert('请填写您的手机');
			$('input[name="phone"]').focus();
			return false;
		}
		if(!phone.testPhone()){
			alert('手机格式有误');
			$('input[name="phone"]').focus();
			return false;
		}
		if(!isLucky){
			isLucky = true;
			$.ajax({
				type : 'POST',
				url : 'createHome_designData',
				data : {name : name,phone : phone},
				dataType : 'text',
				success : function(re){
					isLucky = false;
					if(re === "SUCCESS"){
						alert('申请成功，稍后我们将会联系您');
						$('input[name="name"]').val("");
						$('input[name="phone"]').val("");
					}else{
						alert('申请失败，请稍后再试');
					}
				},error : function(ms){
					isLucky = false;
					alert(ms.status);
				}
			});
		}
	});
});