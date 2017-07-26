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
    	$('.i,textarea').blur();
		if ($(".error-border-color").length == 0 && !isLucky){// && infoyz()) {
			isLucky = true;
			var obj = {};
			var jpid = $('input[name="jpname"]').attr("vaben");
			var jpname =  $('input[name="jpname"]').val();
			var jcid = $('input[name="jcname"]').attr("vaben");
			$(".i").each(function(i, v) {
				var name = $(v).attr("name");
				obj[name] = $(v).val();
			});
			obj["jcid"] = $('input[name="jcname"]').attr("vaben");
			obj["materialinfo"] = $('.info').val();
			obj["materialexplain"] = $('.explain').val();
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
			console.log(obj);
			/*$.each(obj["project_info.rpiinfo"],function(i,v){
				$.each(v,function(ii,vv){
					console.log("info:"+ii+"-"+vv);
				});
			});*/
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addJzMaterial',
				data : obj,
				dataType : "text",
				success : function(re){
					if(re === "LOGIN"){
						location.href = 'admin-loginto';
					}
					isLucky = false;
					if(re==="SUCCESS"){
						alert("添加成功!");
						//location.reload();
						location.href='getAppointJzPorJzC?jpid='+jpid+'&jpname='+jpname+'&jcid='+jcid;
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
});

