package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Technology;

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
 * 2017年7月13日-下午5:01:21
 */
public interface TechnologyService {
	/**
	 * 添加籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午4:59:47
	 * @param technology
	 * @return
	 */
	public Map<String, Object> addTechnology(Technology technology,HttpSession session);
	
	/**
	 * 修改籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午4:59:55
	 * @param technology
	 * @return
	 */
	public Map<String, Object> updTechnologyContent(Technology technology,HttpSession session);
	
	/**
	 * 查看籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:00:04
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	public ReturnParam<Technology> findTechnologyByType(ReturnParam<Technology> returnParam,HttpServletRequest request);
	
	/**
	 * 查看籽匠工艺文章详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:00:12
	 * @param tid
	 * @return
	 */
	public Technology findTechnologyDetailed(int type,String tid,HttpServletRequest request);
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:45:59
	 * @param request
	 * @param session
	 * @param param
	 * @param shid
	 * @return
	 */
	public String updTechnologyAllCount(HttpServletRequest request,HttpSession session,String param,String tid);
}
