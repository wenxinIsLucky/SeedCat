package com.ymkj.furniture.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Jz_material;
import com.ymkj.furniture.service.Jz_materialService;
import com.ymkj.furniture.util.HelpController;

@Controller
public class Jz_materialController extends HelpController {
	@Resource
	Jz_materialService jz_materialService;
	
	/*@RequestMapping(value="addJzMaterial",method = RequestMethod.POST)
	@ResponseBody
	public String addJzMaterial(HttpServletRequest request,@ModelAttribute Jz_material jz_material){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_materialService.addJzmaterial(jz_material);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	*//**
	 * 修改材料信息
	 * 
	 * @param request
	 * @param jz_package
	 * @return
	 *//*
	@RequestMapping(value = "updJzMaterial", method = RequestMethod.POST)
	@ResponseBody
	public String updJzMaterial(HttpServletRequest request,@ModelAttribute Jz_material jz_material) {
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_materialService.updateJzmaterial(jz_material);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	//查看配置内指定材料详细
	@RequestMapping(value="getAppointJzCorJzM",method = RequestMethod.GET)
	public String getAppointJzCorJzM(HttpServletRequest request,Model model,@RequestParam("jpid")String jpid,@RequestParam("jpname")String jpname,
			@RequestParam("jcname")String jcname,@RequestParam("jmid")String jmid){
		Jz_material jm = new Jz_material();
		if (filterParameter(request)) {
			jm = null;
		}
		jm = jz_materialService.findJzmaterial(jmid);
		model.addAttribute("jpid", jpid);
		model.addAttribute("jpname", jpname);
		model.addAttribute("jcname", jcname);
		model.addAttribute("jm", jm);
		return "pcadmin/yingzhuang/updjz_material";
	}
	
	*//**
	 * 删除家装套餐
	 * @param request
	 * @param jpid
	 * @return
	 *//*
	@RequestMapping(value="removeJzMaterial",method = RequestMethod.POST)
	@ResponseBody
	public String removeJzMaterial(HttpServletRequest request,@RequestParam("jmid")String jmid){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_materialService.delJzmaterial(jmid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}*/
}
