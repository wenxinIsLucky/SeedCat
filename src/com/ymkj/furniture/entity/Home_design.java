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
 * 首页设计申请
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:57:13
 */
public class Home_design implements Serializable {
	private Integer hdid;// 标识
	private String name;// 称呼
	private String phone;// 电话
	private Integer handle;// 是否处理 0:否 1:是 2:失败
	private String doorDate;// 处理成功后的上门时间
	private String errorMsg;// 处理失败后的原因
	private String createDate;// 申请时间
	private Integer dataCount;// 数据总数

	public Integer getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:25:16
		 */
		return dataCount;
	}

	public void setDataCount(Integer dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:25:16
		 */
		this.dataCount = dataCount;
	}

	public Integer getHandle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		return handle;
	}

	public void setHandle(Integer handle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		this.handle = handle;
	}

	public String getDoorDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		return doorDate;
	}

	public void setDoorDate(String doorDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		this.doorDate = doorDate;
	}

	public String getErrorMsg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:09:18
		 */
		this.errorMsg = errorMsg;
	}

	public Integer getHdid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		return hdid;
	}

	public void setHdid(Integer hdid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		this.hdid = hdid;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		this.name = name;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		this.phone = phone;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午6:58:05
		 */
		this.createDate = createDate;
	}

}
