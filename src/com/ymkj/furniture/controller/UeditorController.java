package com.ymkj.furniture.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.alibaba.fastjson.JSON;
import com.ymkj.furniture.entity.ImgManage;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.ImgManageService;
import com.ymkj.furniture.util.QiNiuYunUtil;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月21日-上午11:27:55
 */
@Controller
@RequestMapping("/ueditor")
public class UeditorController {
	@Resource
	ImgManageService imgManageService;
	
	@RequestMapping
	public String index() {
		System.out.println(1);
		return "/ueditor/index";
	}
	
	/**
	 * 加载配置
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月21日-下午3:01:39
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	@ResponseBody
	public void upload(HttpServletRequest request, HttpServletResponse response,HttpSession session)
			throws IOException {
		String action = request.getParameter("action");
		if ("config".equals(action)) {
			OutputStream os = response.getOutputStream();
			IOUtils.copy(UeditorController.class.getClassLoader().getResourceAsStream("config.json"), os);
		}else if("listimage".equals(action)){
			Map<String, Object> result = new HashMap<String, Object>();
			String state = "SUCCESS";
			int start = Integer.parseInt(request.getParameter("start"));
			int size = Integer.parseInt(request.getParameter("size"));
			result.put("state", state);
			result.put("start", start);
			result.put("size", size);
			User user = (User)session.getAttribute("user");
			result.put("list", getFileName(start,size,0,user));
			response.getWriter().write(JSON.toJSONString(result));
		}else if("listfile".equals(action)){
			Map<String, Object> result = new HashMap<String, Object>();
			String state = "SUCCESS";
			int start = Integer.parseInt(request.getParameter("start"));
			int size = Integer.parseInt(request.getParameter("size"));
			result.put("state", state);
			result.put("start", start);
			result.put("size", size);
			result.put("list", getFileName(start,size,1,null));
			response.getWriter().write(JSON.toJSONString(result));
		}
	}
	
	/**
	 * 图片上传
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月21日-下午3:01:39
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> upload(HttpServletRequest request,
			@RequestParam CommonsMultipartFile upfile,HttpSession session) throws IOException {
		Map<String, String> result = new HashMap<String, String>();
		String rawName = upfile.getFileItem().getName();
		String fileExt = rawName.substring(rawName.lastIndexOf("."));
		int type = 1;
		if (fileExt.indexOf("jpeg") > -1 || fileExt.indexOf("png") > -1 || fileExt.indexOf("jpg") > -1 || fileExt.indexOf("gif") > -1 || fileExt.indexOf("bmp") > -1) {
			type = 0;
		}
		User user = (User)session.getAttribute("user");
		String path = getFilePath(upfile,type,user);
		String state = "SUCCESS";
		// 返回类型
		String rootPath = request.getContextPath();
		if (type == 1) {
			File file = new File(path);
			path = rootPath + "/ueditor/show?filePath=" + path;
			result.put("size", String.valueOf(file.length()));
			result.put("type", file.getName().substring(file.getName().lastIndexOf(".")));
		}
		result.put("url", path);
		result.put("state", state);
		return result;
	}

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public void show(String filePath, HttpServletResponse response)
			throws IOException {

		File file = getFile(filePath);

		response.setDateHeader("Expires", System.currentTimeMillis() + 1000
				* 60 * 60 * 24);
		response.setHeader("Cache-Control", "max-age=60");
		OutputStream os = response.getOutputStream();

		FileInputStream is = null;
		try {
			is = new FileInputStream(file);
			IOUtils.copy(is, os);
		} catch (FileNotFoundException e) {
			response.setStatus(404);
			return;
		} finally {
			if (null != is) {
				is.close();
			}
			if (null != os) {
				os.flush();
				os.close();
			}
		}
	}

	public String getFilePath(CommonsMultipartFile uploadFile,int type,User user) throws IOException {
		String filePath = "E:/img/post/file";
		String absolutePath = filePath;
		String rawName = uploadFile.getFileItem().getName();
		String fileExt = rawName.substring(rawName.lastIndexOf("."));
		String newName = System.currentTimeMillis()+ UUID.randomUUID().toString() + fileExt;
		if (type == 0) {
			String fileName = QiNiuYunUtil.upload(uploadFile.getBytes(),"head").key;
			ImgManage imgManage = new ImgManage();
			String uid = "admin";
			if (user != null) {
				uid = user.getUid();
			}
			imgManage.setUid(uid);
			imgManage.setPath("http://otamg4nwj.bkt.clouddn.com/"+fileName);
			imgManageService.addImgManage(imgManage);
			return fileName;
		}else {
			File folder = new File(absolutePath);
			if (!folder.exists()) {
				folder.mkdirs();
			}
			File saveFile = new File(absolutePath + File.separator + newName);
			try {
				uploadFile.getFileItem().write(saveFile);
			} catch (Exception e) {
				e.printStackTrace();
				return "";
			}
			return absolutePath + "/" + newName;
		}
	}

	protected File getFile(String path) {
		File file = new File(path);
		return file;
	}
	
	public List<Map<String, String>> getFileName(int start,int size,int type,User user) {
		String filePath = "E:/img/post/file";
		String path = filePath;
		if (type == 0) {
			List<Map<String, String>> list = new ArrayList<Map<String,String>>();
			String uid = "";
			if (user != null) {
				uid = user.getUid();
			}
			List<ImgManage> imgs = imgManageService.findImgManage(start, size,uid);
			for (ImgManage imgManage : imgs) {
				Map<String, String> map = new HashMap<String, String>();
				map.put("url", imgManage.getPath());
				list.add(map);
			}
			//return QiNiuYunUtil.show(size);
			return list;
		}else {
			File f = new File(path);
			if (!f.exists()) {
				System.out.println(path + " not exists");
				return null;
			}
			List<Map<String, String>> urls = new ArrayList<Map<String,String>>();
			File fa[] = f.listFiles();
			int count = 0;
			for (int i = start; i < fa.length; i++) {
				count++ ;
				File fs = fa[i];
				if (!fs.isDirectory()) {
					Map<String,String> map = new HashMap<String,String>();
					map.put("url", fs.getName());
					urls.add(map);
				}
				if (count >= size) {
					break;
				}
			}
			return urls;
		}
	}
}
