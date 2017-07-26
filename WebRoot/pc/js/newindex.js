var isLucky = false;
$(function(){
	jumeOrder();
	$('.seffw').on('click',function(){
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

function jumeOrder(){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getIndexCarouseData',
		success : function(re){
			var strVar = '';
			if(re!=null){
				if(re.length > 0){
					$.each(re,function(i,v){
						strVar += '<li><a target="_blank" href="javascript:void(0);"><img src="/static_img/lunbo/'+v.path+'" alt=""></a></li>';
					});
				}
				$('.img-btn-list')
				$('#orderul').html(strVar);
				bannerListFn(
					    $(".banner"),
					    $(".img-btn-list"),
					    $(".left-btn"),
					    $(".right-btn"),
					    3000,
					    true
					);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}