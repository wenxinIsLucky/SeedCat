package com.ymkj.furniture.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午3:31:18
 */
public class ReadFile {
	/**
	 * 读取(单个)
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午3:39:31
	 * @throws Exception
	 */
	public static void load(String fileName) throws Exception {
		Properties ps = new Properties();
		InputStream is = new FileInputStream(fileName);
		ps.load(is);
		is.close();
		Set<String> set = ps.stringPropertyNames();
		for (String string : set) {
			String value = ps.getProperty(string);
			System.out.println(string + " - " + value);
		}
		System.out.println(ps.toString());
	}

	/**
	 * 读取(多个)
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午3:39:31
	 * @throws Exception
	 */
	public static List<GongSi> loads(String fileName) throws Exception {
		List<GongSi> list = new ArrayList<GongSi>();
		Properties ps = new Properties();
		InputStream is = new FileInputStream(fileName);
		ps.load(is);
		is.close();
		Set<String> set = ps.stringPropertyNames();
		for (String string : set) {
			String value = ps.getProperty(string);
			System.out.println(string + " - " + value);
		}
		JSONArray array = JSON.parseArray("[{address:\"123\"},{address:\"456\"}]");
		for (Object object : array) {
			GongSi obj = JSONObject.toJavaObject(JSON.parseObject(object.toString()), GongSi.class);
			list.add(obj);
		}
		return list;
	}

	/**
	 * 写入
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午3:39:26
	 * @throws Exception
	 */
	public static void propertiesDemo(String fileName, Properties properties)
			throws Exception {
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		Properties ps = properties;
		// 想要将这个集合中的字符串键值信息持久化存储到文件中，需要关联输出流
		FileOutputStream fos = new FileOutputStream(file);
		// 将集合中的数据存储到文件中，使用store方法
		ps.store(fos, "gsContent");// 第二个参数是对这个表的描述
		fos.close();
	}

	public static void main(String[] args) {
		/*
		 * Properties ps = new Properties(); try { ps.setProperty("addredd",
		 * "[深圳市深圳区深圳大道深圳工业区杍匠猫家具城;北京市朝阳区北京市朝阳区北京市朝阳区]");
		 * ps.setProperty("youbian", "[518000;100888]"); ps.setProperty("phone",
		 * "[4000-888-888;010-8888 8888，010-9999 9999]");
		 * ps.setProperty("chuangzhen", "[0755-8888 8888;010-9999 9999]");
		 * ps.setProperty("email", "[zjmao@888.com]");
		 * propertiesDemo("C:/lucky.txt", ps); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
		try {
			load("C:/lucky.txt");
			//loads();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class GongSi {
	private String address;
	private String email;
	private String chuangzhen;
	private String youbian;
	private String phone;

	public String getAddress() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		return address;
	}

	public void setAddress(String address) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		this.address = address;
	}

	public String getEmail() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		return email;
	}

	public void setEmail(String email) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		this.email = email;
	}

	public String getChuangzhen() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		return chuangzhen;
	}

	public void setChuangzhen(String chuangzhen) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		this.chuangzhen = chuangzhen;
	}

	public String getYoubian() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		return youbian;
	}

	public void setYoubian(String youbian) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		this.youbian = youbian;
	}

	public String getPhone() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		return phone;
	}

	public void setPhone(String phone) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月14日-下午4:00:08
		 */
		this.phone = phone;
	}

}
