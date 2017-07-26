package com.ymkj.admin.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.Rz_package_projectMapper;
import com.ymkj.admin.mapper.Rz_project_infoMapper;
import com.ymkj.furniture.entity.Rz_package_project;
import com.ymkj.admin.service.Rz_package_projectService;

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
 * 2017年5月16日-下午5:28:25
 */
@Service("adminrz_package_projectService")
public class Rz_package_projectServiceImpl implements Rz_package_projectService {
	@Resource(name="adminrz_package_projectMapper")
	Rz_package_projectMapper rz_package_projectMapper;
	@Resource
	Rz_project_infoMapper rz_project_infoMapper;

	/**
	 * 添加单条
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:28:25
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int addRzProject(Rz_package_project rz_package_project) {
		int result = 0;
		try {
			result = rz_package_projectMapper.addRzProject(rz_package_project);
			if (result > 0) {
				rz_package_project.getProject_info().setRppid(rz_package_project.getRppid());
				result = rz_project_infoMapper.addRzProjectInfo(rz_package_project.getProject_info());
				if (result == 0) {
					throw new RuntimeException("添加软装套餐项目回滚");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	
	/**
	 * 编辑软装套餐项目
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月25日-下午3:30:32
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public int updRzProject(Rz_package_project rz_package_project) {
		int result = 0;
		try {
			result = rz_package_projectMapper.updRzProject(rz_package_project);
			if (result > 0) {
				rz_package_project.getProject_info().setRppid(rz_package_project.getRppid());
				result = rz_project_infoMapper.updRzRpojectInfo(rz_package_project.getProject_info());
				if (result == 0) {
					throw new RuntimeException("编辑软装套餐项目回滚");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	/**
	 * 添加多条
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月16日-下午5:28:25
	 */
	public int addRzProjects(List<Rz_package_project> rz_package_projects) {
		try {
			return rz_package_projectMapper.addRzProjects(rz_package_projects);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 根据标识查看项目和详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月24日-上午11:00:14
	 */
	public Rz_package_project findRzProject(String rppid,String rpid) {
		try {
			return rz_package_projectMapper.findRzProject(rppid,rpid);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
