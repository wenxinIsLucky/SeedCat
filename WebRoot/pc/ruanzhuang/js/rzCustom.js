$(function(){
	$.ajax({
		type : 'POST',
		async : false,
		url : 'getRzPackageDataq',
		success : function(re){
			$.each(re,function(i,v){
				html(i%2==0?"":"uerd_ys",v);
			});
		},error : function(re){
			alert(re.status);
		}
	});
});

function html(type,re){
	var rppname = "";
	$.each(re.rz_package_projects,function(i,v){
		rppname+=v.rppname;
		if(i <= re.rz_package_projects.length-1){
			rppname+=" &nbsp;  ";  
		}
	});
	var strVar = "";
    /*strVar += "<div class=\"uerd "+type+"\">";
    strVar += "<div class=\"w1200\">";
    strVar += "<p style=\"text-align:center;display: block;padding-top:30px;\">" +
    		"<div class=\"ruan_ji_left fl\" style=\"color:#"+re.rpcolor+";\">"+re.rpname+"<\/div>" +
    		"<div class=\"ruan_ji_right fl\" style=\"background: #"+re.rpcolor+";\">"+rppname+"<\/div><\/p>";
    strVar += "<div class=\"cl\"><\/div>";
    strVar += "<div class=\"ruan_ji2\">";
    strVar += "<div class=\"ruan_ji2_left fl\">【软装全套】￥"+re.rpprice+"<\/div>";
    strVar += "<div class=\"ruan_ji2_right fl\" style=\"color:#"+re.rpcolor+";\">"+re.rpstyle+"<\/div>";
    strVar += "<div class=\"cl\"><\/div><\/div>";
    strVar += "<div class=\"ruan_jianju\">";
    strVar += "<img src=\"pc/images/ruan1.jpg\" alt=\"\" class=\"ruan-img1\">";
    strVar += "<div class=\"por_uj\">";
    strVar += "<div class=\"por_uj-top\">";
    strVar += "<div class=\"pointedr\">";
    strVar += "<div class=\"por_uj1\">"+re.rpstyle+"<\/div>";
    strVar += "<div class=\"por_uj2\">"+(re.rpname.substring(0,4))+"<\/div>";
    strVar += "<div class=\"por_uj3\">"+rppname+"<\/div><\/div><\/div>";
    strVar += "<div class=\"dinzhi-fe\">全屋家具定制低至"+re.minprice+"元/m<sup>2<\/sup>空间使用率马上提升70%<\/div>";
    strVar += "<div class=\"dinzhi_fft\">包设计/包配送/包安装<\/div>";
    strVar += "<div class=\"dif_lian\">";
    strVar += "<a href=\"getRzPackageToPage?rpid="+re.rpid+"\">查看详情<\/a>";
    //console.log(re.rpid);
    strVar += "<\/div><\/div><\/div><\/div><div class=\"cl\"><\/div><\/div>";*/
    
	strVar+="<div class=\"uerd "+type+"\"><div class=\"w1200\">";
	strVar+="<div class=\"ruan_ji1\">";
	strVar+="<div class=\"ruan_ji_left\" style=\"color:#"+re.rpcolor+";\">"+re.rpname+"<\/div>";
	strVar+="<div class=\"ruan_ji_right\" style=\"background:#"+re.rpcolor+";\">"+rppname+"<\/div><\/div>";
	strVar+="<div class=\"cl\"><\/div><div class=\"ruan_ji2\">";
	strVar+="<div class=\"ruan_ji2_left\">【软装全套】￥"+re.rpprice+"<\/div>";
	strVar+="<div class=\"ruan_ji2_right\" style=\"color:#"+re.rpcolor+";\">"+re.rpstyle+"<\/div>";
	strVar+="<div class=\"cl\"><\/div><\/div><div class=\"ruan_jianju\">";
	strVar+="<img src=\"/static_img/rz_img/"+re.rpimg+"\" alt=\"\" class=\"ruan-img1\">";
	strVar+="<div class=\"por_uj\"><div class=\"por_uj-top\"><div class=\"pointedr\">";
	strVar+="<div class=\"por_uj1\">"+re.rpstyle+"<\/div>";
	strVar+="<div class=\"por_uj2\">"+(re.rpname.substring(0,4))+"<\/div>";
	strVar+="<div class=\"por_uj3\">"+rppname+"<\/div><\/div><\/div>";
	strVar+="<div class=\"dinzhi-fe\">全屋家具定制低至"+re.minprice+"元/m<sup>2<\/sup>空间使用率马上提升70%<\/div>";
	strVar+="<div class=\"dinzhi_fft\">包设计/包配送/包安装<\/div>";
	strVar+="<div class=\"dif_lian\"><a href=\"getRzPackageToPage?rpid="+re.rpid+"\">查看详情<\/a><\/div><\/div><\/div><\/div><div class=\"cl\"><\/div><\/div>";
    
    $('.title').after(strVar);
}