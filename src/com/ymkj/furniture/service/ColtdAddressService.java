package com.ymkj.furniture.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.ColtdAddress;

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
 * 2017年7月14日-下午4:47:57
 */
public interface ColtdAddressService {
	/**
	 * 添加公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:46:25
	 * @param coltdAddress
	 * @return
	 */
	public Map<String, Object> addColtdAddress(ColtdAddress coltdAddress,HttpServletRequest request,HttpSession session);
	
	/**
	 * 修改公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:46:34
	 * @param coltdAddress
	 * @return
	 */
	public Map<String, Object> updColtdAddress(ColtdAddress coltdAddress,HttpServletRequest request,HttpSession session);
	
	/**
	 * 设置默认地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:24:14
	 * @param caid
	 * @return
	 */
	public Map<String, Object> updColtdAddressIsMr(int caid,HttpServletRequest request,HttpSession session);
	
	/**
	 * 删除公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:46:42
	 * @param caid
	 * @return
	 */
	public Map<String, Object> delColtdAddress(int caid,HttpServletRequest request,HttpSession session);
	
	/**
	 * 查看公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:46:49
	 * @return
	 */
	public List<ColtdAddress> findColtdAddredd();
}
