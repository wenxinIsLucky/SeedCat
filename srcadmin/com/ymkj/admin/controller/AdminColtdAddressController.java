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

import com.ymkj.furniture.entity.ColtdAddress;
import com.ymkj.furniture.service.ColtdAddressService;

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
 * 2017年7月14日-下午6:29:47
 */
@Controller
public class AdminColtdAddressController {
	@Resource
	ColtdAddressService coltdAddressService;
	
	/**
	 * 设置默认地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:32:13
	 * @param session
	 * @param request
	 * @param caid
	 * @return
	 */
	@RequestMapping(value="editAddressIsMr",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> editAddressIsMr(HttpSession session,HttpServletRequest request,@RequestParam("caid")int caid){
		return coltdAddressService.updColtdAddressIsMr(caid, request, session);
	}
	
	/**
	 * 添加公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:33:05
	 * @param session
	 * @param request
	 * @param coltdAddress
	 * @return
	 */
	@RequestMapping(value="addAddressData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addAddressData(HttpSession session,HttpServletRequest request,@ModelAttribute ColtdAddress coltdAddress){
		return coltdAddressService.addColtdAddress(coltdAddress, request, session);
	}
	
	/**
	 * 修改公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:33:05
	 * @param session
	 * @param request
	 * @param coltdAddress
	 * @return
	 */
	@RequestMapping(value="updColtdAddress",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updColtdAddress(HttpSession session,HttpServletRequest request,@ModelAttribute ColtdAddress coltdAddress){
		return coltdAddressService.updColtdAddress(coltdAddress, request, session);
	}
	
	/**
	 * 查看公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:34:00
	 * @return
	 */
	@RequestMapping(value="getAddressData",method=RequestMethod.POST)
	@ResponseBody
	public List<ColtdAddress> getColtdAddressData(){
		return coltdAddressService.findColtdAddredd();
	}
	
	/**
	 * 删除地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:34:50
	 * @param session
	 * @param request
	 * @param caid
	 * @return
	 */
	@RequestMapping(value="delAddressData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delColtdAddressData(HttpSession session,HttpServletRequest request,@RequestParam("caid")int caid){
		return coltdAddressService.delColtdAddress(caid, request, session);
	}
}
