package com.ymkj.furniture.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

/*by lucky 2017  
 //						   _ooOoo_							              _ooOoo_    
 //						  o8888888o							             o8888888o    
 //						  88" . "88							             88" . "88    
 //						  (| -_- |)							             (| -_- |)    
 //						  O\  =  /O							             O\  =  /O    
 //					   ____/`---'\____						   	      ____/`---'\____    
 //					 .'  \\|     |//  `.						     .   ' \\| |//   `.    
 //					/  \\|||  :  |||//  \						    /  \\|||  :  |||//  \    
 //				   /  _||||| -:- |||||-  \						   /  _||||| -:- |||||-  \    
 //				   |   | \\\  -  /// |   |						   |   | \\\  -  /// |   |    
 //				   | \_|  ''\---/''  |   |						   | \_|  ''\---/''  |   |    
 //				   \  .-\__  `-`  ___/-. /						    \  .-\__ `-` ___/-.  /    
 //			     ___`. .'  /--.--\  `. . __					  	  ___`. .' /--.--\ `. . __    
 //			  ."" '<  `.___\_<|>_/___.'  >'"".				   ."" '< `.___\_<|>_/___.' >'"".    
 //			 | | :  `- \`.;`\ _ /`;.`/ - ` : | |			 | | : `- \`.;`\ _ /`;.`/ - ` : | |    
 //			 \  \ `-.   \_ __\ /__ _/   .-` /  /			   \ \ `-. \_ __\ /__ _/ .-` / /    
 //		 ======`-.____`-.___\_____/___.-`____.-'====== ======`-.____`-.___\_____/___.-`____.-'======    
 //					       	`=---='    
 //
 //		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  .............................................      
 //			     	  佛祖保佑             永无BUG   									佛祖保佑       永无BUG
 //			佛曰:    
 //				写字楼里写字间，写字间里程序员；    
 //				程序人员写程序，又拿程序换酒钱。    
 //				酒醒只在网上坐，酒醉还来网下眠；    
 //				酒醉酒醒日复日，网上网下年复年。    
 //				但愿老死电脑间，不愿鞠躬老板前；    
 //				奔驰宝马贵者趣，公交自行程序员。    
 //				别人笑我忒疯癫，我笑自己命太贱；    
 //				不见满街漂亮妹，哪个归得程序员？  
 //										-------by 见死不救    
 */
/**
 * 公用方法控制器
 * 
 * @author lucky(李文鑫) HelpController HelpController.java 2017年4月10日-下午3:04:33
 */
public class HelpController {
	
	public static List<String> browserList = new ArrayList<String>(45);// list大小
	// browserList里面的值表示的是移动端（非PC端）
	static {
		browserList.add("nokia");
		browserList.add("samsung");
		browserList.add("midp-2");
		browserList.add("cldc1.1");
		browserList.add("symbianos");
		browserList.add("maui");
		browserList.add("untrusted/1.0");
		browserList.add("windows ce");
		browserList.add("iphone");
		browserList.add("ipad");
		browserList.add("android");
		browserList.add("blackberry");
		browserList.add("ucweb");
		browserList.add("brew");
		browserList.add("j2me");
		browserList.add("yulong");
		browserList.add("coolpad");
		browserList.add("tianyu");
		browserList.add("ty-");
		browserList.add("k-touch");
		browserList.add("haier");
		browserList.add("dopod");
		browserList.add("lenovo");
		browserList.add("mobile");
		browserList.add("huaqin");
		browserList.add("aigo-");
		browserList.add("ctc/1.0");
		browserList.add("ctc/2.0");
		browserList.add("cmcc");
		browserList.add("daxian");
		browserList.add("mot-");
		browserList.add("sonyericsson");
		browserList.add("gionee");
		browserList.add("htc");
		browserList.add("zte");
		browserList.add("huawei");
		browserList.add("webos");
		browserList.add("gobrowser");
		browserList.add("iemobile");
		browserList.add("wap2.0");
		browserList.add("ucbrowser");
		browserList.add("ipod");
	}
	
	/**
	 * 判断跳往那个端的页面
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-上午10:01:53
	 * @param request
	 * @param pageName 页面的名称
	 * @return
	 */
	public static String jumpWhichEnd(HttpServletRequest request,String pageName){
		if (isPc(request)) {
			return "pc/"+pageName;
		}else{
			return "mobile/"+pageName;
		}
	}
	
	/**
	 * 判断跳往那个端的页面
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-上午10:01:53
	 * @param request
	 * @param pageName 页面的名称
	 * @return
	 */
	public static String jumpWhichEndFile(HttpServletRequest request,String flie,String pageName){
		if (isPc(request)) {
			return flie+"/"+pageName;
		}else{
			return "mobile/"+pageName;
		}
	}
	
	/**
	 * 判断跳往那个端的页面
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-上午10:01:53
	 * @param request
	 * @param pcName pc页面的名称
	 * @param moName 手机页面的名称
	 * @return
	 */
	public static String jumpWhichEnd(HttpServletRequest request,String pcName,String moName){
		if (isPc(request)) {
			return "pc/"+pcName;
		}else{
			return "mobile/"+moName;
		}
	}
	
	/**
	 * 判断是微信访问还是其他访问
	 * 
	 * @author lucky(李文鑫) HelpController.java 2017年4月10日-下午3:06:52
	 * @param request
	 * @return 是微信true 反之false
	 */
	public static boolean isWx(HttpServletRequest request) {
		String ua = ((HttpServletRequest) request).getHeader("user-agent").toLowerCase();
		if (ua.indexOf("micromessenger") > 0) {// 是微信浏览器
			return true;
		}
		return false;
	}
	
	public static String[] keywords = {"android", "iphone", "ipod", "ipad", "windows phone", "mqqbrowser"};
	
	/**
	 * 判断移动端的什么系统
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-下午4:51:22
	 * @param request
	 * @return
	 */
	public static String isIphoneOrAndroid(HttpServletRequest request){
		String ua = ((HttpServletRequest) request).getHeader("user-agent").toLowerCase();
		if (ua != null) {
			if (browserList.contains(ua)) {// 是移动端
				return ua;
			}
		} 
	    return "PC";  
	}

	/**
	 * 判断是PC访问还是移动访问
	 * @author lucky(李文鑫) HelpController.java 2017年4月10日-下午3:06:52
	 * @param request
	 * @return 是PCtrue 反之false
	 */
	public static boolean isPc(HttpServletRequest request) {
		/*String ua = ((HttpServletRequest) request).getHeader("user-agent").toLowerCase();
		if (ua != null) {
			if (browserList.contains(ua)) {// 是移动端
				return false;
			} else {// PC端
				return true;
			}
		} else {// 为null的时候(默认pc)
			return true;
		}*/
		String userAgent = request.getHeader("user-agent");
		if(userAgent.indexOf("Android") != -1){
		    //安卓
			return false;
		}else if(userAgent.indexOf("iPhone") != -1 || userAgent.indexOf("iPad") != -1){
		   //苹果
			return false;
		}else{
		    //电脑
			return true;
		}
	}
	
	/**
	 * session过期后的操作
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2016年10月31日-下午4:23:59
	 * @param request
	 * @param url 微信端跳转页面
	 * @param pc 电脑端跳转页面
	 * @param mobile 手机端跳转页面
	 * @return
	 */
	public static String notLogin(HttpServletRequest request,String url,String pc,String mobile){
		if (isPc(request)) {
			return pc;
		}else{
			if (isWx(request)) {// 是微信浏览器
				return GetUtil.getLoginUrl(url);
			}
			return mobile;
		}
	}
	
	/**
	 * 判断是PC访问还是移动访问
	 * @author lucky(李文鑫) HelpController.java 2017年4月10日-下午3:06:52
	 * @param request
	 * @return 是PCtrue 反之false
	 */
	public static String isPcReturn(HttpServletRequest request) {
		/*String ua = ((HttpServletRequest) request).getHeader("user-agent").toLowerCase();
		if (ua != null) {
			if (browserList.contains(ua)) {// 是移动端
				return false;
			} else {// PC端
				return true;
			}
		} else {// 为null的时候(默认pc)
			return true;
		}*/
		String userAgent = request.getHeader("user-agent");
		if(userAgent.indexOf("Android") != -1){
		    //安卓
			return "Android";
		}else if(userAgent.indexOf("iPhone") != -1){
		   //苹果
			return "iPhone";
		}else if(userAgent.indexOf("iPad") != -1){
			//苹果
			return "iPad";
		}else{
		    //电脑
			return "PC";
		}
	}
	
	/**
	 * 过滤参数 如果找到非法字符则返回true,如果没找到则返回false
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-下午12:14:17
	 */
	public static boolean filterParameter(HttpServletRequest request){
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (parameterMap != null) {
			for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
				String[] value = entry.getValue();
				if (value != null) {
					int strLength = value.length;
					for (int i = 0; i < strLength; i++) {
						boolean result = stripXSS(value[i]);
						if (result) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * (自定义跳过某个参数不过滤)过滤参数 如果找到非法字符则返回true,如果没找到则返回false
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-下午12:14:17
	 */
	public static boolean filterParameter(HttpServletRequest request,String[] keys){
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (parameterMap != null) {
			for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
				String key = entry.getKey();
				String[] value = entry.getValue();
				boolean isTrue = false;
				for (String k : keys) {
					if (key.equals(k)) {
						isTrue = true;
						break;
					}
				}
				if (isTrue) {
					break;
				}
				if (value != null) {
					int strLength = value.length;
					for (int i = 0; i < strLength; i++) {
						boolean result = stripXSS(value[i]);
						if (result) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * (自定义跳过某个参数不过滤)过滤参数 如果找到非法字符则返回true,如果没找到则返回false
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2016年11月21日-下午12:14:17
	 */
	public static boolean filterParameter(HttpServletRequest request,String keys){
		Map<String, String[]> parameterMap = request.getParameterMap();
		if (parameterMap != null) {
			for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
				String key = entry.getKey();
				String[] value = entry.getValue();
				if (!key.equals(keys)) {
					if (value != null) {
						int strLength = value.length;
						for (int i = 0; i < strLength; i++) {
							boolean result = stripXSS(value[i]);
							if (result) {
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}
	
	/**
	 * 如果找到非法字符则返回true,如果没找到则返回false
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-下午12:14:09
	 * @param value
	 * @return
	 */
    public static boolean stripXSS(String value) {
        boolean result = false;
        if (value != null) {
            // Avoid null characters
            value = value.replaceAll("", "");
            
            //特殊字符
            String regEx="[`~!#$%^&*()+|{}';'\\[\\]<>/?~！#￥%……&*（）——+|{}【】‘；：”“’？]";
	   		Pattern p = Pattern.compile(regEx);
	   		Matcher m = p.matcher(value);
	   		result = m.find();
	   		if (result) 
				return result;
	   		
            // Avoid anything between script tags
            Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>",
                    Pattern.CASE_INSENSITIVE);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            // //如果找到则为true
            if (result)
                return result;
            
            // Avoid anything in a src='...' type of expression
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Remove any lonesome </script> tag
            scriptPattern = Pattern.compile("</script>",
                    Pattern.CASE_INSENSITIVE);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Remove any lonesome <script ...> tag
            scriptPattern = Pattern.compile("<script(.*?)>",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Avoid eval(...) expressions
            scriptPattern = Pattern.compile("eval\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Avoid expression(...) expressions
            scriptPattern = Pattern.compile("expression\\((.*?)\\)",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            scriptPattern = Pattern.compile("vbscript:",
                    Pattern.CASE_INSENSITIVE);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Avoid onload= expressions
            scriptPattern = Pattern.compile("onload(.*?)=",
                    Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                            | Pattern.DOTALL);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
            
            // Avoid alert:... expressions
            scriptPattern = Pattern.compile("alert", Pattern.CASE_INSENSITIVE);
            result = scriptPattern.matcher(value).find();// .replaceAll("");
            if (result)
                return result;
        }
        return result;
    }
    
    /**
	 * 如果找到非法字符则返回true,如果没找到则返回false
	 * @author lucky(李文鑫)
	 * HelpController.java
	 * 2017年4月10日-下午12:14:09
	 * @param value
	 * @return
	 */
    public static boolean stripXSS(String... obj) {
        boolean result = false;
        if (obj != null) {
        	for (String value : obj) {
        		  // Avoid null characters
                value = value.replaceAll("", "");
                
                //特殊字符
                String regEx="[`~!#$%^&*()+|{}':;'\\[\\]<>/?~！#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
    	   		Pattern p = Pattern.compile(regEx);
    	   		Matcher m = p.matcher(value);
    	   		result = m.find();
    	   		if (result) 
    				return result;
    	   		
                // Avoid anything between script tags
                Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>",
                        Pattern.CASE_INSENSITIVE);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                // //如果找到则为true
                if (result)
                    return result;
                
                // Avoid anything in a src='...' type of expression
                scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Remove any lonesome </script> tag
                scriptPattern = Pattern.compile("</script>",
                        Pattern.CASE_INSENSITIVE);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Remove any lonesome <script ...> tag
                scriptPattern = Pattern.compile("<script(.*?)>",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Avoid eval(...) expressions
                scriptPattern = Pattern.compile("eval\\((.*?)\\)",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Avoid expression(...) expressions
                scriptPattern = Pattern.compile("expression\\((.*?)\\)",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                scriptPattern = Pattern.compile("vbscript:",
                        Pattern.CASE_INSENSITIVE);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Avoid onload= expressions
                scriptPattern = Pattern.compile("onload(.*?)=",
                        Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                | Pattern.DOTALL);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
                
                // Avoid alert:... expressions
                scriptPattern = Pattern.compile("alert", Pattern.CASE_INSENSITIVE);
                result = scriptPattern.matcher(value).find();// .replaceAll("");
                if (result)
                    return result;
			}
        }
        return result;
    }
    
    /**
   	 * 如果找到非法字符则返回true,如果没找到则返回false
   	 * @author lucky(李文鑫)
   	 * HelpController.java
   	 * 2017年4月10日-下午12:14:09
   	 * @param value
   	 * @return
   	 */
       public static boolean stripXSS(int... obj) {
           boolean result = false;
           if (obj != null) {
           	for (int o : obj) {
           		  // Avoid null characters
                  String value = o+"".replaceAll("", "");
                   
                   //特殊字符
                   String regEx="[`~!#$%^&*()+|{}':;'\\[\\]<>/?~！#￥%……&*（）——+|{}【】‘；：”“’。，、？]";
       	   		Pattern p = Pattern.compile(regEx);
       	   		Matcher m = p.matcher(value);
       	   		result = m.find();
       	   		if (result) 
       				return result;
       	   		
                   // Avoid anything between script tags
                   Pattern scriptPattern = Pattern.compile("<script>(.*?)</script>",
                           Pattern.CASE_INSENSITIVE);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   // //如果找到则为true
                   if (result)
                       return result;
                   
                   // Avoid anything in a src='...' type of expression
                   scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\'(.*?)\\\'",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   scriptPattern = Pattern.compile("src[\r\n]*=[\r\n]*\\\"(.*?)\\\"",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Remove any lonesome </script> tag
                   scriptPattern = Pattern.compile("</script>",
                           Pattern.CASE_INSENSITIVE);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Remove any lonesome <script ...> tag
                   scriptPattern = Pattern.compile("<script(.*?)>",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Avoid eval(...) expressions
                   scriptPattern = Pattern.compile("eval\\((.*?)\\)",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Avoid expression(...) expressions
                   scriptPattern = Pattern.compile("expression\\((.*?)\\)",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   scriptPattern = Pattern.compile("vbscript:",
                           Pattern.CASE_INSENSITIVE);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Avoid onload= expressions
                   scriptPattern = Pattern.compile("onload(.*?)=",
                           Pattern.CASE_INSENSITIVE | Pattern.MULTILINE
                                   | Pattern.DOTALL);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
                   
                   // Avoid alert:... expressions
                   scriptPattern = Pattern.compile("alert", Pattern.CASE_INSENSITIVE);
                   result = scriptPattern.matcher(value).find();// .replaceAll("");
                   if (result)
                       return result;
   			}
           }
           return result;
       }
}
