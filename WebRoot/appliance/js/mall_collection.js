$(function(){
	
	
	
	$('.userinfo_collection_page').createPage({
		pageCount : 5,
		current : 1,
		input_name : 'userinfo_collection',
		backFn : function(p){
			$.ajax({
				url:urlsl+"mall_collection/"+p,
				type:"GET",
				success:function(msg){alert(msg);
					$('.userinfo_collection_page div').remove();
					var strVar = "";
					$.each(msg,function(i,v){
						strVar += "<div class=\"collection_div\">";
						strVar += "<a href=\"javascript:void(0);\"><img src=\"appliance/images/1.jpg\"/><span class=\"collection_clear_span\" data-span=\"1\"><img alt=\"\" cladd=\"del_collection\" data-mcid=\""+v.mcid+"\" src=\"appliance/images/clear.png\"><\/span><\/a>";
						strVar += "<p><y class=\"y_one\">￥9.9<\/y><span>销量：<y>8918<\/y><\/span><\/p>";
						strVar += "<p><a href=\"javascript:void(0);\">"+v.title+"<\/a><\/p>";
						strVar += "<\/div>";
					});
					$(strVar).appendTo(".userinfo_collection_div");
					$(".del_collection").unbind("click");
					$(".del_collection").on("click",function(){
						var dom = this;
						var mcid = $(this).data("mcid");
						$.ajax({
							url:urlsl+"mall_collection_del"+id,
							type:"POST",
							success:function(msg){
								if(msg=="SUCCESS"){
									dom.remove();
									alert("删除成功");
								}else if(msg=="LOGIN"){
									alert("登录过期,请重新登录");
								}else if(msg=="FAIL"){
									alert("删除失败,稍后再试");
								}
							}
						});
					});
				}
			});
		}
	});
});