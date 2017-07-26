$(document).ready(function(){

	//导航


	$(".sy1_ul .sy1_li").hover(


		function(){


			var index = $('.sy1_ul .sy1_li').index(this);


			$(this).addClass("sy1_li_bg").find(".sy2_ul").stop(true,true).fadeIn(350);


			//select隐藏（i6下select始终在最上层的问题）


			$(".searchselect").slideUp();


		},

		function(){

			var index = $('.sy1_ul .sy1_li').index(this);

			$(this).removeClass("sy1_li_bg").find(".sy2_ul").slideUp();

			//select 恢复显示

			$(".searchselect").slideDown();

		}

	)

	 $(".sy2_li").hover(

			function(){


				var index=$(this).children("ul").length;


				if(index>0){$(this).addClass("sy2_li_h")}


				$(this).find("ul:first").slideDown()	},


			function(){$(this).removeClass("sy2_li_h").find("ul:first").slideUp()}


		);

	//导航下拉位置样式控制

	$(".sy2_ul .sy2_li").addClass("bod_1");


});