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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:14:32
 */
public class Message implements Serializable {
	/**
	 * 标识
	 */
	private Long mid;
	/**
	 * 发送者uid
	 */
	private String sendUid;
	/**
	 * 接受者UID
	 */
	private String recUid;
	/**
	 * 接受者名称
	 */
	private String recName;
	/**
	 * 接收者集合
	 */
	private String recs;
	/**
	 * 消息状态 0是未读 1是已读 2是用户删除 3是管理员删除
	 */
	private Integer state;
	/**
	 * 消息标题
	 */
	private String title;
	/**
	 * 消息内容
	 */
	private String context;
	/**
	 * 私信还是公告区分()0私信1公告
	 */
	private Long scope;
	/**
	 * 建立消息时间
	 */
	private String createDate;

	/**
	 * 关联消息状态表
	 */
	private Msg_State msgState;

	public Long getMid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return mid;
	}

	public void setMid(Long mid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.mid = mid;
	}

	public String getSendUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return sendUid;
	}

	public void setSendUid(String sendUid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.sendUid = sendUid;
	}

	public String getRecUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return recUid;
	}

	public void setRecUid(String recUid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.recUid = recUid;
	}

	public String getRecName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return recName;
	}

	public void setRecName(String recName) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.recName = recName;
	}

	public String getRecs() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return recs;
	}

	public void setRecs(String recs) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.recs = recs;
	}

	public Integer getState() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return state;
	}

	public void setState(Integer state) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.state = state;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return title;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.title = title;
	}

	public String getContext() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return context;
	}

	public void setContext(String context) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.context = context;
	}

	public Long getScope() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return scope;
	}

	public void setScope(Long scope) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.scope = scope;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.createDate = createDate;
	}

	public Msg_State getMsgState() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		return msgState;
	}

	public void setMsgState(Msg_State msgState) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:19:05
		 */
		this.msgState = msgState;
	}

}
