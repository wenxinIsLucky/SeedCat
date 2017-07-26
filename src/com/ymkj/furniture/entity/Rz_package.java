package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

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
 * 软装套餐
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:11:50
 */
public class Rz_package implements Serializable {
	private String rpid;// 标识，自生成
	private String rpname;// 套餐名称
	private String rpprice;// 套餐价格
	private String rpimg;// 套餐封面
	private String minprice;// 最低定制价格/平方
	private String tab;// 套餐标签(多个),逗号分隔
	private String rpstyle;// 套餐风格
	private String rpcolor;// 套餐主题色
	private String rpidea;// 套餐主题理念
	private int shelves;// 上下架 0：下架 1：上架
	private List<Rz_package_project> rz_package_projects;// 套餐项目

	public Rz_package() {
		// 默认创建对象自动生成rpid
		this.rpid = "rp_"+HelpUtil.generateUUID();
	}

	public String getRpstyle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月2日-下午3:30:19
		 */
		return rpstyle;
	}

	public int getShelves() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月12日-上午11:19:41
		 */
		return shelves;
	}

	public void setShelves(int shelves) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月12日-上午11:19:41
		 */
		this.shelves = shelves;
	}

	public void setRpstyle(String rpstyle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月2日-下午3:30:19
		 */
		this.rpstyle = rpstyle;
	}

	public List<Rz_package_project> getRz_package_projects() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:26:51
		 */
		return rz_package_projects;
	}

	public void setRz_package_projects(
			List<Rz_package_project> rz_package_projects) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:26:51
		 */
		this.rz_package_projects = rz_package_projects;
	}

	public String getRpid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		return rpid;
	}

	public void setRpid(String rpid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		this.rpid = rpid;
	}

	public String getRpname() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		return rpname;
	}

	public void setRpname(String rpname) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		this.rpname = rpname;
	}

	public String getMinprice() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		return minprice;
	}

	public void setMinprice(String minprice) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		this.minprice = minprice;
	}

	public String getTab() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		return tab;
	}

	public void setTab(String tab) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:14:06
		 */
		this.tab = tab;
	}

	public String getRpprice() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		return rpprice;
	}

	public void setRpprice(String rpprice) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		this.rpprice = rpprice;
	}

	public String getRpimg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		return rpimg;
	}

	public void setRpimg(String rpimg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		this.rpimg = rpimg;
	}

	public String getRpcolor() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		return rpcolor;
	}

	public void setRpcolor(String rpcolor) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		this.rpcolor = rpcolor;
	}

	public String getRpidea() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		return rpidea;
	}

	public void setRpidea(String rpidea) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-下午3:44:01
		 */
		this.rpidea = rpidea;
	}

}
