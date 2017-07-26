package com.ymkj.furniture.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.ymkj.furniture.entity.Community;
import com.ymkj.furniture.entity.CommunityParam;
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
 * 2017年6月27日-上午11:57:05
 */
public interface CommunityService {
	/**
	 * 新增帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-上午11:56:45
	 * @param community
	 * @return
	 */
	public Map<String, Object> addCommunity(Community community,HttpSession session,HttpServletRequest request);
	
	/**
	 * 查询帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-下午5:39:34
	 * @param examine
	 * @return
	 */
	public ReturnParam<Community> findCommunitySucc(Integer examine,Integer start,Integer size,Integer type);
	
	/**
	 * 查询自己帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-下午5:39:34
	 * @param examine
	 * @return
	 */
	public ReturnParam<Community> findCommunityByMy(HttpSession session,Integer start,Integer size);
	
	/**
	 * 查询别人帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-下午5:39:34
	 * @param examine
	 * @return
	 */
	public ReturnParam<Community> findCommunityByHe(HttpSession session,String heuid,Integer start,Integer size);
	
	/**
	 * 帖子详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-下午10:42:05
	 * @param param
	 * @param cid
	 * @return
	 */
	public Community findCommunityInfo(String cid,HttpSession session,HttpServletRequest request);
	
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月28日-上午1:39:23
	 * @param param
	 * @param cid
	 * @return
	 */
	public String updCommunityAllCount(CommunityParam communityParam,HttpServletRequest request,HttpSession session);
}
