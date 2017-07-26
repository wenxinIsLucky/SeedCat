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
		$('.zongDaoHang').addClass('fixed');
	}else{
		$('.zongDaoHang').removeClass('fixed');
	}
};
$(function(){
	/*搜索按钮*/
	$('.ssSpan').bind('click',function(){
		var va = $('.ss').val().trim();
		if(va.length > 0){
			var zv = va.stripscript();
			if(zv.length > 0){
				var is_search = $('#is_search').val();
				if(is_search == 0){
					window.open("transferPages/search/"+zv);
				}else if(is_search == 1){
					searchPostAjax(zv,1,12,1);
				}
			}else{
				//$('.prompt').hide();
				$('.ss').val('').focus();
			}
		}else{
			//$('.prompt').hide();
			$('.ss').val('').focus();
		}
		$('.ss').val(va.stripscript());
	});
	/*搜索框内监听回车按钮*/
	$('.ss').bind('keyup',function(event){
		var key =  event.keyCode;
		var t = this;
		var va = $(t).val().trim();
		if(va.length > 0){
			//$('.prompt').show();
			if(parseInt(key) == 13){
				var is_search = $('#is_search').val();
				if(is_search == 0){
					window.open("transferPages/search/"+va);
				}else if(is_search == 1){
					searchPostAjax(va,1,12,1);
				}
			}
		}else{
			//$('.prompt').hide();
			$(t).val('').focus();
		}
		$('.ss').val(va.stripscript());
	});
	/*搜索框的聚焦事件*/
	$('.ss').focus(function(){
		var t = this;
		var va = $(t).val().trim();
		if(va.length > 0){
			//$('.prompt').show();
		}else{
			//$('.prompt').hide();
			$(t).val('').focus();
		}
	});
	
	$('.ts_li_rzdz a,.ts_li_yzdz a,.ts_li_zxmfsj a,.ts_li_vrqjty a,.ts_li_jjwh a,.ts_li_jjlt a').hover(
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
});


function jumBlankJ(url){
	window.open("pc/"+url+".jsp");
}

function jumBlankJK(url){
	window.open("appliance/"+url+".jsp");
}

function jumBlankP(url){
	window.open(url);
}

function loginDparam(){
	var u = locatin.href;
	alert(u.substring(u.indexOf('Furniture/')+'Furniture/'.length(),u.length()));
	return;
	location.href = 'transferPages/login/'+u.substring(u.indexOf('Furniture/')+'Furniture/'.length(),u.length());
}