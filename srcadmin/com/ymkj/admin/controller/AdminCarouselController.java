package com.ymkj.admin.controller;

import java.util.List;
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

import com.ymkj.furniture.entity.Carousel;
import com.ymkj.furniture.service.CarouselService;
import com.ymkj.furniture.util.FirstData;

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
 * 2017年7月17日-下午12:01:06
 */
@Controller
public class AdminCarouselController {
	@Resource
	CarouselService carouselService;
	
	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-下午12:03:42
	 * @param carousel
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="addCarouseData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addCarouseData(@ModelAttribute Carousel carousel,HttpServletRequest request,HttpSession session){
		return carouselService.addCarousel(carousel, request, session);
	}
	
	/**
	 * 修改
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-下午12:03:42
	 * @param carousel
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="updCarouseData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updCarouseData(@ModelAttribute Carousel carousel,HttpServletRequest request,HttpSession session){
		return carouselService.updCarousel(carousel, request, session);
	}
	
	/**
	 * 删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-下午12:03:42
	 * @param carousel
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="delCarouseData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delCarouseData(@RequestParam("cid") int cid,HttpServletRequest request,HttpSession session){
		return carouselService.delCarousel(cid, request, session);
	}
	
	/**
	 * 查看
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-下午12:03:42
	 * @param carousel
	 * @param request
	 * @param session
	 * @return
	 */
	@RequestMapping(value="getCarouseData",method=RequestMethod.POST)
	@ResponseBody
	public List<Carousel> getCarouseData(){
		return FirstData.carousels;
	}
}
