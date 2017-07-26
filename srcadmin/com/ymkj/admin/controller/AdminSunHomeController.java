package com.ymkj.admin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Sun_home;
import com.ymkj.furniture.service.Sun_homeService;

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
 * 2017年7月12日-下午3:46:17
 */
@Controller
public class AdminSunHomeController {
	@Resource
	Sun_homeService sun_homeService;
	
	/**
	 * 查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午3:50:05
	 * @param returnParam
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getAdminSunHomeData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Sun_home> getAdminSunHomeData(@ModelAttribute ReturnParam<Sun_home> returnParam,HttpServletRequest request){
		return sun_homeService.findSunHomeByAdmin(returnParam, request);
	}
	
	/**
	 * 对晒家操作
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午3:51:22
	 * @param session
	 * @param request
	 * @param sun_home
	 * @return
	 */
	@RequestMapping(value="updAdminSunHome",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updAdminSunHomeStatus(HttpSession session,HttpServletRequest request,@ModelAttribute Sun_home sun_home,@RequestParam("msg")String msg){
		return sun_homeService.updSunHome(sun_home, session, request, msg);
	}
}
