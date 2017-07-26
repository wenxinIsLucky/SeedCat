package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

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
 * 公司文化类
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:56:29
 */
public class Corporate_culture implements Serializable {
	private int ccid;// 标识
	/**
	 * 公司简介视频
	 */
	private String url;

	/**
	 * 公司介绍内容
	 */
	private String content;

	/**
	 * 公司介绍图片
	 */
	private String imgs;

	/**
	 * 公司目标
	 */
	private String mubiao;

	/**
	 * 企业宗旨
	 */
	private String zongzhi;

	/**
	 * 经营理念
	 */
	private String idea;

	/**
	 * 公司地址
	 */
	private List<ColtdAddress> coltdAddresses;

	public int getCcid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:10:07
		 */
		return ccid;
	}

	public void setCcid(int ccid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:10:07
		 */
		this.ccid = ccid;
	}

	public String getMubiao() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		return mubiao;
	}

	public void setMubiao(String mubiao) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		this.mubiao = mubiao;
	}

	public String getZongzhi() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		return zongzhi;
	}

	public void setZongzhi(String zongzhi) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		this.zongzhi = zongzhi;
	}

	public String getIdea() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		return idea;
	}

	public void setIdea(String idea) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午5:04:53
		 */
		this.idea = idea;
	}

	public String getUrl() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:57:33
		 */
		return url;
	}

	public void setUrl(String url) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:57:33
		 */
		this.url = url;
	}

	public String getContent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:58:58
		 */
		return content;
	}

	public void setContent(String content) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:58:58
		 */
		this.content = content;
	}

	public String getImgs() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:59:34
		 */
		return imgs;
	}

	public void setImgs(String imgs) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:59:34
		 */
		this.imgs = imgs;
	}

	public List<ColtdAddress> getColtdAddresses() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:57:05
		 */
		return coltdAddresses;
	}

	public void setColtdAddresses(List<ColtdAddress> coltdAddresses) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:57:05
		 */
		this.coltdAddresses = coltdAddresses;
	}

}
