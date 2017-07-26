$(function(){
	jume(0,1,10);
	
	$('.listpaike span').on('click',function(){
		$('.listpaike span').removeClass('current');
		$(this).addClass('current');
		var sh = $(this).attr('data-sh');
		jume(parseInt(sh),1,10);
	});
});
function jume(type,start,size){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getClassic_caseData',
		data : {param:type,start:start,size:size},
		success : function(re){
			var strVar = '<h1 style=\"text-align: center;\">暂时未有该类型案例</h1>';
			if(re != null){
				if(re.list.length > 0){
					strVar = '';
					$.each(re.list,function(i,v){
						strVar+='<tr height="40px" align="center">';
						strVar+='<td width="25%" class="td-title">'+v.createDate.substring(0,19)+'</td>';
						strVar+='<td width="25%" class="td-title">'+v.title+'</td>';
						strVar+='<td width="25%" class="td-title">'+v.author+'</td>';
						strVar+='<td width="25%" class="td-title">';
						strVar+='<a href="javascript:void(0);" onclick=\"getContent(\''+v.ccid+'\','+v.type+')\">查看</a>';
						strVar+='</td></tr>';
					});
				}
			}
			$('#tabledata').html(strVar);
			$('.page_p').remove();
			$('#show_classic_case_div').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'show_classic_case-input',
					backFn : function(p){
						jume(type,p,re.size);
					}
	            });
			}
		},error : function(re){
			alert(re.status);
		}
	});
}

function getContent(sid,type){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getClassic_caseContent'+type,
		data : {sid : sid},
		success : function(re){
			$('.contentdiv').html(re.content);
			var width = $('.error_content').width();
			$.each($('.contentdiv').find('img'),function(i,v){
				if($(v).width() > width){
					$(v).width(width);
				}
			});
			$('.error_mask,.error_content').show();
		},error : function(re){
			alert(re.status);
		}
	});
}