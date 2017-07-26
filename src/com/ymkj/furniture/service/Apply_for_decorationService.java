package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ymkj.furniture.entity.Apply_for_decoration;
import com.ymkj.furniture.entity.ReturnParam;

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
 * 2017年5月12日-下午4:38:11
 */
public interface Apply_for_decorationService {
	/**
	 * 添加申请装修表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月12日-下午4:37:39
	 * @param apply_for_decoration
	 * @return
	 */
	public int addApplyForDecoration(Apply_for_decoration apply_for_decoration);
	
	/**
	 * 查看申请装修表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:02:48
	 * @param handle
	 * @param start
	 * @param size
	 * @return
	 */
	public ReturnParam<Apply_for_decoration> findApplyForDecoration(Integer handle,Integer start,Integer size);
	
	/**
	 * 操作装修申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:12:49
	 * @param apply_for_decoration
	 * @return
	 */
	public Map<String, Object> updApplyForDecoration(Apply_for_decoration apply_for_decoration,HttpServletRequest request);
	
	/**
	 * 删除软装申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-下午3:51:05
	 * @param afdid
	 * @return
	 */
	public Map<String, Object> delApplyForDecoration(Integer afdid,HttpServletRequest request);
}
