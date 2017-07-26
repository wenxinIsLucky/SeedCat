// JavaScript Document
$(function(){

    var App = function(){
        var t = this;
        var applist = $('.applist');
        t.app = $('.appdetail');
        t.icon = t.app.find('img');
        t.name = t.app.find('span');
        t.ver  = t.app.find('.appdetail_v');
       // t.cate = t.app.find('.appdetail_c');
        //t.star = t.app.find('.appdetail_s');
        t.href = t.app.find('.appdetail_h');
        t.w = applist.width();
        t.h = applist.height();
        applist.find("li").live("mouseenter",function(){
			if(!$(this).hasClass('on')){t.appendInfo(this);t.resetPosition(this);t.app.show();}
			});
        t.app.bind("mouseleave",function(){$(this).hide();$(".appdetail").removeAttr("style");});
        t.init();
    };App.prototype = {
        init:function(){
            var t = this;
            var applist = $('.applist');
            t.w = applist.width();
            t.h = applist.height();
        },
        appendInfo:function(li){
            var t = this;
            var el = $(li).find('img');
            var name = el.attr("name");
            var ver  = el.attr("conc");


           // var cate = el.attr("cate");
            var img  = el.attr("src");
            var href  = $(li).find('a').attr("href");
            t.icon.attr("src",img);
			 t.icon.attr("alt",name);
            t.name.html(name);
			//t.alt.html(name);
			//alert(ver);
            t.ver.html(ver);

           // t.cate.html(cate);
			t.href.attr('href',href);

        },
        resetPosition:function(li){
            var t = this;
            var pos = $(li).position();
			var posL = pos.left;
			var ulW = $("#app_iphone_list").width();
			var appW = $(".appdetail").width();



	/*$(".des_close").click(function(){
		$(this).parent().parent(".des_detail").removeAttr("style");
		//$(this).parent(".appdetail").removeAttr("style");
		});



			if(posL<= ulW -appW){
				if(pos.top<400){
					t.app.css({"left":posL,"top":pos.top});
				}else{
					t.app.css({"left":posL,"bottom":"0"});
				 }
			}
			if(posL> ulW -appW){
				$(".appdetail").removeAttr("style");
				if(pos.top<400){
					t.app.css({"right":"0","top":pos.top});

				}else{
					t.app.css({"right":"0","bottom":"0"});
				 }

				$(".appdetail").find(".team_box_tj").css("left","25px");
				$(".appdetail").find(".des_img").css("float","right");
				$(".appdetail").find(".des_close").css({right:"inherit",left:"10px"});
			}else{
			$(".appdetail").find(".team_box_tj").removeAttr("style");
			$(".appdetail").find(".des_img").removeAttr("style");
			$(".appdetail").find(".des_close").removeAttr("style");
			}
			*/

            //t.app.css({"left":pos.left,"top":pos.top});
        }
    };var app = new App();


});

