package com.ymkj.furniture.entity;

import java.io.Serializable;

import com.ymkj.furniture.util.HelpUtil;
import com.ymkj.furniture.util.MD5;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:01:07
 */
public class User implements Serializable {
	private String uid;// 标识
	private String name;// 姓名
	private String phone;// 手机
	private String email;// 邮箱
	private String openid;// 微信标识
	private String head;// 头像
	private String account;// 账号
	private String password;// 密码
	private int lock;// 锁，0:false 1:true
	private String createDate;// 注册时间
	
	public User(){
		this.uid = HelpUtil.generateUUIDTop("user");
		this.head = "default.jpg";
	}

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.uid = uid;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.name = name;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.phone = phone;
	}

	public String getEmail() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return email;
	}

	public void setEmail(String email) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.email = email;
	}

	public String getOpenid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return openid;
	}

	public void setOpenid(String openid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.openid = openid;
	}

	public String getHead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return head;
	}

	public void setHead(String head) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.head = head;
	}

	public String getAccount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return account;
	}

	public void setAccount(String account) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.account = account;
	}

	public String getPassword() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return password;
	}

	public void setPassword(String password) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.password = password != null ? MD5.TripleSign(password) : password;
	}

	public int getLock() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return lock;
	}

	public void setLock(int lock) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.lock = lock;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月26日-下午6:11:13
		 */
		this.createDate = createDate!=null?createDate.substring(0,19):createDate;
	}

}
