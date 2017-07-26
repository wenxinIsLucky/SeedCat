package com.ymkj.admin.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.admin.service.DialogueService;


@Controller("adminDialogueController")
public class DialogueController{
	
	@Resource(name="adminDialogueService")
	DialogueService dialogueService;
	
	/**
	 * 查看所有对话
	 * @param request
	 * @param start
	 * @param end
	 * @return
	 */
	@RequestMapping(value="adminfindDialogue",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Dialogue> adminfindDialogues(HttpServletRequest request,@Param("handle")Integer handle,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		return dialogueService.findDialogue(handle,start,end);
	}
	
	/**
	 * 设计师回复用户消息
	 * @param request
	 * @param dialogue
	 * @return
	 */
	@RequestMapping(value="updDialogue",method = RequestMethod.POST)
	@ResponseBody
	public String updDialogue(HttpServletRequest request,@ModelAttribute Dialogue dialogue){
		dialogue.setDid(1);
		int result = dialogueService.updDialogue(dialogue);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
	@RequestMapping(value="delDialogue",method=RequestMethod.POST)
	@ResponseBody
	public String delDialogue(HttpServletRequest request,@RequestParam("dgid")Integer dgid){
		int result = dialogueService.delDialogue(dgid);
		if (result > 0) {
			return "SUCCESS";
		}
		return "FAIL";
	}
	
}
