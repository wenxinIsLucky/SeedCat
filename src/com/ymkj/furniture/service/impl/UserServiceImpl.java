package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.mapper.IntegralMapper;
import com.ymkj.furniture.mapper.LevelMapper;
import com.ymkj.furniture.mapper.UserInfoMapper;
import com.ymkj.furniture.mapper.UserMapper;
import com.ymkj.furniture.entity.Home;
import com.ymkj.furniture.entity.Level;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.entity.UserContainer;
import com.ymkj.furniture.entity.UserInfo;
import com.ymkj.furniture.service.UserService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.MD5;

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
 * 2017年6月26日-下午6:30:20
 */
@Service
public class UserServiceImpl extends HelpController implements UserService {
	@Resource
	UserMapper userMapper;
	@Resource
	FollowMapper followMapper;
	@Resource
	UserInfoMapper userInfoMapper;
	@Resource
	LevelMapper levelMapper;
	@Resource
	IntegralMapper integralMapper;

	/**
	 * 新增用户(微信端)
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> addUserWx(HttpServletRequest request,User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (filterParameter(request)) {
				status = 500;
				msg = "您输入的带有敏感信息,请重新输入";
			}else {
				if (userMapper.inspectLoginName(user.getAccount()) > 0) {
					status = 405;
					msg = "此手机已存在,请更换手机或者前去登录";
				}else{
					int result = userMapper.addUserBrowserPhone(user);
					if (result > 0) {
						result = userInfoMapper.addUserInfo(user.getUid());
						if (result > 0) {
							Level level = new Level();
							level.setUid(user.getUid());
							level.setGrade("猫宝宝");
							result = levelMapper.addLevel(level);
							if (result > 0) {
								result = integralMapper.addIntegral(user.getUid());
							}
						}
					}
					if (result > 0) {
						status = 200;
						msg = "SUCCESS";
					}else {
						status = 400;
						msg = "注册失败";
						throw new RuntimeException("新增用户(微信端)注册出错");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 404;
			msg = "后台异常";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 新增用户(浏览器端)手机注册 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> addUserBrowserPhone(HttpServletRequest request,User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (filterParameter(request)) {
				status = 500;
				msg = "您输入的带有敏感信息,请重新输入";
			}else {
				if (userMapper.inspectLoginName(user.getAccount()) > 0) {
					status = 405;
					msg = "此手机号已存在,请更换手机号注册或者前去登录";
				}else{
					int result = userMapper.addUserBrowserPhone(user);
					if (result > 0) {
						result = userInfoMapper.addUserInfo(user.getUid());
						if (result > 0) {
							Level level = new Level();
							level.setUid(user.getUid());
							level.setGrade("猫宝宝");
							result = levelMapper.addLevel(level);
							if (result > 0) {
								result = integralMapper.addIntegral(user.getUid());
							}
						}
					}
					if (result > 0) {
						status = 200;
						msg = "SUCCESS";
					}else {
						status = 400;
						msg = "注册失败";
						throw new RuntimeException("新增用户(浏览器端)手机注册出错");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 404;
			msg = "后台异常";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 根据用户openid查询 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public User findByOpenId(String openid) {
		try {
			return userMapper.findByOpenId(openid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 根据用户uid查询
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public User findByUid(String uid) {
		try {
			return userMapper.findByUid(uid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 用户输入账号密码登录
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public Map<String, Object> loginUser(HttpServletRequest request,HttpSession session,String account, String password,String url) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			String[] pars = {"url","password"};
			if (filterParameter(request,pars)) {
				status = 500;
				msg = "您输入的带有敏感信息,请重新输入";
			}else {
				User user = userMapper.loginUser(account, MD5.TripleSign(password));
				map.put("user", user);
				if (null != user) {
					if(user.getLock() == 1){
						status = 405;
						msg = "您的账号违反本公司规定,先暂不能使用";
					}else {
						status = 200;
						msg = "SUCCESS";
						session.setAttribute("user", user);
					}
				}else {
					status = 404;
					msg = "请仔细检查账号密码后再次登录";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 404;
			msg = "后台异常";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 修改登录密码
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public int updUserByLoginPass(HttpSession session, String password) {
		try {
			User user = (User)session.getAttribute("user");
			if (user != null) {
				return userMapper.updUserByLoginPass(user.getUid(), password);
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 修改头像 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public int updUserByHead(HttpSession session, String head) {
		try {
			User user = (User)session.getAttribute("user");
			if (user != null) {
				return userMapper.updUserByHead(user.getUid(), head);
			}
			return 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 检查当前的注册账号是否已经注册过
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月26日-下午6:48:50
	 */
	public Integer inspectLoginName(String account) {
		try {
			return userMapper.inspectLoginName(account);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 1;
		}
	}

	/**
	 * 获取首页数据
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午4:36:46
	 */
	public Home findHomeData(HttpSession session,String heuid) {
		try {
			User user = (User)session.getAttribute("user");
			if (user != null) {
				if (heuid != "") {
					Home home = userMapper.findHomeData(heuid);
					home.setUser(userMapper.findByUid(heuid));
					home.setContainer(userMapper.findUserContainer(heuid));
					home.setIsGz(followMapper.findIsFollow(heuid, user.getUid()));
					return home;
				}else {
					Home home = userMapper.findHomeData(user.getUid());
					home.setUser(userMapper.findByUid(user.getUid()));
					home.setContainer(userMapper.findUserContainer(user.getUid()));
					return home;
				}
			}
			return null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 修改个人资料
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-上午12:00:02
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> updUserInfo(UserContainer userContainer,
			HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		int result = 0;
		try {
			User user = (User)session.getAttribute("user");
			if (user != null) {
				UserInfo userInfo = new UserInfo();
				userInfo.setSex(userContainer.getSex());
				userInfo.setDay(userContainer.getDay());
				userInfo.setSheng(userContainer.getSheng());
				userInfo.setShi(userContainer.getShi());
				userInfo.setSignature(userContainer.getSignature());
				userInfo.setUid(user.getUid());
				result = userInfoMapper.updUserInfo(userInfo);
				if (result > 0) {
					result = userMapper.updUserName(userContainer.getName(), user.getUid());
				}
				if (result == 0) {
					msg = "修改失败";
					status = 400;
					throw new RuntimeException("帖子新增各种数量出错");
				}else {
					user.setName(userContainer.getName());
					session.setAttribute("user", user);
					msg = "修改成功";
					status = 200;
				}
			}else {
				status = 404;
				url = "to-login";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "数据出错";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}
	
}
