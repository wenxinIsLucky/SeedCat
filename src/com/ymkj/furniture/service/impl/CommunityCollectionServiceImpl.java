package com.ymkj.furniture.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.CommunityCollection;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.entity.User;
import com.ymkj.furniture.mapper.CommunityCollectionMapper;
import com.ymkj.furniture.service.CommunityCollectionService;
import com.ymkj.furniture.util.HelpController;
import com.ymkj.furniture.util.HelpUtil;

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
 * 2017年6月29日-下午7:29:26
 */
@Service
public class CommunityCollectionServiceImpl implements
		CommunityCollectionService {
	@Resource
	CommunityCollectionMapper communityCollectionMapper;

	/**
	 * 添加收藏
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年6月29日-下午7:29:26
	 */
	public String addCommunityCollection(CommunityCollection communityCollection) {
		try {
			if (communityCollectionMapper.addCommunityCollection(communityCollection) > 0) {
				return "SUCCESS";
			}
			return "FAIL";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "ERROR";
		}
	}

	/**
	 * 查看收藏
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-上午10:46:05
	 */
	public ReturnParam<CommunityCollection> findCommunityCollection(String type,
			int start, int size,HttpSession session,HttpServletRequest request) {
		try {
			if (HelpController.filterParameter(request)) {
				return null;
			}
			ReturnParam<CommunityCollection> param = new ReturnParam<CommunityCollection>();
			User user = (User)session.getAttribute("user");
			if (user != null) {
				param.setStatus(200);
				List<CommunityCollection> collections = new ArrayList<CommunityCollection>();
				List<CommunityCollection> list = communityCollectionMapper.findCommunityCollection(type.toLowerCase(), (start-1)*size, size);
				for (CommunityCollection communityCollection : list) {
					communityCollection.getCommunity().setContent(new String(HelpUtil.decode(communityCollection.getCommunity().getContent())));
					// 解析源代码
					Document document = Jsoup.parse(communityCollection.getCommunity().getContent());
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
					communityCollection.getCommunity().setCunContext(txt.substring(0, 100));
					communityCollection.getCommunity().setCunimg(imgs);
					collections.add(communityCollection);
				}
				param.setStart(start);
				param.setSize(size);
				param.setList(collections);
				param.setCountPage(collections.size() != 0 ? collections.get(0).getDataCount() : 0);
			}else {
				param.setStatus(404);
				param.setUrl("to-login");
			}
			return param;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
