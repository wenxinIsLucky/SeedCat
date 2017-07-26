var xx = 0;
var yy = 0;
var yx = 0;
var thisV = null;
$(function(){
	//阻止浏览器默认右键点击事件
	$("body").bind("contextmenu", function(){
		return false;
	})
	jume();
	$('.error_opacity,.error_content').on('click',function(){
		$('.error_opacity,.error_content').hide();
	});
	/*$('.span-content-img').on('click',function(){
		$('.fd_img').attr('src',$(this).attr('src'));
		$('.error_opacity,.error_content').show();
	});*/
	$("body").on('mousemove',function(e) {
		xx = e.pageX+1;
		yy = e.pageY+1;
	});
	
	$("body").on('mousedown',function(e) {
	    if (1 == e.which && yx === 0) {
	        //左键为1
	    	$("#divdata tr").removeClass('ddd');
	    	$('.youjian-div').hide();
	    }
	})
	$(".youjian-div").on('mousemove',function(e) {
		yx = e.offsetX;
	});
	$(".youjian-div").on('mouseleave',function(e) {
		yx = 0;
	});
	
	$('.upd-span').on('click',function(){
		$('.youjian-div').hide();
		var jpid = $('td',thisV).attr('viben');
		//var obj = {};
		//obj["rpid"] = rpid;
		location.href='transferjzPageyingzhuang-updjz_package,'+jpid;
	});
	
	$('.del-span').on('click',function(){
		if(confirm('您确认删除该硬装套餐')){
			$('.youjian-div').hide();
			var jpid = $('td',thisV).attr('viben');
			$.ajax({
				type : 'POST',
				async : false,
				url : 'removeJzPackage',
				data : {jpid:jpid}, //转JSON字符串  
				dataType : "text",
				success : function(re){
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					if(re==="SUCCESS"){
						alert("操作成功!");
						location.reload();
					}else {
						alert("网络有误！请稍后再试");
					}
				},error : function(re){
					alert(re.status);
				}
			});
		}else{
			$('.youjian-div').hide();
		}
	});
});
function jume(){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'findJzPackages',
		success : function(re){
			if(re === "LOGIN"){
				location.href = 'admin-loginto';
			}
			var strVar = "";
			$.each(re,function(i,v){
				var jcname = "";
				if(v.jz_config.length>0){
					$.each(v.jz_config,function(ii,vv){
						jcname+="<a style=\"color:#000;\" href=\"getAppointJzPorJzC?jcid="+vv.jcid+"&jpname="+v.jpname+"&jpid="+v.jpid+"\">"+vv.jcname+"</a>,";
					});
				}
			    strVar += "<tr align=\"center\">\n";
			    strVar += "	<td width=\"14%\" class=\"td-title\" viben=\""+v.jpid+"\">"+v.jpname+"<\/td>\n";
			    strVar += "	<td width=\"14%\" class=\"td-title\">"+v.jptype+"<\/td>\n";
			    strVar += "	<td width=\"12%\" class=\"td-title\">"+v.jpstartprice+"<\/td>\n";
			    /*strVar += "	<td width=\"9%\" class=\"td-title\">"+v.describe+"<\/td>\n";*/
			    strVar += "	<td width=\"32%\" class=\"td-title\">"+v.describe+"<\/td>\n";
			    /* strVar += "	<td width=\"10%\" class=\"td-title\"><img class=\"span-content-img\" src=\"/static_img/rz_img/"+v.rpimg+"\"/><\/td>\n";*/
			    strVar += "	<td width=\"10%\" class=\"td-title\">"+v.words+"<\/td>\n";
			    /* strVar += "	<td width=\"6%\" class=\"td-title\"><i style=\"width:26px;height:26px;background-color: #"+v.rpcolor+";display: block;margin: 0px auto;\"><\/i><\/td>\n";*/
			    strVar += "	<td width=\"18%\" class=\"td-title\">"+jcname+"<a style=\"color:#fa791b;\" href=\"goAddJzConfig?jpid="+v.jpid+"&jpname="+v.jpname+"\">前去添加</a><\/td>\n";
			    strVar += "<\/tr>\n";
			    
			    /*strVar += "<div class=\"column-div-content\">\n";
			    strVar += "	<span class=\"span-title\">"+v.rpname+"<\/span>\n";
			    strVar += "	<span class=\"span-title\">"+v.rpprice+"<\/span>\n";
			    strVar += "	<span class=\"span-title\">"+v.minprice+"<\/span>\n";
			    strVar += "	<span class=\"span-title\">"+v.rpidea+"<\/span>\n";
			    strVar += "	<span class=\"span-title\"><img class=\"span-content-img\" src=\"/static_img/rz_img/"+v.rpimg+"\"/><\/span>\n";
			    strVar += "	<span class=\"span-title\">"+v.tab+"<\/span>\n";
			    strVar += "	<span class=\"span-title\"><i style=\"width:26px;height:26px;background-color: #"+v.rpcolor+";display: block;margin: 0px auto;\"><\/i><\/span>\n";
			    strVar += "	<span class=\"span-title\">"+ifnulls(v.rz_package_projects.length>0,rppname,"<a href=\"javascript:void(0);\">前去完善</a>")+"<\/span>\n";
			    strVar += "<\/div>\n";*/
			});
			$('#divdata').html(strVar);
			$("#divdata tr").bind('mousedown',function(e) {
				thisV = $(this);
			    //右键为3
			    if (3 == e.which) {
			    	$("#divdata tr").removeClass('ddd');
			    	$(this).addClass('ddd');
			        $('.youjian-div').css({'top':yy,'left':xx});
			        $('.youjian-div').show();
			    }
			});
		},error : function(re){
			alert(re.status);
		}
	});
}