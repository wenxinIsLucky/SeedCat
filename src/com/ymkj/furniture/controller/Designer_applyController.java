package com.ymkj.furniture.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Designer_apply;
import com.ymkj.furniture.service.Designer_applyService;
import com.ymkj.furniture.util.HelpController;

@Controller
public class Designer_applyController extends HelpController {

	@Resource(name="designer_applyService")
	Designer_applyService designer_applyService;
	
	/**
	 * 申请免费设计服务
	 * @param request
	 * @param designer_apply
	 * @return
	 */
	@RequestMapping(value="addDesigner_apply",method=RequestMethod.POST)
	@ResponseBody
	public String addDesigner_apply(HttpServletRequest request,@ModelAttribute Designer_apply designer_apply){
		if (filterParameter(request)) {
			return "ALERT";
		}
		int result = designer_applyService.addDesigner_apply(designer_apply);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	/**
	 * 查看当日申请免费设计服务
	 * @return
	 */
	@RequestMapping(value="searchtodayDesigner_apply",method=RequestMethod.POST)
	@ResponseBody
	public List<Designer_apply> searchtodayDesigner_apply(){
		return designer_applyService.findtodayDesigner_apply();
	}
}
