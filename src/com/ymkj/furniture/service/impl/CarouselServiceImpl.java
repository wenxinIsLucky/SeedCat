package com.ymkj.furniture.service.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.entity.Carousel;
import com.ymkj.furniture.mapper.CarouselMapper;
import com.ymkj.furniture.service.CarouselService;
import com.ymkj.furniture.util.FirstData;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.IMGPATH;

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
 * 2017年7月17日-上午11:50:39
 */
@Service
public class CarouselServiceImpl implements CarouselService {
	@Resource
	CarouselMapper carouselMapper;

	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-上午11:50:39
	 */
	public Map<String, Object> addCarousel(Carousel carousel,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				msg = "登录失效";
				status = 404;
				url = "admin-loginto";
			}
			if (HelpController.filterParameter(request)) {
				msg = "数据有误，请重新再试";
				status = 500;
			}else {
				if (carouselMapper.addCarousel(carousel) > 0) {
					msg = "添加成功";
					status = 200;
				}else {
					msg = "添加失败";
					status = 400;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "操作有误，请检查网络问题";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-上午11:50:39
	 */
	public Map<String, Object> delCarousel(int cid,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				msg = "登录失效";
				status = 404;
				url = "admin-loginto";
			}
			if (HelpController.filterParameter(request)) {
				msg = "数据有误，请重新再试";
				status = 500;
			}else {
				Carousel carousel = carouselMapper.findCarouselDetailed(cid);
				if (carouselMapper.delCarousel(cid) > 0) {
					File file = new File(IMGPATH.lunbo+carousel.getPath());
					file.delete();
					FirstData.carousels = carouselMapper.findCarouselAll();
					msg = "删除成功";
					status = 200;
				}else {
					msg = "删除失败";
					status = 400;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "操作有误，请检查网络问题";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 修改
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-上午11:50:39
	 */
	public Map<String, Object> updCarousel(Carousel carousel,HttpServletRequest request,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				msg = "登录失效";
				status = 404;
				url = "admin-loginto";
			}
			if (HelpController.filterParameter(request)) {
				msg = "数据有误，请重新再试";
				status = 500;
			}else {
				if (carouselMapper.updCarousel(carousel) > 0) {
					FirstData.carousels = carouselMapper.findCarouselAll();
					msg = "修改成功";
					status = 200;
				}else {
					msg = "修改失败";
					status = 400;
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "操作有误，请检查网络问题";
			status = 500;
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 查看
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月17日-上午11:50:39
	 */
	public List<Carousel> findCarouselAll() {
		try {
			return carouselMapper.findCarouselAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
