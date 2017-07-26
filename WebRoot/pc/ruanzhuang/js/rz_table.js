var isLucky = false;
$(function(){
	$('#form2 input[type="text"]').blur(function(){
		var v = this;
		var go = ($(v).val().trim() != "");
		if ($(v).attr("vali") == "number") {
			var reg = /^[0-9]+.?[0-9]*$/;
			go = reg.test($(v).val())
		}
		if (go) {
			$(v).removeClass("error-border-color");
		} else {
			$(v).addClass("error-border-color");
		}
	});
	
	$('#sub-but').click(function(){
		$('#form2 input[type="text"]').blur();
		if ($(".error-border-color").length == 0 && !isLucky) {
			isLucky = true;
			$.ajax({
				type : 'POST',
				async : false,
				url : 'createData',
				data : $('#form2').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if(re==="SUCCESS"){
						alert("恭喜您,申请成功!稍后会有工作人员与您联系!");
						location.reload();
					}else if(re==="FAIL" || re==="ALERT"){
						alert("网络有误！请稍后再试");
					}
				},error : function(ms){
					isLucky = false;
					alert(ms.status);
				}
			});
		}
	});
});