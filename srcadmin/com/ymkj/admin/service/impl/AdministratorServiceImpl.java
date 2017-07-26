package com.ymkj.admin.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.admin.mapper.AdministratorMapper;
import com.ymkj.admin.service.AdministratorService;
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
 * 2017年7月3日-上午10:48:53
 */
@Service
public class AdministratorServiceImpl extends HelpController implements AdministratorService {
	@Resource
	AdministratorMapper administratorMapper;

	/**
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月3日-上午10:48:53
	 */
	public Map<String, Object> loginAdministrator(HttpServletRequest request,HttpSession session,String account, String password,String index) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (filterParameter(request)) {
				status = 500;
				msg = "您输入的带有敏感信息,请重新输入";
			}else {
				Administrator administrator = administratorMapper.loginAdministrator(account, MD5.TripleSign(password));
				if (null != administrator) {
					status = 200;
					msg = "SUCCESS";
					session.setAttribute("administrator", administrator);
					map.put("administrator", administrator);
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
		map.put("index", index);
		return map;
	}
}
