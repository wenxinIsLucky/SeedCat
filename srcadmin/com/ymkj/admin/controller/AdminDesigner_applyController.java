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

import com.ymkj.furniture.entity.Designer_apply;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.Designer_applyService;
import com.ymkj.furniture.util.HelpController;

@Controller
public class AdminDesigner_applyController extends HelpController {

	@Resource(name="designer_applyService")
	Designer_applyService designer_applyService;
	
	/**
	 * 查看所有免费设计服务申请的数据
	 * @param request
	 * @param handle
	 * @param start
	 * @param end
	 * @return
	 */
	@RequestMapping(value="finddesigner_apply",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Designer_apply> finddesigner_apply(HttpServletRequest request,@RequestParam("handle")Integer handle,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		return designer_applyService.finddesigner_apply(handle, start, end);
	}
	
	@RequestMapping(value="upddesigner_apply",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> upddesigner_apply(HttpServletRequest request,@ModelAttribute Designer_apply designer_apply){
		return designer_applyService.upddesigner_apply(designer_apply, request);
	}
	
	@RequestMapping(value="removedesigner_apply",method=RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> removedesigner_apply(HttpServletRequest request,@RequestParam("dpid")Integer dpid){
		return designer_applyService.deldesigner_apply(dpid, request);
	}
	
}
