package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.Apply_for_decorationMapper;
import com.ymkj.furniture.entity.Apply_for_decoration;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.service.Apply_for_decorationService;
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
 * 2017年5月12日-下午4:38:33
 */
@Service("apply_for_decorationService")
public class Apply_for_decorationServiceImpl implements
		Apply_for_decorationService {
	@Resource(name="apply_for_decorationMapper")
	Apply_for_decorationMapper apply_for_decorationMapper;

	/**
	 * 添加申请装修表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年5月12日-下午4:38:33
	 */
	public int addApplyForDecoration(Apply_for_decoration apply_for_decoration) {
		try {
			return apply_for_decorationMapper.addApplyForDecoration(apply_for_decoration);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}
	}

	/**
	 * 查看申请装修表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:05:49
	 */
	public ReturnParam<Apply_for_decoration> findApplyForDecoration(Integer handle,
			Integer start, Integer size) {
		try {
			ReturnParam<Apply_for_decoration> param = new ReturnParam<Apply_for_decoration>();
			List<Apply_for_decoration> list = apply_for_decorationMapper.findApplyForDecoration(handle, (start-1)*size, size);
			param.setList(list);
			param.setStart(start);
			param.setSize(size);
			param.setCountPage(list.size()!=0?list.get(0).getDataCount():0);
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 操作装修申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-上午11:14:00
	 */
	public Map<String, Object> updApplyForDecoration(Apply_for_decoration apply_for_decoration,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else {
				if (apply_for_decoration.getErrorMsg()==null) {
					apply_for_decoration.setErrorMsg("");
				}
				if (apply_for_decoration.getDoorDate()==null) {
					apply_for_decoration.setDoorDate("");
				}
				if (apply_for_decorationMapper.updApplyForDecoration(apply_for_decoration) > 0) {
					status = 200;
					msg = "操作成功";
				}else {
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	
	/**
	 * 删除软装申请表
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月4日-下午3:51:34
	 */
	public Map<String, Object> delApplyForDecoration(Integer afdid,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else {
				if (apply_for_decorationMapper.delApplyForDecoration(afdid) > 0) {
					status = 200;
					msg = "操作成功";
				}else {
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}
}
