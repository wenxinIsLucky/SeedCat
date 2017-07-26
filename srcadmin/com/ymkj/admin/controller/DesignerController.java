package com.ymkj.admin.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
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

import com.ymkj.admin.service.DesignerService;
import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.util.HelpController;

@Controller("adminDesignerController")
public class DesignerController {
	@Resource(name="adminDesignerService")
	DesignerService designerService;
		
	/**
	 * 新增设计师
	 * @param request
	 * @param designer
	 * @return
	 */
	@RequestMapping(value="addDesigner",method=RequestMethod.POST)
	@ResponseBody
	public String addDesigner(HttpServletRequest request,@ModelAttribute Designer designer){
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = designerService.addDesigner(designer);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 查看设计师集合
	 * @param request
	 * @param begin
	 * @param end
	 * @return
	 */
	@RequestMapping(value="findDesigner",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Designer> findDesigner(HttpServletRequest request,@RequestParam("begin")Integer begin,@RequestParam("end")Integer end){
		return designerService.findDesigner(begin, end);
	}
	
	/**
	 * 删除设计师信息
	 * @param request
	 * @param did
	 * @return
	 */
	@RequestMapping(value="removeDesigner",method=RequestMethod.POST)
	@ResponseBody
	public String removeDesigner(HttpServletRequest request,@RequestParam("did")Integer did){
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result = designerService.delDesigner(did);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 带设计师编号跳转到编辑设计师页面
	 * @param request
	 * @param did
	 * @param model
	 * @return
	 */
	@RequestMapping(value="findDesignerByDid",method=RequestMethod.GET)
	public String findDesignerByDid(HttpServletRequest request,@RequestParam("did")Integer did,Model model){
		Designer dg = designerService.findDesignerByDid(did);
		if (HelpController.filterParameter(request)) {
			dg = null;
		}
		model.addAttribute("designer",dg);
		return "pcadmin/designer/upd_designer";
		
	}
	
	/**
	 * 修改设计师信息
	 * @param request
	 * @param did
	 * @return
	 */
	@RequestMapping(value="editDesigner",method=RequestMethod.POST)
	@ResponseBody
	public String editDesigner(HttpServletRequest request,@ModelAttribute Designer designer){
		if (HelpController.filterParameter(request)) {
			return "ALERT";
		}
		int result =  designerService.updDesigner(designer);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
		
}
