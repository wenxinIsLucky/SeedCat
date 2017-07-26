function margJul(){
	var two = 2;
	var count = $('.classification_content_div').size();
	for(var i = 1;i <= count;i++){
		//alert(i+"-"+i%two+"-"+i%3);
		if(i%two==0){
			$('.classification_content_div').eq(i-1).addClass('centen20');
			two+=3;
		}
		if(i%3==0){
			$('.classification_content_div').eq(i-1).removeClass('left').addClass('right');
		}
	};
}


function searchPostAjax(search,startSize,size,current){
	//alert(search);
	$.post('flipSee',{'search':search,'startSize':startSize,'size':size},function(re){
		$('.classification_content_zong_div').appendSearchHtml(re);
		margJul();
		if(re.countPage > 0){
			creP(re.countPage,current);
		}else{
			$('.nimeide').empty();
		}
	});
}

function creP(pageCount,current){
	$('.nimeide').empty();
	$('.nimeide').html('<p class="classification_page"></p>');
	$('.classification_page').createPage({
		pageCount : pageCount,
		current : current,
		input_name : 'classification',
		backFn : function(p){
			var search = $('.ss').val();
			searchPostAjax(search,p,12,p);
		}
	});
}