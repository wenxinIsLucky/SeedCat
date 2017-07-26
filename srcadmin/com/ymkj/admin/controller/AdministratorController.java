package com.ymkj.admin.controller;

import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lwx.lucky.util.PictureVerificationCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.admin.service.AdministratorService;
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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:53:37
 */
@Controller
public class AdministratorController {
	@Resource
	AdministratorService administratorService;

	/**
	 * 后台登录
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:55:45
	 * @param request
	 * @param session
	 * @param account
	 * @param password
	 * @param index
	 * @return
	 */
	@RequestMapping(value = "loginAdmin", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> loginAdmin(HttpServletRequest request,
			HttpSession session, String account, String password, String index) {
		return administratorService.loginAdministrator(request, session,
				account, password, index);
	}

	/**
	 * 注销
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年4月4日-下午10:10:40
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "cancellationAdmin", method = RequestMethod.GET)
	public String cancellation(HttpSession session) {
		session.removeAttribute("administrator");
		return "redirect:/admin-loginto";
	}

	/**
	 * 获取验证码
	 * 
	 * @author lucky(李文鑫) UserController.java 2016年12月1日-上午11:05:43
	 * @param response
	 */
	@RequestMapping(value = "getVerificationStream", method = RequestMethod.GET)
	@ResponseBody
	public void getVerificationStream(HttpServletResponse response,
			HttpSession session) {
		try {
			ServletOutputStream os = response.getOutputStream();
			PictureVerificationCode pvc = new PictureVerificationCode(120, 40,
					4, 10);
			session.setAttribute("verifcationCode", pvc.getCode());
			pvc.write(os);
		} catch (IOException e) {
			System.out.println("getVerificationStream:" + e.getMessage());
		}
	}

	/**
	 * 校验验证码
	 * 
	 * @author lucky(李文鑫) UserController.java 2016年12月1日-上午11:32:23
	 * @param request
	 * @param session
	 * @param inputCode
	 * @return
	 */
	@RequestMapping(value = "verificationCode", method = RequestMethod.POST)
	@ResponseBody
	public String verificationCode(HttpServletRequest request,
			HttpSession session, @RequestParam("inputCode") String inputCode) {
		if (!HelpController.filterParameter(request)) {// 过滤参数 如果找到非法字符则返回true,如果没找到则返回false
			String verifcationCode = session.getAttribute("verifcationCode")
					.toString();
			if (verifcationCode.toLowerCase().equals(inputCode.toLowerCase())) {
				session.removeAttribute("verifcationCode");
				System.out.println("验证成功");
				return "SUCCESS";
			}
			System.out.println("验证失败");
			return "FAIL";
		}
		System.out.println("警告");
		return "ALERT";
	}
}
