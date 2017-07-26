package com.ymkj.admin.controller;

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
import org.springframework.web.multipart.MultipartFile;

import com.ymkj.furniture.entity.Vr;
import com.ymkj.furniture.service.VrService;

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
 * 2017年7月18日-下午4:11:44
 */
@Controller
public class AdminVrController {
	@Resource
	VrService vrService;
	
	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午4:13:38
	 * @param session
	 * @param vr
	 * @return
	 */
	@RequestMapping(value="addVrPojoData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> addVrPojoData(HttpSession session,@ModelAttribute("vr") Vr vr,@RequestParam("imgFile") MultipartFile imageFile){
		return vrService.addVrPojo(vr, session,imageFile);
	}
	
	/**
	 * 修改
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午4:14:51
	 * @param session
	 * @param vr
	 * @return
	 */
	@RequestMapping(value="updVrPojoData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updVrPojoData(HttpSession session,@ModelAttribute("vr") Vr vr,@RequestParam("imgFile") MultipartFile imageFile){
		return vrService.updVrPojo(vr, session,imageFile);
	}
	
	/**
	 * 修改
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午4:14:51
	 * @param session
	 * @param vr
	 * @return
	 */
	@RequestMapping(value="updVrPojoDataQ",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updVrPojoDataQ(HttpSession session,@ModelAttribute("vr") Vr vr){
		return vrService.updVrPojo(vr, session,null);
	}
	
	/**
	 * 删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午4:14:46
	 * @param session
	 * @param vid
	 * @param request
	 * @return
	 */
	@RequestMapping(value="delVrPojoData",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> delVrPojoData(HttpSession session,@RequestParam("vid") int vid,HttpServletRequest request){
		return vrService.delVrPojo(vid, session,request);
	}
}
