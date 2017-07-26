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
 * 社区收藏
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:16:54
 */
public class CommunityCollection implements Serializable {
	private int ccid;// 标识
	private String uid;// 用户id
	private User user;
	private String cid;// 帖子标识
	private Community community;
	private String type;// 收藏的类型
	private String createDate;// 记录时间
	private String system;// 来自哪端
	private int dataCount;// 当前类型数据总数

	public String getSystem() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午11:14:08
		 */
		return system;
	}

	public void setSystem(String system) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午11:14:08
		 */
		this.system = system;
	}

	public Community getCommunity() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午11:04:53
		 */
		return community;
	}

	public void setCommunity(Community community) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午11:04:53
		 */
		this.community = community;
	}

	public User getUser() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:59:14
		 */
		return user;
	}

	public void setUser(User user) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:59:14
		 */
		this.user = user;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:43:26
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:43:26
		 */
		this.dataCount = dataCount;
	}

	public String getType() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:19:38
		 */
		return type;
	}

	public void setType(String type) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-上午10:19:38
		 */
		this.type = type;
	}

	public int getCcid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:20:16
		 */
		return ccid;
	}

	public void setCcid(int ccid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:20:17
		 */
		this.ccid = ccid;
	}

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		this.uid = uid;
	}

	public String getCid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		return cid;
	}

	public void setCid(String cid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		this.cid = cid;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午7:19:02
		 */
		this.createDate = createDate;
	}

}
