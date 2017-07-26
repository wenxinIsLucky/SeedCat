$(function() {
		cssImg();
		$('.html_content_div_jquery').mouse({
			leftCss : 'zuo',
			rightCss : 'you',
			leftFn : function() {
				jumImg("prev");
			},
			rightFn : function() {
				jumImg("next");
			}
		});
		$('.html_content_div_jquery img,.sc_div').hover(function(){
			$('.sc_div').show();
		},function(){
			$('.sc_div').hide();
		});
		$('.sc_div').bind('click',function(){
			var t = this;
			var nav = $(t).find('div.name').data("na");
			var html = "&#xe6f5;";
			var navl = "取消收藏";
			var color = "#ff4200";
			var nav_na = 0;
			if(parseInt(nav) == 0){
				html = "&#xe611;";
				navl = "收藏";
				color = "#fff";
				nav_na = 1;
			}
			
			var url_s = "";
			if(parseInt(nav) == 0){
				url_s = "cancelDesignSketchCollection";
			}else if(parseInt(nav) == 1){
				url_s = "addDesignSketchCollection";
			}
			var dsid_v = $(t).find('div.name').data("lu");
			$.post(url_s,{dsid:dsid_v},function(re){
				if("SUCCESS".equels(re)){
					if(parseInt(nav) == 1){
						datek({title:"温馨提示",content:'收藏成功,您可以去收藏里查看!',imgSrc:"pc/img/success.png",datetime:1500});
					}
					$(t).find('i').html(html).css('color',color);
					$(t).find('div.name').data("na",nav_na);
					$(t).find('div.name').html(navl).css('color',color);
				}else if("LOGIN".equels(re)){
					location.href = 'transferPageChonggetDesignSketchDetails'+dsid_v;
				}else if("FAIL".equels(re)){
					alert("网络有误！请稍后再试");
				}else if("ALERT".equels(re)){
					alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
				}
			});
			return false;
		});
		$('.content_div_jquery ul li').bind('click', function() {
			$(this).siblings().removeClass('curr_img');
			$(this).addClass('curr_img');
			$('.html_content_div_jquery img').attr('src',$(this).find('img').attr('src'));
			cssImg();
		});

		function jumImg(type) {
			$.each($('.content_div_jquery ul li'),function(i, v) {
				if ('curr_img'.stringToEquels($(v).attr('class'))) {
					if ("prev".stringToEquels(type) && $(v).index() > 0) {
						$('.content_div_jquery ul li').removeClass('curr_img');
						$(v).prev().addClass('curr_img');
						$('.html_content_div_jquery img').attr('src',$(v).prev().find('img').attr('src'));
					} else if ("next".stringToEquels(type) && $(v).index() < $('.content_div_jquery ul li').length - 1) {
						$('.content_div_jquery ul li').removeClass('curr_img');
						$(v).next().addClass('curr_img');
						$('.html_content_div_jquery img').attr('src',$(v).next().find('img').attr('src'));
					}else if($(v).index() == 0){
						datekText({
							content : "已经是第一张",
							datetime : 1200
						});
					}else if($(v).index() == $('.content_div_jquery ul li').length - 1){
						datekText({
							content : "已是最后一张",
							datetime : 1200
						});
					}
					cssImg();
					return false;
				}
			});
		}
		
		function cssImg(){
			var width = $('.html_content_div_jquery img').width();
			var height = $('.html_content_div_jquery img').height();
			var zongHeight = $('.html_content_div_jquery').height();
			if(parseInt(height) < 750){
				var yHeight = zongHeight.sub(height).div(2);
				$('.html_content_div_jquery img').css('margin-top',yHeight+'px');
			}else{
				$('.html_content_div_jquery img').css('margin-top','0px');
			}
		}
	});