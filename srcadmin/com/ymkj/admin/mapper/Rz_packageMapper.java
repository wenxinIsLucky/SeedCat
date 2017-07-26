package com.ymkj.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Rz_package;
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
 * 2017年5月16日-下午5:20:00
 */
@Component("adminrz_packageMapper")
public interface Rz_packageMapper {
	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:21:20
	 * @return
	 */
	public int addRzProject(Rz_package rz_package);
	
	/**
	 * 查看套餐内的项目
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:21:27
	 * @return
	 */
	public List<Rz_package_project> findRzPackageProject(@Param("rpid")String rpid);
	
	/**
	 * 查看套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:21:42
	 * @return
	 */
	public List<Rz_package> findRzPackage(@Param("rpid")String rpid);
	
	/**
	 * 查看套餐集合
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:21:42
	 * @return
	 */
	public List<Rz_package> findRzPackages(@Param("start")int start,@Param("size")int size);
	
	/**
	 * 删除套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月17日-下午4:40:38
	 * @param rpid
	 * @return
	 */
	public void delRzPackage(Map<String, Object> map);
	
	/**
	 * 编辑套餐基本内容
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月17日-下午4:40:46
	 * @param rz_package
	 * @return
	 */
	public int updRzPackage(Rz_package rz_package);
	
	/**
	 * 查看上架套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月12日-上午11:12:55
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Rz_package> findRzPackageShangJia(@Param("start")int start,@Param("size")int size);
	
	/**
	 * 对套餐进行上下架
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月12日-上午11:13:05
	 * @param rpid
	 * @return
	 */
	public int updRzPackageShangXiaJia(@Param("shelves")int shelves,@Param("rpid")String rpid);
}
