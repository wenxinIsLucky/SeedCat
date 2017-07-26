package com.ymkj.furniture.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.storage.model.FileListing;
import com.qiniu.util.Auth;

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
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-上午11:57:53
 */
public class QiNiuYunUtil {
	// 设置好账号的ACCESS_KEY和SECRET_KEY
	static String ACCESS_KEY = "XygvjACE_FyfEeW_jQVCfYh0MXtw0n0OHx69dnZ6";
	static String SECRET_KEY = "6-NbemQ-e_DlEu9vehSiPwgyYDJ4yBVGpG6708Ma";
	// 要上传的空间
	//static String bucketname = "head";
	// 上传到七牛后保存的文件名
	static String key = null;

	// /////////////////////指定上传的Zone的信息//////////////////
	// 第一种方式: 指定具体的要上传的zone
	// 注：该具体指定的方式和以下自动识别的方式选择其一即可
	// 要上传的空间(bucket)的存储区域为华东时
	// Zone z = Zone.zone0();
	// 要上传的空间(bucket)的存储区域为华北时
	// Zone z = Zone.zone1();
	// 要上传的空间(bucket)的存储区域为华南时
	// Zone z = Zone.zone2();

	// 简单上传，使用默认策略，只需要设置上传的空间名就可以了
	private static String getUpToken(String bucketname) {
		// 密钥配置
		Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
		return auth.uploadToken(bucketname);
	}

	/**
	 * 上传图片
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月19日-上午11:59:36
	 * @throws IOException
	 */
	public static FileInfo upload(byte[] fileByte,String bucketname) throws IOException {
		try {
			// 第二种方式: 自动识别要上传的空间(bucket)的存储区域是华东、华北、华南。
			Zone z = Zone.autoZone();
			Configuration c = new Configuration(z);
			// 创建上传对象
			UploadManager uploadManager = new UploadManager(c);
			// 调用put方法上传
			Response res = uploadManager.put(fileByte, key, getUpToken(bucketname));
			// 打印返回的信息
			//System.out.println(res.bodyString());
			return res.jsonToObject(FileInfo.class);
		} catch (QiniuException e) {
			Response r = e.response;
			// 请求失败时打印的异常的信息
			System.out.println(r.toString());
			try {
				// 响应的文本信息
				System.out.println(r.bodyString());
			} catch (Exception e1) {
				// ignore
			}
			return null;
		}
	}

	/**
	 * 显示图片
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月19日-下午12:03:22
	 */
	public static List<Map<String, String>> show(int size,String bucketname) {
		List<Map<String, String>> urls = new ArrayList<Map<String,String>>();
		// 第二种方式: 自动识别要上传的空间(bucket)的存储区域是华东、华北、华南。
		Zone z = Zone.autoZone();
		Configuration c = new Configuration(z);
		// 密钥配置
		Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
		// 实例化一个BucketManager对象
		BucketManager bucketManager = new BucketManager(auth, c);

		// 要列举文件的空间名
		try {
			// 调用listFiles方法列举指定空间的指定文件
			// 参数一：bucket 空间名
			// 参数二：prefix 文件名前缀
			// 参数三：marker 上一次获取文件列表时返回的 marker
			// 参数四：limit 每次迭代的长度限制，最大1000，推荐值 100
			// 参数五：delimiter 指定目录分隔符，列出所有公共前缀（模拟列出目录效果）。缺省值为空字符串
			FileListing fileListing = bucketManager.listFiles(bucketname, "Fh",
					null, size, null);
			FileInfo[] items = fileListing.items;
			for (FileInfo fileInfo : items) {
				Map<String,String> map = new HashMap<String,String>();
				map.put("url", fileInfo.key);
				urls.add(map);
			}
		} catch (Exception e) {
			System.out.println("e:" + e.getMessage());
		}
		return urls;
	}
	
	public static void main(String[] args) {
		List<Map<String, String>> list = show(20,"head");
		for (Map<String, String> map : list) {
			System.out.println(map.get("url"));
		}
	}
}
