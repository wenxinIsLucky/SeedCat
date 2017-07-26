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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:36:50
 */
public class Vr implements Serializable {
	private int vid;// 标识
	private String title;// vr标题
	private String cover;// 封面
	private int type;// vr类型
	private String url;// 链接
	private String createDate;// 时间
	private int dataCount;// 给类型总数据

	public String getCover() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午5:06:06
		 */
		return cover;
	}

	public void setCover(String cover) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午5:06:06
		 */
		this.cover = cover;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午4:05:25
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午4:05:25
		 */
		this.dataCount = dataCount;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:39:40
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:39:40
		 */
		this.createDate = createDate;
	}

	public int getVid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		return vid;
	}

	public void setVid(int vid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		this.vid = vid;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		return title;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		this.title = title;
	}

	public int getType() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		return type;
	}

	public void setType(int type) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		this.type = type;
	}

	public String getUrl() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		return url;
	}

	public void setUrl(String url) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月18日-下午3:37:43
		 */
		this.url = url;
	}

}
