package com.ymkj.furniture.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.PostReminder;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.PostReminderService;
import com.ymkj.furniture.util.HelpController;

/*by lucky 2016  
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
 * 评论提醒
 * @author lucky(李文鑫)
 * PostReminderController
 * PostReminderController.java
 * 2016年12月26日-下午4:07:37
 */
@Controller
public class PostReminderController {
	@Resource
	PostReminderService postReminderService;
	
	/**
	 * 分页查看评论提醒(自己)
	 * @author lucky(李文鑫)
	 * PostReminderController.java
	 * 2016年12月26日-下午4:12:44
	 * @param request
	 * @param session
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="findPostRemindersByPage",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<PostReminder> findPostRemindersByPage(HttpServletRequest request,HttpSession session,@RequestParam("type")Integer type,@RequestParam("start")Integer start,@RequestParam("size")Integer size){
		ReturnParam<PostReminder> returnParam = new ReturnParam<PostReminder>();
		if (!HelpController.filterParameter(request)) {
			User user = (User)session.getAttribute("user");
			if (null == user) {
				returnParam.setStatus(404);
				return returnParam;
			}
			returnParam.setStatus(200);
			returnParam.setCurrent(start);
			returnParam.setSize(size);
			returnParam.setList(postReminderService.findPostReminderByPage(type, user.getUid(), (start-1)*size, size));
			return returnParam;
		}
		returnParam.setStatus(500);
		return returnParam;
	}
	
	/**
	 * 分页查看评论提醒（别人 ）
	 * @author lucky(李文鑫)
	 * PostReminderController.java
	 * 2016年12月26日-下午4:12:44
	 * @param request
	 * @param session
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="findPostRemindersByHePage",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<PostReminder> findPostRemindersByHePage(HttpServletRequest request,HttpSession session,@RequestParam("type")Integer type,@RequestParam("start")Integer start,@RequestParam("size")Integer size,@RequestParam("heuid")String heuid){
		ReturnParam<PostReminder> returnParam = new ReturnParam<PostReminder>();
		if (!HelpController.filterParameter(request)) {
			User user = (User)session.getAttribute("user");
			if (null == user) {
				returnParam.setStatus(404);
				return returnParam;
			}
			returnParam.setStatus(200);
			returnParam.setCurrent(start);
			returnParam.setSize(size);
			returnParam.setList(postReminderService.findPostReminderByPage(type, heuid, (start-1)*size, size));
			return returnParam;
		}
		returnParam.setStatus(500);
		return returnParam;
	}
}
