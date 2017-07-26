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
 * 用户对象容器
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:14:56
 */
public class UserContainer implements Serializable {
	private String uid;// 标识
	private String name;// 姓名
	private String phone;// 手机
	private String email;// 邮箱
	private String head;// 头像
	private String sex;// 性别 0:女 1:男
	private String day;// 生日
	private String sheng;// 省
	private String shi;// 市
	private String signature;// 个性签名
	private int number;// 积分数量
	private int lel;// 当前等级
	private String grade;// 等级名称
	private String createDate;// 注册时间

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.uid = uid;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.name = name;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.phone = phone;
	}

	public String getEmail() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return email;
	}

	public void setEmail(String email) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.email = email;
	}

	public String getHead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return head;
	}

	public void setHead(String head) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.head = head;
	}

	public String getSex() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return sex;
	}

	public void setSex(String sex) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.sex = sex;
	}

	public String getDay() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return day;
	}

	public void setDay(String day) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.day = day;
	}

	public String getSheng() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return sheng;
	}

	public void setSheng(String sheng) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.sheng = sheng;
	}

	public String getShi() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return shi;
	}

	public void setShi(String shi) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.shi = shi;
	}

	public String getSignature() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return signature;
	}

	public void setSignature(String signature) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.signature = signature;
	}

	public int getNumber() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return number;
	}

	public void setNumber(int number) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.number = number;
	}

	public int getLel() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return lel;
	}

	public void setLel(int lel) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.lel = lel;
	}

	public String getGrade() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return grade;
	}

	public void setGrade(String grade) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.grade = grade;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月7日-上午10:16:16
		 */
		this.createDate = createDate;
	}

}
