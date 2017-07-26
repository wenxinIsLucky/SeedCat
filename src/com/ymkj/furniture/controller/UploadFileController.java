package com.ymkj.furniture.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ymkj.furniture.entity.Carousel;
import com.ymkj.furniture.entity.ImgManage;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.CarouselService;
import com.ymkj.furniture.service.ImgManageService;
import com.ymkj.furniture.service.UserService;
import com.ymkj.furniture.util.FirstData;
import com.ymkj.furniture.util.HelpUtil;
import com.ymkj.furniture.util.IMGPATH;
import com.ymkj.furniture.util.QiNiuYunUtil;

/*by lucky 2017  
 //						   _ooOoo_							              _ooOoo_    
 //						  o8888888o							             o8888888o    
 //						  88" . "88							             88" . "88    
 //						  (| -_- |)							             (| -_- |)    
 //						  O\  =  /O							             O\  =  /O    
 //					   ____/`---'\____						   	      ____/`---'\____    
 //					 .'  \\|     |//  `.						      .   ' \\| |// `.    
 //					/  \\|||  :  |||//  \						     / \\||| : |||//  \    
 //				   /  _||||| -:- |||||-  \						    / _||||| -:- |||||- \    
 //				   |   | \\\  -  /// |   |						    |   | \\\ - /// |   |    
 //				   | \_|  ''\---/''  |   |						    | \_| ''\---/'' |   |    
 //				   \  .-\__  `-`  ___/-. /						     \ .-\__ `-` ___/-. /    
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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年4月15日-下午9:25:33
 * @return
 */
@Controller
public class UploadFileController {
	@Resource
	UserService userService;
	@Resource
	CarouselService carouselService;
	@Resource
	ImgManageService imgManageService;
	
	/**
	 * 文件多上传
	 * @author Lucky(李文鑫)
	 * @date 2016-8-15 上午10:53:37
	 * @version 1.0
	 * @param request
	 * @throws Exception
	 */
	@RequestMapping(value="uploadImage",method=RequestMethod.POST)
	@ResponseBody
	public String uploadImage(HttpServletRequest request,HttpSession session) {
		String fileNames = "";
		try {
			//创建一个通用的多部分解析器  
	        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());  
	        //判断 request 是否有文件上传,即多部分请求  
	        if(multipartResolver.isMultipart(request)){  
	            //转换成多部分request    
	            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;  
	            //取得request中的所有文件名  
	            Iterator<String> iter = multiRequest.getFileNames();  
	            while(iter.hasNext()){  
	                //记录上传过程起始时的时间，用来计算上传时间  
	                //int pre = (int) System.currentTimeMillis();  
	            	String mid = HelpUtil.generateId(8);
	            	//重命名上传后的文件名  
	            	//String fileName = HelpUtil.generateUUID()+".jpg";
	            	//定义上传路径  
	            	String path = IMGPATH.lunbo;
	                //取得上传文件  
	                MultipartFile file = multiRequest.getFile(iter.next());  
	                if(file != null){  
	                    //取得当前上传文件的文件名称  
	                    String myFileName = file.getOriginalFilename();  
	                    String lastName = myFileName.substring(myFileName.indexOf('.'), myFileName.length());
	                    //如果名称不为“”,说明该文件存在，否则说明该文件不存在  
	                    if(myFileName.trim() !=""){  
	                        //System.out.println(myFileName);  
	                        //String path = "E:/imgLucky";  
	                    	fileNames += mid+lastName;
	                        File localFile = new File(path,mid+lastName);  
	                        if(!localFile.exists()){  
	                        	localFile.mkdirs();  
	                        }  
	                        //保存  
	                        try {  
	                            file.transferTo(localFile);
	                            Carousel carousel = new Carousel();
	                            carousel.setPath(localFile.getName());
	                            carousel.setUrl("");
	                            carousel.setOrder(0);
	                            carouselService.addCarousel(carousel, multiRequest, session);
	                        } catch (Exception e) {  
	                            e.printStackTrace();  
	                        }
	                    }  
	                }  
	            }  
	              
	        }
	        FirstData.carousels = carouselService.findCarouselAll();
	        return fileNames;
		} catch (Exception e) {
			System.out.println("上传轮播图出错:"+e.getMessage());
			return "error";
		}
	}
	
	/**
	 * 高效字节流写入本地文件
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月18日-下午12:15:19
	 * @param imageFile
	 * @param fileName
	 * @throws IOException
	 */
	@RequestMapping(value = "uploadRz",method = RequestMethod.POST)
	@ResponseBody
	public String uploadIdcard(@RequestParam("imgFile") MultipartFile imageFile,HttpSession session){
		try {
			//User user = (User) session.getAttribute("user");
			//if (null == user) {
			//	return "LOGIN";
			//}
			String fileName = QiNiuYunUtil.upload(imageFile.getBytes(),"rz-img").key;
			ImgManage imgManage = new ImgManage();
			String uid = "admin";
			imgManage.setUid(uid);
			imgManage.setPath("http://otda5o23l.bkt.clouddn.com/"+fileName);
			imgManageService.addImgManage(imgManage);
			return fileName;
			/*String fileName = HelpUtil.generateUUID()+".jpg";
			File file = new File(IMGPATH.rz_img+fileName);
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));  
			byte[] by = new byte[1024];
			BufferedInputStream iStream = new BufferedInputStream(imageFile.getInputStream());
			int size=0;  
	        while((size=iStream.read(by))!=-1){  
	            outputStream.write(by,0,size);  
	        }  
	        outputStream.flush();
	        iStream.close();
	        outputStream.close();
	        return fileName;*/
		} catch (Exception e) {
			System.out.println("上传失败:"+e.getMessage());
			return "FAIL";
		}
	}

	/**
	 * 高效字节流写入本地文件
	 * @param imageFile
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "uploadJz", method = RequestMethod.POST)
	@ResponseBody
	public String uploadJzIdcard(@RequestParam("imgFile") MultipartFile imageFile,HttpSession session) {
		try {
			String fileName = QiNiuYunUtil.upload(imageFile.getBytes(),"yz-img").key;
			ImgManage imgManage = new ImgManage();
			String uid = "admin";
			imgManage.setUid(uid);
			imgManage.setPath("http://otdavtkmi.bkt.clouddn.com/"+fileName);
			imgManageService.addImgManage(imgManage);
			return fileName;
			/*String fileName = HelpUtil.generateUUID() + ".jpg";
			File file = new File(IMGPATH.yz_img + fileName);
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
			return fileName;*/
		} catch (IOException e) {
			System.out.println("上传失败:" + e.getMessage());
			return "FAIL";
		}
	}
	
	
	/**
	 * 文件上传(帖子)
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年4月15日-下午9:25:59
	 * @return
	 */
	@RequestMapping(value = "uploadFile", method = RequestMethod.GET)
	public void uploadFile(HttpServletRequest request, HttpSession session) {
		/*User user = (User) session.getAttribute("user");
		String head = "";
		if (null == user) {
			return "LOGIN";
		}*/
		try {
			System.out.println("上传图片uploadFile");
			// 创建一个通用的多部分解析器
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
					request.getSession().getServletContext());
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				while (iter.hasNext()) {
					// 重命名上传后的文件名
					// String fileName = HelpUtil.generateUUID()+".jpg";
					// 定义上传路径
					String path = IMGPATH.post_video;
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						String lastName = myFileName.substring(
								myFileName.indexOf('.'), myFileName.length());
						// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							File localFile = new File(path, HelpUtil.generateUUID() + lastName);
							if (!localFile.exists()) {
								localFile.mkdirs();
							}
							// 保存
							try {
								file.transferTo(localFile);
								// materialService.addMaterial(mid,mid+lastName);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}

			}
		} catch (Exception e) {
			System.out.println("文件上传出错:" + e.getMessage());
		}
	}
	
	/**
	 * 文件上传
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年4月15日-下午9:25:59
	 * @return
	 */
	@RequestMapping(value = "uploadFileUserHead", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFileUserHead(@RequestParam("imgFile") MultipartFile imageFile, HttpSession session) {
		User user = (User) session.getAttribute("user");
		if (null == user) {
			return "LOGIN";
		}
		try {
			String fileName = user.getUid() + ".jpg";
			File file = new File(IMGPATH.head + fileName);
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
			if (user.getHead().equals("default.jpg") || !user.getHead().equals(fileName)) {
				userService.updUserByHead(session,fileName);
			}
			return "SUCCESS";
		} catch (Exception e) {
			System.out.println("文件上传出错:" + e.getMessage());
			return "FAIL";
		}
	}
	
	/**
	 * 高效字节流写入本地文件
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年4月18日-下午12:15:19
	 * @param imageFile
	 * @param fileName
	 * @throws IOException
	 */
	@RequestMapping(value = "uploadStream",method = RequestMethod.GET)
	public void uploadStream(MultipartFile imageFile){
		try {
			File file = new File(IMGPATH.post_video+imageFile.getName()+".mp4");
			BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file));  
			byte[] by = new byte[1024];
			BufferedInputStream iStream = new BufferedInputStream(imageFile.getInputStream());
			int size=0;  
	        while((size=iStream.read(by))!=-1){  
	            outputStream.write(by,0,size);  
	        }  
	        outputStream.flush();
	        iStream.close();
	        outputStream.close();
		} catch (Exception e) {
			System.out.println("上传失败:"+e.getMessage());
		}
	}
	
	@RequestMapping(value="uploadDesigner",method=RequestMethod.POST)
	@ResponseBody
	public String uploadDesigner(MultipartFile imgFile){
		try {
			String fileName = HelpUtil.generateUUID()+".jpg";
			File file = new File(IMGPATH.designer_img+fileName);
			BufferedOutputStream  outputStream = new BufferedOutputStream(new FileOutputStream(file));
			byte[] by = new byte[1024];
			BufferedInputStream inputStream  = new BufferedInputStream(imgFile.getInputStream());
			int size = 0;
			while((size=inputStream.read(by))!=-1){
				outputStream.write(by,0,size);
			}
			outputStream.flush();
			inputStream.close();
			outputStream.close();
			return fileName;
		} catch (Exception e) {
			System.out.println("设计师头像上传失败:"+e.getMessage());
			return "FAIL";
		}
	}
	
	/**
	 * 使用springMVC包装好的解析器进行多文件上传
	 * @param request
	 */
	@RequestMapping(value="uploadDesigner_case",method=RequestMethod.POST)
	@ResponseBody
	public String uploadDesigner_case(HttpServletRequest request){
		try {
			String sb = "";
			System.out.println("上传图片uploadFile");
			// 创建一个通用的多部分解析器
			CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
					request.getSession().getServletContext());
			// 判断 request 是否有文件上传,即多部分请求
			if (multipartResolver.isMultipart(request)) {
				// 转换成多部分request
				MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
				// 取得request中的所有文件名
				Iterator<String> iter = multiRequest.getFileNames();
				
				while (iter.hasNext()) {
					// 重命名上传后的文件名
					// String fileName = HelpUtil.generateUUID()+".jpg";
					// 定义上传路径
					String path = IMGPATH.designer_case_img;
					// 取得上传文件
					MultipartFile file = multiRequest.getFile(iter.next());
					if (file != null) {
						// 取得当前上传文件的文件名称
						String myFileName = file.getOriginalFilename();
						String lastName = myFileName.substring(
								myFileName.indexOf('.'), myFileName.length());
						// 如果名称不为“”,说明该文件存在，否则说明该文件不存在
						if (myFileName.trim() != "") {
							/*File localFile = new File(path, HelpUtil.generateUUID() + lastName);
							if (!localFile.exists()) {
								localFile.mkdirs();
							}
							// 保存
							try {
								file.transferTo(localFile);
								sb = localFile.getName();
								// materialService.addMaterial(mid,mid+lastName);
							} catch (Exception e) {
								e.printStackTrace();
								sb = "FAIL";
							}*/
							sb = QiNiuYunUtil.upload(file.getBytes(),"designer").key;
							ImgManage imgManage = new ImgManage();
							String uid = "admin";
							imgManage.setUid(uid);
							imgManage.setPath("http://otdaugchu.bkt.clouddn.com/"+sb);
							imgManageService.addImgManage(imgManage);
						}
					}
				}
			}
			//System.out.println("fileName:"+sb);
			return sb;
		} catch (Exception e) {
			System.out.println("文件上传出错:" + e.getMessage());
			return "FAIL";
		}
	}
	
}
