var t = 0;
var isLucky = false;
window.onscroll = function(){ 
	//var k = document.body.offsetWidth; //(包括边线的宽)
	//var g = document.body.offsetHeight; //(包括边线的高)
	var jg = document.body.scrollTop; //网页被卷去的高
	//var jz = document.body.scrollLeft; //网页被卷去的左
	//console.log(k+"--"+g);
	//console.log(jg);
	if(parseInt(jg) > 300){
		$('.zongDaoHang').addClass('fdDiv');
		$('.zongDaoHang').attr('data-bs','1');
		$('.memu').hide();
		$('.rightColumn').find('ul li:last-child').removeClass('yc').addClass('xs');
	}else{
		$('.zongDaoHang').removeClass('fdDiv');
		$('.zongDaoHang').attr('data-bs','0');
		$('.hideDh').hide();
		$('.memu').show();
		$('.rightColumn').find('ul li:last-child').removeClass('xs').addClass('yc');
	}
	var data_title = $('.maskLayer').attr('data-title');
	if(parseInt(data_title) == 1){
		$('.maskLayer').attr('data-title','1');
		if(parseInt(jg) > 1000){
			$('.maskLayer').css('height','460px');
			$('.zcText').show();
			$('.topDiv').find('img').attr('src','pc/img/bottom.gif');
		}
		if(jg < t){//向上滚动
			$('.maskLayer').css('height','100px');
			$('.zcText').hide();
			$('.topDiv').find('img').attr('src','pc/img/top.gif');
		}
		setTimeout(function(){t = jg;},0);
	}
};
$(function(){
	$.each($('.memu .memuUL .memuLi'),function(i,v){
		$(v).attr('data-bs',i);
	});
	$.each($('.hideDh .memuUL .memuLi'),function(i,v){
		$(v).attr('data-bs',i);
	});
	/*首页固定的菜单*/
	$(".memu .memuUL .memuLi").hover(
		function(){
			var t = this;
			$.each($('.memuLi'),function(i,v){
				$(v).removeClass('eee');
			});
			$(t).addClass('eee');
			$('.hiddenMemu').attr('data-bs',$(t).attr('data-bs'));
			getMeunValue($(t).data('lu'),0)
			//$('.hiddenMemu').show().html($(t).text());
		},function(){
			$(this).removeClass('eee');
			$('.hiddenMemu').hide();
		}
	);
	$('.hiddenMemu').hover(
			function(){
				$('.hiddenMemu').show();
				var da_bs = $('.hiddenMemu').attr('data-bs');
				$.each($('.memu .memuUL .memuLi'),function(i,v){
					if(parseInt(da_bs) == parseInt(i)){
						$(v).addClass('eee');
					}
				});
				$('.hiddenMemu').removeAttr('data-bs');
			},function(){
				$('.hiddenMemu').hide();
				$.each($('.memuLi'),function(i,v){
					$(v).removeClass('eee');
				});
			}
	);
	$('.hiddenMemu2').hover(
			function(){
				$('.hiddenMemu2').show();
				var da_bs = $('.hiddenMemu2').attr('data-bs');
				$.each($('.hideDh .memuUL .memuLi'),function(i,v){
					if(parseInt(da_bs) == parseInt(i)){
						$(v).addClass('eee');
					}
				});
				$('.hiddenMemu2').removeAttr('data-bs');
			},function(){
				$('.hiddenMemu2').hide();
				$.each($('.memuLi'),function(i,v){
					$(v).removeClass('eee');
				});
			}
	);
	/*跟着浮动的菜单*/
	$(".hideDh .memuUL .memuLi").hover(
			function(){
				var t = this;
				$.each($('.memuLi'),function(i,v){
					$(v).removeClass('eee');
				});
				$(t).addClass('eee');
				$('.hiddenMemu2').attr('data-bs',$(t).attr('data-bs'));
				getMeunValue($(t).data('lu'),1)
				//$('.hiddenMemu2').show().html($(t).text());
			},function(){
				$(this).removeClass('eee');
				$('.hiddenMemu2').hide();
			}
		);
	/*菜单详细的显示*/
	$(".firstDh").hover(
			function(){
				var zdh = $('.zongDaoHang').attr('data-bs');
				if(parseInt(zdh) == 1){
					$('.hideDh').slideDown();
				}
			}
		);
	$(".hideDh").hover(
			function(){
				var zdh = $('.zongDaoHang').attr('data-bs');
				if(parseInt(zdh) == 1){
					$('.hideDh').show();
				}
			},function(){
				var zdh = $('.zongDaoHang').attr('data-bs');
				if(parseInt(zdh) == 1){
					$('.hideDh').slideUp();
				}
			}
		);
	$("body").click(function(){
		var zdh = $('.zongDaoHang').attr('data-bs');
		if(parseInt(zdh) == 1){
			$('.hideDh').slideUp();
		}
		$.each($('.memuLi'),function(i,v){
			$(v).removeClass('eee');
		});
	});
	/*搜索按钮*/
	$('.ssSpan').bind('click',function(){
		var va = $('.ss').val().trim();
		if(va.length > 0){
			var zv = stripscript(va).trim();
			if(zv.length > 0){
				//alert(zv);
				window.open("transferPages/search/"+va);
			}else{
				//$('.prompt').hide();
				$('.ss').val('').focus();
			}
		}else{
			//$('.prompt').hide();
			$('.ss').val('').focus();
		}
	});
	/*搜索框内监听回车按钮*/
	$('.ss').bind('keyup',function(event){
		var key =  event.keyCode;
		var t = this;
		var va = $(t).val().trim();
		if(va.length > 0){
			//$('.prompt').show();
			if(parseInt(key) == 13){
				//alert(va);
				window.open("transferPages/search/"+va);
			}
		}else{
			//$('.prompt').hide();
			$(t).val('').focus();
		}
	});
	/*搜索框的聚焦事件*/
	/*$('.ss').focus(function(){
		var t = this;
		var va = $(t).val().trim();
		if(va.length > 0){
			//$('.prompt').show();
		}else{
			//$('.prompt').hide();
			$(t).val('').focus();
		}
	});*/
	/*$('.ss').blur(function(){
		$('.prompt').hide();
	});*/
	$('.topDiv').bind('click',function(){
		var t = this;
		var isTj = $(t).find('img').attr('src');
		$('.maskLayer').attr('data-title','0');
		if(isTj.indexOf("top.gif") > -1){
			$('.maskLayer').css('height','500px');
			$('.zcText').show();
			$(t).find('img').attr('src',urlsl+'/pc/img/bottom.gif');
		}else if(isTj.indexOf("bottom.gif") > -1){
			$('.maskLayer').css('height','100px');
			$('.zcText').hide();
			$(t).find('img').attr('src',urlsl+'/pc/img/top.gif');
		}
	});
	/*预约免费设计/免费量房*/
	$('.yymflc').on('click',function(){
		if(!isLucky){
			isLucky = true;
			//获取当前是设计还是量房
			var currs_a = $('.currs_a').text();
			//标识是设计还是量房
			var bs_currs = 0;
			if("免费设计" == currs_a){
				bs_currs = 1;
			}else if("免费量房" == currs_a){
				bs_currs = 2;
			}
			//姓名
			var name = $('input[name="name"]').val().trim();
			//手机号码
			var tel= $('input[name="phone"]').val().trim();
			if(name.length == 0){
				isLucky = false;
				alert('请填写您的姓名');
				$('input[name="name"]').val('').focus();
				return;
			}
			if(tel.length == 0){
				isLucky = false;
				alert('请填写您的手机号码');
				$('input[name="phone"]').val('').focus();
				return;
			}
			if(!testPhone(tel)){
				isLucky = false;
				alert('请输入正确的手机号码');
				$('input[name="tel"]').val('').focus();
				return;
			}
			var rOry = 2;
			if(parseInt(bs_currs) == 1){
				$.each($('.curr_img'),function(i,v){
					var xz = $(v).attr('data-bs');
					if(parseInt(xz) == 1){
						var cl = $(v).attr('class');
						if(cl.indexOf('rz') > -1){
							rOry = 0;
						}else if(cl.indexOf('yz') > -1){
							rOry = 1;
						}
					}
				});
			}
			//点击预约提交信息
			$.ajax({
				type : 'POST',
				async : false,
				url : urlsl+'/addToReservation?type='+rOry,
				data : $('#reservation').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if(testTwoStringToEquels(re,"SUCCESS")){
						alert("恭喜您,预约成功!稍后会有工作人员与您联系!");
						location.reload();
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
	});
	
	//免费设计/免费量房
	$('.textDiv_span').on('click',function(){
		var v = $(this);
		var c = $(v).attr('class');
		if(c.indexOf("sj") > -1){
			$('.yymflc').text("预约免费设计");
			$('#wf').css('height','150px');
			$('.jjsj_div').show();
			$('.sj').addClass("currs_a");
			$('.lf').removeClass("currs_a");
		}else{
			$('.yymflc').text("预约免费量房");
			$('#wf').css('height','190px');
			$('.jjsj_div').hide();
			$('.sj').removeClass("currs_a");
			$('.lf').addClass("currs_a");
		}
	});
	
	//选择软装还是硬装
	$('.curr_img').on('click',function(){
		var v = $(this);
		var c = $(v).attr('class');
		if(c.indexOf('rz') > -1){//软装
			$('.rz_check_img').attr('src',urlsl+'/pc/images/checked_2.png');
			$('.yz_check_img').attr('src',urlsl+'/pc/images/checked_1.png');
			$('.rz_check_img').attr('data-bs','1');
			$('.yz_check_img').attr('data-bs','0');
		}else{//硬装
			$('.rz_check_img').attr('src',urlsl+'/pc/images/checked_1.png');
			$('.yz_check_img').attr('src',urlsl+'/pc/images/checked_2.png');
			$('.rz_check_img').attr('data-bs','0');
			$('.yz_check_img').attr('data-bs','1');
		}
	});
	$('.ts_li_rzdz a,.ts_li_yzdz a,.ts_li_jjwh a,.ts_li_jjlt a').hover(
		function(){
			var name = $(this).parent().attr('class');
			name = name.substring("ts_li_".length,name.length);
			var a_w = $('.ts_li_'+name).width();
			var d_w = $('.'+name+'_div').width();
			if(parseInt(d_w) > parseInt(a_w)){
				$('.'+name+'_div').addClass('bottom_right_radius');
			}
			$('.'+name+'_div').show();
		},function(){
			var name = $(this).parent().attr('class');
			name = name.substring("ts_li_".length,name.length);
			$('.'+name+'_div').hide();
			$('.'+name+'_div').removeClass('bottom_right_radius');
		}
	);
	$('.rzdz_div,.yzdz_div,.zxmfsj_div,.vrqjty_div,.jjwh_div,.jjlt_div').hover(
		function(){
			var name = $(this).attr('class');
			name = name.substring(0,name.indexOf("_"));
			$('.ts_li_'+name+' a').addClass('dzxs');
			var a_w = $('.ts_li_'+name).width();
			var d_w = $('.'+name+'_div').width();
			if(parseInt(d_w) > parseInt(a_w)){
				$('.'+name).addClass('bottom_right_radius');
			}
			$('.'+name+'_div').show();
		},function(){
			var name = $(this).attr('class');
			name = name.substring(0,name.indexOf("_"));
			$('.'+name+'_div').removeClass('bottom_right_radius');
			$('.ts_li_'+name+' a').removeClass('dzxs');
			$('.'+name+'_div').hide();
		}
	);
	/*$('.yzdz_div').hover(
			function(){
				$('.ts_li_yz a').addClass('dzxs');
				var a_w = $('.ts_li_yz ').width();
				var d_w = $('.yzdz_div').width();
				if(parseInt(d_w) > parseInt(a_w)){
					$('.yzdz_div').addClass('bottom_right_radius');
				}
				$('.yzdz_div').show();
			},function(){
				$('.ts_li_yz a').removeClass('dzxs');
				$('.yzdz_div').removeClass('bottom_right_radius');
				$('.yzdz_div').hide();
			}
		);
	$('.ts_li_yz a').hover(
		function(){
			var a_w = $('.ts_li_yz').width();
			var d_w = $('.yzdz_div').width();
			if(parseInt(d_w) > parseInt(a_w)){
				$('.yzdz_div').addClass('bottom_right_radius');
			}
			$('.yzdz_div').show();
		},function(){
			$('.yzdz_div').hide();
			$('.yzdz_div').removeClass('bottom_right_radius');
		}
	);*/
});

function yzTest(){
	//房屋类型
	var lx = $('select[name="lx"]').prop('selectedIndex');
	//木材种类
	var wood = $('select[name="wood"]').prop('selectedIndex');
	//手机号码
	var phone = $('input[name="phone"]').val().trim();
	if(parseInt(lx) == 0){
		alert('请选择你要定制的房屋类型');
		$('select[name="lx"]').focus();
		return false;
	}
	if(parseInt(wood) == 0){
		alert('请选择你要的木材原料种类');
		$('select[name="wood"]').focus();
		return false;
	}
	if(phone.length == 0){
		alert('请填写手机号码');
		$('input[name="phone"]').focus();
		return false;
	}
	if(!testPhone(phone)){
		alert('请输入正确的手机号码');
		$('input[name="phone"]').val('').focus();
		return false;
	}
	return true;
}

//开始计算
function calculation(){
	if(yzTest()){
		var price = 42500; 
		var cost = div(price,10000);
		$('.cost').html(price);
		if(parseInt(cost) >= 1){
			$('.yuan').html('万元');
			$('.cost').html(cost);
		}
		$('.cost1').html(19000);
		$('.cost2').html(20000);
		$('.cost3').html(1550);
		$('.cost4').html(1500);
	}
}
/**
 * 软装定制
 * @param oName
 */
function rzCustom(oName){
	window.open("getGoodsBy"+oName+"/1");
}

function jumBlankJ(url){
	window.open("pc/"+url+".jsp");
}

function jumBlankJK(url){
	window.open("appliance/"+url+".jsp");
}

function jumBlankP(url){
	window.open(url);
}
function getMeunValue(type,i){
	$.post('getMenuContent',{type:type},function(re){
		var strVar = "";
		strVar += "<ul class=\"hidden_memuUl\">";
		$.each(re.list,function(i,v){
			strVar += "<li class=\"hidden_memuLi\">";
			strVar += "<p class=\"hidden_memuUlUL\">";
			strVar += "<a href=\"javascript:void(0);\">风格：<\/a>";
			$.each(v.goodsStyles,function(k,va){
				strVar += "<span><a style='cursor: pointer;' href='clickMenuSeeGoodses"+type+"-0-"+va.gtid+"/0' target='_blank'>"+va.gtName+"<\/a><\/span>";
			});
			strVar += "<\/p>";
			strVar += "<\/li>";
		});
		$.each(re.list,function(i,v){
			strVar += "<li class=\"hidden_memuLi\">";
			strVar += "<p class=\"hidden_memuUlUL\">";
			strVar += "<a href=\"javascript:void(0);\">面积：<\/a>";
			$.each(v.goodsMeasures,function(k,va){
				$.each(va,function(kk,vv){
					strVar += "<span><a style='cursor: pointer;' href='clickMenuSeeGoodses"+type+"-0-0/"+kk+"' target='_blank'>"+kk+"m²<\/a><\/span>";
				});
			});
			strVar += "<\/p>";
			strVar += "<\/li>";
		});
	    strVar += "<\/ul>";
	    if(i == 0){
	    	$('.hiddenMemu').show().html(strVar);
	    }else if(i == 1){
	    	$('.hiddenMemu2').show().html(strVar);
	    }
	});
}

function jumeVip(vid){
	window.open('vipArticle/'+vid);
}

function topHead(){
	var oldUrl = location.href;
	var newUrl = null;
	if(oldUrl.indexOf('#') > -1){
		newUrl = oldUrl.substring(0,oldUrl.indexOf('#'));
	}else{
		newUrl = oldUrl;
	}
	location.href = newUrl+'#topBody';
}