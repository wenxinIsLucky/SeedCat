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
 * 申请装修
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:28:01
 */
public class Apply_for_decoration implements Serializable {
	private Integer afdid;// 标识
	private String contacts;// 联系人
	private String phone;// 联系电话
	private String sheng;// 所在省
	private String shi;// 所在市
	private String layout;// 户型
	private Short has;// 面积
	private String style;// 风格
	private String mes;// 备注
	private Integer handle;// 是否处理 0:否 1:是 2:失败
	private String doorDate;// 处理成功后的上门时间
	private String errorMsg;// 处理失败后的原因
	private String createDate;// 提交申请时间
	private Integer dataCount;// 数据总数

	public Integer getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:25:03
		 */
		return dataCount;
	}

	public void setDataCount(Integer dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:25:03
		 */
		this.dataCount = dataCount;
	}

	public Integer getHandle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		return handle;
	}

	public void setHandle(Integer handle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		this.handle = handle;
	}

	public String getDoorDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		return doorDate;
	}

	public void setDoorDate(String doorDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		this.doorDate = doorDate;
	}

	public String getErrorMsg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月3日-下午7:07:03
		 */
		this.errorMsg = errorMsg;
	}

	public Integer getAfdid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return afdid;
	}

	public void setAfdid(Integer afdid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.afdid = afdid;
	}

	public String getContacts() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return contacts;
	}

	public void setContacts(String contacts) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.contacts = contacts;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.phone = phone;
	}

	public String getSheng() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return sheng;
	}

	public void setSheng(String sheng) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.sheng = sheng;
	}

	public String getShi() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return shi;
	}

	public void setShi(String shi) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.shi = shi;
	}

	public String getLayout() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return layout;
	}

	public void setLayout(String layout) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.layout = layout;
	}

	public Short getHas() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		return has;
	}

	public void setHas(Short has) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:09
		 */
		this.has = has;
	}

	public String getStyle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		return style;
	}

	public void setStyle(String style) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		this.style = style;
	}

	public String getMes() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		return mes;
	}

	public void setMes(String mes) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		this.mes = mes;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月12日-下午4:30:10
		 */
		this.createDate = createDate;
	}

}
