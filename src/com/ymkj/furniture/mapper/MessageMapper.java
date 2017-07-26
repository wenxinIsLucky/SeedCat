package com.ymkj.furniture.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Message;

/**
 * 消息
 * @author spark(黄湘川)
 * @date 2017年4月17日 下午10:43:14
 * @version 1.0
 */
public interface MessageMapper {
	
	/**
	 * 我的消息
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public List<Message> myMessage(@Param("uid")String uid);
	
	/**
	 * 更改消息状态
	 * @param mid
	 * @param uid
	 * @throws Exception
	 */
	public Integer updateMessageState(@Param("mid")Long mid);
	
	/**
	 * 新增用户已读系统公告消息
	 * @param mid
	 * @param uid
	 */
	public Integer addMsgState(@Param("mid")Long mid, @Param("uid")String uid);
	
	/**
	 * 根据用户id和消息id删除系统消息记录
	 * @param mid
	 * @param uid
	 * @throws Exception
	 */
	public Integer delSysMessage(@Param("mid")Long mid, @Param("uid")String uid);
	
	/**
	 * 根据消息id删除私信记录
	 * @param mid
	 * @throws Exception
	 */
	public Integer delPrivatelyMessage(@Param("mid")Long mid);
	
	/**
	 * 添加公告
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月23日-上午12:11:46
	 * @return
	 */
	public Integer addMessage(List<Message> messages);
	
	/**
	 * 添加公告并返回id、
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月24日-下午5:55:22
	 * @param message
	 * @return
	 */
	public Integer addMessageG(Message message);
	
	/**
	 * 根据标识返回数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月24日-下午5:58:31
	 * @param mid
	 * @return
	 */
	public Message findMessageByMid(@Param("mid")Integer mid);
	
	/**
	 * 后台查看所有公告条数
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:17
	 * @return
	 */
	public Integer findMessageCount(@Param("startDate")String startDate,@Param("endDate")String endDate);
	
	/**
	 * 后台删除公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:10
	 * @param mid
	 * @return
	 */
	public Integer delMessageByAdmin(@Param("mid")Long mid);
	
	/**
	 * 后台查看公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:03
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Message> findMessageAll(@Param("startDate")String startDate,@Param("endDate")String endDate,@Param("start")Integer start,@Param("size")Integer size);
	
	/**
	 * 查询未读消息数
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public int unreadMessage(@Param("uid")String uid);
	
	/**
	 * note:pc端我的消息
	 * @author pwj
	 * Date:2017年6月21日上午12:10:30
	 * @param uid
	 * @param start
	 * @param end
	 * @return
	 */
	public List<Message> myMessages(@Param("uid")String uid,@Param("start")Integer start,@Param("end")Integer end);
	
	/**
	 * note:pc端查看我的消息总数
	 * @author pwj
	 * Date:2017年6月21日上午12:15:36
	 * @param uid
	 * @return
	 */
	public Integer findMessagesCount(@Param("uid")String uid);
}
