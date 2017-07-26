package com.ymkj.furniture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.ymkj.furniture.entity.BespokeCustomization;
import com.ymkj.furniture.service.BespokeCustomizationService;
import com.ymkj.furniture.util.HelpController;

@Controller
public class BespokeCustomizationController extends HelpController{

	@Resource(name="bespokeCustomizationService")
	BespokeCustomizationService bespokeCustomizationService;
	
	/**
	 * 家装预约定制
	 * @param request
	 * @param bespokeCustomization
	 * @return
	 */
	@RequestMapping(value="addBespokeCustomization",method=RequestMethod.POST)
	@ResponseBody
	public String addBespokeCustomization(HttpServletRequest request,@ModelAttribute BespokeCustomization bespokeCustomization){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = bespokeCustomizationService.addbespokecustomization(bespokeCustomization);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
}
