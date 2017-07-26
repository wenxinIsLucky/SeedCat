package com.ymkj.furniture.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Community;
import com.ymkj.furniture.entity.CommunityParam;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.CommunityService;

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
@Controller("communityController")
public class CommunityController {
	@Resource
	CommunityService communityService;

	/**
	 * 新增拍客
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午12:02:08
	 * @param community
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addCommunity", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addCommunityData(
			@ModelAttribute Community community, HttpSession session,
			HttpServletRequest request) {
		return communityService.addCommunity(community, session, request);
	}

	/**
	 * 查询拍客
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午12:02:08
	 * @param community
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "findCommunityData", method = RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Community> findCommunityData(
			@RequestParam("examine") Integer examine,
			@RequestParam("start") Integer start,
			@RequestParam("size") Integer size,
			@RequestParam("type") Integer type) {
		return communityService.findCommunitySucc(examine, start, size, type);
	}

	/**
	 * 查看拍客详细
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午12:25:43
	 * @param cid
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "getCommunity/{wzid}", method = RequestMethod.GET)
	public String getCommunityPage(@PathVariable("wzid") String wzid,
			Model model, HttpSession session, HttpServletRequest request) {
		model.addAttribute("community",
				communityService.findCommunityInfo(wzid, session, request));
		return "pc/community/community_info";
	}

	/**
	 * 查看详细
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-上午12:27:56
	 * @param cid
	 * @param examine
	 * @return
	 */
	@RequestMapping(value = "getContent/{cid}", method = RequestMethod.POST)
	@ResponseBody
	public Community getCommunityContent(@PathVariable String cid,
			HttpSession session, HttpServletRequest request) {
		return communityService.findCommunityInfo(cid, session, request);
	}

	/**
	 * 新增各种数量
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:44:00
	 * @param param
	 * @param cid
	 */
	@RequestMapping(value = "addCommunityAll", method = RequestMethod.POST)
	@ResponseBody
	public String addAllCount(@ModelAttribute CommunityParam communityParam,
			HttpServletRequest request, HttpSession session) {
		return communityService.updCommunityAllCount(communityParam, request,
				session);
	}

	/**
	 * 查询自己拍客
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午12:02:08
	 * @param community
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "findCommunityMyData", method = RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Community> findCommunityMyData(
			@RequestParam("start") Integer start,
			@RequestParam("size") Integer size, HttpSession session) {
		return communityService.findCommunityByMy(session, start, size);
	}
	
	/**
	 * 查询别人的拍客
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午12:02:08
	 * @param community
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "findCommunityHeData", method = RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Community> findCommunityHeData(
			@RequestParam("start") Integer start,
			@RequestParam("size") Integer size, @RequestParam("heuid") String heuid, HttpSession session) {
		return communityService.findCommunityByHe(session, heuid,start, size);
	}
}
