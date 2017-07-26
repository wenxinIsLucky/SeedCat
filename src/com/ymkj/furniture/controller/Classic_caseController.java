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

import com.ymkj.furniture.entity.Classic_case;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.Classic_caseService;

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
 * 2017年7月14日-上午11:53:43
 */
@Controller
public class Classic_caseController {
	@Resource
	Classic_caseService classic_caseService;
	
	/**
	 * 分页查看经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:54:57
	 * @param request
	 * @param returnParam
	 * @return
	 */
	@RequestMapping(value="getClassic_caseData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Classic_case> getClassic_caseData(HttpServletRequest request,@ModelAttribute ReturnParam<Classic_case> returnParam){
		return classic_caseService.findClassicCaseByType(returnParam, request);
	}
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:55:47
	 * @param request
	 * @param tid
	 * @return
	 */
	@RequestMapping(value="getClassic_caseContent{type}",method=RequestMethod.POST)
	@ResponseBody
	public Classic_case getClassic_caseContent(HttpServletRequest request,@PathVariable int type,@RequestParam("sid")String tid){
		return classic_caseService.findClassicCaseDetailed(type,tid, request);
	}
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:56:51
	 * @param request
	 * @param tid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="getClassic_caseDetailed{type}",method=RequestMethod.GET)
	public String getClassic_caseDetailed(HttpServletRequest request,@PathVariable int type,@RequestParam("sid")String tid,Model model){
		Classic_case classic_case = classic_caseService.findClassicCaseDetailed(type,tid, request);
		model.addAttribute("classic_case", classic_case);
		return "pc/technology/classic_caseDetailed";
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
	@RequestMapping(value = "addClassic_caseAllCount", method = RequestMethod.POST)
	@ResponseBody
	public String addClassic_caseAllCount(@RequestParam("param")String param,@RequestParam("shid")String shid,HttpServletRequest request,HttpSession session){
		return classic_caseService.updClassicCaseAllCount(request, session, param, shid);
	}
}
