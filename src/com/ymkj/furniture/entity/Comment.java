package com.ymkj.furniture.entity;

import java.io.Serializable;

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
 * 评论
 * 
 * @author lucky(李文鑫) Comment Comment.java 2016年11月1日-下午4:46:11
 */
public class Comment implements Serializable {
	private Integer cid;// 标识
	private User user;// 评论人的用户
	private String context;// 评论内容
	private String createDate;// 评论时间
	private Integer lft;// 左值
	private Integer rgt;// 右值
	private String wzid;// 帖子id
	private String system;// 用的什么系统评论的
	private Integer floor;// 楼层

	public Integer getFloor() {
		/**
		 * @author lucky(李文鑫) 2016年11月23日-上午11:56:48
		 */
		return floor;
	}

	public void setFloor(Integer floor) {
		/**
		 * @author lucky(李文鑫) 2016年11月23日-上午11:56:48
		 */
		this.floor = floor;
	}

	public String getSystem() {
		/**
		 * @author lucky(李文鑫) 2016年11月22日-下午5:05:48
		 */
		return system;
	}

	public void setSystem(String system) {
		/**
		 * @author lucky(李文鑫) 2016年11月22日-下午5:05:48
		 */
		this.system = system;
	}

	public Integer getCid() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return cid;
	}

	public void setCid(Integer cid) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		this.cid = cid;
	}

	public User getUser() {
		/**
		 * @author lucky(李文鑫) 2016年11月23日-下午4:36:22
		 */
		return user;
	}

	public void setUser(User user) {
		/**
		 * @author lucky(李文鑫) 2016年11月23日-下午4:36:23
		 */
		this.user = user;
	}

	public String getContext() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return context;
	}

	public void setContext(String context) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		this.context = context;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		String creDate = createDate;
		if (createDate != null && createDate.trim().length() != 0) {
			creDate = createDate.substring(0, 19);
		}
		this.createDate = creDate;
	}

	public Integer getLft() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return lft;
	}

	public void setLft(Integer lft) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		this.lft = lft;
	}

	public Integer getRgt() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return rgt;
	}

	public void setRgt(Integer rgt) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		this.rgt = rgt;
	}

	public String getWzid() {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		return wzid;
	}

	public void setWzid(String wzid) {
		/**
		 * @author lucky(李文鑫) 2016年11月2日-下午2:52:53
		 */
		this.wzid = wzid;
	}

}
