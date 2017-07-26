$(function(){
	$('.userinfo_myfootprint_page').createPage({
		pageCount : 5,
		current : 1,
		input_name : 'userinfo_myfootprint',
		backFn : function(p){
			
		}
	});
	
	$('.clear_span').on('click',function(){
		var v = this;
		var data_span = $(v).attr('data-span');
		alert(data_span);
		var obj = $(v).parent().parent();
		obj.remove();
	});
});