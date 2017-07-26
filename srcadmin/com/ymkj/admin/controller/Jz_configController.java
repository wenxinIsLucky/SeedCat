package com.ymkj.admin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.admin.service.Jz_configService;
import com.ymkj.admin.service.Jz_materialService;
import com.ymkj.furniture.entity.Jz_config;
import com.ymkj.furniture.entity.Jz_material;
import com.ymkj.furniture.util.HelpController;

@Controller("adminJz_configController")
public class Jz_configController extends HelpController {
	@Resource(name="adminjz_configService")
	Jz_configService jz_configService;
	@Resource(name="adminjz_materialService")
	Jz_materialService jz_materialService;
	
	/**
	 * 添加配置
	 * @param request
	 * @param jz_config
	 * @return
	 */
	@RequestMapping(value="addJzConfig",method = RequestMethod.POST)
	@ResponseBody
	public String addJzConfig(HttpServletRequest request,@ModelAttribute Jz_config jz_config){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_configService.addJzConfig(jz_config);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 查看指定套餐内指定配置的详情
	 * @param request
	 * @param model
	 * @param jpid
	 * @param jpname
	 * @param jcid
	 * @return
	 */
	@RequestMapping(value="getAppointJzPorJzC",method = RequestMethod.GET)
	public String getAppointJzPorJzC(HttpServletRequest request,Model model,@RequestParam("jpid")String jpid,@RequestParam("jpname")String jpname,@RequestParam("jcid")String jcid){
		List<Jz_material> ms = new ArrayList<Jz_material>();
		Jz_config jc = new Jz_config(); 
		if (filterParameter(request)) {
			jc = null;
			ms = null;
		}else{
			jc = jz_configService.findAppointJzPorJzC(jpid, jcid);
			ms = jz_materialService.findJzmaterialsByjcId(jcid);
		}
		model.addAttribute("jpname", jpname);
		model.addAttribute("jc", jc);
		model.addAttribute("ms", ms);
		return "pcadmin/yingzhuang/updjz_config";
	}
	
	/**
	 * 编辑指定套餐内指定配置详情
	 * @param request
	 * @param jz_config
	 * @return
	 */
	@RequestMapping(value="editAppointJzPorJzC",method=RequestMethod.POST)
	@ResponseBody
	public String updateAppointJzPorJzC(HttpServletRequest request,@ModelAttribute Jz_config jz_config){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_configService.updateAppointJzPorJzC(jz_config);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 跳转家装配置材料页面
	 * @param request
	 * @param jpid
	 * @param jpname
	 * @param model
	 * @return
	 */
	@RequestMapping(value="goAddJzMaterial",method = RequestMethod.GET)
	public String goAddJzMaterial(HttpServletRequest request,@RequestParam("jpid")String jpid,@RequestParam("jpname")String jpname,@RequestParam("jcid")String jcid,@RequestParam("jcname")String jcname,Model model){
		if (filterParameter(request)) {
			return "pc/error";
		}
		model.addAttribute("jpid", jpid);
		model.addAttribute("jpname", jpname);
		model.addAttribute("jcid", jcid);
		model.addAttribute("jcname", jcname);
		return "pcadmin/yingzhuang/addjz_material";
	}
}
