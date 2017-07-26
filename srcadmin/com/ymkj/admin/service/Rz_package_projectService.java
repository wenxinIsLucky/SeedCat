package com.ymkj.admin.service;

import java.util.List;

import com.ymkj.furniture.entity.Rz_package_project;

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
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年5月16日-下午5:25:10
 */
public interface Rz_package_projectService {
	/**
	 * 添加单条
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:23:13
	 * @param rz_package_project
	 * @return
	 */
	public int addRzProject(Rz_package_project rz_package_project);
	
	/**
	 * 编辑项目内容
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月25日-下午3:29:27
	 * @param rz_package_project
	 * @return
	 */
	public int updRzProject(Rz_package_project rz_package_project);
	
	/**
	 * 添加多条
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:23:23
	 * @param rz_package_projects
	 * @return
	 */
	public int addRzProjects(List<Rz_package_project> rz_package_projects);
	
	/**
	 * 根据标识查看项目和详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月24日-上午10:59:00
	 * @param rppid
	 * @return
	 */
	public Rz_package_project findRzProject(String rppid,String rpid);
}
