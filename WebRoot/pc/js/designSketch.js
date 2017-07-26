var gsid = 0;
var gtid = 0;
var gmid = 0;
$(function(){
  		$('.classification_page').createPage({
  			pageCount : pageCount,
  			current : 1,
  			input_name : 'classification',
  			backFn : function(p){
  				//alert(p);	
  			}
  		});
  		margJul();
  		
  		$('.tj_span').bind('click',function(){
  			$(this).siblings().removeClass('tj_span_curr');
  			$(this).addClass('tj_span_curr');
  			var nabs = $(this).data('bs');
  			alert(nabs);
  		});
  		
  		//汇总
  		$('.kj,.fg,.mj,.gn,.jg').bind('click',function(){
  			//获取当前点击元素的class
  			var cls = $(this).attr('class');
  			//删除当前元素的curr_a样式
  			$('.'+cls).removeClass('curr_a');
  			//添加当前元素curr_a样式
  			$(this).addClass('curr_a');
  			//定义一个变量  用来接收当前点击的哪个大类
  			var isParam = 0;
  			if(cls.stringToEquels("kj")){//如果点击的是空间则进入方法体内
  				isParam = 1;
  				gsid = $(this).data('cl');
  			}else if(cls.stringToEquels("fg")){//如果点击的是风格则进入方法体内
  				isParam = 2;
  				gtid = $(this).data('cl');
  			}else if(cls.stringToEquels("mj")){//如果点击的是面积则进入方法体内
  				isParam = 3;
  				gmid = $(this).data('cl');
  			}
  			//往上添加当前点击的元素值
  			$('.param'+isParam).text(" >"+$(this).text());
  			var params = {start : 1,gsid : gsid,gtid : gtid,gmid : gmid};
  			$.post('getDesignSketchByPage',params,function(re){
  				if(re.status.isStatus() == -1){
  					alert("警告,你提交的数据中带有非法字符,请重新输入");
  					return false;
  				}else if(re.status.isStatus() == 1){
  					$('.classification_content_zong_div').appendDesignSketchHtml(re);
  					margJul();
  				}
  			});
  		});
  		
  		//上面列表点击显示
  		$('.condition_list_div p a').bind('click',function(){
  			//获取当前点击元素的class
  			var cls = $(this).attr('class');
  			if(!cls.stringToEquels("")){//如果点击的是空间则进入方法体内
  				//定义一个数组来接收哪些需要清除
  				var fla = "";
  				if(cls.stringToEquels("zijiangmao")){
  					fla = ["kj","fg","mj"];
  					gsid = 0;
	  				gtid = 0;
	  				gmid = 0;
  				}else{
  					var isParam = cls.substring("param".length,cls.length);
  					if(isParam.stringToEquels("1")){
  						fla = ["fg","mj"];
  						gtid = 0;
  						gmid = 0;
  					}else if(isParam.stringToEquels("2")){
  						fla = ["mj"];
  						gmid = 0;
  					}else if(isParam.stringToEquels("3")){
  						fla = "";
  					}
  					//定义一个变量来接收剩余的条件
  					var params = "";
  					for(var i = 1;i <= isParam;i++){
  						var vul = $('.param'+i).text();
  						params+=vul;
  						if(i != isParam && !vul.stringToEquels("")){
  							params+=",";
  						}
  					}
  				}
  				//情况当前元素后面的所有兄弟元素内容
  				$(this).nextAll().empty();
  				$.each(fla,function(i,v){
  					//删除当前元素的所有同级的curr_li样式
  					$('.'+v).removeClass('curr_a');
  					//$('.'+v).parent().siblings().removeClass('curr_li');
  				});
	  			var params = {start : 1,gsid : gsid,gtid : gtid,gmid : gmid};
	  			$.post('getDesignSketchByPage',params,function(re){
	  				if(re.status.isStatus() == -1){
	  					alert("警告,你提交的数据中带有非法字符,请重新输入");
	  					return false;
	  				}else if(re.status.isStatus() == 1){
	  					$('.classification_content_zong_div').appendDesignSketchHtml(re);
	  					margJul();
	  				}
	  			});
	  			/*alert(params.replaceAll(">",""));*/
  			}
  		});
  	});

function margJul(){
	var two = 2;
	for(var i = 1;i <= $('.classification_content_div').size();i++){
		if(i%two==0){
			$('.classification_content_div').eq(i-1).addClass('centen20');
			two+=3;
		}
		if(i%3==0){
			$('.classification_content_div').eq(i-1).addClass('right');
		}
	};
}