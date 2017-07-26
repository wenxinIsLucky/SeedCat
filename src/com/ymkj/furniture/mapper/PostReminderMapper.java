package com.ymkj.furniture.mapper;

import com.ymkj.furniture.entity.PostReminder;



import java.util.List;

import org.apache.ibatis.annotations.Param;
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
 * PostReminderMapper
 * PostReminderMapper.java
 * 2016年12月26日-下午4:03:55
 */
public interface PostReminderMapper {
	/**
	 * 分页查看评论提醒
	 * @author lucky(李文鑫)
	 * PostReminderMapper.java
	 * 2016年12月26日-下午4:04:55
	 * @param type
	 * @param uid
	 * @param start
	 * @param size
	 * @return
	 */
	public List<PostReminder> findPostReminderByPage(@Param("type")int type,@Param("uid")String uid,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 查看评论提醒总记录数
	 * @author lucky(李文鑫)
	 * PostReminderMapper.java
	 * 2016年12月26日-下午4:55:27
	 * @param type
	 * @param uid
	 * @return
	 */
	public Integer findPostReminderCountNum(@Param("type")int type,@Param("uid")String uid);
}
