package com.ymkj.furniture.controller;

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
import com.ymkj.furniture.entity.Visitor;
import com.ymkj.furniture.service.VisitorService;

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
 * 2017年7月7日-下午3:04:41
 */
@Controller
public class VisitorController {
	@Resource
	VisitorService visitorService;
	
	/**
	 * 获取访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:11:31
	 * @param request
	 * @param session
	 * @param uid
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="getVisitorData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Visitor> getVisitorData(HttpServletRequest request,HttpSession session,@RequestParam("uid")String uid,@RequestParam("heuid")String heuid,@RequestParam("start")int start,@RequestParam("size")int size){
		return visitorService.findVisitor(uid, heuid,start, size, request,session);
	}
	
	/**
	 * 添加访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:12:39
	 * @param request
	 * @param session
	 * @param visitor
	 * @return
	 */
	@RequestMapping(value="addVisitorData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addVisitorData(HttpServletRequest request,HttpSession session,@ModelAttribute Visitor visitor){
		return visitorService.addVisitor(visitor, request, session);
	}
	
	/**
	 * 删除访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:13:36
	 * @param request
	 * @param session
	 * @param visitor
	 * @return
	 */
	@RequestMapping(value="delVisitorData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delVisitorData(HttpServletRequest request,HttpSession session,@ModelAttribute Visitor visitor){
		return visitorService.delVisitor(visitor, request, session);
	}
}
