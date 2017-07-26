package com.ymkj.admin.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.admin.service.CommunityService;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:58:47
 */
@Controller("adminCommunityController")
@RequestMapping("admin")
public class CommunityController {
	@Resource(name = "adminCommunityService")
	CommunityService communityService;

	/**
	 * 审核
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:44:00
	 * @param param
	 * @param cid
	 */
	@RequestMapping(value = "signCommunity", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> signCommunity(
			@RequestParam("examine") int examine,
			@RequestParam("cid") String cid, @RequestParam("uid") String uid,
			@RequestParam("msg") String msg) {
		return communityService.updCommunityType(examine, cid, uid, msg);
	}
	
	/**
	 * 给拍客加精或去精处理
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-下午5:38:03
	 * @param isAdd
	 * @param cid
	 * @param uid
	 * @param context
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addIsAddCommunity", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addIsAddCommunity(
			@RequestParam("isAdd") int isAdd,
			@RequestParam("cid") String cid, @RequestParam("uid") String uid,
			@RequestParam("context") String context,HttpServletRequest request){
		return communityService.updCommunityByIsAdd(isAdd, cid, uid, context, request);
	}
}
