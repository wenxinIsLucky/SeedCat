package com.ymkj.furniture.controller;

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

import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Technology;
import com.ymkj.furniture.service.TechnologyService;

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
 * 2017年7月13日-下午5:30:58
 */
@Controller
public class TechnologyController {
	@Resource
	TechnologyService technologyService;
	
	/**
	 * 查看分页数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:38:38
	 * @param request
	 * @param returnParam
	 * @return
	 */
	@RequestMapping(value="getTechnologyData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Technology> getTechnologyData(HttpServletRequest request,@ModelAttribute ReturnParam<Technology> returnParam){
		return technologyService.findTechnologyByType(returnParam, request);
	}
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:38:33
	 * @param request
	 * @param tid
	 * @return
	 */
	@RequestMapping(value="getTechnologyContent{type}",method=RequestMethod.POST)
	@ResponseBody
	public Technology getTechnologyContent(HttpServletRequest request,@PathVariable int type,@RequestParam("sid")String tid){
		return technologyService.findTechnologyDetailed(type,tid, request);
	}
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:38:27
	 * @param request
	 * @param tid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="getTechnologyDetailed{type}",method=RequestMethod.GET)
	public String getTechnologyDetailed(HttpServletRequest request,@PathVariable int type,@RequestParam("sid")String tid,Model model){
		Technology technology = technologyService.findTechnologyDetailed(type,tid, request);
		model.addAttribute("technology", technology);
		if (technology.getType() == 0) {
			return "pc/technology/technologyvideoDetailed";
		}
		return "pc/technology/technologytuDetailed";
	}
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:53:19
	 * @param param
	 * @param shid
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "addTechnologyAllCount", method = RequestMethod.POST)
	@ResponseBody
	public String addTechnologyAllCount(@RequestParam("param")String param,@RequestParam("shid")String shid,HttpServletRequest request,HttpSession session){
		return technologyService.updTechnologyAllCount(request, session, param, shid);
	}
}
