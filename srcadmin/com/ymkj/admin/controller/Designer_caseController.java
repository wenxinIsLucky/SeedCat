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

import com.ymkj.admin.service.Designer_caseService;
import com.ymkj.furniture.entity.Designer_case;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.HelpUtil;
import com.ymkj.furniture.util.IMGPATH;

@Controller("adminDesigner_caseController")
public class Designer_caseController extends HelpController {
	
	@Resource(name="admindesigner_caseService")
	Designer_caseService designer_caseService;
	
	/**
	 * 新增设计师案例
	 * @param request
	 * @param designer_case
	 * @return
	 */
	@RequestMapping(value="addDesigner_case",method=RequestMethod.POST)
	@ResponseBody
	public String addDesigner_case(HttpServletRequest request,@ModelAttribute Designer_case designer_case){
		int result = designer_caseService.addDesigner_case(designer_case);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 跳转到新增设计师案例
	 * @param request
	 * @param did
	 * @param dname
	 * @param model
	 * @return
	 */
	@RequestMapping(value="goAddDesigner_case",method = RequestMethod.GET)
	public String goAddDesigner_case(HttpServletRequest request,@RequestParam("did")Integer did,@RequestParam("dname")String dname,Model model){
		if (filterParameter(request)) {
			return "pc/error";
		}
		model.addAttribute("dgid", did);
		model.addAttribute("dname", dname);
		return "pcadmin/designer/add_designer_case";
	}
	
	
	/**
	 * 跳转到案例列表页
	 * @param request
	 * @param did
	 * @param model
	 * @return
	 */
	@RequestMapping(value="goShowDesigner_case",method=RequestMethod.GET)
	public String goShowDesigner_case(HttpServletRequest request,@RequestParam("did")Integer did,@RequestParam("dname")String dname,Model model){
		if (filterParameter(request)) {
			return "pc/error";
		}
		model.addAttribute("dgid", did);
		model.addAttribute("dname",dname);
		model.addAttribute("dcs",designer_caseService.findDcByDid(did));
		return "pcadmin/designer/show_designer_case";
	}
	
	/**
	 * 删除设计师案例
	 * @param request
	 * @param dcid
	 * @return
	 */
	@RequestMapping(value="delDesigner_case",method=RequestMethod.POST)
	@ResponseBody
	public String delDesigner_case(HttpServletRequest request,@RequestParam("dcid")Integer dcid){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = designer_caseService.delDesigner_case(dcid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 删除案例完工图
	 * @param request
	 * @param src
	 * @return
	 */
	@RequestMapping(value="delDCimg",method=RequestMethod.POST)
	@ResponseBody
	public String delDCimg(HttpServletRequest request,@RequestParam("src")String src){
		if (filterParameter(request)) {
			return "ALERT";
		}
		if (src != null) {
			HelpUtil.delFile(IMGPATH.designer_case_img,src);
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	
	/**
	 * 跳转到编辑设计师案例页面
	 * @param request
	 * @param did
	 * @param dname
	 * @param model
	 * @return
	 */
	@RequestMapping(value="goUpdDesigner_case",method = RequestMethod.GET)
	public String goUpdDesigner_case(HttpServletRequest request,@RequestParam("dcid")Integer dcid,@RequestParam("dname")String dname,Model model){
		
		Designer_case dc=designer_caseService.findDcByDcid(dcid);
		model.addAttribute("dcid", dcid);
		model.addAttribute("dname",dname);
		model.addAttribute("dc", dc);
		return "pcadmin/designer/upd_designer_case";
	}
	
	/**
	 * 编辑设计师案例
	 * @param request
	 * @param designer_case
	 * @return
	 */
	@RequestMapping(value="updDesigner_case",method=RequestMethod.POST)
	@ResponseBody
	public String updDesigner_case(HttpServletRequest request,@ModelAttribute Designer_case designer_case){
		int result = designer_caseService.updDesigner_case(designer_case);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
}
