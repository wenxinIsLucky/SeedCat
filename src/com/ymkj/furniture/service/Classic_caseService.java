package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.Classic_case;
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
 * 2017年7月14日-上午11:44:44
 */
public interface Classic_caseService {
	/**
	 * 添加经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:43:42
	 * @param classic_case
	 * @return
	 */
    public Map<String, Object> addClassicCase(Classic_case classic_case,HttpSession session);
    
    /**
     * 分页查看经典案例
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:43:53
     * @param type
     * @param start
     * @param size
     * @return
     */
    public ReturnParam<Classic_case> findClassicCaseByType(ReturnParam<Classic_case> returnParam,HttpServletRequest request);
    
    /**
     * 查看详细
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:44:20
     * @param ccid
     * @return
     */
    public Classic_case findClassicCaseDetailed(int type,String ccid,HttpServletRequest request);
    
    /**
     * 修改经典案例
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:44:26
     * @param classic_case
     * @return
     */
    public Map<String, Object> updClassicCaseContent(Classic_case classic_case,HttpSession session);
    
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
	public String updClassicCaseAllCount(HttpServletRequest request,HttpSession session,String param,String ccid);
}
