package com.ymkj.admin.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ymkj.admin.mapper.CommunityMapper;
import com.ymkj.admin.service.CommunityService;
import com.ymkj.furniture.entity.Follow;
import com.ymkj.furniture.entity.Message;
import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.mapper.MessageMapper;
import com.ymkj.furniture.util.HelpController;

/*by lucky 2017  
 //						   _ooOoo_							              _ooOoo_    
 //						  o8888888o							             o8888888o    
 //						  88" . "88							             88" . "88    
 //						  (| -_- |)							             (| -_- |)    
 //						  O\  =  /O							             O\  =  /O    
 //					   ____/`---'\____						   	      ____/`---'\____    
 //					 .'  \\|     |//  `.						     .   ' \\| |//   `.    
 //					/  \\|||  :  |||//  \						    /  \\|||  :  |||//  \    
 //				   /  _||||| -:- |||||-  \						   /  _||||| -:- |||||-  \    
 //				   |   | \\\  -  /// |   |						   |   | \\\  -  /// |   |    
 //				   | \_|  ''\---/''  |   |						   | \_|  ''\---/''  |   |    
 //				   \  .-\__  `-`  ___/-. /						    \  .-\__ `-` ___/-.  /    
 //			     ___`. .'  /--.--\  `. . __					  	  ___`. .' /--.--\ `. . __    
 //			  ."" '<  `.___\_<|>_/___.'  >'"".				   ."" '< `.___\_<|>_/___.' >'"".    
 //			 | | :  `- \`.;`\ _ /`;.`/ - ` : | |			 | | : `- \`.;`\ _ /`;.`/ - ` : | |    
 //			 \  \ `-.   \_ __\ /__ _/   .-` /  /			   \ \ `-. \_ __\ /__ _/ .-` / /    
 //		 ======`-.____`-.___\_____/___.-`____.-'====== ======`-.____`-.___\_____/___.-`____.-'======    
 //					       	`=---='    
 //
 //		^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^  .............................................      
 //			     	  佛祖保佑             永无BUG   									佛祖保佑       永无BUG
 //			佛曰:    
 //				写字楼里写字间，写字间里程序员；    
 //				程序人员写程序，又拿程序换酒钱。    
 //				酒醒只在网上坐，酒醉还来网下眠；    
 //				酒醉酒醒日复日，网上网下年复年。    
 //				但愿老死电脑间，不愿鞠躬老板前；    
 //				奔驰宝马贵者趣，公交自行程序员。    
 //				别人笑我忒疯癫，我笑自己命太贱；    
 //				不见满街漂亮妹，哪个归得程序员？  
 //										-------by 见死不救    
 */
/**
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年6月29日-上午1:07:52
 */
@Service("adminCommunityService")
public class CommunityServiceImpl implements CommunityService {
	@Resource(name="adminCommunityMapper")
	CommunityMapper communityMapper;
	@Resource
	MessageMapper messageMapper;
	@Resource
	FollowMapper followMapper;

	/**
	 * 审核
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月29日-上午1:07:52
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> updCommunityType(Integer examine, String cid,String uid,String content) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			int result = communityMapper.updCommunityType(examine, cid);
			if (result > 0) {
				Message m = new Message();
				m.setContext(content);
				if (examine == 1) {
					m.setTitle("拍客审核通过");
					List<Follow> list = followMapper.findFollowByFans(uid,"0", 0, 10000);
					List<Message> messages = new ArrayList<Message>();
					for (Follow follow : list) {
						Message message = new Message();
						message.setTitle("你关注的"+follow.getFollow().getName()+"有了新的动态");
						message.setContext("你关注的"+follow.getFollow().getName()+"新发表了一篇拍客，赶紧去瞧瞧吧");
						message.setScope(Long.valueOf(0));
						message.setRecUid(follow.getFans().getUid());
						message.setSendUid(null);
						messages.add(message);
					}
					messageMapper.addMessage(messages);
				}else {
					m.setTitle("拍客审核未通过");
				}
				m.setScope(Long.valueOf(0));
				m.setRecUid(uid);
				m.setSendUid(null);
				if (messageMapper.addMessageG(m) == 0) {
					throw new Exception("发送审核结果消息失败");
				}
				msg = "操作成功";
				status = 200;
			}else {
				msg = "操作失败";
				status = 400;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "后台有误";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 给帖子加精或者取消加精
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-下午5:31:35
	 */
	public Map<String, Object> updCommunityByIsAdd(Integer isAdd, String cid,String uid,String context,
			HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据异常";
			}else {
				int result = communityMapper.updCommunityByIsAdd(isAdd, cid);
				if (result > 0) {
					Message m = new Message();
					m.setContext(context);
					if (isAdd == 1) {
						m.setTitle("您的帖子被管理员加精处理");
					}else {
						m.setTitle("您的帖子被管理员去除了加精");
					}
					m.setScope(Long.valueOf(0));
					m.setRecUid(uid);
					m.setSendUid(null);
					if (messageMapper.addMessageG(m) == 0) {
						throw new Exception("发送审核结果消息失败");
					}
					msg = "操作成功";
					status = 200;
				}else {
					msg = "操作失败";
					status = 400;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "后台有误";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}
}
