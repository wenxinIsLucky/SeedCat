package com.ymkj.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.Rz_packageMapper;
import com.ymkj.furniture.entity.Rz_package;
import com.ymkj.furniture.entity.Rz_package_project;
import com.ymkj.admin.service.Rz_packageService;

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
 * 2017年5月16日-下午5:26:24
 */
@Service("adminrz_packageService")
public class Rz_packageServiceImpl implements Rz_packageService {
	@Resource(name="adminrz_packageMapper")
	Rz_packageMapper rz_packageMapper;

	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:26:24
	 */
	public int addRzProject(Rz_package rz_package) {
		try {
			return rz_packageMapper.addRzProject(rz_package);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 查看套餐内的项目
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:26:24
	 */
	public List<Rz_package_project> findRzPackageProject(String rpid) {
		try {
			return rz_packageMapper.findRzPackageProject(rpid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:26:24
	 */
	public Rz_package findRzPackage(String rpid) {
		try {
			List<Rz_package> list = rz_packageMapper.findRzPackage(rpid);
			return list.size()!=0?list.get(0):null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看套餐集合
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月17日-下午3:09:21
	 */
	public List<Rz_package> findRzPackages(int start, int size) {
		try {
			return rz_packageMapper.findRzPackages(start, size);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 删除套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月17日-下午4:41:52
	 */
	public int delRzPackage(String rpid) {
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("in_rpid", rpid);
			rz_packageMapper.delRzPackage(map);
			return Integer.parseInt(map.get("result").toString());			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 编辑套餐基本内容
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月17日-下午4:41:52
	 */
	public int updRzPackage(Rz_package rz_package) {
		try {
			return rz_packageMapper.updRzPackage(rz_package);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 查看上架套餐
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月12日-上午11:14:05
	 */
	public List<Rz_package> findRzPackageShangJia(int start, int size) {
		try {
			return rz_packageMapper.findRzPackageShangJia(start, size);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 对套餐进行上下架
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月12日-上午11:14:05
	 */
	public int updRzPackageShangXiaJia(int shelves,String rpid) {
		try {
			return rz_packageMapper.updRzPackageShangXiaJia(shelves,rpid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
}
