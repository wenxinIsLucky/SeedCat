$(function(){
	jume(0,1,10);
	
	$('.listpaike span').on('click',function(){
		$('.listpaike span').removeClass('current');
		$(this).addClass('current');
		var sh = $(this).attr('data-sh');
		jume(parseInt(sh),1,10);
	});
});
function jume(handle,start,end){
	$.each($('.listpaike span'),function(i,v){
		$(this).removeClass('current');
		if(parseInt($(this).attr('data-sh')) === parseInt(handle)){
			$(this).addClass('current');
		}
	});
	$.ajax({
		type : 'POST',
		async : false,
		url : 'adminfindDialogue',
		data : {handle:handle,start:start,end:end},
		success : function(re){
			var strVar = '<h1 style=\"text-align: center;\">暂时未有客户消息</h1>';
			var titleVar = '';
			if(handle == 0){
				titleVar += '<tr height="32px" align="center" bgcolor="#ccc"><td width="10%" class="td-title">头像</td>';
				titleVar += '<td width="10%" class="td-title">ip</td>';
				titleVar += '<td width="15%" class="td-title">ip所属地区</td>';
				titleVar += '<td width="20%" class="td-title">用户问题</td>';
				titleVar += '<td width="10%" class="td-title">发送时间</td>';
				titleVar += '<td width="5%" class="td-title">操作</td></tr>';
			}else if(handle == 1){
				titleVar += '<tr height="32px" align="center" bgcolor="#ccc"><td width="10%" class="td-title">头像</td>';
				titleVar += '<td width="10%" class="td-title">ip</td>';
				titleVar += '<td width="15%" class="td-title">ip所属地区</td>';
				titleVar += '<td width="20%" class="td-title">用户问题</td>';
				titleVar += '<td width="10%" class="td-title">发送时间</td>';
				titleVar += '<td width="10%" class="td-title">回复人</td>';
				titleVar += '<td width="20%" class="td-title">回复消息</td>';
				titleVar += '<td width="5%" class="td-title">操作</td></tr>';
			}
			if(re != null){
				if(re.list.length > 0){
					strVar = '';
					$.each(re.list,function(i,v){
						strVar+='<tr height="40px" align="center">';
						strVar+='<td width="10%" class="td-title">'+v.head+'</td>';
						strVar+='<td width="10%" class="td-title">'+v.ip+'</td>';
						strVar+='<td width="15%" class="td-title">'+v.ipAddress+'</td>';
						strVar+='<td width="20%" class="td-title">'+v.content+'</td>';
						strVar+='<td width="10%" class="td-title">'+v.createDate+'</td>';
						
						//strVar+='<td width="5%" class="td-title"><a href="javascript:vord(0);">回复</a></td>';
						
						if(v.handle == 1){
							strVar+='<td width="10%" class="td-title">'+v.designer.dname+'</td>';
							strVar+='<td width="20%" class="td-title">'+v.reply+'</td>';
						}
						strVar+='<td width="5%" class="td-title">';
						if(v.handle == 0){
							strVar+='<a href="javascript:vord(0);" onclick=\"toSuccess(\''+v.dgid+'\')\">回复</a>';
							strVar+='<a href="javascript:void(0);" onclick=\"toDele(\''+v.dgid+'\')\">删除</a>';
							//strVar+='<a href="javascript:void(0);" onclick=\"toSuccess(\''+v.afdid+'\')\">申请成功</a>';
							//strVar+='<a href="javascript:void(0);" onclick=\"toFail(\''+v.afdid+'\')\">申请失败</a>';
						}else if(v.handle == 1){
							strVar+='<a href="javascript:void(0);" onclick=\"toDele(\''+v.dgid+'\')\">删除</a>';
						}
						strVar+='</td></tr>';
					});
				}
			}
			
			$('#tabledata').html(strVar);
			$('.title_table').html(titleVar);
			$('.page_p').remove();
			$('#show_post_div').append('<p class="page_p"></p>');
			//分页
		/*	if(re.countPage > 1){
				$('.page_p').createPage({
					pageCount : re.countPage,
					current : re.start,
					input_name : 'show_post-input',
					backFn : function(p){
						jume(examine,p,re.size,type);
					}
	            });
			}*/
		},error : function(re){
			alert(re.status);
		}
	});
}



function toSuccess(dgid){
	var msg = prompt("请输入回复内容");
	//var DATE_FORMAT = /^[0-9]{4}-[0-1]?[0-9]{1}-[0-3]?[0-9]{1}$/;
	if(msg != null && msg != ""){
		upData(dgid,1,msg);
	}
}

/*function toFail(afdid){
	var msg = prompt("请输入失败原因");
	if(msg != null && msg != ""){
		upData(afdid,2,"",msg);
	}
}*/

function toDele(dgid){
	if (confirm('您确认删除该设计师案例吗？')) {
		$.ajax({
			type : 'POST',
			async : false,
			url : 'delDialogue',
			data : {dgid:dgid},
			success : function(re){
				if(re === "LOGIN"){
					location.href = 'admin-loginto';
				}
				if(re === "SUCCESS"){
					alert("删除成功!");
					jume(1,1,10);
				}else{
					alert("网络有误！请稍后再试");
				}
			},error : function(re){
				alert(re.status);
			}
		});
	}	
}

function upData(dgid,handle,reply){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'updDialogue',
		data : {dgid:dgid,handle:handle,reply:reply},
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			if(re === "SUCCESS"){
				alert("回复操作成功!");
				jume(1,1,10);
			}else{
				alert("网络有误！请稍后再试");
			}
		},error : function(re){
			alert(re.status);
		}
	});
}