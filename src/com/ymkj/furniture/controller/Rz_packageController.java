package com.ymkj.furniture.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Rz_package;
import com.ymkj.furniture.service.Rz_packageService;
import com.ymkj.furniture.util.HelpController;

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
 * 2017年5月16日-下午5:31:13
 */
@Controller("rz_packageController")
public class Rz_packageController {
	@Resource
	Rz_packageService rz_packageService;
	@Resource(name = "adminrz_packageService")
	com.ymkj.admin.service.Rz_packageService adminrz_packageService;
	
	/**
	 * 指定查看软装套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月18日-上午10:15:04
	 * @param request
	 * @param rpid
	 * @return
	 */
	@RequestMapping(value="getRzPackageToPage",method=RequestMethod.GET)
	public String getRzPackageToPage(HttpServletRequest request,@RequestParam("rpid")String rpid,Model model){
		model.addAttribute("rpid", rpid);
		model.addAttribute("package", rz_packageService.findRzPackage(rpid));
		return "pc/ruanzhuang/rzCustom_2";
	}
	
	/**
	 * 进入各种页面防止session过期
	 * @author lucky(李文鑫)
	 * UserController.java
	 * 2016年10月31日-下午12:13:42
	 * @param action 需要跳转的页面
	 * @param session
	 * @param request
	 * @return
	 */
	@RequestMapping(value="transferrzPage{action}",method=RequestMethod.GET)
	public String transferPageAction(@PathVariable String action,HttpSession session,HttpServletRequest request){
		if (!HelpController.filterParameter(request) && !HelpController.stripXSS(action)) {//过滤参数 如果找到非法字符则返回true,如果没找到则返回false
			//取出用户信息
			String[] vals = action.replaceAll("-", "/").split(",");
			/*Admin admin = (Admin)session.getAttribute("admin");
			if (null == admin) {
				request.setAttribute("jumpParam", "transferrzPage"+action);
				return "pc/login";
			}*/
			if (vals.length>1) {
				request.setAttribute("lucky", vals[1]);
			}
			return "pcadmin/"+vals[0];
		}
		request.setAttribute("context", "警告,你提交的数据中带有非法字符或html和js注入！");
		return "pc/error";//警报,参数持有非法字符或html和js注入
	}
	
	/**
	 * 查看软装套餐
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月17日-下午3:39:13
	 * @param request
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value = "getRzPackageData{type}", method = RequestMethod.POST)
	@ResponseBody
	public List<Rz_package> getRzPackageData(@PathVariable char type) {
		if (type == 'h') {
			return adminrz_packageService.findRzPackages(0, 15);
		} else {
			return adminrz_packageService.findRzPackageShangJia(0, 15);
		}
	}
}
