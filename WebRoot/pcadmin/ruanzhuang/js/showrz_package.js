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
	jume();
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
		var rpid = $('td', thisV).attr('viben');
		// var obj = {};
		// obj["rpid"] = rpid;
		location.href = 'transferrzPageruanzhuang-updrz_package,' + rpid;
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
		if (confirm('您确认删除该软装套餐')) {
			$('.youjian-div').hide();
			var rpid = $('td', thisV).attr('viben');
			$.ajax({
				type : 'POST',
				async : false,
				url : 'removeRz',
				data : {
					rpid : rpid
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
function jume() {
	$
			.ajax({
				type : 'POST',
				async : false,
				url : 'getRzPackageDatah',
				success : function(re) {
					var strVar = "";
					$
							.each(
									re,
									function(i, v) {
										var rppname = "";
										if (v.rz_package_projects.length > 0) {
											$
													.each(
															v.rz_package_projects,
															function(ii, vv) {
																rppname += "<a style=\"color:#000;\" href=\"getRzPackageProject?rppid="
																		+ vv.rppid
																		+ "&rpname="
																		+ v.rpname
																		+ "&rpid="
																		+ v.rpid
																		+ "\">"
																		+ vv.rppname
																		+ "</a>,";
															});
										}
										strVar += "<tr align=\"center\">\n";
										strVar += "	<td width=\"14%\" class=\"td-title\" viben=\""
												+ v.rpid
												+ "\" "
												+ (rppname == "" ? ""
														: "data-sj=\""
																+ v.shelves
																+ "\"")
												+ ">"
												+ v.rpname + "<\/td>\n";
										strVar += "	<td width=\"8%\" class=\"td-title\">"
												+ v.rpprice + "<\/td>\n";
										strVar += "	<td width=\"6%\" class=\"td-title\">"
												+ v.minprice + "<\/td>\n";
										strVar += "	<td width=\"9%\" class=\"td-title\">"
												+ v.rpstyle + "<\/td>\n";
										strVar += "	<td width=\"18%\" class=\"td-title\">"
												+ v.rpidea + "<\/td>\n";
										strVar += "	<td width=\"10%\" class=\"td-title\"><img class=\"span-content-img\" src=\"/static_img/rz_img/"
												+ v.rpimg + "\"/><\/td>\n";
										strVar += "	<td width=\"10%\" class=\"td-title\">"
												+ v.tab + "<\/td>\n";
										strVar += "	<td width=\"6%\" class=\"td-title\"><i style=\"width:26px;height:26px;background-color: #"
												+ v.rpcolor
												+ ";display: block;margin: 0px auto;\"><\/i><\/td>\n";
										strVar += "	<td width=\"18%\" class=\"td-title\">"
												+ rppname
												+ "<a style=\"color:#fa791b;\" href=\"goAddrz_package_project?rpid="
												+ v.rpid
												+ "&rpname="
												+ v.rpname
												+ "\">前去添加</a><\/td>\n";
										strVar += "<\/tr>\n";

										/*
										 * strVar += "<div
										 * class=\"column-div-content\">\n";
										 * strVar += " <span
										 * class=\"span-title\">"+v.rpname+"<\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\">"+v.rpprice+"<\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\">"+v.minprice+"<\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\">"+v.rpidea+"<\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\"><img
										 * class=\"span-content-img\"
										 * src=\"/static_img/rz_img/"+v.rpimg+"\"/><\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\">"+v.tab+"<\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\"><i
										 * style=\"width:26px;height:26px;background-color:
										 * #"+v.rpcolor+";display: block;margin:
										 * 0px auto;\"><\/i><\/span>\n";
										 * strVar += " <span
										 * class=\"span-title\">"+ifnulls(v.rz_package_projects.length>0,rppname,"<a
										 * href=\"javascript:void(0);\">前去完善</a>")+"<\/span>\n";
										 * strVar += "<\/div>\n";
										 */
									});
					$('#divdata').html(strVar);
					$("#divdata tr").bind('mousedown', function(e) {
						thisV = $(this);
						// 右键为3
						if (3 == e.which) {
							$("#divdata tr").removeClass('ddd');
							$(this).addClass('ddd');
							$('.youjian-div').css({
								'top' : yy,
								'left' : xx
							});
							$('.youjian-div').show();
							var sj = $('td', thisV).attr('data-sj');
							if (sj === "0") {
								$('.jia').text("上架");
							} else if (sj === "1") {
								$('.jia').text("下架");
							} else {
								$('.jia').empty();
							}
							$('.jia').attr('data-sj', sj)
						}
					});
				},
				error : function(re) {
					alert(re.status);
				}
			});
}