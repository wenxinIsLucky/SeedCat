package com.ymkj.furniture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Home_culture;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.Home_cultureService;

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
 * 2017年7月5日-下午8:33:44
 */
@Controller
public class Home_cultureController {
	@Resource
	Home_cultureService home_cultureService;
	
	/**
	 * 查看家居文化内的文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-下午8:36:02
	 * @param request
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="getHomeCultureData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Home_culture> getHomeCultureDataByPage(HttpServletRequest request,@RequestParam("type")int type,@RequestParam("start")int start,@RequestParam("size")int size){
		return home_cultureService.findHomeCultureAll(type, start, size, request);
	}
	
	/**
	 * 查看文章详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-下午8:41:12
	 * @param request
	 * @param hcid
	 * @return
	 */
	@RequestMapping(value="getHomeCultureDetailed",method=RequestMethod.POST)
	@ResponseBody
	public Home_culture getHomeCultureDetailed(HttpServletRequest request,@RequestParam("hcid")int hcid,@RequestParam("type")int type){
		return home_cultureService.findHomeCultureInfo(hcid, type,request);
	}
	
	/**
	 * 获取最新数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-下午9:02:25
	 * @param request
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="getHomeCultureMaxData",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Home_culture> getHomeCultureMaxData(HttpServletRequest request,@RequestParam("start")int start,@RequestParam("size")int size){
		return home_cultureService.findHomeCultureByDate(start, size, request);
	}
	
	/**
	 * 获取推荐数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-下午9:02:32
	 * @param request
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="getHomeCultureTuiJian",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Home_culture> getHomeCultureTuiJian(HttpServletRequest request,@RequestParam("start")int start,@RequestParam("size")int size){
		return home_cultureService.findHomeCultureByTuiJian(start, size, request);
	}
}
