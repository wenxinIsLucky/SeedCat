package com.ymkj.furniture.service;


import java.util.List;



import com.ymkj.furniture.entity.Message;
import com.ymkj.furniture.entity.ReturnParam;

/**
 * 消息
 * @author spark(黄湘川)
 * @date 2017年4月17日 下午9:46:41
 * @version 1.0
 */
public interface MessageService {
	
	/**
	 * 我的消息
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public List<Message> myMessage(String uid);
	
	/**
	 * 更改查看状态
	 * @param mid
	 * @param uid
	 * @param scope
	 * @return
	 */
	public int updateMessageState(Long mid, String uid, Long scope, Long state);
	
	/**
	 * 删除消息
	 * @param mid
	 * @param uid
	 * @param scope
	 * @return
	 * @throws Exception
	 */
	public int delMessage(Long mid,String uid,Long scope);
	
	/**
	 * 添加公告
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月23日-上午12:11:46
	 * @return
	 */
	public Integer addMessage(Message message);
	
	/**
	 * 根据标识返回数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月24日-下午5:58:31
	 * @param mid
	 * @return
	 */
	public Message findMessageByMid(Integer mid);
	
	/**
	 * 后台删除公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:10
	 * @param mid
	 * @return
	 */
	public Integer delMessageByAdmin(Long mid);
	
	/**
	 * 后台查看公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:51:31
	 * @param startDate
	 * @param endDate
	 * @param start
	 * @param size
	 * @return
	 */
	public ReturnParam<Message> findMessageAll(String startDate,String endDate,Integer start,Integer size);
	
	/**
	 * 查询未读消息数
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public int unreadMessage(String uid);
	
	/**
	 * note:pc端我的消息
	 * @author hxc
	 * Date:2017年6月21日上午12:09:59
	 * @param uid
	 * @param start
	 * @param end
	 * @return
	 */
	public ReturnParam<Message> myMessages(String uid,Integer start,Integer end);
	
}
