package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Home_culture;

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
 * 2017年7月5日-上午11:26:36
 */
public interface Home_cultureMapper {
	/**
	 * 分页查看每个类型的数据 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:28:26
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Home_culture> findHomeCultureAll(@Param("type")int type,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 前几的最新文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:28:48
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Home_culture> findHomeCultureByDate(@Param("start")int start,@Param("size")int size);
	
	/**
	 * 前几的推荐文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-下午8:59:17
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Home_culture> findHomeCultureByTuiJian(@Param("start")int start,@Param("size")int size);
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:29:06
	 * @param hcid
	 * @return
	 */
	public Home_culture findHomeCultureInfo(@Param("hcid")int hcid,@Param("type")int type);
	
	/**
	 * 新增浏览数,赞数,收藏数
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:27:10
	 * @param param
	 * @param hcid
	 * @return
	 */
	public int updHomeCultureAllCount(@Param("param")String param,@Param("hcid")int hcid);
	
	/**
	 * 新增文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:34:50
	 * @param home_culture
	 * @return
	 */
	public int addHomeCulture(Home_culture home_culture);
}
