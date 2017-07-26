var isLucky = false;
$(function(){
	//加载设计师免费设计申请列表
	loadDesigner_apply();
	
	//加载设计师列表分页值
	loadDesigner(1,10);
	
	//加载设计师案例列表
	loadDesigner_case();
	
	//加载对话列表
	loadDialogue(1,5);
	
	$('#formda input[type="text"]').blur(function(){
		var v = this;
		var go = ($(v).val().trim() != "");
		if ($(v).attr("vali") == "number") {
			var reg = /^[0-9]+.?[0-9]*$/;
			go = reg.test($(v).val())
		}
		if (go) {
			$(v).removeClass("error-border-color");
		} else {
			$(v).addClass("error-border-color");
		}
	});
	
	$('#submit').click(function(){
		$('#formda input[type="text"]').blur();
		if ($(".error-border-color").length == 0 && !isLucky) {
			isLucky = true;
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addDesigner_apply',
				data : $('#formda').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if(re==="SUCCESS"){
						alert("恭喜您,申请成功!稍后会有工作人员与您联系!");
						location.reload();
					}else if(re==="FAIL" || re==="ALERT"){
						alert("网络有误！请稍后再试");
					}
				},error : function(ms){
					isLucky = false;
					alert(ms.status);
				}
			});
		}
	});
	
	//加载设计师免费设计申请列表
	function loadDesigner_apply(){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'searchtodayDesigner_apply',
			success : function(re){
				$.each(re,function(i,v){
					if (v != null) {
						$('.list_l ul').html('<li><a href="javascript:void(0);">'+v.city+v.name+convertDateFromString(v.createDate)+'已申请上门量尺</a></li>');
					}
				});
			},error : function(re){
				alert(re.status);
			}
		});
	}
	
	//格式化时间
	function convertDateFromString(dateString) { 
		if (dateString) { 
		var arr1 = dateString.split(" "); 
		var sdate = arr1[0].split('-'); 
		var date = sdate[1]+"月"+sdate[2]+"日"; //sdate[0]+"年"+
		return date;
		}
	}
	
	
	//加载设计师列表
	function loadDesigner(begin,end){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'pcfindDesigner',
			data : {begin:begin,end:end},
			success : function(re) {
				var strVar = '<h1>没有设计师信息</h1>';
				if(re != null){
					if(re.list.length > 0){
						strVar = '';
						$.each(re.list,function(i, v) {
							if(i === 0){
								strVar += '<li style="width:670px; height:210px; " class=""></li>';
								$('.csfe1').find('a').attr('href','pcfindDesignerByDid?did='+v.did);
						        $('.appdetail_h').find('img').attr('src','/static_img/designer_img/'+v.head);
						        $('.frwsw .appdetail_v').html(v.idea);
						        $('.frwsw span').text(v.level+' · '+v.dname);
							}else if(i === 3){
								strVar += '<li style="width:328px; height:210px; " class=""></li>';
							}
							strVar += '<li class=""><a href="pcfindDesignerByDid?did='+v.did+'" target="_blank" class="des_img "> <img width="157px;" height="215px;" src="/static_img/designer_img/'+v.head+'" data-original="/static_img/designer_img/'+v.head+'" conc="'+v.idea+'" name="'+v.level+' · '+v.dname+'" alt="'+v.level+' · '+v.dname+'">';
					        strVar += '<div class="red_kuang"></div>';   //pcfindDesignerByDid?did="'+v.did+'
						    strVar += '</a></li>';
						});
					}
				}
				
				$('#app_iphone_list').html(strVar);
				
			},error : function(re){
				alert(re.status);
			}
		});
	}

	//加载设计师案例列表
	function loadDesigner_case(){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'pcfindDesignerData',
			success : function(re) {
				var designerCaseVar = '';
				if(re != null){
					if(re.length > 0){
						var designerVar = '';
						//var designerCaseVar = '';
						$.each(re,function(i, v) {
							var head = "/static_img/designer_img/"+v.head;
							var dname = v.dname;
							var did = v.did;
							//var num = re.length;
							$.each(v.designer_case,function(ii,vv){
								var imgs = vv.imgs;
								if(null === imgs){
									imgs = "";
								}
								var strs = new Array();
								strs = imgs.split(",");
								if((i === 1 && ii === 0 || ii === 3 ) || i === 4 || i === 7){
									designerCaseVar += "<li class=\"liv_ul-hoc\"><div class=\"liv_ul1\">";
								}else{
									designerCaseVar += "<li><div class=\"liv_ul1\">";
								}
								designerCaseVar += "<a href=\"findDesignerByid?did="+did+"&dcid="+vv.dcid+"\"><img src=\"/static_img/designer_case/img/"+strs[0]+"\" alt=\"\"><\/a>";
								designerCaseVar += "<\/div><div class=\"liv\"><div class=\"liv_ul2\">";
								designerCaseVar += "<span class=\"ul1 fl\">"+vv.size+"m<sup>2<\/sup>"+vv.model+"<\/span> <span class=\" fl ul2\">"+vv.name+"<\/span>";
								designerCaseVar += "<div class=\"cl\"><\/div><p>"+vv.describe+"<\/p>";
								designerCaseVar += "<\/div><div class=\"liv_ul3\"><span>客户需求<\/span>";
								designerCaseVar += "<p>"+vv.important+"<\/p><\/div>";
								designerCaseVar += "<div class=\"liv_ul4\"><div class=\"liv_ul4_left fl\">";
								designerCaseVar += "<span>设计师解决<\/span><p>"+vv.recollections	+"<\/p>";
								designerCaseVar += "<div class=\"dianz\">"+vv.follow+"<\/div><\/div>";
								designerCaseVar += "<div class=\"liv_ul4_right fr\">";
								designerCaseVar += "<img src=\""+head+"\" alt=\"\"><span>"+dname+"<\/span><\/div>";
								designerCaseVar += "<div class=\"cl\"><\/div>";
								designerCaseVar += "<\/div><\/div><\/li>";
							});
						});
					}
				}
				$('.liv_ul ul').html(designerCaseVar);
			},error : function(re){
				alert(re.status);
			}
		});
	}
	
	
	//加载对话列表
	function loadDialogue(start,end){
		$.ajax({
			type : 'POST',
			async : false,
			url : 'findDialogue',
			data : {start:start,end:end},
			success : function(re) {
				var strDiaVar = '<h1>没有对话信息</h1>';
				if(re != null){
					console.log('有没有数据'+re);
					if(re.list.length > 0){
						strDiaVar = '';
						$.each(re.list,function(i, v) {
							strDiaVar += '<li><div class="Conver1 fl">'
							strDiaVar += '<div class="Conver_left fl">'   
							strDiaVar += '<img src="pc/images3/cui_tou.png" alt=""></div>'       
							strDiaVar += '<div class="Conver_right fl">'           
							strDiaVar += '<div class="Conver_right1">'+v.ip+'.*(来自'+v.ipAddress+')'+v.createDate+'</div>'        									
							strDiaVar += '<div class="Conver_right2">'+v.content+'</div>'        
							strDiaVar += '</div><div class="cl"></div></div>'            
							strDiaVar += '<div class="Conver2 fr"><div class="Conver_left fr">'            
							strDiaVar += '<img src="pc/images3/cui_tou.png" alt=""></div>'        
							strDiaVar += '<div class="Conver_right fl">'        
							strDiaVar += '<div class="Conver_right1 fr frd">'+v.designer.level+'&nbsp;   '+v.designer.dname+'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'+v.designer.pularval+'</div>'    
							strDiaVar += '<div class="cl"></div><div class="Conver_right2 frdsrr">'+v.reply+'</div></div></div>'    
							strDiaVar += '<div class="cl"></div></li>'         
						});
					}
				}
				$('.Conver ul').html(strDiaVar);
				//分页
				/*$('.page').remove();
				$('#show_post_div').append('<p class="page_p"></p>');
				if(re.countPage > 1){
					$('.page_p').createPage({
						pageCount : re.countPage,
						current : re.start,
						input_name : 'show_post-input',
						backFn : function(p){
							loadDialogue(re.size,type);
						}
		            });
				}*/
				
			},error : function(re){
				alert(re.status);
			}
		});
	}
	
	
	$('#formco textarea[name="content"]').blur(function(){
		var v = this;
		var go = ($(v).val().trim() != "");
		if ($(v).attr("vali") == "number") {
			var reg = /^[0-9]+.?[0-9]*$/;
			go = reg.test($(v).val())
		}
		if (go) {
			$(v).removeClass("error-border-color");
		} else {
			$(v).addClass("error-border-color");
		}
	});
	
	//获取用户提问消息
	/*$('.dia-v').on('click',function(){
		
	});*/
	
	//获取用户提问消息
	$('#submittw').click(function(){
		$('#formco textarea[name="content"]').blur();
		if ($(".error-border-color").length == 0 && !isLucky) {
			//var content = $('textarea[name="content"]').val();
			//alert(content);
			isLucky = true;
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addDialogue',
				data : $('#formco').serialize(),
				dataType : "text",
				success : function(re){
					isLucky = false;
					if(re==="SUCCESS"){
						alert("问题已提交!稍后会有设计师回复您!");
						location.reload();
					}else if(re==="FAIL" || re==="ALERT"){
						alert("网络有误！请稍后再试");
					}
				},error : function(ms){
					isLucky = false;
					alert(ms.status);
				}
			});
		}
	});
	
	
	
	/*if(i === 0){
	strVar += '<li style="width:670px; height:210px; " class=""></li>';
	$('.csfe1').find('a').attr('href','pcfindDesignerByDid?did='+v.did);
    $('.appdetail_h').find('img').attr('src','/static_img/designer_img/'+v.head);
    $('.frwsw .appdetail_v').html(v.idea);
    $('.frwsw span').text(v.level+' · '+v.dname);
}else if(i === 3){
	strVar += '<li style="width:328px; height:210px; " class=""></li>';
}
strVar += '<li class=""><a href="pcfindDesignerByDid?did='+v.did+'" target="_blank" class="des_img "> <img width="157px;" height="215px;" src="/static_img/designer_img/'+v.head+'" data-original="/static_img/designer_img/'+v.head+'" conc="'+v.idea+'" name="'+v.level+' · '+v.dname+'" alt="'+v.level+' · '+v.dname+'">';
strVar += '<div class="red_kuang"></div>';   //pcfindDesignerByDid?did="'+v.did+'
strVar += '</a></li>';*/
	
});