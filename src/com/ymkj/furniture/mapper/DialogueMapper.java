package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Dialogue;

/**
 * 与设计师对话模块
 * @author hxc
 *
 */
public interface DialogueMapper {

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
	public List<Dialogue> findDialogue(@Param("start")Integer start,@Param("end")Integer end);
	
	/**
	 * 查看对话总条数
	 * @return
	 */
	public Integer findDialogueCount();
	
	/**
	 * 查看某设计师对话消息
	 * @param did
	 * @param start
	 * @param end
	 * @return
	 */
	public List<Dialogue> findDialogueByDid(@Param("did")Integer did,@Param("start")Integer start,@Param("end")Integer end);
	
	/**
	 * 查看某设计师对话总条数
	 * @return
	 */
	public Integer findDialogueByDidCount(@Param("did")Integer did);
	
	/**
	 * 设计师回复用户消息
	 * @param dialogue
	 * @return
	 */
	public int updDialogue(Dialogue dialogue);
}
