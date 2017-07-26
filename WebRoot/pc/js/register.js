var isLucky = false;
$(function(){
	/*切换注册方式*/
	$('.register_buttom').bind('click',function(){
		var t = $(this);
		var v = $(t).attr('class');
		if(v.indexOf("phone_buttom") > -1){
			$('.phone_buttom').addClass('register_buttom_curres');
			$('.email_buttom').removeClass('register_buttom_curres');
			$('.phone_register_div').show();
			$('.email_register_div').hide();
		}else{
			$('.email_buttom').addClass('register_buttom_curres');
			$('.phone_buttom').removeClass('register_buttom_curres');
			$('.phone_register_div').hide();
			$('.email_register_div').show();
		}
		hztp1();
	});
	/*点击注册*/
	$('.div_buttom').bind('click',function(){
		var sheng = $('select[name="sheng"]').val();
		var shi = $('select[name="shi"]').val();
		var isRegister = false;
		var type = "Email";
		var obj = null;
		if(!$('.phone_register_div').is(":hidden")){//手机注册
			type = "Phone";
			obj = $("#Phone");
			if($.trim($('input[name="name"]',obj).val()) == ""){
				alert("昵称不能为空");
				$('input[name="name"]',obj).focus();
				return;
			}
			isRegister = phoneVerification(obj);
		}else{//邮箱注册
			obj = $("#Email");
			if($.trim($('input[name="name"]',obj).val()) == ""){
				alert("昵称不能为空");
				$('input[name="name"]',obj).focus();
				return;
			}
			isRegister = emailVerification(obj);
		}
		if(isRegister && !isLucky){
			isLucky = true;
			$.ajax({
				type : "post",
				async : false,
				url : luckyUrl+'browserRegisterUser?type='+type+'&sheng='+sheng+'&shi='+shi,
				data : $("#"+type).serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if("SUCCESS" == re){
						if(testTwoStringToEquels(type,"Email")){
	  						location.href=luckyUrl+"pc/email.html";
	  					}else if(testTwoStringToEquels(type,"Phone")){
	  						location.href=luckyUrl+"pc/login.jsp";
	  					}
	  				}else if("REGISTER" == re){
	  					if(testTwoStringToEquels(type,"Email")){
	  						alert("此邮箱已经注册过");
	  					}else if(testTwoStringToEquels(type,"Phone")){
	  						alert("此手机号已注册");
	  					}
	  					$('input[name="loginName"]',obj).focus();
	  				}else if("ALERT" == re){
	  					alert("警告,你提交的数据中带有非法字符,请重新输入");
	  				}else if("FAIL" == re){
	  					alert("注册失败");
	  				}
					hztp1();
				},
				error : function(re){
					isLucky = false;
					alert(re.status);
					hztp1();
				}
			});
		}
	});
	
	/*获取手机验证码*/
	$('.fonbuttom').bind('click',function(){
		alert(1);
	});
});

/**
 * 邮箱注册校验
 * @param obj
 */
function emailVerification(obj){
	var email = $('input[name="loginName"]',obj).val();
	if(!testEmail(email)){
		alert("邮箱格式不对");
		$('input[name="loginName"]',obj).focus();
		return false;
	}
	return emailOrPhonePublic(obj);
}

/**
 * 手机注册校验
 * @param obj
 */
function phoneVerification(obj){
	var phone = $('input[name="loginName"]',obj).val();
	if(!testPhone(phone)){
		alert("手机格式不对");
		$('input[name="loginName"]',obj).focus();
		return false;
	}
	if(!emailOrPhonePublic(obj)){
		return false;
	}
	var msg = emsVerification($('input[name="ems"]',obj).val());
	if(testTwoStringToEquels("ALERT",msg)){
		alert("警告,你提交的数据中带有非法字符,请重新输入");
		$('input[name="ems"]',obj).focus();
		return false;
	}else if(testTwoStringToEquels("FAIL",msg)){
		alert("短信验证码错误");
		$('input[name="ems"]',obj).focus();
		return false;
	}
	return true;
}

/**
 * 手机短信校验码
 * @param code
 */
function emsVerification(code){
	/*$.post(luckyUrl+'',{'':code},function(re){
		return re;
	});*/
	return "FAIL";
}

/**
 * 手机邮箱共同校验地方
 * @param obj
 * @returns
 */
function emailOrPhonePublic(obj){
	//验证码
	var yzm = $('input[name="yzm"]',obj).val();
	//密码
	var pass = $('input[name="loginPass"]',obj).val();
	//第二次密码
	var newPass = $('input[name="newPassword"]',obj).val();
	if($.trim(pass) == ""){
		alert("密码不能为空");
		$('input[name="loginPass"]',obj).focus();
		return false;
	}
	if($.trim(newPass) == ""){
		alert("请再次输入密码");
		$('input[name="newPassword"]',obj).focus();
		return false;
	}
	if(!stringLength(pass,6)){
		alert("密码长度最低6位");
		$('input[name="loginPass"]',obj).focus();
		return false;
	}
	if(!testTwoStringToEquels(pass,newPass)){
		alert("两次输入的密码不一致,请重新输入");
		$('input[name="newPassword"]',obj).focus();
		return false;
	}
	if($.trim(yzm) == ""){
		alert("验证码不能为空");
		$('input[name="yzm"]',obj).focus();
		return false;
	}
	var msg = verificationCode(yzm);
	if(testTwoStringToEquels("ALERT",msg)){
		alert("警告,你提交的数据中带有非法字符,请重新输入");
		$('input[name="yzm"]',obj).focus();
		return false;
	}else if(testTwoStringToEquels("FAIL",msg)){
		alert("验证码错误");
		$('input[name="yzm"]',obj).focus();
		return false;
	}
	return true;
}

/**
 * 换张验证码
 * @param type
 */
function hztp(type) {
	var obj = null;
	if(1 == type){//邮箱
		obj = $("#email");
	}else if(0 == type){//手机
		obj = $("#phone");
	}
	var imgSrc = $(".himg",obj);
	var src = imgSrc.attr("src");
	$(".himg",obj).attr("src", gburl(src));
}

function hztp1() {
	var imgSrc = $(".himg");
	var src = imgSrc.attr("src");
	$(".himg").attr("src", gburl(src));
}

/**
 * 刷新验证码
 * @param urls
 * @returns {String}
 */
function gburl(urls) {
	var timestamp = (new Date()).valueOf();
	var urlurl = urls.substring(0,urls.indexOf('?')>-1?urls.indexOf('?'):urls.length);
	if ((urls.indexOf("&") >= 0)) {
		urlurl = urlurl + "×tamp=" + timestamp;
	} else {
		urlurl = urlurl + "?timestamp=" + timestamp;
	}
	return urlurl;
}

/**
 * 校验验证码
 * @param code
 * @returns 
 */
function verificationCode(code){
	$.post(luckyUrl+'verificationCode',{'inputCode':code},function(re){
		return re;
	});
}