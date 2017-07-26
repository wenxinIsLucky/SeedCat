package com.ymkj.furniture.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ymkj.furniture.entity.CommunityParam;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.CommentService;
import com.ymkj.furniture.util.HelpController;

/*by lucky 2016  
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
 * 评论
 * @author lucky(李文鑫)
 * CommentController
 * CommentController.java
 * 2016年11月2日-下午4:33:53
 */
@Controller
public class CommentController {
	@Resource
	CommentService commentService;
	
	/**
	 * 查看指定文章下面所有评论(不需登录)
	 * @author lucky(李文鑫)
	 * CommentController.java
	 * 2016年11月3日-下午3:56:51
	 * @param model
	 * @return
	 */
	@RequestMapping(value="getByArticleComment",method=RequestMethod.POST)
	@ResponseBody
	public ReturnParam getByArticleComment(@RequestParam("wzid")String wzid,@RequestParam("start")Integer start){
		//查看文章下面所有评论
		return commentService.findByArticleComment(wzid,start,10);
	}
	
	/**
	 * 带参数跳到登录页面，登录后返回指定文章
	 * @author lucky(李文鑫)
	 * CommentController.java
	 * 2016年11月22日-下午4:20:55
	 * @param model
	 * @param request
	 * @param wzid
	 * @param start
	 * @param size
	 * @return
	 */
	@RequestMapping(value="getByArticleCommentBy{wzid}UserIsNull",method=RequestMethod.GET)
	public String getByArticleCommentByUserIsNull(Model model,HttpServletRequest request,@PathVariable String wzid){
		model.addAttribute("jumpParam", "getArticle"+wzid+"Defailt");
		return HelpController.notLogin(request,"getArticle"+wzid+"Defailt","pc/login","mobile/login");
	}
	
	/**
	 * 添加对某篇文章的评论(添加节点)
	 * @author lucky(李文鑫)
	 * CommentController.java
	 * 2016年11月3日-下午5:24:34
	 * @param comment
	 * @param session
	 * @return
	 */
	@RequestMapping(value="addByArticleCommentNode",method=RequestMethod.POST)
	@ResponseBody
	public String addByArticleCommentNode(HttpServletRequest request,@ModelAttribute CommunityParam communityParam,HttpSession session){
		//取出用户信息
		User user = (User)session.getAttribute("user");
		if (user == null) {
			return "LOGIN";//未登录
		}
		communityParam.setInsystem(HelpController.isPcReturn(request));
		communityParam.setInuid(user.getUid());
		Integer result = commentService.addByArticleCommentNode(communityParam);
		return result > 0 ? "SUCCESS"+(result%10==0?result/10:(result/10)+1) : "FAIL" ;
	}
	
	/**
	 * 添加对某篇文章的某个评论的评论(添加子节点)
	 * @author lucky(李文鑫)
	 * CommentController.java
	 * 2016年11月3日-下午5:57:14
	 * @param comment
	 * @param session
	 * @return
	 */
	@RequestMapping(value="addByArticleCommentChildNode",method=RequestMethod.POST)
	@ResponseBody
	public String addByArticleCommentChildNode(HttpServletRequest request,@ModelAttribute CommunityParam communityParam,HttpSession session){
		//取出用户信息
		User user = (User)session.getAttribute("user");
		if (user == null) {
			return "LOGIN";//未登录
		}
		communityParam.setInsystem(HelpController.isPcReturn(request));
		communityParam.setInuid(user.getUid());
		Integer result = commentService.addByArticleCommentChildNode(communityParam);
		return result > 0 ? "SUCCESS"+(result%10==0?result/10:(result/10)+1) : "FAIL" ;
	}
}
