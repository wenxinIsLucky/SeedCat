package com.ymkj.admin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Apply_for_decoration;
import com.ymkj.furniture.service.Apply_for_decorationService;

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
 * 2017年7月4日-上午11:34:45
 */
@Controller
public class AdminApply_for_decorationController {
	@Resource(name="apply_for_decorationService")
	Apply_for_decorationService apply_for_decorationService;
	
	/**
	 * 操作软装申请装修表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:48:22
	 * @param request
	 * @param apply_for_decoration
	 * @return
	 */
	@RequestMapping(value="editApplyForData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editApplyForData(HttpServletRequest request,@ModelAttribute Apply_for_decoration apply_for_decoration){
		return apply_for_decorationService.updApplyForDecoration(apply_for_decoration,request);
	}
	
	/**
	 * 删除软装申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-下午3:33:11
	 * @param request
	 * @param hdid
	 * @return
	 */
	@RequestMapping(value="delApplyForData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delApplyForData(HttpServletRequest request,@RequestParam("afdid")Integer afdid){
		return apply_for_decorationService.delApplyForDecoration(afdid, request);
	}
}
