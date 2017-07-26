package com.ymkj.furniture.entity;

import java.io.Serializable;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:33:37
 */
public class Home implements Serializable {
	private int follow;// 关注数量
	private int fans;// 粉丝数量
	private int visitor;// 访客数量
	private String sign;// 签名
	private int message;// 消息数量
	private int isGz;// 是否关注
	private User user;
	private UserContainer container;

	public int getIsGz() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午12:09:44
		 */
		return isGz;
	}

	public void setIsGz(int isGz) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午12:09:44
		 */
		this.isGz = isGz;
	}

	public User getUser() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-上午11:31:31
		 */
		return user;
	}

	public void setUser(User user) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-上午11:31:31
		 */
		this.user = user;
	}

	public UserContainer getContainer() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-上午11:31:31
		 */
		return container;
	}

	public void setContainer(UserContainer container) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-上午11:31:31
		 */
		this.container = container;
	}

	public int getFollow() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		return follow;
	}

	public void setFollow(int follow) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		this.follow = follow;
	}

	public int getFans() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		return fans;
	}

	public void setFans(int fans) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		this.fans = fans;
	}

	public int getVisitor() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		return visitor;
	}

	public void setVisitor(int visitor) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		this.visitor = visitor;
	}

	public String getSign() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		return sign;
	}

	public void setSign(String sign) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		this.sign = sign;
	}

	public int getMessage() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		return message;
	}

	public void setMessage(int message) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午4:34:55
		 */
		this.message = message;
	}

}
