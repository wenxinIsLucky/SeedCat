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
import com.ymkj.furniture.entity.Classic_case;
import com.ymkj.furniture.entity.CommunityCollection;
import com.ymkj.furniture.entity.Fabulous;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.Step;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.Classic_caseMapper;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.mapper.FollowMapper;
import com.ymkj.furniture.mapper.StepMapper;
import com.ymkj.furniture.service.Classic_caseService;
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
 * 2017年7月14日-上午11:46:41
 */
@Service
public class Classic_caseServiceImpl implements Classic_caseService {
	@Resource
	Classic_caseMapper classic_caseMapper;
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
	 * 添加经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:46:42
	 */
	public Map<String, Object> addClassicCase(Classic_case classic_case,
			HttpSession session) {
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
			classic_case.setContent(HelpUtil.encode(classic_case.getContent().getBytes()));
			classic_case.setAuthor("籽匠猫");
			int result = classic_caseMapper.addClassicCase(classic_case);
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
	 * 分页查看经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:46:42
	 */
	public ReturnParam<Classic_case> findClassicCaseByType(
			ReturnParam<Classic_case> returnParam,
			HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			List<Classic_case> cases = new ArrayList<Classic_case>();
			List<Classic_case> list = classic_caseMapper.findClassicCaseByType(Integer.parseInt(returnParam.getParam()), (returnParam.getStart()-1)*returnParam.getSize(), returnParam.getSize());
			for (Classic_case c : list) {
				c.setContent(new String(HelpUtil.decode(c.getContent())));
				
				// 解析源代码
				Document document = Jsoup.parse(c.getContent());
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
				c.setCunContent(txt);
				c.setCunImg(imgs);
				cases.add(c);
			}
			int count = cases.size() != 0 ?cases.get(0).getDataCount():0;
			returnParam.setStatus(200);
			returnParam.setList(cases);
			returnParam.setDataCount(count);
			returnParam.setCountPage(count);
			return returnParam;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:46:42
	 */
	public Classic_case findClassicCaseDetailed(int type,String ccid,
			HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			Classic_case classic_case = classic_caseMapper.findClassicCaseDetailed(type,ccid);
			if (classic_case.getContent() != null) {
				classic_case.setContent(new String(HelpUtil.decode(classic_case.getContent())));
				// 解析源代码
				Document document = Jsoup.parse(classic_case.getContent());
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
				classic_case.setCunContent(txt);
				classic_case.setCunImg(imgs);
			}
			return classic_case;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 修改经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:46:42
	 */
	public Map<String, Object> updClassicCaseContent(Classic_case classic_case,
			HttpSession session) {
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
			classic_case.setContent(HelpUtil.encode(classic_case.getContent().getBytes()));
			classic_case.setAuthor("籽匠猫");
			int result = classic_caseMapper.updClassicCaseContent(classic_case);
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
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午10:45:03
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	public String updClassicCaseAllCount(HttpServletRequest request,
			HttpSession session, String param, String ccid) {
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
			int result = classic_caseMapper.updclassic_caseAllCount(param, ccid);
			if (result > 0) {
				IPSeeker seeker = IPSeeker.getInstance();
				String ipadd = seeker.getIpAddr(request);
				String uid = null;
				if (user != null) {
					uid = user.getUid();
				}
				if (param.equals("zan")) {
					Fabulous fabulous = new Fabulous();
					fabulous.setCid(ccid);
					fabulous.setIpadd(ipadd);
					fabulous.setUid(uid);
					result = fabulousMapper.addFabulous(fabulous);
				}else if(param.equals("cai")){
					Step step = new Step();
					step.setCid(ccid);
					step.setIpadd(ipadd);
					step.setUid(uid);
					result = stepMapper.addStep(step);
				}else if(param.equals("collection")){
					CommunityCollection communityCollection = new CommunityCollection();
					communityCollection.setCid(ccid);
					communityCollection.setUid(uid);
					communityCollection.setType(type);
					communityCollection.setSystem(HelpController.isPcReturn(request));
					result = communityCollectionMapper.addCommunityCollection(communityCollection);
				}
				if (result == 0) {
					throw new RuntimeException("经典案例新增各种数量出错");
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
