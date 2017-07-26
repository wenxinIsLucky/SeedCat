package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.Follow;
import com.ymkj.furniture.entity.ReturnParam;

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
 * 2017年7月7日-下午3:15:50
 */
public interface FollowService {
	/**
	 * 添加关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:10
	 * @param follow
	 * @return
	 */
	public Map<String, Object> addFollow(Follow follow,HttpServletRequest request,HttpSession session);
	
	/**
	 * 取消关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:17
	 * @param follow
	 * @return
	 */
	public Map<String, Object> delFollow(Follow follow,HttpServletRequest request,HttpSession session);
	
	/**
	 * 查看关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:24
	 * @param uid
	 * @return
	 */
	public ReturnParam<Follow> findFollowByThis(String uid,String heuid,int start,int size,HttpServletRequest request,HttpSession session);
	
	/**
	 * 查看粉丝
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:32
	 * @param uid
	 * @return
	 */
	public ReturnParam<Follow> findFollowByFans(String uid,String heuid,int start,int size,HttpServletRequest request,HttpSession session);
}
