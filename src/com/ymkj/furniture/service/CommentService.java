package com.ymkj.furniture.service;

import java.util.List;
import java.util.Map;

import com.ymkj.furniture.entity.Comment;
import com.ymkj.furniture.entity.CommunityParam;
import com.ymkj.furniture.entity.ReturnParam;

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
 * CommentService
 * CommentService.java
 * 2016年11月2日-下午4:18:46
 */
public interface CommentService {
	/**
	 * 统计该文章下面的所有评论数量
	 * @author lucky(李文鑫)
	 * CommentMapper.java
	 * 2016年11月11日-上午11:51:10
	 * @param wzid
	 * @return
	 */
	public Integer findByCidArticleCommentCountNum(String wzid);
	/**
	 * 查看指定文章下面的所有标识cid
	 * @author lucky(李文鑫)
	 * CommentMapper.java
	 * 2016年11月2日-下午4:18:07
	 * @param wzid
	 * @return
	 */
	public List<Integer> findByCidArticleComment(String wzid,Integer start,Integer size);
	
	/**
	 * 查看指定标识cid上面的直接父节点
	 * @author lucky(李文鑫)
	 * CommentMapper.java
	 * 2016年11月2日-下午4:18:15
	 * @param wzid
	 * @param cid
	 * @return
	 */
	public List<Comment> findByCidArticleCommentCount(String wzid,Integer cid);
	
	/**
	 * 查看文章下面所有评论
	 * @author lucky(李文鑫)
	 * CommentService.java
	 * 2016年11月2日-下午4:27:28
	 * @return
	 */
	public ReturnParam findByArticleComment(String wzid,Integer start,Integer size);
	
	/**
	 * 添加对某篇文章的评论(添加节点)
	 * @author lucky(李文鑫)
	 * CommentMapper.java
	 * 2016年11月3日-下午5:10:25
	 * @param map
	 */
	public Integer addByArticleCommentNode(CommunityParam communityParam);
	
	/**
	 * 添加对某篇文章的某个评论的评论(添加子节点)
	 * @author lucky(李文鑫)
	 * CommentMapper.java
	 * 2016年11月3日-下午5:10:33
	 * @param map
	 */
	public Integer addByArticleCommentChildNode(CommunityParam communityParam);
}
