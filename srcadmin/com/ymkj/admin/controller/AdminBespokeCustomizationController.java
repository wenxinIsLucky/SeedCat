package com.ymkj.admin.controller;


import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.BespokeCustomization;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.BespokeCustomizationService;

@Controller
public class AdminBespokeCustomizationController {

	@Resource(name="bespokeCustomizationService")
	BespokeCustomizationService bespokeCustomizationService;
	
	/**
	 * 查看所有预约数据
	 * @param handle
	 * @param start
	 * @param end
	 * @return
	 */
	@RequestMapping(value="findBespokeCusomization",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<BespokeCustomization> findBespokeCusomization(@RequestParam("handle")Integer handle,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		return bespokeCustomizationService.findbespokecustomization(handle, start, end);
	}
	
	/**
	 * 处理预约定制数据
	 * @param bespokeCustomization
	 * @param request
	 * @return
	 */
	@RequestMapping(value="updBespokeCusomization",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> updBespokeCusomization(@ModelAttribute BespokeCustomization bespokeCustomization,HttpServletRequest request){
		return bespokeCustomizationService.updbespokecustomization(bespokeCustomization, request);
	}
	
	/**
	 * 删除预约定制数据
	 * @param bcid
	 * @param request
	 * @return
	 */
	@RequestMapping(value="removeBespokeCusomization",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> removeBespokeCusomization(@RequestParam("bcid")Integer bcid,HttpServletRequest request){
		return bespokeCustomizationService.delbespokecustomization(bcid, request);
	}
	
}
