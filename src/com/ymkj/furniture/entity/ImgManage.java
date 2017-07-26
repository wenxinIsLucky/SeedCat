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
 * 七牛云图片管理
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午3:57:16
 */
public class ImgManage implements Serializable {
	private int imid;
	private String path;
	private String uid;
	private String createDate;

	public int getImid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		return imid;
	}

	public void setImid(int imid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		this.imid = imid;
	}

	public String getPath() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		return path;
	}

	public void setPath(String path) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		this.path = path;
	}

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		this.uid = uid;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-下午4:09:32
		 */
		this.createDate = createDate;
	}

}
