/**
 * @author lucky(李文鑫)
 */
(function($) {
	var ms = {
		init : function(obj, args) {
			return (function() {
				ms.fillHtml(obj, args);
				ms.bindEvent(obj, args);
			})();
		},
		// 填充html
		fillHtml : function(obj, args) {
			return (function() {
				obj.empty();
				obj.append('<div class="page_div_span">');
				// 上一页
				if (args.current > 1) {
					obj.append('<span class="prev_span">上一页</span>');
				} else {
					obj.remove('.prev_span');
					obj.append('<span class="dinone_span">上一页</span>');
				}
				// 中间页码
				if (args.current != 1 && args.current >= 4
						&& args.pageCount != 4) {
					obj.append('<span class="page_span">' + 1 + '</span>');
				}
				if (args.current - 2 > 2 && args.current <= args.pageCount
						&& args.pageCount > 5) {
					obj.append('<y class="page_y">...</y>');
				}
				var start = args.current - 2, end = args.current + 2;
				if ((start > 1 && args.current < 4) || args.current == 1) {
					end++;
				}
				if (args.current > args.pageCount - 4
						&& args.current >= args.pageCount) {
					start--;
				}
				for (; start <= end; start++) {
					if (start <= args.pageCount && start >= 1) {
						if (start != args.current) {
							obj.append('<span class="page_span">' + start
									+ '</span>');
						} else {
							obj.append('<span class="page_span curr">' + start
									+ '</span>');
						}
					}
				}
				if (args.current + 2 < args.pageCount - 1 && args.current >= 1
						&& args.pageCount > 5) {
					obj.append('<y class="page_y">...</y>');
				}
				if (args.current != args.pageCount
						&& args.current < args.pageCount - 2
						&& args.pageCount != 4) {
					obj.append('<span class="page_span">' + args.pageCount
							+ '</span>');
				}
				// 下一页
				if (args.current < args.pageCount) {
					obj.append('<span class="next_span">下一页</span>');
				} else {
					obj.remove('.next_span');
					obj.append('<span class="dinone_span">下一页</span>');
				}
				obj.append('<div class="jssearch_div"><input class="test_input"= title="按回车键跳转" maxlength="3" id="'
								+ args.input_name
								+ '"/><div class="go '
								+ args.input_name + '">GO</div></div>');
			})();
		},
		// 绑定事件
		bindEvent : function(obj, args) {
			return (function() {
				obj.on("click", "span.page_span", function() {
					var current = parseInt($(this).text());
					ms.fillHtml(obj, {
						"current" : current,
						"pageCount" : args.pageCount,
						"input_name" : args.input_name
					});
					if (typeof (args.backFn) == "function") {
						args.backFn(current);
					}
				});
				// 上一页
				obj.on("click", "span.prev_span", function() {
					var current = parseInt(obj.children("span.curr").text());
					ms.fillHtml(obj, {
						"current" : current - 1,
						"pageCount" : args.pageCount,
						"input_name" : args.input_name
					});
					if (typeof (args.backFn) == "function") {
						args.backFn(current - 1);
					}
				});
				// 下一页
				obj.on("click", "span.next_span", function() {
					var current = parseInt(obj.children("span.curr").text());
					ms.fillHtml(obj, {
						"current" : current + 1,
						"pageCount" : args.pageCount,
						"input_name" : args.input_name
					});
					if (typeof (args.backFn) == "function") {
						args.backFn(current + 1);
					}
				});
				// GO
				obj.on("click", "div." + args.input_name, function() {
					var current = parseInt($("#" + args.input_name).val());
					if (args.pageCount >= current) {// 如果输入的页数超过了总页数则不跳
						ms.fillHtml(obj, {
							"current" : current,
							"pageCount" : args.pageCount,
							"input_name" : args.input_name
						});
						if (typeof (args.backFn) == "function") {
							args.backFn(current);
						}
					}
				});
				obj.on("keyup", "#" + args.input_name, function(event) {
					var curKey = event.which;
					if (curKey == 13) {
						var current = parseInt($("#" + args.input_name).val());
						if (args.pageCount >= current) {// 如果输入的页数超过了总页数则不跳
							ms.fillHtml(obj, {
								"current" : current,
								"pageCount" : args.pageCount,
								"input_name" : args.input_name
							});
							if (typeof (args.backFn) == "function") {
								args.backFn(current);
							}
						}
					}
				});
			})();
		}
	}
	$.fn.createPage = function(options) {
		var args = $.extend({
			pageCount : 10,
			current : 1,
			input_name : "testS",
			backFn : function() {

			}
		}, options);
		ms.init(this, args);
	}
	$.fn.loadJs = function(options) {
		$("script[src='" + options.file + "']").remove();
		var obj = this;
		$("<script>" + "</script>").attr({
			role : 'reload',
			src : options.file,
			type : 'text/javascript'
		}).appendTo(obj);
	};
	
	var mse = {
			init : function(obj, args) {
				return (function() {
					mse.bindEvent(obj, args);
				})();
			},
			// 绑定事件
			bindEvent : function(obj, args) {
				return (function() {
					obj.on("mousemove", function(e) {
						var width = $(this).width();
			    		//左右
			        	var xx = e.originalEvent.x || e.originalEvent.layerX || 0;
			    		//上下
			        	var yy = e.originalEvent.y || e.originalEvent.layerY || 0;
			    		var isZyVaule = width.div(2);
			        	if(parseInt(isZyVaule) > parseInt(xx)){
			        		$(obj).removeClass(args.rightCss).addClass(args.leftCss);
			        	}else{
			        		$(obj).removeClass(args.leftCss).addClass(args.rightCss);
			        	}
					});
					// GO
					obj.on("click", function() {
			    		var cl = $(obj).attr('class');
						if(cl.indexOf('zuo') > -1 && typeof (args.leftFn) == "function"){
				    		args.leftFn();
				    	}else if(cl.indexOf('you') > -1 && typeof (args.rightFn) == "function"){
				    		args.rightFn();
				    	}
					});
				})();
			}
		}
	
	$.fn.mouse = function(options){
		var args = $.extend({
			leftCss : '',
			rightCss : '',
			leftFn : function() {

			},rightFn : function() {

			}
		}, options);
		mse.init(this, args);
	}
	
/*------------------------------------------------------------------------------------------------------------------------------*/
/*-----------------------------------------------放大镜-------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------------------------------------*/	
	var ims = {
			init : function(obj, args) {
				return (function() {
					ims.fillHtml(obj, args);
					ims.bindEvent(obj, args);
				})();
			},
			// 填充html
			fillHtml : function(obj, args) {
				return (function() {
					//添加鼠标选择放大区域
					var magnifier = $(document.createElement("div"));
					var back = args.background_img == ''?'rgba(255,255,255,0.4)':"url(\""+args.background_img+"\")";
					var cssJson = {
						'width' : args.size,
						'height' : args.size,
						'position' : 'absolute',
						'background' : back,
						'cursor' : 'crosshair',
						'display' : 'none'
					};
					magnifier.attr({
						'class' : 'magnifier'
					}).css(cssJson);
					obj.after(magnifier);
				})();
			},
			// 绑定事件
			bindEvent : function(obj, args) {
				return (function() {
					var xx = 0;
					var y = 0;
					obj.on("mousemove", function(event) {
						var current = this;
						xx = event.offsetX-args.size/2;
						yy = event.offsetY-args.size/2;
						var width = (obj.width()-args.size);
						var height = (obj.height()-args.size);
						xx = xx<0?0:xx>width?width:xx;
						yy = yy<0?0:yy>height?height:yy;
						var url = '-'+(xx*args.width_multiple)+'px -'+(yy*args.height_multiple)+'px';
						var size = (obj.width()*args.width_multiple)+'px '+(obj.height()*args.height_multiple)+'px';
						$('div.magnifier').css({'top':yy,'left':xx});
						$(args.showTag).css({'background-image':'url("'+obj.attr('src')+'")','background-size':size,'background-position':url});
						$('div.magnifier').show();
						$(args.showTag).show();
					});
					
					$('div.magnifier').on("mousemove",function(event) {
						var current = this;
						var x = event.offsetX-args.size/2;
						var y = event.offsetY-args.size/2;
						var width = (obj.width()-args.size);
						var height = (obj.height()-args.size);
						xx = xx+x;
						yy = yy+y;
						xx = xx<0?0:xx>width?width:xx;
						yy = yy<0?0:yy>height?height:yy;
						var url = '-'+(xx*args.width_multiple)+'px -'+(yy*args.height_multiple)+'px';
						var size = (obj.width()*args.width_multiple)+'px '+(obj.height()*args.height_multiple)+'px';
						$(current).css({'top':yy,'left':xx});
						$(args.showTag).css({'background-image':'url("'+obj.attr('src')+'")','background-size':size,'background-position':url});
						$(current).show();
						$(args.showTag).show();
					});
					
					$('div.magnifier').on("mouseout", function(event) {
						var current = this;
						$(current).hide();
						$(args.showTag).hide();
					});
				})();
			}
		}
	
	
	$.fn.imgMagnifier = function(options){
		var width_multiple = parseFloat($(this).width()/options.size);
		var height_multiple = parseFloat($(this).height()/options.size);
		var args = $.extend({
			showTag : '',
			background_img : '',
			size : 100,
			width_multiple : width_multiple,
			height_multiple : height_multiple
		}, options);
		ims.init(this, args);
	}
	
	$.fn.getCursorPosition = function() {
        var el = $(this).get(0);
        var pos = 0;
        if ('selectionStart' in el) {
            pos = el.selectionStart;
        } else if ('selection' in document) {
            el.focus();
            var Sel = document.selection.createRange();
            var SelLength = document.selection.createRange().text.length;
            Sel.moveStart('character', -el.value.length);
            pos = Sel.text.length - SelLength;
        }
        return pos;
    }
    $.fn.selectRange = function(start, end) {
        return this.each(function() {
            if (this.setSelectionRange) {
                this.focus();
                this.setSelectionRange(start, end);
            } else if (this.createTextRange) {
                var range = this.createTextRange();
                range.collapse(true);
                range.moveEnd('character', end);
                range.moveStart('character', start);
                range.select();
            }
        });
    };
    
    $.extend({
        format : function(str, step, splitor) {
            str = str.toString();
            var len = str.length;
            if(len > step) {
                 var l1 = len%step,
                     l2 = parseInt(len/step),
                     arr = [],
                     first = str.substr(0, l1);
                 if(first != '') {
                     arr.push(first);
                 };
                 for(var i=0; i<l2 ; i++) {
                     arr.push(str.substr(l1 + i*step, step));                                   
                 };
                 str = arr.join(splitor);
             };
             return str;
        }
    });
})(jQuery);

function tsk(content) {
	var html = '<div class="error_mask error_opacity"></div><div class="error_content"><div><span class="error_span_title">提示信息：</span><span class="error_close" onclick="mUp();">×</span>';
	html += '</div><div class="error_div_context">'
			+ content
			+ '</div><div class="error_div_button" onclick="mUp();">确定</div></div>';
	$('body').append(html);
}

function datek(options) {
	$('.error_mask').remove();
	$('.tsimg_p').remove();
	var html = '<div class="error_mask error_opacity"></div><p class="tsimg_p">';
	html+='<div class="error_datetime_content"><div>';
	if(options.title != null){
		html += '<span class="error_span_title">' + options.title + '</span>';
	}
	html += '</div><div class="error_datetime_div_context">'
	if (options.imgSrc != null) {
		html += '<img class="error_div_img" alt="" src="' + options.imgSrc
				+ '">';
	}
	html += options.content + '</div></div>';
	if(options.color != null){
		$('.error_datetime_div_context').css('color',options.color);
	}
	html+="</p>";
	$('body').append(html);
	var datime = 1000;
	if(options.datetime != null){
		datime = options.datetime;
	}
	setTimeout(function() {
		$('.error_mask').remove();
		$('.error_datetime_content').remove();
	}, datime);
}

function datekText(options) {
	$('.ts_p').remove();
	var height = $('body').height();
	var html = '<p class="ts_p">' + options.content + '</p>';
	$('body').before(html);
	if(options.color != null){
		$('.ts_p').css('color',options.color);
	}
	$('.ts_p').css('margin-top',height.div(2)+'px');
	var datime = 1000;
	if(options.datetime != null){
		datime = options.datetime;
	}
	setTimeout(function() {
		$('.ts_p').remove();
	}, datime);
}

function mUp() {
	$('.error_mask').remove();
	$('.error_content').remove();
}
$(function(){
	console.log("%c \u5b89\u5168\u8b66\u544a\uff01", "font-size:50px;color:red;-webkit-text-fill-color:red;-webkit-text-stroke: 1px black;");
	console.log("%c \u6b64\u6d4f\u89c8\u5668\u529f\u80fd\u4e13\u4f9b\u5f00\u53d1\u8005\u4f7f\u7528\u3002\u8bf7\u4e0d\u8981\u5728\u6b64\u7c98\u8d34\u6267\u884c\u4efb\u4f55\u5185\u5bb9\uff0c\u8fd9\u53ef\u80fd\u4f1a\u5bfc\u81f4\u60a8\u7684\u8d26\u6237\u53d7\u5230\u653b\u51fb\uff0c\u7ed9\u60a8\u5e26\u6765\u635f\u5931 \uff01", "font-size: 20px;color:#333");
	console.log("%c	  \u884d\u5922\u5de5\u4f5c\u5ba4 %c \u4ea4\u6d41QQ\u7fa4:%c536149997","color:#ff4200;font-size:30px;font-weight:bold;","font-size:30px;font-weight:bold;","color:orange;font-size:30px;font-weight:bold;");
});
function ifnull(str1,str2){
	if(str1 === null || str1 === ""){
		return str2;
	}
	return str1;
}
function ifnulls(term,str1,str2){
	if(term){
		return str1;
	}
	return str2;
}
/*$(function() {
	$('body').bind('keydown', function(event) {
		var key = event.keyCode;
		if (key == 13) {
			if($('.error_div_button').length && $('.error_div_button').length>0){
				$('.error_div_button').addClass('error_active_button');
			}
			return;
		}
	});
	$('body').bind('keyup', function(event) {
		var key = event.keyCode;
		if (key == 13) {
			if($('.error_div_button').length && $('.error_div_button').length>0){
				$('.error_div_button').removeClass('error_active_button');
				$('.error_mask').remove();
				$('.error_content').remove();
			}
			return;
		}
	});
});*/

Number.prototype.add = function(num) {
	var r1, r2, m;
	try {
		r1 = this.toString().split(".")[1].length;
	} catch (e) {
		r1 = 0;
	}
	try {
		r2 = num.toString().split(".")[1].length;
	} catch (e) {
		r2 = 0;
	}
	m = Math.pow(10, Math.max(r1, r2));
	return (this * m + num * m) / m;
};
Number.prototype.sub = function(num) {
	return this.add(-num);
};
Number.prototype.mul = function(num) {
	var m = 0, s1 = this.toString(), s2 = num.toString();
	try {
		m += s1.split(".")[1].length;
	} catch (e) {

	}
	try {
		m += s2.split(".")[1].length;
	} catch (e) {

	}
	return Number(s1.replace(".", "")) * Number(s2.replace(".", ""))
			/ Math.pow(10, m);
};
Number.prototype.div = function(num) {
	var t1 = 0, t2 = 0, r1, r2;
	try {
		t1 = this.toString().split(".")[1].length;
	} catch (e) {

	}
	try {
		t2 = num.toString().split(".")[1].length;
	} catch (e) {

	}
	with (Math) {
		r1 = Number(this.toString().replace(".", ""));
		r2 = Number(num.toString().replace(".", ""));
		return (r1 / r2) * pow(10, t2 - t1);
	}
};
Number.prototype.stringToEquels = function(str) {
	if (parseInt(this) == parseInt(str)) {
		return true;
	}
	return false;
};
Number.prototype.equels = function(str) {
	if (parseInt(this) == parseInt(str)) {
		return true;
	}
	return false;
};
String.prototype.testPhone = function() {
	var pattern = /(13\d|14[57]|15[^4,\D]|17[678]|18\d)\d{8}|170[059]\d{7}/;
	return pattern.test(this);
};
String.prototype.stripscript = function() {
	var pattern = new RegExp(
			"[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]");
	var rs = "";
	for (var i = 0; i < this.length; i++) {
		rs = rs + this.substr(i, 1).replace(pattern, '').trim();
	}
	return rs;
};
String.prototype.testEmail = function() {
	var pattern = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
	return pattern.test(this);
};
String.prototype.isCardNo = function() {
	var arrExp = [7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2];//加权因子  
    var arrValid = [1, 0, "X", 9, 8, 7, 6, 5, 4, 3, 2];//校验码  
    if(/^\d{17}\d|x$/i.test(this)){   
        var sum = 0, idx;  
        for(var i = 0; i < this.length - 1; i++){  
            // 对前17位数字与权值乘积求和  
            sum += parseInt(this.substr(i, 1), 10) * arrExp[i];  
        }  
        // 计算模（固定算法）  
        idx = sum % 11;  
        // 检验第18为是否与校验码相等  
        return arrValid[idx] == this.substr(17, 1).toUpperCase();  
    }else{  
        return false;  
    }
};
String.prototype.stringToEquels = function(str) {
	if ($.trim(this) == $.trim(str)) {
		return true;
	}
	return false;
};
String.prototype.equels = function(str) {
	if ($.trim(this) == $.trim(str)) {
		return true;
	}
	return false;
};
String.prototype.signResult = function(){
	if("SUCCESS" == $.trim(this)){
		return 200;
	}else if("ALERT" == $.trim(this)){
		return 500;
	}else if("LOGIN" == $.trim(this)){
		return 404;
	}else if("FAIL" == $.trim(this)){
		return 300;
	}else if("ISJH" == $.trim(this)){
		return -1;
	}
}
String.prototype.minLength = function(leng) {
	var str = $.trim(this);
	if (str.length >= leng) {
		return true;
	}
	return false;
};
String.prototype.maxLength = function(leng) {
	var str = $.trim(this);
	if (str.length > leng) {
		return false;
	}
	return true;
};
String.prototype.betweenLength = function(minLeng, maxLeng) {
	var str = $.trim(this);
	if (str.length >= minLeng && str.length <= maxLeng) {
		return true;
	}
	return false;
};
String.prototype.replaceAll = function(oldV, newV) {
	var reg = new RegExp(oldV, "g");
	return this.replace(reg, newV);
};
String.prototype.getDateDiff = function(){
	var dateTimeStamp = new Date(this).getTime();
	var minute = 1000 * 60;
	var hour = minute * 60;
	var day = hour * 24;
	var halfamonth = day * 15;
	var month = day * 30;
	var now = new Date().getTime();
	var diffValue = now - dateTimeStamp;
	/*if (diffValue < 0) {
		// 若日期不符则弹出窗口告之
		// alert("结束日期不能小于开始日期！");
	}*/
	var monthC = diffValue / month;
	var yearC = parseInt(monthC)>=12?Math.floor(parseInt(monthC)/12):0;
	var weekC = diffValue / (7 * day);
	var dayC = diffValue / day;
	var hourC = diffValue / hour;
	var minC = diffValue / minute;
	if(yearC > 0){
		result = parseInt(yearC) + "年前";
	}else{
		if (monthC >= 1) {
			result = parseInt(monthC) + "个月前";
		} else {
			if (weekC >= 1) {
				result = parseInt(weekC) + "周前";
			} else {
				if (dayC >= 1) {
					result = parseInt(dayC) + "天前";
				} else {
					if (hourC >= 1) {
						result = parseInt(hourC) + "个小时前";
					} else {
						if (minC >= 1) {
							result = parseInt(minC) + "分钟前";
						} else
							result = "刚刚";
					}
				}
			}
		}
	}
	return result;
}
String.prototype.getDateDiffRJson = function(){
	var data = {};
	var dateTimeStamp = new Date(this).getTime();
	var minute = 1000 * 60;
	var hour = minute * 60;
	var day = hour * 24;
	var halfamonth = day * 15;
	var month = day * 30;
	var now = new Date().getTime();
	var diffValue = now - dateTimeStamp;
	data.monthC = diffValue / month;
	data.yearC = parseInt(data.monthC)>=12?Math.floor(parseInt(data.monthC)/12):0;
	data.weekC = diffValue / (7 * day);
	data.dayC = diffValue / day;
	data.hourC = diffValue / hour;
	data.minC = diffValue / minute;
	return data;
}
Array.prototype.removeElement = function(src) {
	this.splice(jQuery.inArray(src, this), 1);
};