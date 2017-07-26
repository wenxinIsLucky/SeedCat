package com.ymkj.furniture.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.PostReminderMapper;
import com.ymkj.furniture.entity.PostReminder;
import com.ymkj.furniture.service.PostReminderService;
import com.ymkj.furniture.util.HelpUtil;

/*by lucky 2016  
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
 * 评论提醒
 * @author lucky(李文鑫)
 * PostReminderServiceImpl
 * PostReminderServiceImpl.java
 * 2016年12月26日-下午4:06:23
 */
@Service
public class PostReminderServiceImpl implements PostReminderService {
	@Resource
	PostReminderMapper postReminderMapper;

	/**
	 * 分页查看评论提醒
	 * @author lucky(李文鑫)
	 * 2016年12月26日-下午4:06:23
	 */
	public List<PostReminder> findPostReminderByPage(int type, String uid, int start, int size) {
		List<PostReminder> postReminders = new ArrayList<PostReminder>();
		List<PostReminder> list = postReminderMapper.findPostReminderByPage(type, uid, start, size);
		for (PostReminder postReminder : list) {
			postReminder.setContent(new String(HelpUtil.decode(postReminder.getContent())));
			postReminders.add(postReminder);
		}
		return postReminders;
	}
}
