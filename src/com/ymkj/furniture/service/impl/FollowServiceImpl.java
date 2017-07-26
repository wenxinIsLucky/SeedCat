package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Follow;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.entity.UserContainer;
import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.service.FollowService;
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
 * 2017年7月7日-下午3:17:26
 */
@Service
public class FollowServiceImpl implements FollowService {
	@Resource
	FollowMapper followMapper;

	/**
	 * 添加关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:17:26
	 */
	public Map<String, Object> addFollow(Follow follow,
			HttpServletRequest request, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			User user = (User)session.getAttribute("user");
			if (user == null) {
				status = 404;
				msg = "LOGIN";
				url = "to-login";
			}else if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "操作有误";
			}else {
				UserContainer fans = new UserContainer();
				fans.setUid(user.getUid());
				follow.setFans(fans);
				int result = followMapper.addFollow(follow);
				if (result > 0) {
					status = 200;
					msg = "关注成功";
				}else {
					status = 400;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 取消关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:17:26
	 */
	public Map<String, Object> delFollow(Follow follow,
			HttpServletRequest request, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			User user = (User)session.getAttribute("user");
			if (user == null) {
				status = 404;
				msg = "LOGIN";
				url = "to-login";
			}else if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "操作有误";
			}else {
				UserContainer fans = new UserContainer();
				fans.setUid(user.getUid());
				follow.setFans(fans);
				int result = followMapper.delFollow(follow);
				if (result > 0) {
					status = 200;
					msg = "已取消关注";
				}else {
					status = 400;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 查看关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:17:26
	 */
	public ReturnParam<Follow> findFollowByThis(String uid,String heuid,int start,int size,
			HttpServletRequest request, HttpSession session) {
		try {
			User user = (User)session.getAttribute("user");
			ReturnParam<Follow> param = new ReturnParam<Follow>();
			if (user == null) {
				param.setStatus(404);
				param.setUrl("to-login");
			}else if (HelpController.filterParameter(request)) {
				return null;
			}else {
				param.setStart(start);
				param.setSize(size);
				List<Follow> list = followMapper.findFollowByThis(uid,heuid, (start-1)*size, size);
				param.setList(list);
				param.setCountPage(list.size() != 0 ? list.get(0).getDataCount() : 0);
				param.setStatus(200);
			}
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看粉丝
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:17:26
	 */
	public ReturnParam<Follow> findFollowByFans(String uid,String heuid,int start,int size,
			HttpServletRequest request, HttpSession session) {
		try {
			User user = (User)session.getAttribute("user");
			ReturnParam<Follow> param = new ReturnParam<Follow>();
			if (user == null) {
				param.setStatus(404);
				param.setUrl("to-login");
			}else if (HelpController.filterParameter(request)) {
				return null;
			}else {
				param.setStart(start);
				param.setSize(size);
				List<Follow> list = followMapper.findFollowByFans(uid,heuid, (start-1)*size, size);
				param.setList(list);
				param.setCountPage(list.size() != 0 ? list.get(0).getDataCount() : 0);
				param.setStatus(200);
			}
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
