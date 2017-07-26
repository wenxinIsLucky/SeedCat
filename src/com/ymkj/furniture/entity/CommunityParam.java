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
 * 针对帖子的一个参数类
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午12:27:21
 */
public class CommunityParam implements Serializable {
	private String param;// 动态参数名
	private String inwzid;// 帖子标识
	private int replyType;// 评论的类别 0:直接针对帖子回帖 1:对评论回帖
	private String incontext;// 评论的内容
	private String inuid;// 回复人uid
	private Integer incid;// 评论表标识
	private String insystem;// 评论所用的系统
	private Integer result;// 返回结果参数

	public String getParam() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return param;
	}

	public void setParam(String param) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.param = param;
	}

	public String getInwzid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return inwzid;
	}

	public void setInwzid(String inwzid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.inwzid = inwzid;
	}

	public int getReplyType() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return replyType;
	}

	public void setReplyType(int replyType) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.replyType = replyType;
	}

	public String getIncontext() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return incontext;
	}

	public void setIncontext(String incontext) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.incontext = incontext;
	}

	public String getInuid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return inuid;
	}

	public void setInuid(String inuid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.inuid = inuid;
	}

	public Integer getIncid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return incid;
	}

	public void setIncid(Integer incid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.incid = incid;
	}

	public String getInsystem() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return insystem;
	}

	public void setInsystem(String insystem) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.insystem = insystem;
	}

	public Integer getResult() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		return result;
	}

	public void setResult(Integer result) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月30日-上午1:28:09
		 */
		this.result = result;
	}

}
