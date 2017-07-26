package com.ymkj.admin.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.admin.service.Rz_packageService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.entity.Rz_package;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午5:31:13
 */
@Controller("adminRz_packageController")
public class Rz_packageController {
	@Resource(name = "adminrz_packageService")
	Rz_packageService rz_packageService;

	/**
	 * 添加套餐
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午5:35:30
	 * @param request
	 * @param rz_package
	 * @return
	 */
	@RequestMapping(value = "addRzPackage", method = RequestMethod.POST)
	@ResponseBody
	public String addRzPackageData(HttpServletRequest request,
			@ModelAttribute Rz_package rz_package) {
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = rz_packageService.addRzProject(rz_package);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}


	/**
	 * 删除套餐
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月17日-下午4:44:29
	 * @param rpid
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "removeRz", method = RequestMethod.POST)
	@ResponseBody
	public String removeRzPackage(@RequestParam("rpid") String rpid,
			HttpServletRequest request) {
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = rz_packageService.delRzPackage(rpid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}

	/**
	 * 指定查看软装套餐
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月18日-上午10:15:04
	 * @param request
	 * @param rpid
	 * @return
	 */
	@RequestMapping(value = "getRzPackage", method = RequestMethod.POST)
	@ResponseBody
	public Rz_package getRzPackage(HttpServletRequest request,
			@RequestParam("rpid") String rpid) {
		if (HelpController.filterParameter(request)) {
			return null;
		}
		return rz_packageService.findRzPackage(rpid);
	}

	/**
	 * 编辑套餐基本内容
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月17日-下午4:44:29
	 * @param rpid
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "editRz", method = RequestMethod.POST)
	@ResponseBody
	public String editRzPackage(HttpServletRequest request,
			@ModelAttribute Rz_package rz_package) {
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = rz_packageService.updRzPackage(rz_package);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}

	/**
	 * 前往添加项目页面
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月22日-下午2:26:07
	 * @param rpid
	 * @param rpname
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "goAddrz_package_project",
			"toAddrz_package_project.html" }, method = RequestMethod.GET)
	public String goAddrz_package_project(@RequestParam("rpid") String rpid,
			@RequestParam("rpname") String rpname, HttpServletRequest request,
			Model model) {
		if (HelpController.filterParameter(request)) {
			return "pc/error";
		}
		/*
		 * Admin admin = (Admin)session.getAttribute("admin"); if (null ==
		 * admin) { request.setAttribute("jumpParam", "transferrzPage"+action);
		 * return "pc/login"; }
		 */
		model.addAttribute("rpid", rpid);
		model.addAttribute("rpname", rpname);
		return "pcadmin/ruanzhuang/addrz_package_project";
	}

	/**
	 * 对软装套餐进行上下架操作
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月12日-下午2:17:17
	 * @param rpid
	 * @param shelves
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "editRz_Package_ProjectSxJ", method = RequestMethod.POST)
	@ResponseBody
	public String editRz_Package_ProjectSxJ(@RequestParam("rpid") String rpid,
			@RequestParam("shelves") int shelves, HttpServletRequest request) {
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = rz_packageService.updRzPackageShangXiaJia(shelves, rpid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
}
