var zlen = 0;
	$(function(){
		window.onscroll = function(){
			//var k = document.body.offsetWidth; //(包括边线的宽)
			//var g = document.body.offsetHeight; //(包括边线的高)
			var jg = document.body.scrollTop; //网页被卷去的高
			//var jz = document.body.scrollLeft; //网页被卷去的左
			//console.log(k+"--"+g);
			if(parseInt(jg) > 50){
				$('.consnav').addClass('fdDiv');
			}else{
				$('.consnav').removeClass('fdDiv');
			}
			if(parseInt(jg) > 500){
				$('.top').removeClass('none');
			}else{
				$('.top').addClass('none');
			}
		};
  //提交
		$('.tjhf').bind('click',function(){
			var len = $('textarea').val().trim().length;
			if(len == 0 || (zlen!=0 && len <= zlen)){
				alert('请输入您的回复');
				$('textarea').focus();
				return;
			}
			var wzid = $('.scForum').attr('data-a');
			var context = $('textarea').val().trim();
			if(zlen == 0 && typeof($('textarea').attr("data-cid")) == "undefined"){
				$.post('addByArticleCommentNode',{'cid':1,'context':context,'wzid':wzid},function(re){
					if(re.indexOf("SUCCESS") > -1){
						alert('回复成功');
						$('textarea').val("");
						$('.page').val(re.substring("SUCCESS".length,re.length));
						//$('body').scrollTop(0);
	  				location.reload();
					}else if("LOGIN" == re){
						location.href='getByArticleCommentBy'+wzid+'UserIsNull';
					}else if("FAIL" == re){
						alert('回复失败');	
					}
				});
				return;
			}else{
				var cid = $('textarea').attr("data-cid");
				$.post('addByArticleCommentChildNode',{'cid':cid,'context':context.substring(zlen,context.length),'wzid':wzid},function(re){
					if(re.indexOf("SUCCESS") > -1){
						alert('回复成功');
	  				$('textarea').val("");
	  				//$('body').scrollTop(0);
	  				$('.page').val(re.substring("SUCCESS".length,re.length));
	  				location.reload();
					}else if("LOGIN" == re){
	  				location.href='getByArticleCommentBy'+wzid+'UserIsNull';
				} else if ("FAIL" == re) {
					alert('回复失败');
				}
			});
		}
	});
		
	//输入回复事件
	$('textarea').on('click', function() {
		var len = $('textarea').attr("data-name").length+4;
		var current_len = $('textarea').getCursorPosition();
		if(current_len < len){
			$('textarea').selectRange(len,len+1);
		}
	});
	
	//输入回复事件
	$('textarea').bind('keyup', function() {
		var len = $('textarea').attr("data-name").length+4;
		var current_len = $('textarea').getCursorPosition();
		if(current_len < len){
			$('textarea').selectRange(len,len+1);
		}
		return;
		var len = $('textarea').val().trim().length;
		if (zlen != 0) {
			if (len < zlen) {
				zlen = 0;
				$('textarea').removeAttr("data-cid");
				$('textarea').removeAttr("data-name");
				$('textarea').val("");
				$('.txz').text(1000);
				return;
			}
			len = len - zlen;
		}
		if (1000 - len <= 0) {
			$('textarea').val($('textarea').val().substring(0, 1000));
		}
		$('.txz').text(1000 - len);
	});
	//点击回复事件
	//回复楼主
	$('.floorZhu').bind('click', function() {
		var h = $('body').height();
		$(document).scrollTop(h); 
		$('textarea').val("");
		$('textarea').focus();
	});

	/* 只看楼主 */
	$('.seeLouzhu').bind('click', function() {
		if ($('.hfLouZhu').is(":hidden")) {//如果隐藏就显示
			$('.hfLouZhu').show();
		} else {
			$('.hfLouZhu').hide();
		}
	});
	
	/* 鼠标移上移出 */
	$('.rightColumn ul li').hover(function(){
		$(this).find('i').addClass('none');
		$(this).find('div').removeClass('none');
		if($(this).attr('class').indexOf('bottom') > -1){
			$(this).removeClass('dao');
		}
    },function(){
    	$(this).find('div').addClass('none');
		$(this).find('i').removeClass('none');
		if($(this).attr('class').indexOf('bottom') > -1){
        	$(this).addClass('dao');
		}
    });
	
	/* 收藏帖子 */
	$('.scForum').bind('click',function(){
		var aid = $(this).attr('data-a');
		$.post('addCollection',{'gid':aid,'gType':'article'},function(re){
			if(testTwoStringToEquels(re,"SUCCESS")){
				alert("收藏成功");
			}else if(testTwoStringToEquels(re,"FAIL")){
				alert("网络有误！请稍后再试");
			}else if(testTwoStringToEquels(re,"REPEAT")){
				alert("已存在您的收藏中");
			}else if(testTwoStringToEquels(re,"LOGIN")){
				location.href = 'transferVariousgetArticle'+aid+'Defailt';
			}else if(testTwoStringToEquels(re,"ALERT")){
				alert("警告,你提交的数据中带有非法字符,请仔细检查后再提交");
			}
		});
	});
});
	
function shang(){
	alert("123");
}