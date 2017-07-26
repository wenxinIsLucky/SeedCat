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
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Step;
import com.ymkj.furniture.entity.Technology;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.mapper.StepMapper;
import com.ymkj.furniture.mapper.TechnologyMapper;
import com.ymkj.furniture.service.TechnologyService;
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
 * 2017年7月13日-下午5:04:39
 */
@Service
public class TechnologyServiceImpl implements TechnologyService {
	@Resource
	TechnologyMapper technologyMapper;
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
	 * 添加籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:04:39
	 */
	public Map<String, Object> addTechnology(Technology technology,HttpSession session) {
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
			technology.setContent(HelpUtil.encode(technology.getContent().getBytes()));
			technology.setAuthor("籽匠猫");
			int result = technologyMapper.addTechnology(technology);
			if (result > 0) {
				msg = "发布成功";
				status = 200;
			}else{
				status = 400;
				msg = "发布失败";
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
	 * 修改籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:04:39
	 */
	public Map<String, Object> updTechnologyContent(Technology technology, HttpSession session) {
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
			technology.setContent(HelpUtil.encode(technology.getContent().getBytes()));
			technology.setAuthor("籽匠猫");
			int result = technologyMapper.updTechnologyContent(technology);
			if (result > 0) {
				msg = "修改成功";
				status = 200;
			}else{
				status = 400;
				msg = "修改失败";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "修改失败，请检查网络是否有问题";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 查看籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:04:39
	 */
	public ReturnParam<Technology> findTechnologyByType(ReturnParam<Technology> returnParam, HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			List<Technology> technologies = new ArrayList<Technology>();
			List<Technology> list = technologyMapper.findTechnologyByType(Integer.parseInt(returnParam.getParam()), (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
			for (Technology technology : list) {
				technology.setContent(new String(HelpUtil.decode(technology.getContent())));
				
				// 解析源代码
				Document document = Jsoup.parse(technology.getContent());
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
				technology.setCunContent(txt);
				technology.setCunImg(imgs);
				technologies.add(technology);
			}
			int count = technologies.size() != 0 ?technologies.get(0).getDataCount():0;
			returnParam.setStatus(200);
			returnParam.setList(technologies);
			returnParam.setDataCount(count);
			returnParam.setCountPage(count);
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看籽匠工艺文章详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:04:39
	 */
	public Technology findTechnologyDetailed(int type,String tid,
			HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			Technology technology = technologyMapper.findTechnologyDetailed(type,tid);
			if (technology.getContent() != null) {
				technology.setContent(new String(HelpUtil.decode(technology.getContent())));
			}
			return technology;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午10:32:04
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updTechnologyAllCount(HttpServletRequest request,
			HttpSession session, String param, String tid) {
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
			int result = technologyMapper.updTechnologyAllCount(param, tid);
			if (result > 0) {
				IPSeeker seeker = IPSeeker.getInstance();
				String ipadd = seeker.getIpAddr(request);
				String uid = null;
				if (user != null) {
					uid = user.getUid();
				}
				if (param.equals("zan")) {
					Fabulous fabulous = new Fabulous();
					fabulous.setCid(tid);
					fabulous.setIpadd(ipadd);
					fabulous.setUid(uid);
					result = fabulousMapper.addFabulous(fabulous);
				}else if(param.equals("cai")){
					Step step = new Step();
					step.setCid(tid);
					step.setIpadd(ipadd);
					step.setUid(uid);
					result = stepMapper.addStep(step);
				}else if(param.equals("collection")){
					CommunityCollection communityCollection = new CommunityCollection();
					communityCollection.setCid(tid);
					communityCollection.setUid(uid);
					communityCollection.setType(type);
					communityCollection.setSystem(HelpController.isPcReturn(request));
					result = communityCollectionMapper.addCommunityCollection(communityCollection);
				}
				if (result == 0) {
					throw new RuntimeException("籽匠图文视频新增各种数量出错");
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
