package com.ymkj.furniture.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
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




import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Sun_home;
import com.ymkj.furniture.service.Sun_homeService;
/**
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年7月12日-下午2:39:20
 */
@Controller
public class Sun_HomeController {
	@Resource
	Sun_homeService sun_homeService;
	
	/**
	 * 添加晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午2:41:01
	 * @param request
	 * @param session
	 * @param sun_home
	 * @return
	 */
	@RequestMapping(value="addSunHomeData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addSunHomeData(HttpServletRequest request,HttpSession session,@ModelAttribute Sun_home sun_home){
		return sun_homeService.addSunHome(sun_home, session, request);
	}
	
	/**
	 * 查看用户晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午2:44:15
	 * @param request
	 * @param session
	 * @param returnParam
	 * @return
	 */
	@RequestMapping(value="getSunHomeData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Sun_home> getSunHomeData(HttpServletRequest request,HttpSession session,@ModelAttribute ReturnParam<Sun_home> returnParam){
		return sun_homeService.findSunHome(returnParam, session, request);
	}
	
	/**
	 * 查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午3:50:05
	 * @param returnParam
	 * @param request
	 * @return
	 */
	@RequestMapping(value="getSunHomeDataPage",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Sun_home> getSunHomeDataPage(@ModelAttribute ReturnParam<Sun_home> returnParam,HttpServletRequest request){
		return sun_homeService.findSunHomeByAdmin(returnParam, request);
	}
	
	/**
	 * 查看详细页面
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:11:39
	 * @param shid
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getSunHomeDetailed/{shid}", method = RequestMethod.GET)
	public String getSunHomeDetailed(@PathVariable("shid") String shid,
			Model model, HttpServletRequest request) {
		model.addAttribute("sunHome",sun_homeService.findSunHomeDetailed(shid, request));
		return "pc/technology/ownersDetailed";
	}
	
	/**
	 * 查看详细页面
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:11:39
	 * @param shid
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getSunHomeContent/{shid}", method = RequestMethod.POST)
	@ResponseBody
	public Sun_home getSunHomeDetailed(@PathVariable("shid") String shid, HttpServletRequest request) {
		return sun_homeService.findSunHomeDetailed(shid, request);
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
	@RequestMapping(value = "addSunHomeAllCount", method = RequestMethod.POST)
	@ResponseBody
	public String addSunHomeAllCount(@RequestParam("param")String param,@RequestParam("shid")String shid,HttpServletRequest request,HttpSession session){
		return sun_homeService.updSunHomeAllCount(request, session, param, shid);
	}
}
