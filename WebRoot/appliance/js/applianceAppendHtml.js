(function($) {
	$.fn.appendMallFootPrint = function(options) {
		var obj = this;
		obj.empty();
		var strVar = "<div class=\"userinfo_content_myfootPrint\">";
		
		strVar += "<div class=\"userinfo_content_myfootPrint_details\">";
		strVar += "<a href=\"javascript:void(0);\"><img src=\"appliance/images/5.jpg\"/><span class=\"clear_span\" data-span=\"1\"><img alt=\"\" src=\"appliance/images/clear.png\"><\/span><\/a>";
		strVar += "<p><y class=\"y_one\">￥9.9<\/y><span>销量：<y>8918<\/y><\/span><\/p>";
		strVar += "<p><a href=\"javascript:void(0);\">彭万锦fdsaffasfdsfsafadsffsdddsfsfdssd1516<\/a><\/p>";
		strVar += "<\/div>";

		strVar += "<div class=\"userinfo_content_myfootPrint_details\">";
		strVar += "<a href=\"javascript:void(0);\"><img src=\"appliance/images/5.jpg\"/><span class=\"clear_span\" data-span=\"2\"><img alt=\"\" src=\"appliance/images/clear.png\"><\/span><\/a>";
		strVar += "<p><y class=\"y_one\">￥9.9<\/y><span>销量：<y>8918<\/y><\/span><\/p>";
		strVar += "<p><a href=\"javascript:void(0);\">彭万锦fdsaffasfdsfsafadsffsdddsfsfdssd1516<\/a><\/p>";
		strVar += "<\/div>";
		
		strVar += "<p class=\"userinfo_myfootprint_page\"></p><\/div>";
		obj.append(strVar);
	}

	$.fn.appendMallOrder = function(options) {
		var obj = this;
		obj.empty();
		var strVar = "";
		strVar += "<div class=\"userinfo_content_order\">";
		strVar += "<div class=\"userinfo_content_order_title\">";
		strVar += "<ul class=\"userinfo_content_order_title_ul\">";
		strVar += "<li class=\"current_li\">全部<\/li><li>未付款<\/li><li>待发货<\/li><li>待收货<\/li>";
		strVar += "<\/ul>";
		strVar += "<\/div>";
		strVar += "<div class=\"clear\"><\/div>";
		strVar += "<div class=\"userinfo_content_order_title_title\">";
		strVar += "<span>商品<\/span><span>单价<\/span><span>数量<\/span><span>折扣<\/span><span>实付款<\/span><span>优惠<\/span><span>交易操作<\/span>";
		strVar += "<\/div>";
		strVar += "<div class=\"clear\"><\/div>";
		
		strVar += "<div class=\"userinfo_content_order_content\">";
		strVar += "<div class=\"userinfo_content_order_details\">";
		strVar += "<div class=\"userinfo_content_order_details_title\"><span>2017-02-22<\/span><y>订单号：3461681384613841485<\/y><\/div>";
		strVar += "<div class=\"order_goods_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_img\"><img alt=\"\" src=\"appliance/images/1.jpg\"/><\/a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_title\">正泰开关插座面板86型5孔斜五孔家用16A空调墙壁带USB暗装金色 [交易快照]<\/a>";
		strVar += "<\/div>";
		strVar += "<div class=\"order_price_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_num_div\">1<\/div>";
		strVar += "<div class=\"order_zhekou_div\">1<\/div>";
		strVar += "<div class=\"order_money_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_youhui_div\">0<\/div>";
		strVar += "<div class=\"order_caozuo_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"ok_a\">立即付款<\/a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"no_a \">取消订单<\/a>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		
		strVar += "<div class=\"userinfo_content_order_content\">";
		strVar += "<div class=\"userinfo_content_order_details\">";
		strVar += "<div class=\"userinfo_content_order_details_title\"><span>2017-02-22<\/span><y>订单号：3461681384613841485<\/y><\/div>";
		strVar += "<div class=\"order_goods_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_img\"><img alt=\"\" src=\"appliance/images/1.jpg\"/><\/a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_title\">正泰开关插座面板86型5孔斜五孔家用16A空调墙壁带USB暗装金色 [交易快照]<\/a>";
		strVar += "<\/div>";
		strVar += "<div class=\"order_price_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_num_div\">1<\/div>";
		strVar += "<div class=\"order_zhekou_div\">1<\/div>";
		strVar += "<div class=\"order_money_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_youhui_div\">0<\/div>";
		strVar += "<div class=\"order_caozuo_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"tx_a\">提醒卖家发货</a>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		
		strVar += "<div class=\"userinfo_content_order_content\">";
		strVar += "<div class=\"userinfo_content_order_details\">";
		strVar += "<div class=\"userinfo_content_order_details_title\"><span>2017-02-22<\/span><y>订单号：3461681384613841485<\/y><\/div>";
		strVar += "<div class=\"order_goods_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_img\"><img alt=\"\" src=\"appliance/images/1.jpg\"/><\/a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_title\">正泰开关插座面板86型5孔斜五孔家用16A空调墙壁带USB暗装金色 [交易快照]<\/a>";
		strVar += "<\/div>";
		strVar += "<div class=\"order_price_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_num_div\">1<\/div>";
		strVar += "<div class=\"order_zhekou_div\">1<\/div>";
		strVar += "<div class=\"order_money_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_youhui_div\">0<\/div>";
		strVar += "<div class=\"order_caozuo_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"enter_a\">确认收货</a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"see_a\">查看进程</a>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		
		strVar += "<div class=\"userinfo_content_order_content\">";
		strVar += "<div class=\"userinfo_content_order_details\">";
		strVar += "<div class=\"userinfo_content_order_details_title\"><span>2017-02-22<\/span><y>订单号：3461681384613841485<\/y><\/div>";
		strVar += "<div class=\"order_goods_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_img\"><img alt=\"\" src=\"appliance/images/1.jpg\"/><\/a>";
		strVar += "<a href=\"javascript:void(0);\" class=\"order_title\">正泰开关插座面板86型5孔斜五孔家用16A空调墙壁带USB暗装金色 [交易快照]<\/a>";
		strVar += "<\/div>";
		strVar += "<div class=\"order_price_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_num_div\">1<\/div>";
		strVar += "<div class=\"order_zhekou_div\">1<\/div>";
		strVar += "<div class=\"order_money_div\">¥99.99<\/div>";
		strVar += "<div class=\"order_youhui_div\">0<\/div>";
		strVar += "<div class=\"order_caozuo_div\">";
		strVar += "<a href=\"javascript:void(0);\" class=\"delete_a\">删除订单</a>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		strVar += "<\/div>";
		
		strVar += "<p class=\"userinfo_order_page\"><\/p><\/div>";
		obj.append(strVar);
	}
	
	$.fn.appendMallAddress = function(options) {
		loadAddress();
		
		var obj = this;
		obj.empty();
		var strVar = "";
	    strVar += "<div class=\"userinfo_address_div\">";
	    strVar += "<div class=\"userinfo_address_div_title\">&nbsp;收货地址<\/div>";
	    strVar += "<div class=\"userinfo_add_address_div\">";
	    strVar += "<p class=\"add_p\">新增收货地址<\/p><form class=\"address_form\">";
	    strVar += "<table border=\"0\" class=\"add_table\">";
	    strVar += "<tr>";
	    strVar += "<td>所在地区：<\/td>";
	    strVar += "<td>";
	    strVar += "<span class=\"tit\">省<\/span> ";
	    strVar += "<select class=\"select\" name=\"provinceId\" id=\"sel-provance\" onchange=\"selectCity();\"><\/select>";
	    strVar += "<span class=\"tit\">市<\/span> ";
	    strVar += "<select class=\"select\" id=\"sel-city\" name=\"xian\" tabindex=\"4\" required=\"required\" onchange=\"selectcounty()\"><\/select>";
	    strVar += "<span class=\"tit\">区/县<\/span> ";
	    strVar += "<select class=\"select\" id=\"sel-area\" name=\"qu\" tabindex=\"5\" required=\"required\"><\/select>";
	    strVar += "<\/td>";
	    strVar += "<\/tr>";
	    strVar += "<tr>";
	    strVar += "<td>详细地址：<\/td>";
	    strVar += "<td><textarea name=\"info\" id=\"address_info\" placeholder=\"建议您如实填写详细收货地址，例如街道名称，门牌号码，楼层和房间号等信息\" rows=\"4\" cols=\"50\"><\/textarea><\/td>";
	    strVar += "<\/tr>";
	    strVar += "<tr>";
	    strVar += "<td>收货人姓名：<\/td>";
	    strVar += "<td><input name=\"name\" id=\"address_name\" placeholder=\"长度不超过25个字\" class=\"input\"/><\/td>";
	    strVar += "<\/tr>";
	    strVar += "<tr>";
	    strVar += "<td>手机号码：<\/td>";
	    strVar += "<td><input placeholder=\"您的手机号码\" id=\"address_phone\" class=\"input\" name=\"phone\" maxlength=\"11\" onkeyup=\"this.value=this.value.replace(/\\D/g,'')\"  onafterpaste=\"this.value=this.value.replace(/\\D/g,'')\" /><\/td>";
	    strVar += "<\/tr>";
	    strVar += "<tr>";
	    strVar += "<td><\/td>";
	    strVar += "<td><p class=\"check_p_two\"><img alt=\"\" id=\"address_ismr\" src=\"appliance/images/checked_1.png\"/><\/p><span class=\"default_span\">设置为默认地址<\/span><\/td>";
	    strVar += "<\/tr>";
	    strVar += "<tr>";
	    strVar += "<td><\/td>";
	    strVar += "<td><div class=\"bc_div_button\" id=\"address_save\">保存<\/div><\/td>";
	    strVar += "<\/tr>";
	    strVar += "<\/table>";
	    strVar += "</form><\/div>";
	    strVar += "<div class=\"clear\"><\/div>";
	    strVar += "<div class=\"show_addressList_div\">";
	    strVar += "<div class=\"show_address_num\">已保存了2条地址，还能保存3条地址<\/div>";
	    strVar += "<div class=\"addressList_div\">";
	    strVar += "<input type='hidden' id='address_maid' />";
	    strVar += "<table border=\"0\" class=\"show_table\">";
	    strVar += "<tr>";
	    strVar += "<td>收货人<\/td>";
	    strVar += "<td>所在地区<\/td>";
	    strVar += "<td>详细地址<\/td>";
	    strVar += "<td>手机号码<\/td>";
	    strVar += "<td>操作<\/td>";
	    strVar += "<\/tr>";
	    strVar += "<\/table>";
	    strVar += "<\/div>";
	    strVar += "<\/div>";
	    
	    strVar += "<\/div>";
		obj.append(strVar);
	}
	
	$.fn.appendMallCollection = function(options) {
		var obj = this;
		obj.empty();
		var strVar = "";
		strVar += "<div class=\"userinfo_collection_div\">";
	 
	    strVar += "<\/div>";
	    strVar += "<p class=\"userinfo_collection_page\"><\/p>";
		
		obj.append(strVar);
	}
	
	$.fn.appendSearchHtml = function(options) {
		var obj = this;
		obj.empty();
		var strVar = "";
		
		strVar += "<div class=\"search_div_content\">";
		strVar += "<a href=\"javascript:void(0);\"><img alt=\"\" src=\"appliance/images/1.jpg\"/></a>";
		strVar += "<p><y class=\"y_price\">￥99.00</y><span>销量：<y>5841</y></span></p>";
		strVar += "<p><a href=\"javascript:void(0);\">某某某某某某某某某某某某某某某某某某某某某</a></p>";
		strVar += "</div>";
		
		obj.append(strVar);
	}
})(jQuery);
//加载
function loadCollection(){
	
}

function loadAddress(){
	$(".address_item").remove();
	//异步获取用户地址
	var address="";
	$.ajax({
		url:urlsl+"/mall_address_user",
		type:"GET",
		success:function(msg){
			$.each(msg,function(i,v){
				var mr = "";
				if(v.isMr==0){
					mr="gb change_mr";
				}else{
					mr="";
				}
				address += "<tr class=\"address_item\">";
				address += "<td class=\"address_name\">"+v.name+"<\/td>";
				address += "<td class=\"address_quyu\"><span class=\"address_sheng\">"+v.sheng+"<\/span><span class=\"address_shi\">"+v.shi+"<\/span><span class=\"address_qu\">"+v.qu+"<\/span><\/td>";
				address += "<td class=\"address_info\">"+v.info+"<\/td>";
				address += "<td class=\"address_phone\">"+v.phone+"<\/td>";
				address += "<td class=\"address_caozuo\"><a href=\"javascript:void(0);\" data-maid=\""+v.maid+"\" class=\"address_upd_a\">修改<\/a> | <a href=\"javascript:void(0);\" data-maid=\""+v.maid+"\" class=\"address_del_a\">删除<\/a><span  data-maid=\""+v.maid+"\" class=\"default_address_span "+mr+"\">设为默认<\/span><\/td>";
				address += "<\/tr>";
			});
			$(address).appendTo(".show_table");
			//设为默认
			$(".change_mr").unbind("click");
			$(".change_mr").bind("click",function(){
				var maid = $(this).data("maid");
				$.ajax({
					url:urlsl+"/mall_address_ismr",
					type:"POST",
					data:{maid:maid},
					success:function(msg){
						if(msg=="SUCCESS"){
							alert("操作成功");
							loadAddress();
						}else if(msg=="FAIL"){
							alert("操作失败,稍后试");
						}else if(msg=="LOGIN"){
							alert("登录过期,请重新登录");
						}
					}
				});
			});
			//删除
			$(".address_del_a").unbind("click");
			$(".address_del_a").on("click",function(){
				var maid = $(this).data("maid");
				$.ajax({
					url:urlsl+"/mall_address_del",
					type:"POST",
					data:{maid:maid},
					success:function(msg){
						if(msg=="SUCCESS"){
							alert("操作成功");
							loadAddress();
						}else if(msg=="FAIL"){
							alert("操作失败,稍后试");
						}else if(msg=="LOGIN"){
							alert("登录过期,请重新登录");
						}
					}
				});
			});
			//修改
			$(".address_upd_a").on("click",function(){
				$("#address_maid").val($(this).data("maid"));
				var items = $(this).parent().parent();
				var name = items.children("td:eq(0)").html();
				var sheng = items.children("td:eq(1)").children("span:eq(0)").html();
				var shi = items.children("td:eq(1)").children("span:eq(1)").html();
				var qu = items.children("td:eq(1)").children("span:eq(2)").html();
				var info = items.children("td:eq(2)").html();
				var phone = items.children("td:eq(3)").html();
				var mr = items.children("td:eq(4)").children("span:eq(0)").hasClass("gb");
				
				if(mr){
					$("#address_ismr").attr("src","appliance/images/checked_1.png");
				}else{
					$("#address_ismr").attr("src","appliance/images/checked_2.png");
				}
				$("#sel-provance").val(sheng);
				$("#sel-city").val(shi);
				$("#sel-area").val(qu);
				$("#address_info").val(info);
				$("#address_name").val(name);
				$("#address_phone").val(phone);
			});
		}
	});
	
}
