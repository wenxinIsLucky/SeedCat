package com.ymkj.furniture.controller;


import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.service.DesignerService;
import com.ymkj.furniture.service.Designer_caseService;
import com.ymkj.furniture.service.DialogueService;
import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.Designer_case;
import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.util.HelpController;

@Controller
public class DesignerController extends HelpController {
	@Resource
	DesignerService designerService;
	@Resource
	Designer_caseService designer_caseService;
	@Resource
	DialogueService dialogueService;
	
	/**
	 * 查看设计师集合
	 * @param request
	 * @param begin
	 * @param end
	 * @return
	 */
	@RequestMapping(value="pcfindDesigner",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Designer> pcfindDesigner(HttpServletRequest request,@RequestParam("begin")Integer begin,@RequestParam("end")Integer end){
		return designerService.findDesigner(begin, end);
	}
	
	/**
	 * 查看所有设计师的设计案例按关注量排序
	 * @param request
	 * @return
	 */
	@RequestMapping(value="pcfindDesignerData",method=RequestMethod.POST)
	@ResponseBody
	public List<Designer> pcfindDesignerData(HttpServletRequest request){
		return designerService.findDesignerData();
	}
	
	/**
	 * 带设计师编号跳转到编辑设计师页面
	 * @param request
	 * @param did
	 * @param model
	 * @return
	 */
	@RequestMapping(value="pcfindDesignerByDid",method=RequestMethod.GET)
	public String pcfindDesignerByDid(HttpServletRequest request,@RequestParam("did")Integer did,Model model){
		Designer dg = designerService.findDesignerByDid(did);
		List<Designer_case> dcs = designer_caseService.findDcByDid(did);
		ReturnParam<Dialogue> dparam = dialogueService.findDialogueByDid(did, 1, 10);
		/*if (filterParameter(request)) {
			dg = null;
		}*/		
		model.addAttribute("designer",dg);
		model.addAttribute("dcs",dcs);
		model.addAttribute("dparam",dparam.getList());
		return "pc/designer/designer_child";
	}
	
	/**
	 * 进入案例详情页面
	 * @param request
	 * @param did
	 * @param dcid
	 * @param model
	 * @return
	 */
	@RequestMapping(value="findDesignerByid",method=RequestMethod.GET)
	public String findDesignerByid(HttpServletRequest request,@RequestParam("did")Integer did,@RequestParam("dcid")Integer dcid,Model model){
		Designer dgdata = designerService.findDesignerDataByid(did, dcid);
		model.addAttribute("dgdata",dgdata);
		return "pc/designer/designer_info";
	}
	
}
