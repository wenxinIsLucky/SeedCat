package com.ymkj.admin.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.admin.mapper.DialogueMapper;
import com.ymkj.admin.service.DialogueService;

@Service("adminDialogueService")
public class DialogueServiceImpl implements DialogueService {

	@Resource(name="adminDialogueMapper")
	DialogueMapper dialogueMapper; 
	

	public ReturnParam<Dialogue> findDialogue(Integer handle,Integer start,Integer end) {
		try {
			ReturnParam<Dialogue> dparam = new ReturnParam<Dialogue>();
			dparam.setList(dialogueMapper.findDialogue(handle,(start-1)*end,end));
			dparam.setStart(start);
			dparam.setSize(end);
			dparam.setCountPage(dialogueMapper.findDialogueCount(handle));
			dparam.setStatus(200);
			return dparam;
		} catch (Exception e) {
			System.out.println("DialogueServiceImpl=>findDialogue:"+e.getMessage());
			return null;
		}
	}

	public int updDialogue(Dialogue dialogue) {
		return dialogueMapper.updDialogue(dialogue);
	}

	public ReturnParam<Dialogue> findDialogueByDid(Integer did, Integer start,
			Integer end) {
		try {
			ReturnParam<Dialogue> dparam = new ReturnParam<Dialogue>();
			dparam.setList(dialogueMapper.findDialogueByDid(did,(start-1)*end,end));
			dparam.setStart(start);
			dparam.setSize(end);
			dparam.setCountPage(dialogueMapper.findDialogueByDidCount(did));
			dparam.setStatus(200);
			return dparam;
		} catch (Exception e) {
			System.out.println("DialogueServiceImpl=>findDialogueByDid:"+e.getMessage());
			return null;
		}
	}

	public int delDialogue(Integer dgid) {
		return dialogueMapper.delDialogue(dgid);
	}
}
