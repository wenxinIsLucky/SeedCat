package com.ymkj.furniture.entity;

import java.io.Serializable;

import com.ymkj.furniture.util.HelpUtil;

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
 * 软装套餐项目
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:16:38
 */
public class Rz_package_project implements Serializable {
	private String rppid;// 标识，自生成
	private String rpid;// 所属软装套餐标识
	private String rppname;// 套餐项目名称
	private String rppimg;// 项目的主题封面
	private String rppidea;// 项目的理念描述
	private Rz_project_info project_info;// 项目详细

	public Rz_package_project() {
		// 默认创建对象自动生成rpid
		this.rppid = "rpp_"+HelpUtil.generateUUID();
	}

	public Rz_project_info getProject_info() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:27:55
		 */
		return project_info;
	}

	public void setProject_info(Rz_project_info project_info) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:27:55
		 */
		this.project_info = project_info;
	}

	public String getRppid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		return rppid;
	}

	public void setRppid(String rppid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		this.rppid = rppid;
	}

	public String getRpid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		return rpid;
	}

	public void setRprid(String rpid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		this.rpid = rpid;
	}

	public String getRppname() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		return rppname;
	}

	public void setRppname(String rppname) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		this.rppname = rppname;
	}

	public String getRppimg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		return rppimg;
	}

	public void setRppimg(String rppimg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		this.rppimg = rppimg;
	}

	public String getRppidea() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		return rppidea;
	}

	public void setRppidea(String rppidea) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:19:30
		 */
		this.rppidea = rppidea;
	}

}
