package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.Home;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.entity.UserContainer;

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
 * 2017年6月26日-下午6:29:00
 */
public interface UserService {
	/**
	 * 新增用户(微信端)
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:22:00
	 * @param user
	 * @return
	 */
	public Map<String, Object> addUserWx(HttpServletRequest request,User user);
	
	/**
	 * 新增用户(浏览器端)手机注册 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:22:10
	 * @param user
	 * @return
	 */
	public Map<String, Object> addUserBrowserPhone(HttpServletRequest request,User user);
	
	/**
	 * 根据用户openid查询 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:22:46
	 * @param openid
	 * @return
	 */
	public User findByOpenId(String openid);
	
	/**
	 * 根据用户uid查询
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:25:57
	 * @param uid
	 * @return
	 */
	public User findByUid(String uid);
	
	/**
	 * 用户输入账号密码登录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:25:47
	 * @param account
	 * @param password
	 * @return
	 */
	public Map<String, Object> loginUser(HttpServletRequest request,HttpSession session,String account,String password,String url);
	
	/**
	 * 修改登录密码
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:26:29
	 * @param uid
	 * @param password
	 * @return
	 */
	public int updUserByLoginPass(HttpSession session,String password);
	
	/**
	 * 修改头像 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:26:44
	 * @param uid
	 * @param head
	 * @return
	 */
	public int updUserByHead(HttpSession session,String head);
	
	/**
	 * 检查当前的注册账号是否已经注册过
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:27:25
	 * @param account
	 * @return
	 */
	public Integer inspectLoginName(String account);
	
	/**
	 * 获取首页数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午4:36:28
	 * @param uid
	 * @return
	 */
	public Home findHomeData(HttpSession session,String heuid);

	/**
	 * 修改个人资料
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:59:52
	 * @param userContainer
	 * @param session
	 * @return
	 */
	public Map<String, Object> updUserInfo(UserContainer userContainer,HttpSession session);
}
