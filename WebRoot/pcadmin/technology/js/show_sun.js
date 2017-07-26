$(function(){
	jume(0,1,10);
	
	$('.listpaike span').on('click',function(){
		$('.listpaike span').removeClass('current');
		$(this).addClass('current');
		var sh = $(this).attr('data-sh');
		jume(parseInt(sh),1,10);
	});
});
function jume(examine,start,size){
	$.each($('.listpaike span'),function(i,v){
		if(parseInt($(v).attr('data-sh')) === parseInt(examine)){
			$('.listpaike span').removeClass('current');
			$(v).addClass('current');
			return;
		}
	});
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getAdminSunHomeData',
		data : {param:examine,start:start,size:size},
		success : function(re){
			var typename = "待审核";
			if(parseInt(examine) == 1){
				typename = "审核成功";
			}
			if(parseInt(examine) == 2){
				typename = "审核失败";		
			}
			var strVar = '<h1 style=\"text-align: center;\">暂时未有'+typename+'晒家</h1>';
			if(re != null){
				if(re.list.length > 0){
					strVar = '';
					$.each(re.list,function(i,v){
						strVar+='<tr height="40px" align="center">';
						strVar+='<td width="25%" class="td-title">'+v.createDate+'</td>';
						strVar+='<td width="25%" class="td-title">'+v.title+'</td>';
						strVar+='<td width="25%" class="td-title">'+v.name+'</td>';
						strVar+='<td width="25%" class="td-title">';
						strVar+='<a href="javascript:void(0);" onclick=\"getContent(\''+v.shid+'\')\">查看</a>';
						if(v.examine == 0){
							strVar+='<a href="javascript:void(0);" onclick=\"sign(1,\''+v.shid+'\',\''+v.uid+'\')\">通过审核</a>';
							strVar+='<a href="javascript:void(0);" onclick=\"sign(2,\''+v.shid+'\',\''+v.uid+'\')\">审核不通过</a>';
						}
						strVar+='</td></tr>';
					});
				}
			}
			$('#tabledata').html(strVar);
			$('.page_p').remove();
			$('#show_post_div').append('<p class="page_p"></p>');
			if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'show_mysun-input',
					backFn : function(p){
						jume(examine,p,re.size);
					}
	            });
			}
		},error : function(re){
			alert(re.status);
		}
	});
}

function getContent(cid){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getSunHomeContent/'+cid,
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

function sign(examine,shid,uid){
	var msg = "您发表的晒家审核成功，赶紧去瞧瞧吧";
	if(parseInt(examine) === 2){
		msg = prompt("请填写审核失败原因","");
		if(msg==null || msg==""){
			return;
		}
	}
	$.ajax({
		type : 'POST',
		async : false,
		url : 'updAdminSunHome',
		data : {examine:examine,shid:shid,uid:uid,msg:msg},
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			alert(re.msg);
			if(re.status === 200){
				jume(examine,1,10);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}