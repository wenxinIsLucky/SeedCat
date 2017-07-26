var isLucky = false;
$(function(){
	$('.yzh').bind('click',function(){
		if(!isLucky){
			isLucky = true;
			$.ajax({
				type : 'POST',
				async : false,
				url : 'editJoinInfo',
				data : $('#form').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if("SUCCESS".stringToEquels(re)){
						alert("填写资料成功!稍后会有工作人员与您联系!");
						location.reload();
					}else if("FAIL".stringToEquels(re)){
						alert("网络有误！请稍后再试");
					}else if("ALERT".stringToEquels(re)){
						alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
					}
				},error : function(re){
					isLucky = false;
				}
			});
		}
	});
});