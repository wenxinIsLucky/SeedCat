package com.ymkj.furniture.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Fabulous;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.service.FabulousService;
import com.ymkj.furniture.util.HelpController;

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
 * 2017年6月29日-下午7:29:35
 */
@Service
public class FabulousServiceImpl implements FabulousService {
	@Resource
	FabulousMapper fabulousMapper;

	/**
	 * 添加赞
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月29日-下午7:29:35
	 */
	public String addFabulous(Fabulous fabulous) {
		try {
			if (fabulousMapper.addFabulous(fabulous) > 0) {
				return "SUCCESS";
			}
			return "FAIL";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "ERROR";
		}
	}

	/**
	 * 查看赞
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午3:25:32
	 */
	public ReturnParam<Fabulous> findFabulous(ReturnParam<Fabulous> returnParam,HttpSession session,HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			User user = (User)session.getAttribute("user");
			if (user != null) {
				returnParam.setStatus(200);
				List<Fabulous> list = fabulousMapper.findFabulous(user.getUid(), (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
				returnParam.setList(list);
				returnParam.setDataCount(list.size() != 0 ? list.get(0).getDataCount() : 0);
				returnParam.setCountPage(list.size() != 0 ? list.get(0).getDataCount() : 0);
			}else {
				returnParam.setStatus(404);
				returnParam.setUrl("to-login");
			}
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
