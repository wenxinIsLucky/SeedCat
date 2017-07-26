package com.ymkj.furniture.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Home;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.entity.UserContainer;
import com.ymkj.furniture.service.UserService;

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
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年6月26日-下午7:11:29
 */
@Controller
public class UserController {
	@Resource
	UserService userService;
	
	/**
	 * 登录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午7:24:24
	 * @param request
	 * @param account
	 * @param password
	 * @return
	 */
	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginTO(HttpServletRequest request,HttpSession session,@RequestParam("account")String account,@RequestParam("password")String password,@RequestParam("url")String url){
		return userService.loginUser(request,session,account, password,url);
	}
	
	/**
	 * 重新加载数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月6日-下午4:35:39
	 * @param session
	 * @param request
	 * @param url
	 * @return
	 */
	@RequestMapping(value="reloadDate{url}",method=RequestMethod.GET)
	public String reloadDate(HttpSession session,HttpServletRequest request,@PathVariable String url){
		User user = (User)session.getAttribute("user");
		user = userService.findByUid(user.getUid());
		session.setAttribute("user",user);
		return "redirect:"+url;
	}
	
	/**
	 * 注销
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月28日-下午12:26:27
	 * @param session
	 * @return
	 */
	@RequestMapping(value="cancellation",method=RequestMethod.GET)
	public String cancellation(HttpSession session){
		session.removeAttribute("user");
		return "redirect:/to-index";
	}
	
	/**
	 * 注册
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月28日-下午4:58:52
	 * @param request
	 * @param phone
	 * @param user
	 * @return
	 */
	@RequestMapping(value="register",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> registerUser(HttpServletRequest request,@ModelAttribute User user){
		return userService.addUserBrowserPhone(request, user);
	}
	
	/**
	 * 获取首页数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午4:40:45
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getUserHomeData",method=RequestMethod.POST)
	@ResponseBody
	public Home getUserHomeData(HttpSession session,@RequestParam("heuid")String heuid){
		return userService.findHomeData(session,heuid);
	}
	
	
	/**
	 * 修改个人资料
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-上午12:10:31
	 * @param userContainer
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updUserInfo",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updUserInfoData(@ModelAttribute UserContainer userContainer,HttpSession session){
		return userService.updUserInfo(userContainer,session);
	}
}
