;(function($) {
	$.extend({
		'idycode' : function(options) {
			options = $.extend({
				'form' : null,
				'codeSelector' : '.identityCode',
				'itemSelector' : '.item',
			}, options);
			$('<style></style>', {
				type : 'text/css'
			}).html(
					options.codeSelector + '{' + 'width: 300px;'
							+ 'height: 300px;' + 'background: #ccc;' + '} '
							+ options.codeSelector + ' ' + options.itemSelector
							+ '{' + 'width: 90px;' + 'height: 90px;'
							+ 'line-height: 90px;' + 'background: #666;'
							+ 'margin: 5px;' + 'float: left;' + 'color: white;'
							+ 'font-size: 4em;' + 'text-align: center;' + '} '
							+ options.codeSelector + ' ' + options.itemSelector
							+ ':hover{' + 'cursor: pointer;' + '}').appendTo(
					'head');
			function getColorByPos(pos) {
				switch (pos) {
				case 1:
					return '#FF4500';
				case 2:
					return '#FF8C00';
				case 3:
					return '#FFD700';
				case 4:
					return '#98FB98';
				case 5:
					return '#66CDAA';
				case 6:
					return '#48D1CC';
				case 7:
					return '#9400D3';
				case 8:
					return '#DC143C';
				case 9:
					return '#4169E1';
				default:
					return 'black';
				}
			}
			var userInputCode = [];
			var $codeBox = $(options.codeSelector);
			var $items = $codeBox.find(options.itemSelector);
			var $form = $(options.form);
			$items.click(function(e) {
				var srcEle = e.target;
				var pos;
				for (pos = 1; pos <= $items.length; pos++) {
					if ($items.get(pos - 1) == srcEle){
						break;
					}
				}
				if (userInputCode.indexOf(pos) == -1) {
					$($items.get(pos - 1)).css('background', 'white').css(
							'color', getColorByPos(pos));
					userInputCode.push(pos);
				}
				if (userInputCode.length == 9) {
					var tmp = '';
					for (var i = 0; i < 9; i++) {
						tmp += userInputCode[i];
					}
					$('<input></input>', {
						type : 'hidden',
						name : 'idycode',
						value : tmp
					}).appendTo($form);
				}
			});

		},
	});
})(jQuery);