var isLucky = false;
$(function(){
	/*切换激活方式*/
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
	/*点击激活*/
	$('.div_buttom').bind('click',function(){
		var isRegister = false;
		var type = "Email";
		var obj = null;
		if(!$('.phone_register_div').is(":hidden")){//手机激活
			type = "Phone";
			obj = $("#Phone");
			isRegister = phoneVerification(obj);
		}else{//邮箱注册
			obj = $("#Email");
			isRegister = emailVerification(obj);
		}
		if(isRegister && !isLucky){
			isLucky = true;
			var loginName = $('input[name="loginName"]',obj).val();
			var loginPass = $('input[name="loginPass"]',obj).val();
			$.post(luckyUrl+'browserLoginUser',{'loginName':loginName,'loginPass':loginPass},function(re){
  				isLucky = false;
  				if("SUCCESS" == re){
  					location.href = luckyUrl;
  				}else if("LOOK" == re){
  					alert("此账号处于锁死状态,请联系客服人员处理!");
  				}else if("ISJH" == re){
  					if(testTwoStringToEquels(type,"Phone")){//手机激活
  						location.href = luckyUrl+'pc/login.jsp';
  					}else if(testTwoStringToEquels(type,"Email")){
  						$.post(luckyUrl+'sendOutRegisterEmail',{'email':loginName},function(re){
  							location.href=luckyUrl+"pc/email.html";
  						});
  					}
  				}else if("ALERT" == re){
  					alert("警告,你提交的数据中带有非法字符,请重新输入");
  					$('input[name="loginName"]').focus();
  				}else if("FAIL" == re){
  					alert("账号密码错误");
  					$('input[name="loginName"]').focus();
  				}
  				hztp1();
  			});
		}
	});
	
	/*获取手机验证码*/
	$('.fonbuttom').bind('click',function(){
		alert(1);
	});
});

/**
 * 邮箱激活校验
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
 * 手机激活校验
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
	if($.trim(pass) == ""){
		alert("密码不能为空");
		$('input[name="loginPass"]',obj).focus();
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