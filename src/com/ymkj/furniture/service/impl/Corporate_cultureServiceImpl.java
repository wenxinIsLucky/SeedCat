package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.ymkj.admin.entity.Administrator;
import com.ymkj.furniture.entity.Corporate_culture;
import com.ymkj.furniture.mapper.ColtdAddressMapper;
import com.ymkj.furniture.mapper.Corporate_cultureMapper;
import com.ymkj.furniture.service.Corporate_cultureService;
import com.ymkj.furniture.util.FirstData;
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
 * 2017年7月14日-下午5:17:19
 */
@Service
public class Corporate_cultureServiceImpl implements Corporate_cultureService {
	@Resource
	Corporate_cultureMapper corporate_cultureMapper;
	@Resource
	ColtdAddressMapper coltdAddressMapper;

	/**
	 * 修改公司文化
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午5:17:19
	 */
	public Map<String, Object> updCorporateCulture(Corporate_culture corporate_culture,HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String url = "";
		String msg = "";
		try {
			Administrator administrator = (Administrator)session.getAttribute("administrator");
			if (administrator == null) {
				msg = "数据有误";
				status = 404;
				url = "admin-loginto";
				return map;
			}
			// 解析源代码
			Document document = Jsoup.parse(corporate_culture.getContent());
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
			corporate_culture.setImgs(imgs);
			corporate_culture.setContent(HelpUtil.encode(txt.getBytes()));
			if (corporate_cultureMapper.updCorporateCulture(corporate_culture) > 0) {
				msg = "操作成功";
				status = 200;
				FirstData.corporate_culture = findCorporateCulture();
			}else{
				msg = "操作失败";
				status = 400;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			msg = "操作有误，请查看网络情况";
			status = 500;
		}
		map.put("status", status);
		map.put("url", url);
		map.put("msg", msg);
		return map;
	}

	/**
	 * 查看公司文化
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-下午5:17:19
	 */
	public Corporate_culture findCorporateCulture() {
		try {
			Corporate_culture corporate_culture = corporate_cultureMapper.findCorporateCulture();
			corporate_culture.setColtdAddresses(coltdAddressMapper.findColtdAddredd());
			if(corporate_culture.getContent() != null || corporate_culture.getContent() != ""){
				corporate_culture.setContent(new String(HelpUtil.decode(corporate_culture.getContent())));
			}
			return corporate_culture;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
}
