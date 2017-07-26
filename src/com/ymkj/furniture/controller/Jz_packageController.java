package com.ymkj.furniture.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
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

import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.entity.Jz_config;
import com.ymkj.furniture.entity.Jz_material;
import com.ymkj.furniture.entity.Jz_package;
import com.ymkj.furniture.service.Jz_configService;
import com.ymkj.furniture.service.Jz_materialService;
import com.ymkj.furniture.service.Jz_packageService;

/**
 * 家装套餐
 * 
 * @author hxc
 * 
 */
@Controller
public class Jz_packageController extends HelpController {
	@Resource
	Jz_packageService jz_packageService;
	@Resource
	Jz_materialService jz_materialService;

	/**
	 * 添加家装套餐
	 * 
	 * @param request
	 * @param jz_package
	 * @return
	 *//*
	@RequestMapping(value = "addJzPackage", method = RequestMethod.POST)
	@ResponseBody
	public String addJzPackageData(HttpServletRequest request,
			@ModelAttribute Jz_package jz_package) {
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_packageService.addJzPackage(jz_package);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}*/

	/**
	 * 查看指定家装套餐
	 * 
	 * @param request
	 * @param jpid
	 * @return
	 *//*
	@RequestMapping(value = "findJzPackage", method = RequestMethod.POST)
	@ResponseBody
	public Jz_package getJzPackageData(HttpServletRequest request,
			@RequestParam("jpid") String jpid) {
		if (filterParameter(request)) {
			return null;
		}
		return jz_packageService.findJzPackage(jpid);
	}*/

	/**
	 * 查看所有家装套餐
	 * 
	 * @param request
	 * @return
	 *//*
	@RequestMapping(value = "findJzPackages", method = RequestMethod.POST)
	@ResponseBody
	public List<Jz_package> getJzPackagesData(HttpServletRequest request) {
		return jz_packageService.findJzPackages(0, 15);
	}

	*//**
	 * 修改家装套餐
	 * 
	 * @param request
	 * @param jz_package
	 * @return
	 *//*
	@RequestMapping(value = "updJzPackage", method = RequestMethod.POST)
	@ResponseBody
	public String updateJzPackage(HttpServletRequest request,
			@ModelAttribute Jz_package jz_package) {
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_packageService.updateJzPackage(jz_package);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	*//**
	 * 进入页面防止session过期
	 * @param action
	 * @param request
	 * @param session
	 * @return
	 *//*
	@RequestMapping(value="transferjzPage{action}",method=RequestMethod.GET)
	public String transferPageAction(@PathVariable String action,HttpServletRequest request,HttpSession session){
		System.out.println("*****************************************************"+action);
		if (!filterParameter(request) && !stripXSS(action)) {
			String[] vals = action.replace("-", "/").split(","); 
			if (vals.length > 1) {
				request.setAttribute("tag", vals[1]);
			}
			return "pcadmin/"+vals[0];
		}
		request.setAttribute("context", "警告,你提交的数据中带有非法字符或html和js注入！");
		return "pc/error";
	}
	
	*//**
	 * 删除家装套餐
	 * @param request
	 * @param jpid
	 * @return
	 *//*
	@RequestMapping(value="removeJzPackage",method = RequestMethod.POST)
	@ResponseBody
	public String removeJzPackage(HttpServletRequest request,@RequestParam("jpid")String jpid){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = jz_packageService.deleteJzPackage(jpid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	*//**
	 * 跳转家装配置页面
	 * @param request
	 * @param jpid
	 * @param jpname
	 * @param model
	 * @return
	 *//*
	@RequestMapping(value="goAddJzConfig",method = RequestMethod.GET)
	public String goAddJzConfig(HttpServletRequest request,@RequestParam("jpid")String jpid,@RequestParam("jpname")String jpname,Model model){
		if (filterParameter(request)) {
			return "pc/error";
		}
		model.addAttribute("jpid", jpid);
		model.addAttribute("jpname", jpname);
		return "pcadmin/yingzhuang/addjz_config";
	}*/
	
	/**
	 * 查看所有家装套餐
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "showJzPackages",method=RequestMethod.GET)
	public String showJzPackagesData(HttpServletRequest request,@RequestParam(value="jpid",defaultValue="no")String jpid,Model model) {
		List<Jz_package> jps = jz_packageService.findJPname();
		Jz_package jp = jz_packageService.findJzPackage(jpid);
		List<Jz_material> jm = jz_materialService.findJzmaterials();
		model.addAttribute("jps", jps);
		model.addAttribute("jpid", jpid); 
		model.addAttribute("jp", jp);
		model.addAttribute("jm", jm);
		return "pc/yingzhuang/jzCustomDetail";
	}
}
