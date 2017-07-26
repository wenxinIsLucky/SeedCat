var isLucky = false;
var tabs = [];
var file = null;
var x = 0;
var y = 0;
var xx = 0;
var yy = 0;
var yx = 0;
var thisV = null;
var bnwk = 0;
$(function(){
	//阻止浏览器默认右键点击事件
	$(".contentDiv").bind("contextmenu", function(){
		return false;
	})
	$("body").on('mousedown',function(e) {
	    if (1 == e.which && yx === 0) {
	        //左键为1
	    	$('.youjian-div').hide();
	    }
	})
	$("body").on('mousemove',function(e) {
		xx = e.pageX+1;
		yy = e.pageY+1;
	});
	$(".youjian-div").on('mousemove',function(e) {
		yx = e.offsetX;
	});
	$(".youjian-div").on('mouseleave',function(e) {
		yx = 0;
	});
	$("#file_upload").change(function () {
		var num = "";
    	if($(this).attr('id').indexOf('2') > -1){
    		num = "2";
    	}
        var $file = $(this);
        var fileObj = $file[0];
        file = this.files[0];
        var windowURL = window.URL || window.webkitURL;
        var dataURL;
        var $img = $("#preview"+num);

        if (fileObj && fileObj.files && fileObj.files[0]) {
            dataURL = windowURL.createObjectURL(fileObj.files[0]);
            $img.attr('src', dataURL);
        } else {
            dataURL = $file.val();
            var imgObj = document.getElementById("preview"+num);
            // 两个坑:
            // 1、在设置filter属性时，元素必须已经存在在DOM树中，动态创建的Node，也需要在设置属性前加入到DOM中，先设置属性在加入，无效；
            // 2、src属性需要像下面的方式添加，上面的两种方式添加，无效；
            imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
            imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;

        }
    });
    
    $(".file").on("change","input[type='file']",function(){
    	var num = "";
    	if($(this).parent().attr('class').indexOf('2') > -1){
    		num = "2";
    	}
        var filePath=$(this).val();
        if(filePath.indexOf("jpg")!=-1 || filePath.indexOf("png")!=-1){
            $(".fileerrorTip"+num).html("").hide();
            var arr=filePath.split('\\');
            var fileName=arr[arr.length-1];
            $(".showFileName"+num).html(fileName);
        }else{
        	if(typeof($('#preview'+num).attr("src")) == "undefined" || filePath.indexOf("jpg")==-1 || filePath.indexOf("png")==-1){
                $(".showFileName"+num).html("");
                $(".fileerrorTip"+num).html("您未上传文件，或者您上传文件类型有误！").show();
                return false ;
        	}
        }
        if($(".showFileName"+num).text() != ""){
        	$(".file"+num).removeClass("red");
        }
        loadingImg(num);
    });
    
    
    $('#tab-div').on('click',function(){
    	$('.tabinput').show();
    	$('.tabinput').focus();
    	if($('.tab-span').length > 4){
    		$('.tabinput').hide();
    	}
    });
    
    $('.tabinput').on('keyup',function(){
    	if($('.tab-span').length > 4){
    		$('.tabinput').hide();
    	}
    	if($(this).val().indexOf(',') == 0){
    		$(this).val("");
    	}
    	
    	if($(this).val().indexOf(',') > 0 && $('.tab-span').length < 5){
    		if($.inArray($(this).val().replace(',',''), tabs) > -1){
    			$('.msg-data').show().delay(1000).fadeOut();
        	}else{
        		$('#tab-div').prepend('<span class="tab-span">'+$(this).val().replace(',','')+'</span>');
        		tabs[$('.tab-span').length-1] = $(this).val().replace(',','');
        		$(this).val("");
        		$('.tab-span').bind('click',function(){
        			$(this).remove();
        		});
        	}
    	}
    });
    
    $('.tabinput').on('blur',function(){
    	$('.tabinput').hide();
    });
    
    $("#cp3").colorpicker({
        fillcolor:true,
        success:function(o,color){
            $("#cp3text").css("color",color);
        }
    });
    
    $('.i,textarea').blur(function(){
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
    
    $('#add-button-div').on('click',function(){
    	$('.i').blur();
    	var fileName = $(".showFileName").text();
    	if(fileName == ""){
    		$('.file').addClass('red');
    	}else{
    		$('.file').removeClass('red');
    	}
		if ($(".error-border-color").length == 0 && !isLucky && fileName != "") {
			isLucky = true;
			var obj = {};
			$(".i").each(function(i, v) {
				var name = $(v).attr("name")
				obj[name] = $(v).val();
			});
			obj["jpid"] = $('input[name="jpname"]').attr("vaben");
			obj["jcimg"] = $('.jcimg').val();
			/*obj["project_info.rpiimg"] = $('.rpiimg').val();
			obj["project_info.rpiid"] = $('input[name="rpiid"]').val();*/
			/*var newtabs = [];
			$('.content-span').each(function(i,v){
				var jsonc = {};
				$(v).find('lwx').each(function(ii,vv){
					var name = $(vv).attr("class");
					jsonc[name] = $(vv).text();
				});
				newtabs[i] = JSON.stringify(jsonc);
			});
			obj["project_info.rpiinfo"] = newtabs.join(",");*/
			//console.log(obj);
			$.ajax({
				type : 'POST',
				async : false,
				url : 'editAppointJzPorJzC',
				data : obj,
				dataType : "text",
				success : function(re){
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					isLucky = false;
					if(re==="SUCCESS"){
						alert("保存成功!");
						//location.reload();
						location.href='admin-yingzhuang-showjz_package';
					}else if(re==="FAIL"||re==="ALERT"){
						alert("网络有误！请稍后再试");
					}
				},error : function(re){
					isLucky = false;
					alert(re.status);
				}
			});
		}
    });
    
    $('.del-span').on('click',function(){
    	if(confirm('确认删除该材料信息吗？')){
    		var jmid = $("input[name=jmid]").val();
    		$.ajax({
    			type : 'POST',
    			async : false,
    			url : 'removeJzMaterial',
    			data : {jmid:jmid},
    			dataType : 'text',
    			success : function(re){
    				if(re === "LOGIN"){
    					location.href = 'admin-loginto';
    				}
    				if(re == "SUCCESS"){
    					alert("操作成功！");
    					location.reload();
    				}else{
    					alert("网络错误！请稍后再试");
    				}
    			} ,error : function(re){
    				alert(re.status);
    			}
    		});
    	}
    });
    
    //跳转到材料详细页面
    $(".add-material").on('click',function(){
    	$('.youjian-div').hide();
		var jcid = $('#jcid').val();
		var jcname = $('#jcname').val();
		var jpid = $('input[name=jpname]').attr('vaben');
		var jpname = $('input[name=jpname]').val();
		location.href='goAddJzMaterial?jpid='+jpid+'&jpname='+jpname+'&jcid='+jcid+'&jcname='+jcname;
    });
});

function loadingImg(num){
	var formData = new FormData();
	formData.append("imgFile", file);
	$.ajax({
		 type: 'POST',
         data: formData,
         async: false,
         cache: false,
         contentType: false,
         processData: false,
         url: 'uploadJz',
         dataType : 'text',
         success : function(re){
        	 if(re === "LOGIN"){
 				location.href = 'admin-loginto';
 			 }
        	 if(re.indexOf('.jpg') > -1 || re.indexOf('.png') > -1 || re.indexOf('.jpeg') > -1){
        		 if(num != ""){
        			 $('.jcimg').val(re);
        		 }else{
        			 $('.jcimg').val(re);
        		 }
        	 }else if(re === "LOGIN"){
        		 alert("登录超时，请重新登录");
        		 //location.href='signuser-avatar?v='+(new Date().getTime());
        	 }else{
        		 alert("上传图片有误,请重新上传");
        	 }
         },error : function(ms){
        	alert(ms.status);
         }
	});
}

function infoyz(){
	var infosize = $('.bsi').length;
	if(infosize == 0){
		alert('请在家具详细图中标记家具用料');
		return false;
	}else{
		$('.content-span').each(function(i,v){
			if($(v).text().length < 10){
				alert('请完善家具用料描述');
				return false;
			}
		});
	}
	return true;
}