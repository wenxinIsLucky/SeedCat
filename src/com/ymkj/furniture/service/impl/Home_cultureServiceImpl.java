package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ymkj.furniture.entity.CommunityCollection;
import com.ymkj.furniture.entity.Fabulous;
import com.ymkj.furniture.entity.Home_culture;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.mapper.FabulousMapper;
import com.ymkj.furniture.mapper.Home_cultureMapper;
import com.ymkj.furniture.service.Home_cultureService;
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
 * 2017年7月5日-上午11:35:54
 */
@Service
public class Home_cultureServiceImpl implements Home_cultureService {
	@Resource
	Home_cultureMapper home_cultureMapper;
	//收藏
	@Resource
	CommunityCollectionMapper communityCollectionMapper;
	//赞
	@Resource
	FabulousMapper fabulousMapper;

	/**
	 * 分页查看每个类型的数据 
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	public ReturnParam<Home_culture> findHomeCultureAll(int type, int start,
			int size, HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			ReturnParam<Home_culture> param = new ReturnParam<Home_culture>();
			param.setStart(start);
			param.setSize(size);
			List<Home_culture> list = home_cultureMapper.findHomeCultureAll(type, (start-1)*size, size);
			param.setList(list);
			param.setCountPage(list.size() != 0 ? list.get(0).getDataCount() : 0);
			param.setStatus(200);
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 前几的最新文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	public ReturnParam<Home_culture> findHomeCultureByDate(int start, int size,
			HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			ReturnParam<Home_culture> param = new ReturnParam<Home_culture>();
			param.setStart(start);
			param.setSize(size);
			List<Home_culture> list = home_cultureMapper.findHomeCultureByDate((start-1)*size, size);
			param.setList(list);
			param.setStatus(200);
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	/**
	 * 前几的推荐文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	public ReturnParam<Home_culture> findHomeCultureByTuiJian(int start, int size,
			HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			ReturnParam<Home_culture> param = new ReturnParam<Home_culture>();
			param.setStart(start);
			param.setSize(size);
			List<Home_culture> list = home_cultureMapper.findHomeCultureByTuiJian((start-1)*size, size);
			param.setList(list);
			param.setStatus(200);
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	public Home_culture findHomeCultureInfo(int hcid, int type,HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			Home_culture culture = home_cultureMapper.findHomeCultureInfo(hcid,type);
			culture.setContent(new String(HelpUtil.decode(culture.getContent())));
			return culture;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/**
	 * 新增浏览数,赞数,收藏数
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	@Transactional(value="txManager",propagation=Propagation.REQUIRED,rollbackFor=RuntimeException.class)
	public String updHomeCultureAllCount(String param, int hcid,
			HttpServletRequest request,HttpSession session) {
		try {
			User user = (User)session.getAttribute("user");
			param = param.toLowerCase();
			if(param.equals("collection")){
				return "LOGIN";
			}
			int result = home_cultureMapper.updHomeCultureAllCount(param, hcid);
			if (result > 0) {
				IPSeeker seeker = IPSeeker.getInstance();
				String ipadd = seeker.getIpAddr(request);
				String uid = null;
				if (user != null) {
					uid = user.getUid();
				}
				if (param.equals("zan")) {
					Fabulous fabulous = new Fabulous();
					fabulous.setCid(hcid+"");
					fabulous.setIpadd(ipadd);
					fabulous.setUid(uid);
					result = fabulousMapper.addFabulous(fabulous);
				}else if(param.equals("collection")){
					CommunityCollection communityCollection = new CommunityCollection();
					communityCollection.setCid(hcid+"");
					communityCollection.setUid(uid);
					result = communityCollectionMapper.addCommunityCollection(communityCollection);
				}
				if (result == 0) {
					throw new RuntimeException("文章新增各种数量出错");
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
	 * 新增文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月5日-上午11:35:54
	 */
	public Map<String, Object> addHomeCulture(Home_culture home_culture) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			home_culture.setAuthor("籽匠猫");
			home_culture.setContent(HelpUtil.encode(home_culture.getContent().getBytes()));
			int result = home_cultureMapper.addHomeCulture(home_culture);
			if (result > 0) {
				map.put("url", "admin-culture-home_culture");
				msg = "发表成功";
				status = 200;
			}else{
				status = 400;
				msg = "发表失败，请稍后再试";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			status = 500;
			msg = "发表失败，请检查网络是否有问题";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}
	
}
