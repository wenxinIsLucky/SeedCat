var isLucky = false;
var tabs = [];
var file = null;
$(function(){
	$("#file_upload").change(function () {
        var $file = $(this);
        var fileObj = $file[0];
        file = this.files[0];
        var windowURL = window.URL || window.webkitURL;
        var dataURL;
        var $img = $("#preview");

        if (fileObj && fileObj.files && fileObj.files[0]) {
            dataURL = windowURL.createObjectURL(fileObj.files[0]);
            $img.attr('src', dataURL);
        } else {
            dataURL = $file.val();
            var imgObj = document.getElementById("preview");
            // 两个坑:
            // 1、在设置filter属性时，元素必须已经存在在DOM树中，动态创建的Node，也需要在设置属性前加入到DOM中，先设置属性在加入，无效；
            // 2、src属性需要像下面的方式添加，上面的两种方式添加，无效；
            imgObj.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
            imgObj.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = dataURL;

        }
    });
    
    $("input[type='file']").on("change",function(){
        var filePath=$(this).val();
        if(filePath.indexOf("jpg")!=-1 || filePath.indexOf("png")!=-1){
            $(".fileerrorTip").html("").hide();
            var arr=filePath.split('\\');
            var fileName=arr[arr.length-1];
            $(".showFileName").html(fileName);
        }else{
        	if(typeof($('#preview').attr("src")) == "undefined"){
                $(".showFileName").html("");
                $(".fileerrorTip").html("您未上传文件，或者您上传文件类型有误！").show();
                return false ;
        	}
        }
        loadingImg();
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
    
    /*$("#cp3").colorpicker({
        fillcolor:true,
        success:function(o,color){
            $("#cp3text").css("color",color);
        }
    });*/
    
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
    	$('.i,textarea').blur();
    	var fileName = $(".imgs").val();
    	if(fileName == undefined){
    		$('#ssi-previewBox').addClass('red');
    	}else{
    		$('#ssi-previewBox').removeClass('red');
    	}
    	var d = UE.getEditor('details').getContent();
    	if ($.trim(d).length <= 0) {
    		$('#alert').text("*请填写效果图文否则无法提交");
		}else{
			$('#alert').text("");
		}
    	var f = "/static_img/designer_case/text/default.png";
		$.each($('#ycdiv').find('img'), function(i, v) {
			if (i === 0) {
				f = $(v).attr('src');
				return
			}
		});
		if ($(".error-border-color").length == 0 && !isLucky && fileName != undefined && $.trim(d).length > 0) {
			var obj = {};
			$(".i").each(function(i, v) {
				var name = $(v).attr("name")
				obj[name] = $(v).val();
			});
			//obj["rpcolor"] = $('#HexColor').val().replace("#","");
			//obj["head"] = $('input[name="head"]').val();
			obj["demand"] = $('textarea[name="demand"]').val();
			obj["recollections"] = $('textarea[name="recollections"]').val();
			obj["details"] = UE.getEditor('details').getContent();
			console.log(obj["details"]);
			var imgs = [];
			$('.imgs').each(function(i,v){
				imgs[i]=$(v).val();
			});
			obj["imgs"] = imgs.join(",");
			console.log(obj);
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addDesigner_case',
				data : obj, //转JSON字符串  
				dataType : "text",
				timeout: 20000,
				success : function(re){
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					isLucky = false;
					if(re==="SUCCESS"){
						alert("添加设计师案例成功!");
						location.reload();
					}else {
						alert("网络有误！请稍后再试");
					}
				},error : function(re, b, c){
					isLucky = false;
					alert(re.status+"...状态： " + b + "; 出错提示：" + c);
				}
			});
		}
    });
});

function loadingImg(){
	var formData = new FormData();
	formData.append("imgFile", file);
	$.ajax({
		 type: 'POST',
         data: formData,
         async: false,
         cache: false,
         contentType: false,
         processData: false,
         url: 'uploadDesigner',
         dataType : 'text',
         success : function(re){
        	 if(re.indexOf('.jpg') > -1 || re.indexOf('.png') > -1 || re.indexOf('.jpeg') > -1){
        		 $('input[name="head"]').val(re);
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