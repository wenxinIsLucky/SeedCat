package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
 * 软装套餐项目中的详细
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:21:55
 */
public class Rz_project_info implements Serializable {
	private String rpiid;// 标识，自生成
	private String rppid;// 所属软装套餐项目标识
	private String rpiimg;// 套餐详细主题图
	private String rpiinfo;// 细节点(JSON格式保存)[{}]
	private List<RzInfo> rzInfos;// 转换成对象

	// position --在详细主题图中的位置坐标
	// materialName --所用材料名称
	// model --型号
	// materialCount --所用材料数量
	// materialSize --材料尺寸
	// material --材质

	public Rz_project_info() {
		// 默认创建对象自动生成rpid
		this.rpiid = "rpi_"+HelpUtil.generateUUID();
	}

	public List<RzInfo> getRzInfos() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:26:53
		 */
		return rzInfos;
	}

	public void setRzInfos(List<RzInfo> rzInfos) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:26:53
		 */
		this.rzInfos = rzInfos;
	}

	public String getRpiid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		return rpiid;
	}

	public void setRpiid(String rpiid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		this.rpiid = rpiid;
	}

	public String getRppid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		return rppid;
	}

	public void setRppid(String rppid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		this.rppid = rppid;
	}

	public String getRpiimg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		return rpiimg;
	}

	public void setRpiimg(String rpiimg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		this.rpiimg = rpiimg;
	}

	public String getRpiinfo() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		return rpiinfo;
	}

	public void setRpiinfo(String rpiinfo) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月16日-上午11:24:19
		 */
		this.rpiinfo = rpiinfo;
		JSONArray json = JSONArray.parseArray("[" + rpiinfo + "]");
		List<RzInfo> list = new ArrayList<RzInfo>();
		if (json.size() > 0) {
			for (int i = 0; i < json.size(); i++) {
				JSONObject job = json.getJSONObject(i); // 遍历 jsonarray
														// 数组，把每一个对象转成 json 对象
				RzInfo rzInfo = (RzInfo) JSONObject.toJavaObject(job,
						RzInfo.class);
				list.add(rzInfo);
			}
		}
		this.rzInfos = list;
	}

}
