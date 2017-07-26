package com.ymkj.furniture.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ymkj.furniture.entity.Designer_case;
import com.ymkj.furniture.service.Designer_caseService;
import com.ymkj.furniture.util.HelpController;

public class Designer_caseController extends HelpController {
	
	Designer_caseService designer_caseService;
	
	
	/**
	 * 跳转到新增设计师案例
	 * @param request
	 * @param did
	 * @param dname
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="goAddDesigner_case",method = RequestMethod.GET)
	public String goAddDesigner_case(HttpServletRequest request,@RequestParam("did")Integer did,@RequestParam("dname")String dname,Model model){
		if (filterParameter(request)) {
			return "pc/error";
		}
		model.addAttribute("dgid", did);
		model.addAttribute("dname", dname);
		return "pcadmin/designer/add_designer_case";
	}
	
	
	*//**
	 * 跳转到案例列表页
	 * @param request
	 * @param did
	 * @param model
	 * @return
	 *//*
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
	
	
	*//**
	 * 跳转到编辑设计师案例页面
	 * @param request
	 * @param did
	 * @param dname
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="goUpdDesigner_case",method = RequestMethod.GET)
	public String goUpdDesigner_case(HttpServletRequest request,@RequestParam("dcid")Integer dcid,@RequestParam("dname")String dname,Model model){
		
		Designer_case dc=designer_caseService.findDcByDcid(dcid);
		model.addAttribute("dcid", dcid);
		model.addAttribute("dname",dname);
		model.addAttribute("dc", dc);
		return "pcadmin/designer/upd_designer_case";
	}*/
}
