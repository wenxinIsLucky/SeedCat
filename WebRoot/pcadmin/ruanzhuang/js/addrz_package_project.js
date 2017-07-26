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
	$("#file_upload,#file_upload2").change(function () {
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
    
    $(".file,.file2").on("change","input[type='file']",function(){
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
    	var fileName = $(".showFileName").text();
    	var fileName2 = $(".showFileName2").text();
    	if(fileName == ""){
    		$('.file').addClass('red');
    	}else{
    		$('.file').removeClass('red');
    	}
    	if(fileName2 == ""){
    		$('.file2').addClass('red');
    	}else{
    		$('.file2').removeClass('red');
    	}
		if ($(".error-border-color").length == 0 && !isLucky && fileName != "" && fileName2 != "" && infoyz()) {
			isLucky = true;
			var obj = {};
			$(".i").each(function(i, v) {
				var name = $(v).attr("name")
				obj[name] = $(v).val();
			});
			obj["rpid"] = $('input[name="rpname"]').attr("vaben");
			obj["rppidea"] = $('textarea').val();
			obj["rppimg"] = $('.rppimg').val();
			obj["project_info.rpiimg"] = $('.rpiimg').val();
			var newtabs = [];
			$('.content-span').each(function(i,v){
				var jsonc = {};
				$(v).find('lwx').each(function(ii,vv){
					var name = $(vv).attr("class");
					jsonc[name] = $(vv).text();
				});
				newtabs[i] = JSON.stringify(jsonc);
			});
			obj["project_info.rpiinfo"] = newtabs.join(",");
			//console.log(obj);
			/*$.each(obj["project_info.rpiinfo"],function(i,v){
				$.each(v,function(ii,vv){
					console.log("info:"+ii+"-"+vv);
				});
			});*/
			$.ajax({
				type : 'POST',
				async : false,
				url : 'addRzPackageProject',
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
						location.href='admin-ruanzhuang-showrz_package';
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
    
    $('#preview2').on('mousemove',function(e){
    	//console.log(e.offsetX+":"+e.offsetY);
    	x = e.offsetX;
    	y = e.offsetY;
    });
    
    $('#preview2').on('click',function(){
    	if($(this).attr("src") === ""){
    		return false;
    	}
    	var num = $('.yuan-i').length;
    	$(this).after('<i class="yuan-i" vb="'+num+'" style="left:'+x+';top:'+y+';">'+num+'</i>');
    	$(".yuan-i").bind('mousedown',function(e) {
			thisV = $(this);
		    //右键为3
		    if (3 == e.which) {
		        $('.youjian-div').css({'top':yy,'left':xx});
		        $('.youjian-div').show();
		    }
		});
    	var strVar = "";
        strVar += "<div class=\"column-div bsi i"+num+"\" vb=\""+num+"\">";
        strVar += "<span class=\"span-name\">用料记录"+num+"：<\/span>";
        strVar += "<span class=\"content-span\" style=\"width: 200px;display: inline-block;vertical-align: text-top;line-height:24px;\">";
        strVar += "坐标：<lwx class=\"position\">"+x+","+y+"</lwx><br><\/span><\/div>";
    	$('.rz-package-info').append(strVar);
    });
    
    $('.upd-span').on('click',function(){
		$('.youjian-div').hide();
		$('.youjian-div2').show();
		$('.bj-span').val(thisV.attr('vb'));
		$('.bj-name').focus();
	});
	
	$('.del-span').on('click',function(){
		$('.youjian-div').hide();
		var num = parseInt(thisV.attr('vb'));
		$('.i'+num).remove();
		thisV.remove();
		$(".yuan-i").each(function(i,v){
			var n = parseInt($(v).attr('vb'));
			if(num < n){
				$(v).attr('vb',n-1);
				$(v).text(n-1);
			}
		});
		$('.bsi').each(function(i,v){
			var n = parseInt($(v).attr('vb'));
			var cl = $(v).attr('class');
			if(num < n){
				$(v).attr('vb',n-1);
				var cls = cl.split(" ");
				$(v).removeClass(cls[cls.length-1]);
				$(v).addClass('i'+(n-1));
				$(v).find('span.span-name').text("用料记录"+(n-1)+"：");
			}
		});
	});
	
	$('.btbj').blur(function(){
		var v = this;
		var go = ($(v).val().trim() != "");
		if ($(v).attr("vali") == "number") {
			var reg = /^[0-9]+.?[0-9]*$/;
			go = reg.test($(v).val())
			if(!go && $(v).val().trim() != ""){
				$(v).next().text("只能数字");
			}else{
				$(v).next().text("不能为空");
			}
		}
		if(go){
			$(v).next().hide();
			bnwk = 2;
		}else{
			$(v).next().show();
			bnwk = 1;
		}
	});
	
	$('#dian-button-div').on('click',function(){
		var o = this;
		var bj = $('.bj-span').val();
		if(bj === ""){
			alert("请选择编辑的标记点");
		}
		$('.btbj').blur();
		if(bnwk === 2){
			var obj = {};
			var objhtml = "";
			$('.youjian-div2 input[type="text"]').each(function(i,v){
				var name = $(v).attr("name");
				obj[name] = $(v).val();
			});
			var num = $(o).parent().find('input.bj-span').val();
			objhtml+='坐标：<lwx class="position">'+$('.i'+num+' .position').text()+'</lwx><br>';
			objhtml+='名称：<lwx class="materialName">'+obj["materialName"]+'</lwx><br>';
			objhtml+='型号：<lwx class="model">'+obj["model"]+'</lwx><br>';
			objhtml+='数量：<lwx class="materialCount">'+obj["materialCount"]+'</lwx><br>';
			objhtml+='尺寸：<lwx class="materialSize">'+obj["materialSize"]+'</lwx><br>';
			objhtml+='材质：<lwx class="material">'+obj["material"]+'</lwx><br>';
			//console.log(obj);
			//console.log(objhtml);
			$('.i'+num+' .content-span').html(objhtml);
			$('.youjian-div2').hide();
		}
	});
});

function loadingImg(num){
	var formData = new FormData();
	formData.append("imgFile", file);
	$('#error_mask,.showmsg').show();
	$.ajax({
		 type: 'POST',
         data: formData,
         async: false,
         cache: false,
         contentType: false,
         processData: false,
         url: 'uploadRz',
         dataType : 'text',
         success : function(re){
        	 $('#error_mask,.showmsg').hide();
        	 if(re != "LOGIN" && re != "FAIL"){
        		 if(num != ""){
        			 $('.rpiimg').val(re);
        		 }else{
        			 $('.rppimg').val(re);
        		 }
        	 }else if(re === "LOGIN"){
        		 alert("登录超时，请重新登录");
        		 //location.href='signuser-avatar?v='+(new Date().getTime());
        	 }else{
        		 alert("上传图片有误,请重新上传");
        	 }
         },error : function(ms){
        	 $('#error_mask,.showmsg').hide();
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