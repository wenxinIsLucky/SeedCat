$(function(){
	$('.check_p_two img').on('click',function(){
		var v = $(this);
		var src = $(v).attr('src');
		if(src.indexOf('checked_1.png') > -1){
			$(v).attr('src',src.replace('checked_1.png','checked_2.png'));
		}else if(src.indexOf('checked_2.png') > -1){
			$(v).attr('src',src.replace('checked_2.png','checked_1.png'));
		}
	});
	
	$('.address_upd_a').on('click',function(){
		var v = this;
		var obj = $(v).parent().parent();
		var address_name = $('.address_name',obj).text().trim();
		var address_quyu = $('.address_quyu',obj);
		var address_sheng = $('.address_sheng',address_quyu).text().trim();
		var address_shi = $('.address_shi',address_quyu).text().trim();
		var address_qu = $('.address_qu',address_quyu).text().trim();
		var address_info = $('.address_info',obj).text().trim();
		var address_phone = $('.address_phone',obj).text().trim();
		cascdeInit(address_sheng,address_shi,address_qu);
		$('textarea[name="info"]').text(address_info);
		$('input[name="name"]').val(address_name);
		$('input[name="phone"]').val(address_phone);
		//alert(address_name+"--"+address_sheng+"--"+address_shi+"--"+address_qu+"--"+address_info+"--"+address_phone);
	});
	
	$('.address_del_a').on('click',function(){
		var v = this;
		var obj = $(v).parent().parent();
		obj.remove();
	});
	
	$('.default_address_span').on('click',function(){
		var v = this;
		var cla = $(v).attr('class');
		if(cla.indexOf('gb') > -1){
			$('.address_caozuo').find('span').text('设为默认');
			$('.address_caozuo').find('span').addClass('gb');
			$(v).text('默认地址');
			$(v).removeClass('gb');
		}
	});
	
	
	//这个是我的服务端交互
	$("#address_save").on("click",function(){
		var maid = $("#address_maid").val();
		var provance = $("#sel-provance").val();
		var city = $("#sel-city").val();
		var area = $("#sel-area").val();
		var info = $("#address_info").val();
		var name = $("#address_name").val();
		var phone = $("#address_phone").val();
		var isMr = $("#address_ismr").attr("src");

		if(isMr.indexOf('checked_1.png') > -1){
			isMr = 0;
		}else{
			isMr = 1;
		}
		if(provance=="" || city=="" || area=="" || info=="" || name=="" || phone==""){
			alert("地址和姓名电话不能为空");
			return;
		}
		//如果是修改的
		if(maid!=""){
			$.ajax({
				url:urlsl+"mall_address_up",
				type:"POST",
				data:{maid:maid,sheng:provance,shi:city,phone:phone,qu:area,info:info,name:name,isMr:isMr},
				success:function(msg){
					if(msg=="SUCCESS"){
						alert("修改成功");
						//重新加载地址
						loadAddress();
					}else if(msg=="LOGIN"){
						alert("登录过期,请重新登录");
					}else if(msg=="FAIL"){
						alert("修改失败,稍后重试");
					}
				}
			});
		}else{
			$.ajax({
				url:urlsl+"mall_address",
				type:"POST",
				data:{sheng:provance,shi:city,phone:phone,qu:area,info:info,name:name,isMr:isMr},
				success:function(msg){
					if(msg=="SUCCESS"){
						alert("成功添加");
						//重新加载地址
						loadAddress();
					}else if(msg=="LOGIN"){
						alert("登录过期,请重新登录");
					}else if(msg=="FAIL"){
						alert("添加失败,稍后重试");
					}
				}
			});
		}
	});
	
	
});


	