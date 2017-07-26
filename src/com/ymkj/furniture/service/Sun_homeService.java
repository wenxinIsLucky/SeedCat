package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Sun_home;

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
 * 2017年7月11日-下午5:36:46
 */
public interface Sun_homeService {
	/**
	 * 添加晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:21:41
	 * @param sun_home
	 * @return
	 */
	public Map<String, Object> addSunHome(Sun_home sun_home,HttpSession session,HttpServletRequest request);
	
	/**
	 * 用户查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:21:50
	 * @param uid
	 * @param start
	 * @param size
	 * @return
	 */
	public ReturnParam<Sun_home> findSunHome(ReturnParam<Sun_home> returnParam,HttpSession session,HttpServletRequest request);
	
	/**
	 * 管理员查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:36:10
	 * @param examine
	 * @param start
	 * @param size
	 * @return
	 */
	public ReturnParam<Sun_home> findSunHomeByAdmin(ReturnParam<Sun_home> returnParam,HttpServletRequest request);
	
	/**
	 * 审核或者软删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:36:18
	 * @param sun_home
	 * @return
	 */
	public Map<String, Object> updSunHome(Sun_home sun_home,HttpSession session,HttpServletRequest request,String msg);
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:04:17
	 * @param shid
	 * @return
	 */
	public Sun_home findSunHomeDetailed(String shid,HttpServletRequest request);
	
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
	public String updSunHomeAllCount(HttpServletRequest request,HttpSession session,String param,String shid);
}
