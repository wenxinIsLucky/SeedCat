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
import com.ymkj.furniture.entity.CommunityCollection;
import com.ymkj.furniture.entity.Fabulous;
import com.ymkj.furniture.entity.Follow;
import com.ymkj.furniture.entity.Message;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Step;
import com.ymkj.furniture.entity.Sun_home;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.mapper.MessageMapper;
import com.ymkj.furniture.mapper.StepMapper;
import com.ymkj.furniture.mapper.Sun_homeMapper;
import com.ymkj.furniture.service.Sun_homeService;
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
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年7月12日-上午11:43:08
 */
@Service
public class Sun_homeServiceImpl implements Sun_homeService {
	@Resource
	Sun_homeMapper sun_homeMapper;
	@Resource
	MessageMapper messageMapper;
	@Resource
	FollowMapper followMapper;
	//收藏
	@Resource
	CommunityCollectionMapper communityCollectionMapper;
	//赞
	@Resource
	FabulousMapper fabulousMapper;
	//踩
	@Resource
	StepMapper stepMapper;

	/**
	 * 添加晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-上午11:43:08
	 */
	public Map<String, Object> addSunHome(Sun_home sun_home,HttpSession session,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			User user = (User) session.getAttribute("user");
			if (user == null) {
				map.put("status", 404);
				map.put("msg", "LOGIN");
				map.put("url", "to-login");
				return map;
			}
			sun_home.setUid(user.getUid());
			sun_home.setContent(HelpUtil.encode(sun_home.getContent().getBytes()));
			String system = HelpController.isPcReturn(request);
			sun_home.setSystem(system);
			int result = sun_homeMapper.addSunHome(sun_home);
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
	 * 用户查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-上午11:43:08
	 */
	public ReturnParam<Sun_home> findSunHome(ReturnParam<Sun_home> returnParam,HttpSession session,HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			User user = (User)session.getAttribute("user");
			if (user != null) {
				returnParam.setStatus(200);
				String uid = returnParam.getParam();
				List<Sun_home> sun_homes = new ArrayList<Sun_home>();
				if (uid == null) {
					uid = user.getUid();
				}
				List<Sun_home> list = sun_homeMapper.findSunHome(uid, (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
				for (Sun_home sun_home : list) {
					sun_home.setContent(new String(HelpUtil.decode(sun_home.getContent())));
					// 解析源代码
					Document document = Jsoup.parse(sun_home.getContent());
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
					sun_home.setCunContent(txt.substring(0, 200));
					sun_home.setCunImg(imgs);
					sun_homes.add(sun_home);
				}
				int dataCount = sun_homes.size() != 0? sun_homes.get(0).getDataCount() : 0;
				returnParam.setList(sun_homes);
				returnParam.setDataCount(dataCount);
				returnParam.setCountPage(dataCount);
			}else {
				returnParam.setStatus(404);
				returnParam.setUrl("to-login");
			}
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 管理员查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-上午11:43:08
	 */
	public ReturnParam<Sun_home> findSunHomeByAdmin(ReturnParam<Sun_home> returnParam,HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			returnParam.setStatus(200);
			List<Sun_home> sun_homes = new ArrayList<Sun_home>();
			List<Sun_home> list = sun_homeMapper.findSunHomeByAdmin(Integer.valueOf(returnParam.getParam()), (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
			for (Sun_home sun_home : list) {
				sun_home.setContent(new String(HelpUtil.decode(sun_home.getContent())));
				// 解析源代码
				Document document = Jsoup.parse(sun_home.getContent());
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
				sun_home.setCunContent(txt.substring(0, 200));
				sun_home.setCunImg(imgs);
				sun_homes.add(sun_home);
			}
			int dataCount = sun_homes.size() != 0? sun_homes.get(0).getDataCount() : 0;
			returnParam.setList(sun_homes);
			returnParam.setDataCount(dataCount);
			returnParam.setCountPage(dataCount);
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 审核或者软删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-上午11:43:08
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public Map<String, Object> updSunHome(Sun_home sun_home,HttpSession session,HttpServletRequest request,String content) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			Administrator administrator = (Administrator) session.getAttribute("administrator");
			if (administrator == null) {
				map.put("status", 404);
				map.put("msg", "LOGIN");
				map.put("url", "admin-loginto");
				return map;
			}
			int result = sun_homeMapper.updSunHome(sun_home);
			if (result > 0) {
				Message m = new Message();
				m.setContext(content);
				if (sun_home.getExamine() == 1) {
					m.setTitle("晒家审核通过");
					List<Follow> list = followMapper.findFollowByFans(sun_home.getUid(),"0", 0, 10000);
					List<Message> messages = new ArrayList<Message>();
					for (Follow follow : list) {
						Message message = new Message();
						message.setTitle("你关注的"+follow.getFollow().getName()+"有了新的动态");
						message.setContext("你关注的"+follow.getFollow().getName()+"新发表了一篇晒家，赶紧去瞧瞧吧");
						message.setScope(Long.valueOf(0));
						message.setRecUid(follow.getFans().getUid());
						message.setSendUid(null);
						messages.add(message);
					}
					messageMapper.addMessage(messages);
				}else {
					m.setTitle("晒家审核未通过");
				}
				m.setScope(Long.valueOf(0));
				m.setRecUid(sun_home.getUid());
				m.setSendUid(null);
				if (messageMapper.addMessageG(m) == 0) {
					throw new Exception("发送审核结果消息失败");
				}
				msg = "操作成功";
				status = 200;
			}else{
				status = 400;
				msg = "操作失败";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "操作失败，请检查网络是否有问题";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:05:31
	 */
	public Sun_home findSunHomeDetailed(String shid, HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				System.out.println("进了这里面filterParameter");
				return null;
			}
			Sun_home sun = sun_homeMapper.findSunHomeDetailed(shid);
			if (sun.getContent() != null) {
				sun.setContent(new String(HelpUtil.decode(sun.getContent())));
			}
			System.out.println("进了这里面sun");
			return sun;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("进了这里面Exception");
			return null;
		}
	}

	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:46:24
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updSunHomeAllCount(HttpServletRequest request,
			HttpSession session, String param, String shid) {
		try {
			param = param.toLowerCase();
			User user = (User)session.getAttribute("user");
			if(param.indexOf("collection") > -1 && user == null){
				return "LOGIN";
			}
			String type = "";
			if (param.indexOf("collection") > -1) {
				type = param.replace("collection", "");
				param = "collection";
			}
			int result = sun_homeMapper.updSunHomeAllCount(param, shid);
			if (result > 0) {
				IPSeeker seeker = IPSeeker.getInstance();
				String ipadd = seeker.getIpAddr(request);
				String uid = null;
				if (user != null) {
					uid = user.getUid();
				}
				if (param.equals("zan")) {
					Fabulous fabulous = new Fabulous();
					fabulous.setCid(shid);
					fabulous.setIpadd(ipadd);
					fabulous.setUid(uid);
					result = fabulousMapper.addFabulous(fabulous);
				}else if(param.equals("cai")){
					Step step = new Step();
					step.setCid(shid);
					step.setIpadd(ipadd);
					step.setUid(uid);
					result = stepMapper.addStep(step);
				}else if(param.equals("collection")){
					CommunityCollection communityCollection = new CommunityCollection();
					communityCollection.setCid(shid);
					communityCollection.setUid(uid);
					communityCollection.setType(type);
					communityCollection.setSystem(HelpController.isPcReturn(request));
					result = communityCollectionMapper.addCommunityCollection(communityCollection);
				}
				if (result == 0) {
					throw new RuntimeException("晒家新增各种数量出错");
				}
				return "SUCCESS";
			}
			return "FAIL";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "ERROR";
		}
	}
	
}
