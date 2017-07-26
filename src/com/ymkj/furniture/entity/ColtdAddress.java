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
 * 公司地址
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:38:32
 */
public class ColtdAddress implements Serializable {
	private int caid;// 标识
	private String name;// 公司名称
	private String address;// 详细地址
	private String youbian;// 邮编
	private String phone;// 电话
	private String chuanzhen;// 传真
	private String email;// 邮箱
	private int isMr;// 默认总公司显示 0:否 1:是

	public int getIsMr() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午6:21:31
		 */
		return isMr;
	}

	public void setIsMr(int isMr) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午6:21:31
		 */
		this.isMr = isMr;
	}

	public int getCaid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return caid;
	}

	public void setCaid(int caid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.caid = caid;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.name = name;
	}

	public String getAddress() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return address;
	}

	public void setAddress(String address) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.address = address;
	}

	public String getYoubian() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return youbian;
	}

	public void setYoubian(String youbian) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.youbian = youbian;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.phone = phone;
	}

	public String getChuanzhen() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return chuanzhen;
	}

	public void setChuanzhen(String chuanzhen) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.chuanzhen = chuanzhen;
	}

	public String getEmail() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		return email;
	}

	public void setEmail(String email) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:39:36
		 */
		this.email = email;
	}

}
