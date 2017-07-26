/**
 * 加法
 * @param num1
 * @param num2
 * @returns {Number}
 */
function add(num1,num2){  
    var r1,r2,m;  
    try{
    	r1=num1.toString().split(".")[1].length;
    }catch(e){
    	r1=0;
    }  
    try{
    	r2=num2.toString().split(".")[1].length;
    }catch(e){
    	r2=0;
    }  
    m=Math.pow(10,Math.max(r1,r2));
    return (num1*m+num2*m)/m;
}

/**
 * 减法
 * @param num1
 * @param num2
 * @returns
 */
function sub(num1,num2){      
    return add(num1,-num2);  
}

/**
 * 乘法
 * @param num1
 * @param num2
 * @returns {Number}
 */
function mul(num1,num2){
	var m=0,
	s1=num1.toString(),
	s2=num2.toString();  
    try{
    	m+=s1.split(".")[1].length;
    }catch(e){
    	
    }  
    try{
    	m+=s2.split(".")[1].length;
    }catch(e){
    	
    }  
    return Number(s1.replace(".",""))*Number(s2.replace(".",""))/Math.pow(10,m);
}

/**
 * 除法
 * @param num1
 * @param num2
 * @returns {Number}
 */
function div(num1,num2){  
    var t1=0,t2=0,r1,r2;  
    try{
    	t1=num1.toString().split(".")[1].length;
    }catch(e){
    	
    }  
    try{
    	t2=num2.toString().split(".")[1].length;
    }catch(e){
    	
    }  
    with(Math){  
        r1=Number(num1.toString().replace(".",""));
        r2=Number(num2.toString().replace(".",""));
        return (r1/r2)*pow(10,t2-t1);  
    }  
}

/**
 * 验证手机号码格式
 * @param str
 * @returns
 */
function testPhone(str){
	var pattern = /(13\d|14[57]|15[^4,\D]|17[678]|18\d)\d{8}|170[059]\d{7}/;
	return pattern.test(str);
}

/**
 * 验证各种特殊字符并替换掉
 * @param s
 * @returns
 */
function stripscript(s){ 
    var pattern = new RegExp("[`~!@#$^&*()=|{}':;',\\[\\].<>/?~！@#￥……&*（）——|{}【】‘；：”“'。，、？]");
    var rs = ""; 
    for (var i = 0; i < s.length; i++) { 
        rs = rs+s.substr(i, 1).replace(pattern, '').trim(); 
    } 
    return rs; 
}

/**
 * 验证邮箱
 * @param str
 * @returns
 */
function testEmail(str){
	var pattern = /\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
	return pattern.test(str);
}

/**
 * 判断是否相等
 * @param str1 需要判断的第一个字符串
 * @param str2 需要判断的第二个字符串
 * @returns
 */
function testTwoStringToEquels(str1,str2){
	if($.trim(str1) == $.trim(str2)){
		return true;
	}
	return false;
}

/**
 * 字符长度验证
 * @param str 字符串
 * @param leng 多长
 * @returns 
 */
function stringLength(str,leng){
	str = $.trim(str);
	if(str.length >= leng){
		return true;
	}
	return false;
}