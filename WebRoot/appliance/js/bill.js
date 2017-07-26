$(function(){
	$('.bill_info').on('click',function(){
		var v = this;
		var phone = $('.phone').val();
		if(phone == '' || $.trim(phone).length <= 0){
			alert('请输入手机号码');
			$('.phone').focus();
		}else{
			if(phone.testPhone()){
				var price = $(v).find('y').text();
				var money = $(v).find('span').text();
				$('.mes_info_tel').text(phone);
				$('.mes_info_bill_bao').text(price);
				$('.mes_info_price').text(money+"元");
				$('.confirm_mes_info').show();
			}else{
				alert('请输入正确的手机号码');
			}
		}
	});
	$('.quxiao').on('click',function(){
		heidBill();
	});
	$('.submit').on('click',function(){
		alert('提交');
		heidBill();
	});
});
function heidBill(){
	$('.mes_info_tel').empty();
	$('.mes_info_bill_bao').empty();
	$('.mes_info_price').empty();
	$('.confirm_mes_info').hide();
}