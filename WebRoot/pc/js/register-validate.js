//=====================初始化代码======================
$(function () {
    //初始化验证表单
	$("#regform").Validform({
		tiptype:3,
		callback:function(form){
			if($.trim($('#yzm').val()).length > 0){
				//AJAX提交表单
				$(form).ajaxSubmit({
					beforeSubmit: showRequest,
					success: showResponse,
					error: showError,
					dataType: "json",
					timeout: 6000
				});
				return false;
			}
			$('#yzm').focus();
			return false;
		}
	});
	
	$('#yzm').blur(function(){
		if($.trim($(this).val()).length <= 0){
			$('.lucky').show();
		}else{
			$('.lucky').hide();
		}
	});

    //表单提交前
    function showRequest(formData, jqForm, options) {
		$("#register").val("正在提交...")
        $("#register").prop("disabled", true);
    }
    //表单提交后
    function showResponse(re, textStatus) {
    	if(re.status === 200){
    		$('.success_msg').text("注册成功！");
			setTimeout(function(){
				location.href='to-login';
			},2000);
    	}else{
    		$('.error_msg').text(re.msg);
    		$("#register").val("再次提交");
            $("#register").prop("disabled", false);
    	}
    }
    //表单提交出错
    function showError(XMLHttpRequest, textStatus, errorThrown) {
    	$('.error_msg').text("状态：" + textStatus + "；出错提示：" + errorThrown);
        $("#register").val("再次提交");
        $("#register").prop("disabled", false);
    }
});