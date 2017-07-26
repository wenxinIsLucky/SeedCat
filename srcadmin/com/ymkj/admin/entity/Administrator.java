package com.ymkj.admin.entity;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:43:18
 */
public class Administrator {
	private int aid;// 标识
	private String name;// 名称
	private String account;// 账号
	private String password;// 密码
	private String createDate;// 创建时间

	public int getAid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		return aid;
	}

	public void setAid(int aid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		this.aid = aid;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		this.name = name;
	}

	public String getAccount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		return account;
	}

	public void setAccount(String account) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		this.account = account;
	}

	public String getPassword() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		return password;
	}

	public void setPassword(String password) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		this.password = password;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-上午10:44:23
		 */
		this.createDate = createDate;
	}

}
