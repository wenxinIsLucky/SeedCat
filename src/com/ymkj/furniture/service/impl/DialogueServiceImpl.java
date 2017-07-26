package com.ymkj.furniture.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.mapper.DialogueMapper;
import com.ymkj.furniture.service.DialogueService;

@Service
public class DialogueServiceImpl implements DialogueService {

	@Resource
	DialogueMapper dialogueMapper; 
	
	public int addDialogue(Dialogue dialogue) {
		return dialogueMapper.addDialogue(dialogue);
	}

	public ReturnParam<Dialogue> findDialogue(Integer start,Integer end) {
		try {
			ReturnParam<Dialogue> dparam = new ReturnParam<Dialogue>();
			dparam.setList(dialogueMapper.findDialogue((start-1)*end,end));
			dparam.setStart(start);
			dparam.setSize(end);
			dparam.setCountPage(dialogueMapper.findDialogueCount());
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

}
