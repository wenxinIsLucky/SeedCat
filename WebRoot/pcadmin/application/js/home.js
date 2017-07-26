$(function(){
	jume(0,1,10);
	
	$('.listpaike span').on('click',function(){
		$('.listpaike span').removeClass('current');
		$(this).addClass('current');
		var sh = $(this).attr('data-sh');
		jume(parseInt(sh),1,10);
	});
});
function jume(handle,start,size){
	$.each($('.listpaike span'),function(i,v){
		$(this).removeClass('current');
		if(parseInt($(this).attr('data-sh')) === parseInt(handle)){
			$(this).addClass('current');
		}
	});
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getHome_designData',
		data : {handle:handle,start:start,size:size},
		success : function(re){
			var strVar = '<h1 style=\"text-align: center;\">暂时未有待处理的申请表</h1>';
			var titleVar = '';
			var bfb = "20%";
			if(handle == 0){
				titleVar += '<tr height="32px" align="center" bgcolor="#ccc">';
				titleVar += '<td width="25%" class="td-title">申请时间</td>';
				titleVar += '<td width="25%" class="td-title">申请人称呼</td>';
				titleVar += '<td width="25%" class="td-title">申请人手机号码</td>';
				titleVar += '<td width="25%" class="td-title">操作</td></tr>';
				bfb = "25%";
			}else if(handle == 1){
				titleVar += '<tr height="32px" align="center" bgcolor="#ccc">';
				titleVar += '<td width="20%" class="td-title">申请时间</td>';
				titleVar += '<td width="20%" class="td-title">申请人称呼</td>';
				titleVar += '<td width="20%" class="td-title">申请人手机号码</td>';
				titleVar += '<td width="20%" class="td-title">上门时间</td>';
				titleVar += '<td width="20%" class="td-title">操作</td></tr>';
			}else if(handle == 2){
				titleVar += '<tr height="32px" align="center" bgcolor="#ccc">';
				titleVar += '<td width="20%" class="td-title">申请时间</td>';
				titleVar += '<td width="20%" class="td-title">申请人称呼</td>';
				titleVar += '<td width="20%" class="td-title">申请人手机号码</td>';
				titleVar += '<td width="20%" class="td-title">失败原因</td>';
				titleVar += '<td width="20%" class="td-title">操作</td></tr>';
			}
			if(re != null){
				if(re.list.length > 0){
					strVar = '';
					$.each(re.list,function(i,v){
						strVar+='<tr height="40px" align="center">';
						strVar+='<td width="'+bfb+'" class="td-title">'+v.createDate+'</td>';
						strVar+='<td width="'+bfb+'" class="td-title">'+v.name+'</td>';
						strVar+='<td width="'+bfb+'" class="td-title">'+v.phone+'</td>';
						if(v.handle == 1){
							strVar+='<td width="'+bfb+'" class="td-title">'+v.doorDate.substring(0,10)+'</td>';
						}
						if(v.handle == 2){
							strVar+='<td width="'+bfb+'" class="td-title">'+v.errorMsg+'</td>';
						}
						strVar+='<td width="'+bfb+'" class="td-title">';
						if(v.handle == 0){
							strVar+='<a href="javascript:void(0);" onclick=\"toSuccess(\''+v.hdid+'\')\">申请成功</a>';
							strVar+='<a href="javascript:void(0);" onclick=\"toFail(\''+v.hdid+'\')\">申请失败</a>';
						}else if(v.handle == 1){
							strVar+='<a href="javascript:void(0);" onclick=\"toFail(\''+v.hdid+'\')\">中途失败</a>';
						}else if(v.handle == 2){
							strVar+='<a href="javascript:void(0);" onclick=\"toDele(\''+v.hdid+'\')\">删除</a>';
						}
						strVar+='</td></tr>';
					});
				}
			}
			$('#tabledata').html(strVar);
			$('.title_table').html(titleVar);
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

function toSuccess(hdid){
	var msg = prompt("请输入上门时间","20XX-XX-XX");
	var DATE_FORMAT = /^[0-9]{4}-[0-1]?[0-9]{1}-[0-3]?[0-9]{1}$/;
	if(msg != null && msg != "" && msg != "20XX-XX-XX"){
		if(DATE_FORMAT.test(msg)){
			upData(hdid,1,msg,"");
		}else{
			alert("您输入的日期格式不正确，格式为:20XX-XX-XX");
		}
	}
}

function toFail(hdid){
	var msg = prompt("请输入失败原因");
	if(msg != null && msg != ""){
		upData(hdid,2,"",msg);
	}
}

function toDele(hdid){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'delHome_designData',
		data : {hdid:hdid},
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			alert(re.msg);
			if(re.status == 200){
				jume(2,1,10);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}

function upData(hdid,handle,doorDate,errorMsg){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'editHome_designData',
		data : {hdid:hdid,handle:handle,doorDate:doorDate,errorMsg:errorMsg},
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			alert(re.msg);
			if(re.status == 200){
				jume(handle,1,10);
			}
		},error : function(re){
			alert(re.status);
		}
	});
}