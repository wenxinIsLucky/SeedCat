$(function(){
	jume(1,1,10,1);
});
function jume(examine,start,size,type){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'findCommunityData',
		data : {examine:examine,start:start,size:size,type:type},
		success : function(re){
			var strVar = '<h1 style=\"text-align: center;\">您暂时未上传话题</h1>';
			if(re != null){
				if(re.list.length > 0){
					strVar = '';
					$.each(re.list,function(i,v){
						strVar+='<tr height="40px" align="center">';
						strVar+='<td width="25%" class="td-title">'+v.createDate+'</td>';
						strVar+='<td width="25%" class="td-title">'+v.title+'</td>';
						strVar+='<td width="25%" class="td-title">System</td>';
						strVar+='<td width="25%" class="td-title">';
						strVar+='<a href="javascript:void(0);" onclick=\"getContent(\''+v.cid+'\')\">查看</a>';
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
					input_name : 'show_post-input',
					backFn : function(p){
						jume(examine,p,re.size,type);
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
		url : 'getContent/'+cid,
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

function sign(examine,cid,uid){
	var msg = "您发表的拍客审核成功，赶紧去瞧瞧吧";
	if(parseInt(examine) === 2){
		var msg = prompt("请填写审核失败原因","");
		if(msg==null || msg==""){
			return;
		}
	}
	$.ajax({
		type : 'POST',
		async : false,
		url : 'admin/signCommunity',
		data : {examine:examine,cid:cid,uid:uid,msg:msg},
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			alert(re.msg);
			if(re.status === 200){
				jume(examine,1,10,1);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}