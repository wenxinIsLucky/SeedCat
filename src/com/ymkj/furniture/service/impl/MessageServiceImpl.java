package com.ymkj.furniture.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Message;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.mapper.MessageMapper;
import com.ymkj.furniture.service.MessageService;

/**
 * 消息实现类
 * 
 * @author spark(黄湘川)
 * @date 2017年4月18日 下午2:53:23
 * @version 1.0
 */
@Service
public class MessageServiceImpl implements MessageService {
	@Resource
	MessageMapper messageMapper;

	public List<Message> myMessage(String uid)  {
		return messageMapper.myMessage(uid);
	}

	@SuppressWarnings("finally")
	public int updateMessageState(Long mid, String uid, Long state, Long scope){
		int result = 0;
		try {
			if (scope == 1 && state == 0) {
				result = messageMapper.addMsgState(mid, uid);
			} else if (scope == 0 && state == 0) {
				result = messageMapper.updateMessageState(mid);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	public int delMessage(Long mid, String uid, Long scope){
		Integer result = 0;
		if (scope == 1) {
			result = messageMapper.delSysMessage(mid, uid);
		} else if (scope == 0) {
			result =  messageMapper.delPrivatelyMessage(mid);
		}
		return result;
	}

	/**
	 * 添加公告
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月23日-上午12:12:31
	 * @return
	 */
	public Integer addMessage(Message message) {
		List<Message> list = new ArrayList<Message>();
		if(message.getScope() == 0){
			String[] rec = message.getRecs().split(",");
			for (String s: rec) {
				Message m = new Message();
				m.setContext(message.getContext());
				m.setTitle(message.getTitle());
				m.setScope(message.getScope());
				m.setRecUid(s);
				m.setSendUid(null);
				list.add(m);
			}
			return messageMapper.addMessage(list);
		}else{
			message.setRecUid(null);
			message.setSendUid(null);
			if (messageMapper.addMessageG(message) > 0) {
				return Integer.valueOf(message.getMid().toString());
			}
			return 0;
		}
	}

	/**
	 * 根据标识返回数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月24日-下午5:59:16
	 */
	public Message findMessageByMid(Integer mid) {
		return messageMapper.findMessageByMid(mid);
	}

	/**
	 * 后台删除公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:56
	 */
	public Integer delMessageByAdmin(Long mid) {
		return messageMapper.delMessageByAdmin(mid);
	}

	/**
	 * 后台查看公告记录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月27日-下午3:39:56
	 */
	public ReturnParam<Message> findMessageAll(String startDate,String endDate,Integer start, Integer size) {
		ReturnParam<Message> rClass = new ReturnParam<Message>();
		rClass.setCurrent(start);
		rClass.setSize(size);
		rClass.setList(messageMapper.findMessageAll(startDate,endDate,(start-1)*size, size));
		rClass.setCountPage(messageMapper.findMessageCount(startDate,endDate));
		rClass.setStatus(200);
		return rClass;
	}
	
	/**
	 * 查询未读消息数
	 */
	public int unreadMessage(String uid) {
		return messageMapper.unreadMessage(uid);
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com
		 * 2017年4月29日-下午11:51:27
		 * @return
		*/
	}

	/**
	 * note:pc端查看我的消息
	 * @author pwj
	 * Date:2017年6月21日上午12:39:52
	 * @param uid
	 * @param start
	 * @param end
	 * @return
	 */
	public ReturnParam<Message> myMessages(String uid, Integer start, Integer end) {
		ReturnParam<Message> rClass = new ReturnParam<Message>();
		rClass.setCurrent(start);
		rClass.setSize(end);
		rClass.setList(messageMapper.myMessages(uid,(start-1)*end, end));
		int count = messageMapper.findMessagesCount(uid);
		rClass.setCountPage(count);
		rClass.setDataCount(count);
		rClass.setStatus(200);
		return rClass;
	}
}
