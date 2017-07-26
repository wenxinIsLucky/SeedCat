package com.ymkj.furniture.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.mapper.CommentMapper;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.mapper.CommunityMapper;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.mapper.StepMapper;
import com.ymkj.furniture.entity.Community;
import com.ymkj.furniture.entity.CommunityCollection;
import com.ymkj.furniture.entity.CommunityParam;
import com.ymkj.furniture.entity.Fabulous;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Step;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.service.CommunityService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.HelpUtil;
import com.ymkj.furniture.util.IPSeeker;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:57:25
 */
@Service
public class CommunityServiceImpl extends HelpController implements
		CommunityService {
	//帖子
	@Resource
	CommunityMapper communityMapper;
	//收藏
	@Resource
	CommunityCollectionMapper communityCollectionMapper;
	//赞
	@Resource
	FabulousMapper fabulousMapper;
	//踩
	@Resource
	StepMapper stepMapper;
	//评论
	@Resource
	CommentMapper commentMapper;

	/**
	 * 新增帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:57:25
	 */
	public Map<String, Object> addCommunity(Community community,HttpSession session,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			User user = null;
			if (community.getType() == 2) {
				user = (User) session.getAttribute("user");
				if (user == null) {
					map.put("status", 404);
					map.put("msg", "LOGIN");
					map.put("url", "to-login");
					return map;
				}
			} else {
				Administrator administrator = (Administrator) session.getAttribute("administrator");
				if (administrator == null) {
					map.put("status", 404);
					map.put("msg", "LOGIN");
					map.put("url", "admin-loginto");
					return map;
				}
				user = new User();
				user.setUid("籽匠猫");
			}
			community.setUser(user);
			community.setContent(HelpUtil.encode(community.getContent().getBytes()));
			int result = 0;
			String system = HelpController.isPcReturn(request);
			community.setSystem(system);
			if (community.getType() ==1) {
				result = communityMapper.addCommunityHt(community);
				map.put("url", "admin-community-post");
			}else {
				result = communityMapper.addCommunity(community);
				map.put("url", "to-community-community_home");
			}
			if (result > 0) {
				msg = "发布成功，等待审核";
				status = 200;
			}else{
				status = 400;
				msg = "发布失败，请稍后再试";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "发布失败，请检查网络是否有问题";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}
	
	/**
	 * 查询帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月27日-下午5:40:02
	 */
	public ReturnParam<Community> findCommunitySucc(Integer examine,Integer start,Integer size,Integer type) {
		try {
			ReturnParam<Community> cParam = new ReturnParam<Community>();
			cParam.setList(communityMapper.findCommunitySucc(examine,(start-1)*size,size,type));
			cParam.setStart(start);
			cParam.setSize(size);
			cParam.setCountPage(communityMapper.findCommunityCount(examine));
			cParam.setStatus(200);
			return cParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 帖子详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月28日-上午12:03:27
	 */
	public Community findCommunityInfo(String cid,HttpSession session,HttpServletRequest request) {
		try {
			User user = (User)session.getAttribute("user");
			String uid = "";
			if (user != null) {
				uid = user.getUid();
			}
			IPSeeker seeker = IPSeeker.getInstance();
			Community community = communityMapper.findCommunityInfo(uid,seeker.getIpAddr(request),cid);
			if (community.getContent() != null) {
				community.setContent(new String(HelpUtil.decode(community.getContent())));
			}
			return community;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月28日-上午1:40:02
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updCommunityAllCount(CommunityParam communityParam,HttpServletRequest request,HttpSession session) {
		try {
			User user = (User)session.getAttribute("user");
			if((communityParam.getParam().toLowerCase().indexOf("collection") > -1 || communityParam.getParam().toLowerCase().equals("reply")) && user == null){
				return "LOGIN";
			}
			String param = communityParam.getParam().toLowerCase();
			String type = "";
			if (communityParam.getParam().toLowerCase().indexOf("collection") > -1) {
				type = param.replace("collection", "");
				param = "collection";
			}
			int result = communityMapper.updCommunityAllCount(param, communityParam.getInwzid());
			if (result > 0) {
				communityParam.setInsystem(HelpController.isPcReturn(request));
				IPSeeker seeker = IPSeeker.getInstance();
				String ipadd = seeker.getIpAddr(request);
				String uid = null;
				if (user != null) {
					uid = user.getUid();
				}
				if (param.equals("zan")) {
					Fabulous fabulous = new Fabulous();
					fabulous.setCid(communityParam.getInwzid());
					fabulous.setIpadd(ipadd);
					fabulous.setUid(uid);
					result = fabulousMapper.addFabulous(fabulous);
				}else if(param.equals("cai")){
					Step step = new Step();
					step.setCid(communityParam.getInwzid());
					step.setIpadd(ipadd);
					step.setUid(uid);
					result = stepMapper.addStep(step);
				}else if(param.equals("collection")){
					CommunityCollection communityCollection = new CommunityCollection();
					communityCollection.setCid(communityParam.getInwzid());
					communityCollection.setUid(uid);
					communityCollection.setType(type);
					communityCollection.setSystem(HelpController.isPcReturn(request));
					result = communityCollectionMapper.addCommunityCollection(communityCollection);
				}else if(param.equals("reply")){
					communityParam.setInuid(uid);
					communityParam.setIncontext(HelpUtil.encode(communityParam.getIncontext().getBytes()));
					if (communityParam.getReplyType() == 0) {
						commentMapper.addByArticleCommentNode(communityParam);
					}else if (communityParam.getReplyType() == 1) {
						commentMapper.addByArticleCommentChildNode(communityParam);
					}
					result = communityParam.getResult();
				}
				if (result == 0) {
					throw new RuntimeException("拍客新增各种数量出错");
				}
				return "SUCCESS";
			}
			return "FAIL";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "ERROR";
		}
	}

	/**
	 * 查看自己的帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午4:31:22
	 */
	public ReturnParam<Community> findCommunityByMy(HttpSession session, Integer start,
			Integer size) {
		try {
			User user = (User)session.getAttribute("user");
			ReturnParam<Community> cParam = new ReturnParam<Community>();
			if (user != null) {
				List<Community> communities = new ArrayList<Community>();
				List<Community> list = communityMapper.findCommunityByMy(user.getUid(), (start-1)*size, size);
				for (Community community : list) {
					community.setContent(new String(HelpUtil.decode(community.getContent())));
					// 解析源代码
					Document document = Jsoup.parse(community.getContent());
					// 获取所有图片的地址<img src="" alt="" width="" height=""/>
					Elements p = document.getElementsByTag("p");
					Elements img = document.getElementsByTag("img");
					String txt = "";
					String imgs = "";
					for (Element element : p) {
						txt += element.text();
					}
					for (int i = 0; i < img.size(); i++) {
						imgs += img.get(i).attr("src");
						if (i < img.size()-1) {
							imgs+=",";
						}
					}
					community.setCunContext(txt);
					community.setCunimg(imgs);
					communities.add(community);
				}
				cParam.setList(communities);
				cParam.setStart(start);
				cParam.setSize(size);
				cParam.setCountPage(communities.size() != 0 ? communities.get(0).getDataCount() : 0);
				cParam.setStatus(200);
				return cParam;
			}else {
				cParam.setStatus(404);
				cParam.setUrl("to-login");
				return cParam;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	
	/**
	 * 查看别人的帖子
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午4:31:22
	 */
	public ReturnParam<Community> findCommunityByHe(HttpSession session,String heuid, Integer start,
			Integer size) {
		try {
			User user = (User)session.getAttribute("user");
			ReturnParam<Community> cParam = new ReturnParam<Community>();
			if (user != null) {
				List<Community> communities = new ArrayList<Community>();
				List<Community> list = communityMapper.findCommunityByMy(heuid, (start-1)*size, size);
				for (Community community : list) {
					community.setContent(new String(HelpUtil.decode(community.getContent())));
					// 解析源代码
					Document document = Jsoup.parse(community.getContent());
					// 获取所有图片的地址<img src="" alt="" width="" height=""/>
					Elements p = document.getElementsByTag("p");
					Elements img = document.getElementsByTag("img");
					String txt = "";
					String imgs = "";
					for (Element element : p) {
						txt += element.text();
					}
					for (int i = 0; i < img.size(); i++) {
						imgs += img.get(i).attr("src");
						if (i < img.size()-1) {
							imgs+=",";
						}
					}
					community.setCunContext(txt);
					community.setCunimg(imgs);
					communities.add(community);
				}
				cParam.setList(communities);
				cParam.setStart(start);
				cParam.setSize(size);
				cParam.setDataCount(communities.size() != 0 ? communities.get(0).getDataCount() : 0);
				cParam.setCountPage(communities.size() != 0 ? communities.get(0).getDataCount() : 0);
				cParam.setStatus(200);
				return cParam;
			}else {
				cParam.setStatus(404);
				cParam.setUrl("to-login");
				return cParam;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
