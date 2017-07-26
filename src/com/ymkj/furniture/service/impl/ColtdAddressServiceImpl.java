package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.entity.ColtdAddress;
import com.ymkj.furniture.entity.Corporate_culture;
import com.ymkj.furniture.mapper.ColtdAddressMapper;
import com.ymkj.furniture.service.ColtdAddressService;
import com.ymkj.furniture.util.FirstData;
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
 * 2017年7月14日-下午4:48:20
 */
@Service
public class ColtdAddressServiceImpl implements ColtdAddressService {
	@Resource
	ColtdAddressMapper coltdAddressMapper;

	/**
	 * 添加公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:48:20
	 */
	public Map<String, Object> addColtdAddress(ColtdAddress coltdAddress,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String url = "";
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误，查看网络连接";
				return map;
			}
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "数据有误，查看网络连接";
				url = "admin-loginto";
				return map;
			}
			if (coltdAddressMapper.addColtdAddress(coltdAddress) > 0) {
				Corporate_culture culture = FirstData.corporate_culture;
				culture.setColtdAddresses(findColtdAddredd());
				FirstData.corporate_culture = culture;
				status = 200;
				msg = "添加成功";
			}else {
				status = 400;
				msg = "添加失败";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误，查看网络连接";
		}
		map.put("status", status);
		map.put("url", url);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 修改公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:48:20
	 */
	public Map<String, Object> updColtdAddress(ColtdAddress coltdAddress,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String url = "";
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误，查看网络连接";
				return map;
			}
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "数据有误，查看网络连接";
				url = "admin-loginto";
				return map;
			}
			if (coltdAddressMapper.updColtdAddress(coltdAddress) > 0) {
				Corporate_culture culture = FirstData.corporate_culture;
				culture.setColtdAddresses(findColtdAddredd());
				FirstData.corporate_culture = culture;
				status = 200;
				msg = "修改成功";
			}else {
				status = 400;
				msg = "修改失败";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误，查看网络连接";
		}
		map.put("status", status);
		map.put("url", url);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 删除公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:48:20
	 */
	public Map<String, Object> delColtdAddress(int caid,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String url = "";
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误，查看网络连接";
				return map;
			}
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "数据有误，查看网络连接";
				url = "admin-loginto";
				return map;
			}
			if (coltdAddressMapper.delColtdAddress(caid) > 0) {
				Corporate_culture culture = FirstData.corporate_culture;
				culture.setColtdAddresses(findColtdAddredd());
				FirstData.corporate_culture = culture;
				status = 200;
				msg = "删除成功";
			}else {
				status = 400;
				msg = "删除失败";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误，查看网络连接";
		}
		map.put("status", status);
		map.put("url", url);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 查看公司地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午4:48:20
	 */
	public List<ColtdAddress> findColtdAddredd() {
		try {
			return coltdAddressMapper.findColtdAddredd();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 设置默认地址
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午6:25:17
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> updColtdAddressIsMr(int caid,
			HttpServletRequest request, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String url = "";
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误，查看网络连接";
				return map;
			}
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "数据有误，查看网络连接";
				url = "admin-loginto";
				return map;
			}
			int result = coltdAddressMapper.updColtdAddressIsMr(0, 0);
			if (result > 0) {
				result = coltdAddressMapper.updColtdAddressIsMr(1, caid);
				if (result > 0) {
					Corporate_culture culture = FirstData.corporate_culture;
					culture.setColtdAddresses(findColtdAddredd());
					FirstData.corporate_culture = culture;
					msg = "设置成功";
					status = 200;
				}else{
					msg = "设置失败，请稍后再试";
					status = 400;
				}
			}else{
				msg = "设置失败，请稍后再试";
				status = 400;
			}
			if (result == 0) {
				throw new Exception("设置默认地址失败");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作有误，查看网络连接";
		}
		map.put("status", status);
		map.put("url", url);
		map.put("msg", msg);
		return map;
	}
	
}
