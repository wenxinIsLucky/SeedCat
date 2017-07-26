$(function(){
	/*搜索按钮*/
	$('.ssSpan').bind('click',function(){
		var va = $('.ss').val().trim();
		if(va.length > 0){
			var zv = va.stripscript();
			if(zv.length > 0){
				var is_search = $('#is_search').val();
				if(is_search == 0){
					window.open("transferPageMall/search/"+zv);
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
					window.open("transferPageMall/search/"+va);
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
});
function loginDparam(){
	var u = location.href;
	alert(u.substring(u.indexOf('Furniture/')+'Furniture/'.length,u.indexOf('.jsp')));
	return;
	location.href = 'transferPageMall/login/'+u.substring(u.indexOf('Furniture/')+'Furniture/'.length,u.length);
}