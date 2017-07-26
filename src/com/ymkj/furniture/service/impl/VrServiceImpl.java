package com.ymkj.furniture.service.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Vr;
import com.ymkj.furniture.mapper.VrMapper;
import com.ymkj.furniture.service.VrService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.HelpUtil;
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
 * 2017年7月18日-下午3:52:09
 */
@Service
public class VrServiceImpl implements VrService {
	@Resource
	VrMapper vrMapper;

	/**
	 * 添加
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午3:52:09
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> addVrPojo(Vr vr,HttpSession session,MultipartFile imageFile) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "请重新登录";
				url = "admin-loginto";
			}else {
				String cover = uploadFileVrCover(imageFile);
				if(cover == "FAIL"){
					throw new Exception("添改vr失败");
				}
				vr.setCover("/static_img/post/images/"+cover);
				if (vrMapper.addVrPojo(vr) > 0) {
					status = 200;
					msg = "添加成功";
				}else {
					status = 400;
					msg = "添加失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "添加出错，请检查网络";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 修改
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午3:52:09
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> updVrPojo(Vr vr,HttpSession session,MultipartFile imageFile) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "请重新登录";
				url = "admin-loginto";
			}else {
				String cover = "";
				if (imageFile != null) {
					cover = uploadFileVrCover(imageFile);
					cover = "/static_img/post/images/"+cover;
					if(cover == "FAIL"){
						throw new Exception("修改vr失败");
					}
					vr.setCover(cover);
				}
				if (vrMapper.updVrPojo(vr) > 0) {
					status = 200;
					msg = "修改成功";
				}else {
					status = 400;
					msg = "修改失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "修改出错，请检查网络";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午3:52:09
	 */
	public Map<String, Object> delVrPojo(int vid,HttpSession session,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		String url = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				status = 404;
				msg = "请重新登录";
				url = "admin-loginto";
			}else if(HelpController.filterParameter(request)){
				status = 500;
				msg = "数据有误";
			}else {
				if (vrMapper.delVrPojo(vid) > 0) {
					status = 200;
					msg = "删除成功";
				}else {
					status = 400;
					msg = "删除失败";
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "删除出错，请检查网络";
		}
		map.put("status", status);
		map.put("msg", msg);
		map.put("url", url);
		return map;
	}

	/**
	 * 查看
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午3:52:09
	 */
	public ReturnParam<Vr> findVrPojoAll(ReturnParam<Vr> returnParam,HttpServletRequest request) {
		try {
			if(HelpController.filterParameter(request)){
				return null;
			}
			List<Vr> list = vrMapper.findVrPojoAll(Integer.parseInt(returnParam.getParam()), (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
			returnParam.setList(list);
			int count = list.size() != 0 ? list.get(0).getDataCount() : 0;
			returnParam.setCountPage(count);
			returnParam.setDataCount(count);
			returnParam.setStatus(200);
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 文件上传
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年4月15日-下午9:25:59
	 * @return
	 */
	public String uploadFileVrCover(MultipartFile imageFile) {
		try {
			String fileName = HelpUtil.generateUUID() + ".jpg";
			File file = new File(IMGPATH.post_img + fileName);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
			byte[] by = new byte[1024];
			BufferedInputStream bufferedInputStream = new BufferedInputStream(imageFile.getInputStream());
			int size = 0;
			while ((size = bufferedInputStream.read(by)) != -1) {
				bufferedOutputStream.write(by,0,size);
			}
			bufferedOutputStream.flush();
			bufferedInputStream.close();
			bufferedOutputStream.close();
			return fileName;
		} catch (Exception e) {
			System.out.println("文件上传出错:" + e.getMessage());
			return "FAIL";
		}
	}
}
