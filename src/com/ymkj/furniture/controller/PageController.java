package com.ymkj.furniture.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.util.HelpController;

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
 * 页面跳转控制器
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年6月15日-下午11:39:14
 */
@Controller
public class PageController {
	/**
	 * 前端展示跳转页面
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月15日-下午11:41:26
	 * @param action
	 * @return
	 */
	@RequestMapping(value={"to{action}","do.html"},method=RequestMethod.GET)
	public String toPage(@PathVariable String action,HttpServletRequest request,HttpSession session,Model model){
		String url = "to"+action;
		String retUrl = "";
		if(action.equals("-login")){
			retUrl = request.getHeader("referer");
			if (retUrl != null) {
				retUrl = retUrl.substring(7).substring(retUrl.substring(7).indexOf("/")+1);
				if(retUrl.equals("to-register") || retUrl.equals("to-login") || retUrl.equals("to-sign") || retUrl.equals("cancellation")){
					retUrl = "to-index";
				}
			}else {
				retUrl = "to-index";
			}
			request.setAttribute("url", retUrl);
		}
		action=action.replace('-', '/');
		if (action.indexOf("/user/") > -1) {
			User user = (User)session.getAttribute("user");
			if (user == null) {
				request.setAttribute("url", "to-user-index");
				action = "/login";
			}
		}
		String[] array = action.split(",");
		if (array.length > 1) {
			model.addAttribute("luckyParam", array[1]);
		}
		return "pc"+array[0];
	}
	
	/**
	 * 商城页面
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月16日-下午3:11:14
	 * @param action
	 * @return
	 */
	@RequestMapping(value={"go{action}","doo.html"},method=RequestMethod.GET)
	public String tooPage(@PathVariable String action){
		action=action.replace('-', '/');
		return "appliance"+action;
	}
	
	/**
	 * 后台展示跳转页面
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月15日-下午11:42:36
	 * @param action
	 * @return
	 */
	@RequestMapping(value="admin{action}",method=RequestMethod.GET)
	public String tooAdminPage(@PathVariable String action,HttpServletRequest request,HttpSession session){
		if (HelpController.filterParameter(request)) {
			return "filterParameter";
		}
		Administrator administrator = (Administrator)session.getAttribute("administrator");
		if (null == administrator) {
			return "pcadmin/loginto";
		}
		String [] array = action.split(",");
		if (array.length > 1) {
			request.setAttribute("lucky", array[1]);
		}else {
			action=action.replace('-', '/');
		}
		return "pcadmin"+action;
	}
}
