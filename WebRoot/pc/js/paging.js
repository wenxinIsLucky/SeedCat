/**
 * @author lucky
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
				obj
						.append('<input class="test_input" title="按回车键跳转" maxlength="3" id="'
								+ args.input_name
								+ '"/><div class="go '
								+ args.input_name + '">GO</div>');
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
			backFn : function(p) {
				alert(p);
			}
		}, options);
		ms.init(this, args);
	}
})(jQuery);