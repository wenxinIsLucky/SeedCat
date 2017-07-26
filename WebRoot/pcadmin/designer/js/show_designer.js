var xx = 0;
var yy = 0;
var yx = 0;
var thisV = null;
var isLucky = false;
$(function() {
	// 阻止浏览器默认右键点击事件
	$("body").bind("contextmenu", function() {
		return false;
	})
	jume(1,10);
	$('.error_opacity,.error_content').on('click', function() {
		$('.error_opacity,.error_content').hide();
	});
	$('.span-content-img').on('click', function() {
		$('.fd_img').attr('src', $(this).attr('src'));
		$('.error_opacity,.error_content').show();
	});
	$("body").on('mousemove', function(e) {
		xx = e.pageX + 1;
		yy = e.pageY + 1;
	});
	$("body").on('mousedown', function(e) {
		if (1 == e.which && yx === 0) {
			// 左键为1
			$("#divdata tr").removeClass('ddd');
			$('.youjian-div').hide();
		}
	})
	$(".youjian-div").on('mousemove', function(e) {
		yx = e.offsetX;
	});
	$(".youjian-div").on('mouseleave', function(e) {
		yx = 0;
	});

	$('.upd-span').on('click', function() {
		$('.youjian-div').hide();
		var did = $('td', thisV).attr('viben');
		// var obj = {};
		// obj["rpid"] = rpid;
		location.href = 'findDesignerByDid?did='+ did;
	});

	$('.jia').on('click', function() {
		if (!isLucky) {
			isLucky = true;
			$('.youjian-div').hide();
			var rpid = $('td', thisV).attr('viben');
			var type = parseInt($(this).attr('data-sj'));
			// alert(rpid+"-"+type);
			$.ajax({
				type : 'POST',
				async : false,
				url : 'editRz_Package_ProjectSxJ',
				data : {
					rpid : rpid,
					shelves : parseInt(type)==0?1:0
				}, // 转JSON字符串
				dataType : "text",
				success : function(re) {
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					isLucky = false;
					if (re === "SUCCESS") {
						alert("操作成功!");
						location.reload();
					} else {
						alert("网络有误！请稍后再试");
					}
				},
				error : function(re) {
					isLucky = false;
					alert(re.status);
				}
			});
		}
	});

	$('.del-span').on('click', function() {
		if (confirm('您确认删除该设计师的信息吗？')) {
			$('.youjian-div').hide();
			var did = $('td', thisV).attr('viben');
			$.ajax({
				type : 'POST',
				async : false,
				url : 'removeDesigner',
				data : {
					did : did
				}, // 转JSON字符串
				dataType : "text",
				success : function(re) {
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					if (re === "SUCCESS") {
						alert("操作成功!");
						location.reload();
					} else {
						alert("网络有误！请稍后再试");
					}
				},
				error : function(re) {
					alert(re.status);
				}
			});
		} else {
			$('.youjian-div').hide();
		}
	});
});
function jume(begin,end) {
	$
			.ajax({
				type : 'POST',
				async : false,
				url : 'findDesigner',
				data : {begin:begin,end:end},
				success : function(re) {
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					var strVar = '<h1>没有设计师信息</h1>';
					if(re != null){
						if(re.list.length > 0){
							strVar = '';
							$.each(re.list,function(i, v) {
								 strVar += '<tr height="40px" align="center">';
								    strVar += '	<td width="5%" class="td-title" viben='+v.did+'>'+v.dname+'</td>';
								    strVar += '	<td width="8%" class="td-title">'+v.level+'</td>';
								    strVar += '	<td width="8%" class="td-title">'+v.address+'</td>';
								    strVar += '	<td width="18%" class="td-title">'+v.style+'</td>';
								    strVar += '	<td width="20%" class="td-title">'+v.idea+'</td>';
								    strVar += '	<td width="5%" class="td-title"><img class="span-content-img" src="/static_img/designer_img/'
									 + v.head + '"/></td>';
								    strVar += '	<td width="8%" class="td-title">'+v.phone+'</td>';
								    strVar += '	<td width="9%" class="td-title">'+v.email+'</td>';
								    strVar += '	<td width="5%" class="td-title">'+v.pularval+'</td>';
								    strVar += '	<td width="8%" class="td-title">'+v.createDate+'</td>';
								    strVar += '	<td width="6%" class="td-title"><a href="goAddDesigner_case?did='+v.did+'&dname='+v.dname+'">新增案例</a><a href="goShowDesigner_case?did='+v.did+'&dname='+v.dname+'">案例列表</a></td>';
								    strVar += '</tr>';
							});
						}
					}
					$('#tabledata').html(strVar);
					//右键显示
					$("#tabledata tr").bind('mousedown',function(e) {
						thisV = $(this);
					    //右键为3
					    if (3 == e.which) {
					    	$("#tabledata tr").removeClass('ddd');
					    	$(this).addClass('ddd');
					        $('.youjian-div').css({'top':yy,'left':xx});
					        $('.youjian-div').show();
					    }
					});
					//分页
					$('.page_p').remove();
					$('#show_designer_div').append('<p class="page_p"></p>');
					if(re.countPage > 1){
						$('.page_p').createPage({
							pageCount : re.countPage,
							current : re.start,
							input_name : 'show_post-input',
							backFn : function(p){
								jume(p,re.size);
							}
			            });
					}
				},error : function(re){
					alert(re.status);
				}
			});
}