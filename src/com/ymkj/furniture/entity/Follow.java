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
 * 关注表
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:47:33
 */
public class Follow implements Serializable {
	private int fid;// 标识
	private UserContainer follow;// 关注用户对象
	private UserContainer fans;// 粉丝用户对象
	private String followDate;// 关注时间
	private int dataCount;// 数据条数
	private int isGz;// 是否我也关注了他
	private int isHeGz;// 是否游客也关注了他

	public int getIsGz() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午6:36:07
		 */
		return isGz;
	}

	public void setIsGz(int isGz) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午6:36:07
		 */
		this.isGz = isGz;
	}

	public int getIsHeGz() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午6:36:07
		 */
		return isHeGz;
	}

	public void setIsHeGz(int isHeGz) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午6:36:07
		 */
		this.isHeGz = isHeGz;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午2:30:58
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-下午2:30:58
		 */
		this.dataCount = dataCount;
	}

	public int getFid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:48:31
		 */
		return fid;
	}

	public void setFid(int fid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:48:31
		 */
		this.fid = fid;
	}

	public UserContainer getFollow() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:10:53
		 */
		return follow;
	}

	public void setFollow(UserContainer follow) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:10:53
		 */
		this.follow = follow;
	}

	public UserContainer getFans() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:10:53
		 */
		return fans;
	}

	public void setFans(UserContainer fans) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:10:53
		 */
		this.fans = fans;
	}

	public String getFollowDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:48:31
		 */
		return followDate;
	}

	public void setFollowDate(String followDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:48:31
		 */
		this.followDate = followDate;
	}

}
