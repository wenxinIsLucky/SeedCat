package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.Date;

import com.ymkj.furniture.util.HelpUtil;

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
 * 我的钱包
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:50:20
 */
public class Wallet implements Serializable {
	private int wid;// 标识
	private String uid;// 用户标识
	private int money;// 代金券金额
	private String expireDate;// 到期时间
	private String createDate;// 获取时间
	private int isExpire;// 是否过期.   1大于  -1小于  0等于

	public int getIsExpire() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午6:28:48
		 */
		return isExpire;
	}

	public void setIsExpire(int isExpire) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午6:28:48
		 */
		this.isExpire = isExpire;
	}

	public int getWid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		return wid;
	}

	public void setWid(int wid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		this.wid = wid;
	}

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		this.uid = uid;
	}

	public int getMoney() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		return money;
	}

	public void setMoney(int money) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		this.money = money;
	}

	public String getExpireDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		if (expireDate != null) {
			this.isExpire = HelpUtil.compare_date(expireDate.substring(0,19), new Date());
		}
		this.expireDate = expireDate.substring(0,19);
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:51:16
		 */
		this.createDate = createDate;
	}
}
