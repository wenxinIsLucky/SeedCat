//====================初始化验证表单====================
$(function(){
	$(".loginName,.loginPass").on("keyup",function(key){
		if(key.keyCode === 13){
			loginFun();
		}
	});
	//提交表单
	$(".btnSubmit1").on("click", function() {
		loginFun();
    });
});

function refreshSign(){
	$('#iframe').attr('src','to-sign?v='+new Date().getTime());
}
function loginFun(){
	if($(".loginName").val()=="" || $(".loginPass").val()==""){
		$(".tips1").show();
		$(".tips1").text("请填写用户名和登录密码！");
		return false;
	}
	$('iframe').attr("src","to-sign");
	$('#error_mask,iframe').show()
}