package com.ymkj.furniture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.entity.Apply_for_decoration;
import com.ymkj.furniture.entity.ReturnParam;
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
 * 2017年5月12日-下午4:40:54
 */
@Controller
public class Apply_for_decorationController {
	@Resource(name="apply_for_decorationService")
	Apply_for_decorationService apply_for_decorationService;
	
	/**
	 * 添加装修申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月12日-下午4:44:07
	 * @param apply_for_decoration
	 * @param request
	 * @return
	 */
	@RequestMapping(value="createData",method=RequestMethod.POST)
	@ResponseBody
	public String createData(@ModelAttribute Apply_for_decoration apply_for_decoration,HttpServletRequest request){
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = apply_for_decorationService.addApplyForDecoration(apply_for_decoration);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 获取申请装修表数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:18:19
	 * @return
	 */
	@RequestMapping(value="getApplyForData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Apply_for_decoration> getApplyForData(@RequestParam("handle")Integer handle,@RequestParam("start")Integer start,@RequestParam("size")Integer size){
		return apply_for_decorationService.findApplyForDecoration(handle, start, size);
	}
}
