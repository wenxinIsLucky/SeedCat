package com.ymkj.furniture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.Message;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.MessageService;

@Controller
public class MessageController {
	@Resource
	MessageService messageService;
	
	/**
	 * 查询公告列表
	 * @param session
	 * @return
	 */
	@RequestMapping(value="myMessage",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Message> myMessage(HttpSession session){
		ReturnParam<Message> returnClass = new ReturnParam<Message>();
		User user = (User)session.getAttribute("user");
		if(null == user){
			returnClass.setStatus(404);
			return returnClass;
		}
		returnClass.setStatus(200);
		try {
			returnClass.setList(messageService.myMessage(user.getUid()));
		} catch (Exception e) {
			e.printStackTrace();
			returnClass.setStatus(500);
			return returnClass;
		}
		return returnClass;
	}
	
	/**
	 * 查询公告列表
	 * @param session
	 * @return
	 */
	@RequestMapping(value="myMessages",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam<Message> myMessages(HttpSession session,@RequestParam("start")Integer start,@RequestParam("end")Integer end){
		ReturnParam<Message> returnClass = new ReturnParam<Message>();
		User user = (User)session.getAttribute("user");
		if(null == user){
			returnClass.setStatus(404);
			return returnClass;
		}
		try {
			returnClass = messageService.myMessages(user.getUid(), start, end);
		} catch (Exception e) {
			e.printStackTrace();
			returnClass.setStatus(500);
			return returnClass;
		}
		return returnClass;
	}
	
	/**
	 * 修改读取状态
	 * @param session
	 * @param mid
	 * @param state
	 * @param scope
	 * @return
	 */
	@RequestMapping(value="updateMessageState",method=RequestMethod.POST)
	@ResponseBody
	public int updateState(HttpSession session,Long mid,Long state,Long scope){
		User user = (User)session.getAttribute("user");
		if(null == user){
			return 0;
		}
		try {
			return messageService.updateMessageState(mid,user.getUid(),state,scope);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	/**
	 * 删除公告
	 * @param session
	 * @param mid
	 * @param state
	 * @param scope
	 * @return
	 */
	@RequestMapping(value="deleteMessageState",method=RequestMethod.POST)
	@ResponseBody
	public int deleteMessageState(HttpSession session,Long mid,Long state,Long scope){
		User user = (User)session.getAttribute("user");
		if(null == user){
			return 0;
		}
		return messageService.delMessage(mid, user.getUid(), scope);
	}
	
	/**
	 * 查询未读消息条数
	 * @param session
	 * @return
	 */
	@RequestMapping(value="unreadMessage",method=RequestMethod.POST)
	@ResponseBody
	public int unreadMessage(HttpSession session){
		User user = (User)session.getAttribute("user");
		if(null == user){
			return 0;
		}
		return messageService.unreadMessage(user.getUid());
	}
}
