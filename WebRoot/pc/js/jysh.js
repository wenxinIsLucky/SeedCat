/*
* @Author: Marte
* @Date:   2017-05-06 00:56:47
* @Last Modified by:   Marte
* @Last Modified time: 2017-05-06 01:01:36
*/
 var FRONTEND_HOST = 'http://cdn.guojj.com';
    var STATIC_GLOBAL_VERSION = '';
    var STATIC_VERSION_CONFIG = {"http:\/\/cdn.guojj.com\/ywj\/component\/simpleimageuploader.js":"20161212","http:\/\/cdn.guojj.com\/ywj\/component\/resource\/imgslide.css":"20161229","http:\/\/cdn.guojj.com\/ywj\/component\/suggest_community.js":"20160411","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_whkyfx_word.css":"20170414","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_xinnian2017.css":"20170205","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_wylb201608.css":"20170216","http:\/\/cdn.guojj.com\/app\/component\/packagecompute.js":"20161111","http:\/\/cdn.guojj.com\/app\/www\/css\/article_detail.css":"20170406","http:\/\/cdn.guojj.com\/app\/www\/css\/quote_combo_tk.css":"2017040602","http:\/\/cdn.guojj.com\/app\/www\/css\/login_register.css":"20170104","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_jbh_xcqd.css":"20170222","http:\/\/cdn.guojj.com\/app\/www\/css\/question_list.css":"20160418","http:\/\/cdn.guojj.com\/app\/www\/css\/index_zpj_mod.css":"20170321","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_wylb201608.css":"20170216","http:\/\/cdn.guojj.com\/app\/www\/css\/about_shigong.css":"20170406","http:\/\/cdn.guojj.com\/ywj\/component\/areaselector.js":"20170209","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_zpj2016.css":"20170204","http:\/\/cdn.guojj.com\/app\/www\/css\/image_detail.css":"20170406","http:\/\/cdn.guojj.com\/app\/www\/css\/userdecorate.css":"20160812","http:\/\/cdn.guojj.com\/app\/www\/css\/about_zhucai.css":"20170406","http:\/\/cdn.guojj.com\/app\/component\/autoappoint.js":"20170405","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_znq2016.css":"20161121","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_gqj2016.css":"2016092702","http:\/\/cdn.guojj.com\/app\/h5\/css\/app-download.css":"20170419","http:\/\/cdn.guojj.com\/app\/www\/css\/quote_combo.css":"20170412","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_wxzfxt.css":"20170405","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_whkyfx.css":"20170418","http:\/\/cdn.guojj.com\/app\/www\/css\/renxinghua.css":"20170424","http:\/\/cdn.guojj.com\/app\/h5\/css\/quote_combo.css":"20170424","http:\/\/cdn.guojj.com\/app\/www\/css\/gdp\/common.css":"20170104","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_sjybj.css":"20161212","http:\/\/cdn.guojj.com\/ywj\/component\/build.www.js":"20170301","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_ymbj2.css":"20170308","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_wbh2016.css":"20160505","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_apphd.css":"20160622","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_moban.css":"20160805","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_gqj2016.css":"20160927","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_ppxc.css":"20160622","http:\/\/cdn.guojj.com\/ywj\/component\/imgslide.js":"20161229","http:\/\/cdn.guojj.com\/app\/www\/js\/albumdetail.js":"20161202","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_sdky.css":"20160419","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_ymbj.css":"20160928","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_whzx.css":"20170301","http:\/\/cdn.guojj.com\/app\/www\/js\/imagedetail.js":"20161202","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_whky.css":"20170505","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_zqtg.css":"20160907","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_lctq.css":"20170315","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_zxbj.css":"20160928","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_qbbj.css":"20170321","http:\/\/cdn.guojj.com\/app\/h5\/css\/renxinghua.css":"20170328","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_xftg.css":"20160928","http:\/\/cdn.guojj.com\/app\/www\/css\/news_list.css":"20170419","http:\/\/cdn.guojj.com\/app\/www\/css\/down-page.css":"20160729","http:\/\/cdn.guojj.com\/app\/www\/css\/list_page.css":"20170109","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_freeyf.css":"20170105","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_sjs.css":"20160630","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_zpjfb.css":"20170204","http:\/\/cdn.guojj.com\/app\/www\/css\/sz_tyg01.css":"20161209","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd_dwj.css":"2016052302","http:\/\/cdn.guojj.com\/app\/www\/css\/question.css":"20170109","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_moban.css":"20161027","http:\/\/cdn.guojj.com\/app\/www\/css\/article.css":"20170406","http:\/\/cdn.guojj.com\/app\/www\/css\/zhenpin.css":"20170420","http:\/\/cdn.guojj.com\/app\/www\/css\/zhuanti.css":"20170109","http:\/\/cdn.guojj.com\/ywj\/component\/ladder.js":"20161013","http:\/\/cdn.guojj.com\/app\/h5\/css\/fx\/znqfx.css":"20161123","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_sdky.css":"20160419","http:\/\/cdn.guojj.com\/app\/www\/css\/constru.css":"20170303","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_xftg.css":"2016052302","http:\/\/cdn.guojj.com\/app\/www\/css\/sz_tc01.css":"20160920","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_zxbj.css":"20160927","http:\/\/cdn.guojj.com\/app\/www\/js\/accordion.js":"20160831","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_qbbj.css":"20170321","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_lctq.css":"20170315","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_ymbj.css":"20170308","http:\/\/cdn.guojj.com\/app\/www\/css\/global.css":"20170421","http:\/\/cdn.guojj.com\/app\/h5\/css\/zhenpin.css":"20170424","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_sjs.css":"20160630","http:\/\/cdn.guojj.com\/app\/h5\/css\/shigong.css":"20170410","http:\/\/cdn.guojj.com\/app\/www\/css\/hd_dwj.css":"20160607","http:\/\/cdn.guojj.com\/app\/h5\/css\/userapp.css":"20160530","http:\/\/cdn.guojj.com\/app\/www\/css\/baojia.css":"20160810","http:\/\/cdn.guojj.com\/ywj\/component\/popup.js":"20161228","http:\/\/cdn.guojj.com\/app\/www\/css\/topic.css":"20170109","http:\/\/cdn.guojj.com\/app\/h5\/css\/public.css":"20170418","http:\/\/cdn.guojj.com\/app\/www\/js\/zhenpin.js":"20170420","http:\/\/cdn.guojj.com\/app\/component\/auto.js":"20170414","http:\/\/cdn.guojj.com\/app\/www\/css\/offer.css":"20160503","http:\/\/cdn.guojj.com\/app\/www\/css\/about.css":"20170320","http:\/\/cdn.guojj.com\/app\/h5\/css\/appweb.css":"20170418","http:\/\/cdn.guojj.com\/app\/www\/css\/index.css":"201704011","http:\/\/cdn.guojj.com\/app\/www\/css\/cshhr.css":"20170407","http:\/\/cdn.guojj.com\/app\/www\/js\/appoint.js":"20170112","http:\/\/cdn.guojj.com\/app\/www\/css\/image.css":"20170109","http:\/\/cdn.guojj.com\/ywj\/ui\/backend\/*.css":"20170113","http:\/\/cdn.guojj.com\/app\/www\/js\/common.js":"20170316","http:\/\/cdn.guojj.com\/app\/www\/css\/user.css":"20170104","http:\/\/cdn.guojj.com\/app\/h5\/css\/hd\/hd.css":"20170505","http:\/\/cdn.guojj.com\/app\/www\/css\/zxjz.css":"20160425","http:\/\/cdn.guojj.com\/app\/h5\/css\/index.css":"20170418","http:\/\/cdn.guojj.com\/app\/www\/css\/seo.css":"20160503","http:\/\/cdn.guojj.com\/app\/h5\/css\/anli.css":"20161229","http:\/\/cdn.guojj.com\/app\/www\/js\/index.js":"20170320","http:\/\/cdn.guojj.com\/app\/h5\/js\/public.js":"20170313","http:\/\/cdn.guojj.com\/app\/component\/*.js":"20160415","http:\/\/cdn.guojj.com\/app\/h5\/css\/tyg.css":"20170303","http:\/\/cdn.guojj.com\/app\/www\/css\/hd.css":"20161025","http:\/\/cdn.guojj.com\/ywj\/component\/*.js":"20170427","http:\/\/cdn.guojj.com\/seajs\/config.js":"20170420","http:\/\/cdn.guojj.com\/app\/www\/*.css":"20160415","http:\/\/cdn.guojj.com\/app\/h5\/*.css":"20160415","http:\/\/cdn.guojj.com\/hightchart\/*":"2015","http:\/\/cdn.guojj.com\/app\/www\/*.js":"20160307","http:\/\/cdn.guojj.com\/app\/h5\/*.js":"20160415","http:\/\/cdn.guojj.com\/waterfall\/*":"2015","http:\/\/cdn.guojj.com\/seajs\/*.js":"2015","http:\/\/cdn.guojj.com\/lazyload\/*":"2015","http:\/\/cdn.guojj.com\/ueditor\/*":"20160315","http:\/\/cdn.guojj.com\/jquery\/*":"2015","http:\/\/cdn.guojj.com\/swiper\/*":"2015","*.gif":"","*.png":"","*.jpg":"","*":"2017031601"};




    seajs.use(['jquery', 'app/autoappoint', 'ywj/msg', 'www/zhenpin', 'jquery/cookie'], function($, autoappoint, msg, zhenpin){
    $appointForm = $('form[data-auto-appoint-tag]');
    //预约组件调用
    autoappoint({
        on_success: function(message, data){
            //关闭验证码框
            $('.verify-popup').hide();
            $('.verify-popup-mask').hide();
            $('input[name="captcha"]').val('');
            if($('[name="quote_position"]').val() == 1) {
                $.cookie('mobile_quote', $('.zhenpin-quote input[name="mobile"]').val());
                $('.zhenpin-quote .price-result').removeClass('mtlarge');
                $('.zhenpin-quote .auth-code').remove();
                $('.zhenpin-quote .captchaBox').hide();
                $('form[data-auto-appoint-tag]').removeClass("need-verify-form");

                $type_quote = $('input[name="type_quote"]').val();
                $area_quote = $('.zhenpin-quote input[name="measure_area"]').val();
                $area_status = $('.zhenpin-quote input[name="house_type"]:checked').val();
                if($area_status == 2){
                    $area_quote = $area_quote * 0.8;
                }
                $.ajax({
                    type: 'post',

                    data: {'type_quote': $type_quote,'area_quote' : $area_quote},
                    success: function (data) {
                        $('.price-result3 .price').html(data);
                        $('.price-result3').siblings('.price-tip').fadeIn(200);

                        if($('input[name="type_quote"]').val() == 'A'){
                            $('input[name="quote_a"]').val(data);
                        }else if($('input[name="type_quote"]').val() == 'B'){
                            $('input[name="quote_b"]').val(data);
                        }
                        $.ajax({
                            type: "post",

                            data: {'can_msg': $('.zhenpin-quote input[name="mobile"]').val(),'can_tag':'2017WEBzhenpin'},
                            success: function (data) {
                            },
                            error: function (data) {
                                return false;
                            }
                        });
                    },
                    error: function (data) {
                        return false;
                    }
                });
            }else if($("[name='quote_position']").val() == 2){
                $.cookie('mobile_quote', $('.group-quote input[name="mobile"]').val());
                $area_quote = $('#zpj-quoteForm3 input[name="measure_area"]').val();
                $area_status = $('#zpj-quoteForm3 input[name="house_type"]:checked').val();
                if($area_status == 2){
                    $area_quote = $area_quote * 0.8;
                }
                var A_type=$('input[name="A_type"]').val();
                var B_type=$('input[name="B_type"]').val();
                var C_type=$('input[name="C_type"]').val();
                var C_type_num=$('input[name="C_type_num"]').val();
                var C2_type=$('input[name="C2_type"]').val();
                var C2_type_num=$('input[name="C2_type_num"]').val();
                var D_type=$('input[name="D_type"]').val();

                // $('.group-quote .g-txt.area').addClass('mllarge');
                $('.group-quote .auth-code').remove();
                $('.group-quote .captchaBox').hide();
                $('form[data-auto-appoint-tag]').removeClass("need-verify-form");
                $.ajax({
                    type: 'post',
                    url: "http://www.guojj.com/zhenpin/quotation",
                    data: {'area_quote' : $area_quote,'A_type' : A_type,'B_type' : B_type,'C_type' : C_type,'C2_type' : C2_type,'D_type' : D_type,'C_type_num':C_type_num,'C2_type_num':C2_type_num},
                    success: function (data) {
                        $('.price-result2 .price').html(data);
                        $('.price-result2').siblings('.price-tip').fadeIn(200);
                        $.ajax({
                            type: "post",
                            url: "http://www.guojj.com/huodong/package_compute_ajax",
                            data: {'can_msg': $('.group-quote input[name="mobile"]').val(),'can_tag':'2017WEBzhenpin'},
                            success: function (data) {
                            },
                            error: function (data) {
                                return false;
                            }
                        });
                    },
                    error: function (data) {
                        return false;
                    }
                });
            }else{
                msg.show(message, 'succ');
            }

        },

        on_error:function(message, code, data){
            msg.show(message, 'err');

            if($("[name='quote_position']").val() == 0 || $("[name='quote_position']").val() == ''){
                if(data.error=='captcha'){
                    $('.verify-popup, .verify-popup-mask').show();
                    $('input.name_hid').val(data.name);
                    $('input.mobile_hid').val(data.mobile);
                    $('input.stores_hid').val(data.stores);
                    $('input.city_hid').val(data.city);
                }
            }else{
                if(data.error=='captcha'){
                    $('.captchaBox').show();
                    $appointForm.addClass("need-verify-form");
                }else{
                    $appointForm.removeClass("need-verify-form");
                }
            }
        }
    });
    //首页跳转过来对应TAB展开
    var href =  window.location.href.split('/');
    var pageId = href.pop() - 1;
    var handle = function(obj){
        obj.eq(pageId).addClass("active").removeClass("disactive").siblings().removeClass("active").addClass("disactive");
    };
    handle($(".zpj-tab li"));
    handle($(".zpj-tab-con > li"));
    window.onload=function(){
        var location = window.location.href;
        var includedText = "/id/";
        var tabStrNum = location.indexOf(includedText);//指定字符串首次出现的位置
        var newUrl = location.substr(0,tabStrNum);
        var stateObject = {};
        var title = "zpj-index";
        history.pushState(stateObject,title,newUrl);
        if(pageId >= 0){
            $('html, body').scrollTop('750');
        }
    };
});