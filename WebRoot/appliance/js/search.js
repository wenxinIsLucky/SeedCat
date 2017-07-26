function searchPostAjax(search,startSize,size,current){
	//alert(search);
	$.post('flipSeeMall',{'search':search,'startSize':startSize,'size':size},function(re){
		$('.search_div_zong_content').appendSearchHtml(re);
		if(re.countPage > 0){
			creP(re.countPage,current);
		}else{
			$('.nimeide').empty();
		}
	});
}

function creP(pageCount,current){
	$('.nimeide').empty();
	$('.nimeide').html('<p class="search_p_page"></p>');
	$('.search_p_page').createPage({
  		pageCount : pageCount,
  		current : current,
  		input_name : 'search_page',
  		backFn : function(p){
  			var search = $('.ss').val();
			searchPostAjax(search,p,12,p);
  		}
  	});
}