package com.ymkj.furniture.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.DialogueService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.IPSeeker;

@Controller
public class DialogueController extends HelpController {
	
	@Resource
	DialogueService dialogueService;
	
	/**
	 * 用户咨询消息
	 * @param request
	 * @param dialogue
	 * @return
	 */
	@RequestMapping(value="addDialogue",method=RequestMethod.POST)
	@ResponseBody
	public String addDialogue(HttpServletRequest request,@ModelAttribute Dialogue dialogue){
		if (filterParameter(request)) {
			return "ALERT";
		}
		IPSeeker seeker;
		try {
			seeker = IPSeeker.getInstance();
			String ip = seeker.getIpAddr(request);
			String ipArea = seeker.getArea(ip);
			dialogue.setIp(ip);
			dialogue.setIpAddress(ipArea);
			int result = dialogueService.addDialogue(dialogue);
			if (result > 0) {
				return "SUCCESS";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "FAIL";
		}
		return "FAIL";
	}
	
	/**
	 * 查看所有已回复对话记录
	 * @param request
	 * @return
	 */
	@RequestMapping(value="findDialogue",method = RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Dialogue> findDialogue(HttpServletRequest request,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		return dialogueService.findDialogue(start,end);
	}
	
	/*@RequestMapping(value="findDialogueByDid",method=RequestMethod.POST)
	public ReturnParam<Dialogue> findDialogueByDid(HttpServletRequest request,@RequestParam("did")Integer did,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		return dialogueService.findDialogueByDid(did, start, end);
	}*/
}
