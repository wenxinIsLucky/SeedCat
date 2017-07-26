package com.ymkj.furniture.service;



import com.ymkj.furniture.entity.Dialogue;
import com.ymkj.furniture.entity.ReturnParam;

public interface DialogueService {

	/**
	 * 用户咨询消息
	 * @param dialogue
	 * @return
	 */
	public int addDialogue(Dialogue dialogue);
	
	/**
	 * 查看所有对话
	 * @return
	 */
	public ReturnParam<Dialogue> findDialogue(Integer start,Integer end);
	
	/**
	 * 查看某设计师对话消息
	 * @param did
	 * @param start
	 * @param end
	 * @return
	 */
	public ReturnParam<Dialogue> findDialogueByDid(Integer did,Integer start,Integer end);
	
	/**
	 * 设计师回复用户消息
	 * @param dialogue
	 * @return
	 */
	public int updDialogue(Dialogue dialogue);
}
