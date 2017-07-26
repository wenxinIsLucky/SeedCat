package com.ymkj.furniture.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;








import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.CommentMapper;
import com.ymkj.furniture.entity.Comment;
import com.ymkj.furniture.entity.CommunityParam;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.CommentService;
import com.ymkj.furniture.util.HelpUtil;

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
 * CommentServiceImpl
 * CommentServiceImpl.java
 * 2016年11月2日-下午4:21:21
 */
@Service
public class CommentServiceImpl implements CommentService {
	@Resource
	CommentMapper commentMapper;
	
	/**
	 * @author lucky(李文鑫)
	 * 2016年11月2日-下午4:21:21
	 * @param wzid 文章id
	 */
	public List<Integer> findByCidArticleComment(String wzid,Integer start,Integer size) {
		return commentMapper.findByCidArticleComment(wzid,start,size);
	}

	/**
	 * 查看指定标识cid上面的直接父节点
	 * @author lucky(李文鑫)
	 * 2016年11月2日-下午4:21:21
	 * @param wzid 文章id
	 * @param cid 标识id
	 */
	public List<Comment> findByCidArticleCommentCount(String wzid, Integer cid) {
		return commentMapper.findByCidArticleCommentCount(wzid, cid);
	}

	/**
	 * 查看文章下面所有评论
	 * @author lucky(李文鑫)
	 * 2016年11月2日-下午4:29:33
	 */
	public ReturnParam findByArticleComment(String wzid,Integer start,Integer size) {
		ReturnParam returnParam = new ReturnParam();
		List<Map<Object, List<Comment>>> comMaps = new ArrayList<Map<Object,List<Comment>>>();
		List<Integer> cids = commentMapper.findByCidArticleComment(wzid,(start-1)*10,size);
		for (Integer c : cids) {
			Map<Object, List<Comment>> map = new HashMap<Object, List<Comment>>();
			List<Comment> cms = new ArrayList<Comment>();
			List<Comment> cs = commentMapper.findByCidArticleCommentCount(wzid, c);
			for (Comment comment : cs) {
				Comment cm = comment;
				User user = comment.getUser();
				cm.setUser(user);
				cm.setContext(new String(HelpUtil.decode(cm.getContext())));
				cms.add(cm);
			}
			map.put(c, cms);
			comMaps.add(map);
		}
		returnParam.setList(comMaps);
		returnParam.setStart(start);
		returnParam.setSize(size);
		returnParam.setCountPage(commentMapper.findByCidCommentCount(wzid));
		return returnParam;
	}

	/**
	 * 添加对某篇文章的评论(添加节点)
	 * @author lucky(李文鑫)
	 * 2016年11月3日-下午5:10:51
	 */
	public Integer addByArticleCommentNode(CommunityParam communityParam) {
		commentMapper.addByArticleCommentNode(communityParam);
		return communityParam.getResult();
	}

	/**
	 * 添加对某篇文章的某个评论的评论(添加子节点)
	 * @author lucky(李文鑫)
	 * 2016年11月3日-下午5:10:51
	 */
	public Integer addByArticleCommentChildNode(CommunityParam communityParam) {
		commentMapper.addByArticleCommentChildNode(communityParam);
		return communityParam.getResult();
	}

	/**
	 * 统计该文章下面的所有评论数量
	 * @author lucky(李文鑫)
	 * 2016年11月11日-上午11:51:39
	 */
	public Integer findByCidArticleCommentCountNum(String wzid) {
		return commentMapper.findByCidArticleCommentCountNum(wzid);
	}
	
}
