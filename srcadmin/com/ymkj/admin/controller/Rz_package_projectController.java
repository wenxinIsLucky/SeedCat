package com.ymkj.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.admin.service.Rz_package_projectService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.entity.Rz_package_project;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月19日-下午3:41:55
 */
@Controller
public class Rz_package_projectController {
	@Resource(name = "adminrz_package_projectService")
	Rz_package_projectService rz_package_projectService;

	/**
	 * 添加套餐项目
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月19日-下午3:47:21
	 * @param rz_package_project
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "addRzPackageProject", method = RequestMethod.POST)
	@ResponseBody
	public String addRzPackageProjectAndInfo(
			@ModelAttribute Rz_package_project rz_package_project,
			HttpServletRequest request) {
		if (HelpController.filterParameter(request, "project_info.rpiinfo")) {
			return "ALERT";
		}
		try {
			int result = rz_package_projectService
					.addRzProject(rz_package_project);
			if (result > 0) {
				return "SUCCESS";
			}
		} catch (Exception e) {
			return "FAIL";
		}
		return "FAIL";
	}

	/**
	 * 编辑软装套餐项目内容
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月25日-下午3:39:07
	 * @param rz_package_project
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "editRzPackageProject", method = RequestMethod.POST)
	@ResponseBody
	public String editRzPackageProjectAndInfo(
			@ModelAttribute Rz_package_project rz_package_project,
			HttpServletRequest request) {
		if (HelpController.filterParameter(request, "project_info.rpiinfo")) {
			return "ALERT";
		}
		try {
			int result = rz_package_projectService
					.updRzProject(rz_package_project);
			if (result > 0) {
				return "SUCCESS";
			}
		} catch (Exception e) {
			return "FAIL";
		}
		return "FAIL";
	}

	/**
	 * 根据标识查看套餐内的指定项目详细
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-上午10:59:33
	 * @param rppid
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "getRzPackageProject", method = RequestMethod.GET)
	public String getRzPackageProjectAndInfo(
			@RequestParam("rppid") String rppid,
			@RequestParam("rpname") String rpname,
			@RequestParam("rpid") String rpid, HttpServletRequest request,
			Model model) {
		Rz_package_project r = new Rz_package_project();
		if (HelpController.filterParameter(request)) {
			r = null;
		} else {
			r = rz_package_projectService.findRzProject(rppid, rpid);
		}
		model.addAttribute("rz_pj", r);
		model.addAttribute("rpname", rpname);
		return "pcadmin/ruanzhuang/updrz_package_project";
	}
}