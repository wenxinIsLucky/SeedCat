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
 * 轮播图
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:39:27
 */
public class Carousel implements Serializable {
	private int cid;// 标识
	private String path;// 图片路径
	private String url;// 点击后的路径
	private int order;// 轮播顺序

	public int getCid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		return cid;
	}

	public void setCid(int cid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		this.cid = cid;
	}

	public String getPath() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		return path;
	}

	public void setPath(String path) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		this.path = path;
	}

	public String getUrl() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		return url;
	}

	public void setUrl(String url) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		this.url = url;
	}

	public int getOrder() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		return order;
	}

	public void setOrder(int order) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月17日-上午10:40:18
		 */
		this.order = order;
	}

}
