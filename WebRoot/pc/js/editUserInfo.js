var isLucky = false;
$(function(){
	$('.edit_ul li').bind('click',function(){
		$(this).siblings().removeClass('eee');
		$(this).addClass('eee');
		if(testTwoStringToEquels($(this).data('lu'),"info")){
			$('.userpass_div').hide();
			$('.jypass_div').hide();
			$('.userinfo_div').show();
		}else if(testTwoStringToEquels($(this).data('lu'),"pass")){
			$('.userinfo_div').hide();
			$('.jypass_div').hide();
			$('.userpass_div').show();
		}else if(testTwoStringToEquels($(this).data('lu'),"jy_pass")){
			$('.jypass_div').show();
			$('.userinfo_div').hide();
			$('.userpass_div').hide();
		}
	});
	$('.tab_a_div li').bind('click',function(){
		var pass_text = "登录密码";
		$(this).siblings().removeAttr('class');
		$(this).addClass('curr_a_click');
		 if(parseInt($(this).find('a').data('lu')) == 1){
			 pass_text = "交易密码";
		 }else if(parseInt($(this).find('a').data('lu')) == 0){
			 pass_text = "登录密码";
		 }
		$('#editPass').text(pass_text);
	});
	$('.tab_p_div li').bind('click',function(){
		$(this).siblings().removeAttr('class');
		$(this).addClass('curr_a_click');
		if(parseInt($(this).find('a').data('lu')) == 1){//头像
			$('.head_palan').show();
			$('.info_palan').hide();
		}else if(parseInt($(this).find('a').data('lu')) == 0){//基本资料
			$('.info_palan').show();
			$('.head_palan').hide();
		}
	});
	$('#editPass').bind('click',function(){
		if(yz_pass()){
			var type = "";
			$.each($('.tab_a_div li'),function(i,v){
				var t_class = $(v).attr('class');
				if(t_class != undefined && t_class.indexOf("curr_a_click") > -1){
					 if(parseInt($(v).find('a').data('lu')) == 1){
						 type = "enitJyPass";
					 }else if(parseInt($(v).find('a').data('lu')) == 0){
						 type = "enitLoginPass";
					 }
				}
			});
			if(!isLucky){
				isLucky = true;
				$.ajax({
					type : "post",
					async : false,
					url : luckyUrl+'enitUserInfo?type='+type,
					data : $("#pass").serialize(),
					dataType : "text",
					success : function(re){
						isLucky = false;
						if(testTwoStringToEquels(re,"SUCCESS")){
							alert("保存成功");
							location.reload();
						}else if(testTwoStringToEquels(re,"LOGIN")){
							location.href = 'transferPagepersonalCenter,editUserPass';
						}else if(testTwoStringToEquels(re,"OLDPASSERROR")){
							alert("原密码不正确");
							$('input[name="currentPass"]').focus();
						}else if(testTwoStringToEquels(re,"PASSNULL")){
							alert("新密码不能为空");
							$('input[name="newPass"]').focus();
						}else if(testTwoStringToEquels(re,"PASSERROR")){
							alert("两次密码不一致");
							$('input[name="confirmPass"]').focus();
						}else if(testTwoStringToEquels(re,"TWONOTXT")){
							alert("新密码不能跟原密码相同");
							$('input[name="newPass"]').focus();
						}else if(testTwoStringToEquels(re,"FAIL")){
							alert("网络有误！请稍后再试");
						}else if(testTwoStringToEquels(re,"PERFECT")){
							alert("资料不许为空");
						}else if(testTwoStringToEquels(re,"ALERT")){
							alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
						}
					},error : function(re){
						isLucky = false;
						alert(re.status);
					}
				});
			}
		}
	});
	$('#sub').bind('click',function(){
		var v = $('#fcupload').val();
		if($.trim(v) == ""){
			alert("请选择图片");
			return;
		}
		if(!isLucky){
			isLucky = true;
			$(".form-horizontal").submit();
			var time = setInterval(function(){
				var text = jcIframe();
				if(testTwoStringToEquels(text,"保存成功")){
					isLucky = false;
					location.reload();
				}else if(testTwoStringToEquels(text,"请前去登录")){
					isLucky = false;
					location.href = 'transferPagepersonalCenter,editUserInfo';
				}else{
					isLucky = false;
					clearInterval(time);
				}
			},1000);
		}
	});
	$('#editUserInfo').bind('click',function(){
		if(yz_info()){
			if(!isLucky){
				isLucky = true;
				$.ajax({
					type : "post",
					async : false,
					url : luckyUrl+'enitUserInfo?type=enitInfo',
					data : $("#user_info").serialize(),
					dataType : "text",
					success : function(re){
						isLucky = false;
						if(testTwoStringToEquels(re,"SUCCESS")){
							alert("保存成功");
							location.reload();
						}else if(testTwoStringToEquels(re,"LOGIN")){
							location.href = 'transferPagepersonalCenter,editUserInfo';
						}else if(testTwoStringToEquels(re,"NAMENULL")){
							alert("昵称不能为空");
							$('input[name="currentPass"]').focus();
						}else if(testTwoStringToEquels(re,"HEADNULL")){
							alert("头像不能为空");
							$('input[name="newPass"]').focus();
						}else if(testTwoStringToEquels(re,"ADDRESSNULL")){
							alert("地址不能为空");
							$('input[name="confirmPass"]').focus();
						}else if(testTwoStringToEquels(re,"FAIL")){
							alert("网络有误！请稍后再试");
						}else if(testTwoStringToEquels(re,"ALERT")){
							alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
						}
					},error : function(re){
						isLucky = false;
						alert(re.status);
					}
				});
			}
		}
	});
	
	$('#editJyPass').bind('click',function(){
		var jypass = $('input[name="jyPass"]').val();
		var jy_pass = $('input[name="jy_Pass"]').val();
		if(yz_jy_pass()){
			if(!isLucky){
				isLucky = true;
				$.post(luckyUrl+'enitUserInfo',{'type':'addJyPass','newPass':jypass,'confirmPass':jy_pass},function(re){
					isLucky = false;
					if(testTwoStringToEquels(re,"SUCCESS")){
						alert("保存成功");
						location.reload();
					}else if(testTwoStringToEquels(re,"LOGIN")){
						location.href = 'transferPagepersonalCenter,editUserPass';
					}else if(testTwoStringToEquels(re,"PASSNULL")){
						alert("交易密码不能为空");
						$('input[name="jyPass"]').focus();
					}else if(testTwoStringToEquels(re,"PASSERROR")){
						alert("两次密码不一致");
						$('input[name="jy_Pass"]').focus();
					}else if(testTwoStringToEquels(re,"FAIL")){
						alert("网络有误！请稍后再试");
					}else if(testTwoStringToEquels(re,"ALERT")){
						alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
					}
				});
			}
		}
	});
});
/**
 * 交易密码验证
 * @returns {Boolean}
 */
function yz_jy_pass(){
	var jypass = $('input[name="jyPass"]').val();
	var jy_pass = $('input[name="jy_Pass"]').val();
	if($.trim(jypass) == ""){
		alert('请输入交易密码');
		$('input[name="jyPass"]').focus();
		return false;
	}
	if(!stringLength(jypass,6)){
		alert("密码长度最低6位");
		$('input[name="jyPass"]').focus();
		return false;
	}
	if($.trim(jy_pass) == ""){
		alert('请再次输入交易密码');
		$('input[name="jy_Pass"]').focus();
		return false;
	}
	if(!testTwoStringToEquels(jypass,jy_pass)){
		alert('两次输入的密码不一致,请重新输入');
		$('input[name="jy_Pass"]').focus();
		return false;
	}
	return true;
}
/**
 * 编辑基本资料验证
 */
function yz_info(){
	var name = $('input[name="name"]').val();
	var sel_provance = $('#sel-provance option:selected').val();
	var sel_city = $('#sel-city option:selected').val();
	if($.trim(name) == ""){
		alert('昵称不能为空');
		$('input[name="name"]').focus();
		return false;
	}
	if($.trim(sel_provance) == ""){
		alert('省/市份不能为空');
		$('#sel-provance').focus();
		return false;
	}
	if($.trim(sel_city) == ""){
		alert('省/市份不能为空');
		$('#sel-city').focus();
		return false;
	}
	return true;
}
/**
 * 编辑密码验证
 */
function yz_pass(){
	var currentPass = $('input[name="currentPass"]').val();
	var newPass = $('input[name="newPass"]').val();
	var confirmPass = $('input[name="confirmPass"]').val();
	if($.trim(currentPass) == ""){
		alert("请输入密码");
		$('input[name="currentPass"]').focus();
		return false;
	}
	if($.trim(newPass) == ""){
		alert("请输入新密码");
		$('input[name="newPass"]').focus();
		return false;
	}
	if(!stringLength(newPass,6)){
		alert("密码长度最低6位");
		$('input[name="newPass"]').focus();
		return false;
	}
	if($.trim(confirmPass) == ""){
		alert("请第二次输入密码");
		$('input[name="confirmPass"]').focus();
		return false;
	}
	if(!testTwoStringToEquels(newPass,confirmPass)){
		alert("两次输入的密码不一致,请重新输入");
		$('input[name="confirmPass"]').focus();
		return false;
	}
	return true;
}
/**
 * 编辑头像
 */
function editHead(){
	$('.tab_p_div li').siblings().removeClass('curr_a_click');
	$('.tab_p_div li').eq(1).addClass('curr_a_click');
	$('.head_palan').show();
	$('.info_palan').hide();
}

/**
 * 获取iframe内容
 * @returns
 */
function jcIframe(){
	var win = document.getElementById('result-iframe').contentWindow;
    var text = win.document.body.innerText;
    return text;
}