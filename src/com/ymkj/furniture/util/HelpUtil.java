package com.ymkj.furniture.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import sun.misc.BASE64Decoder;

/*by lucky 2016  
 //						   _ooOoo_							              _ooOoo_    
 //						  o8888888o							             o8888888o    
 //						  88" . "88							             88" . "88    
 //						  (| -_- |)							             (| -_- |)    
 //						  O\  =  /O							             O\  =  /O    
 //					   ____/`---'\____						   	      ____/`---'\____    
 //					 .'  \\|     |//  `.						      .   ' \\| |// `.    
 //					/  \\|||  :  |||//  \						     / \\||| : |||//  \    
 //				   /  _||||| -:- |||||-  \						    / _||||| -:- |||||- \    
 //				   |   | \\\  -  /// |   |						    |   | \\\ - /// |   |    
 //				   | \_|  ''\---/''  |   |						    | \_| ''\---/'' |   |    
 //				   \  .-\__  `-`  ___/-. /						     \ .-\__ `-` ___/-. /    
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
 * 工具类
 * 
 * @author Lucky(李文鑫)
 * @date 2016-5-11 下午6:44:13
 * @version 1.0
 */
public class HelpUtil {
	public static final String ALLCHAR = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
	public static final String ALLCHAR2 = "qwertyuiopasdfghjklzxcvbnm0123456789QWERTYUIOPASDFGHJKLZXCVBNM";
	private static final String ORDER_TITLE = "MJ";

	/**
	 * 生成制定范围内的随机数
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-7-5 下午10:39:31
	 * @version 1.0
	 * @param min
	 * @param max
	 * @return
	 */
	public static Integer createRandom(int min, int max) {
		Random random = new Random();
		int s = random.nextInt(max) % (max - min + 1) + min;
		return s;
	}

	/**
	 * Note:生成自定长度随机数字
	 * 
	 * @author pen 2016-7-22
	 * @param length
	 */
	public static String randomNum(int length) {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < length; i++) {
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}

	/**
	 * 生成id
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-5-11 下午6:49:28
	 * @version 1.0
	 * @param length
	 *            生成自己定义的长度id
	 * @return 生成好的id
	 */
	public static String generateId(int length) {
		// 创建一个stringbuffer对象来拼接随机获取的字符
		StringBuffer sb = new StringBuffer();
		// 创建生成随机数的对象
		Random random = new Random();
		// 根据自己定义的长度来获取多长的随机id
		for (int i = 0; i < length; i++) {
			sb.append(ALLCHAR.charAt(random.nextInt(ALLCHAR.length())));
		}
		return sb.toString();
	}

	/**
	 * 生成id
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-5-11 下午6:49:28
	 * @version 1.0
	 * @param tou
	 *            需要加的前缀
	 * @return 生成好的id
	 */
	public static String generateUUIDTop(String tou) {
		// 系统创建出来一个uuid
		String value = UUID.randomUUID().toString();
		// 将系统创建的uuid中的-都去掉
		return tou + value.replace("-", "");
	}

	/**
	 * 生成uuid
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-5-11 下午6:49:28
	 * @version 1.0
	 * @return 修改好的系统创建出来一个uuid
	 */
	public static String generateUUID() {
		// 系统创建出来一个uuid
		String value = UUID.randomUUID().toString();
		// 将系统创建的uuid中的-都去掉
		return value.replace("-", "");
	}

	public static synchronized String getOrderDh() {
		long dateTime = System.currentTimeMillis();
		String sjf = randomNum(3);
		String oldOid = ORDER_TITLE + dateTime;
		return oldOid.replaceAll(oldOid.substring(14, 17), sjf);
	}

	/**
	 * double 相加
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double sum(double d1, double d2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(d1));
		BigDecimal bd2 = new BigDecimal(Double.toString(d2));
		return bd1.add(bd2).doubleValue();
	}

	/**
	 * double 相减
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double sub(double d1, double d2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(d1));
		BigDecimal bd2 = new BigDecimal(Double.toString(d2));
		return bd1.subtract(bd2).doubleValue();
	}

	/**
	 * double 乘法
	 * 
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static double mul(double d1, double d2) {
		BigDecimal bd1 = new BigDecimal(Double.toString(d1));
		BigDecimal bd2 = new BigDecimal(Double.toString(d2));
		return bd1.multiply(bd2).doubleValue();
	}

	/**
	 * double 除法
	 * 
	 * @param d1
	 * @param d2
	 * @param scale
	 *            四舍五入 小数点位数
	 * @return
	 */
	public static double div(double d1, double d2, int scale) {
		// 当然在此之前，你要判断分母是否为0，
		// 为0你可以根据实际需求做相应的处理
		BigDecimal bd1 = new BigDecimal(Double.toString(d1));
		BigDecimal bd2 = new BigDecimal(Double.toString(d2));
		return bd1.divide(bd2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 时间的比较
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-9-7 下午2:18:59
	 * @version 1.0
	 * @return 1大于  -1小于  0等于
	 */
	public static int compare_date(String DATE1, String DATE2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:sm");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * 时间的比较
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月6日-下午6:33:59
	 * @param DATE1
	 * @param DATE2
	 * @return 1大于  -1小于  0等于
	 */
	public static int compare_date(String DATE1, Date DATE2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:sm");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = DATE2;
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

	/**
	 * 判断日期是否为同一天
	 * 
	 * @author Lucky(李文鑫)
	 * @date 2016-9-9 下午22:45:59
	 * @version 1.0
	 */
	public static boolean isSameDate(Date date1, Date date2) {
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(date1);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		boolean isSameYear = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		boolean isSameMonth = isSameYear
				&& cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean isSameDate = isSameMonth
				&& cal1.get(Calendar.DAY_OF_MONTH) == cal2
						.get(Calendar.DAY_OF_MONTH);
		return isSameDate;
	}

	/**
	 * 是否是正整数
	 * 
	 * @author lucky(李文鑫) HelpUtil.java 2017年2月13日-上午11:31:38
	 * @param str
	 * @return false:否 true:是
	 */
	public static boolean isNum(String str) {
		String pattern = "[0-9]\\d*";
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(str);
		return m.matches();
	}

	/**
	 * 将string装成utf-8存储
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午4:43:34
	 * @param xml
	 * @return
	 */
	public static String getUTF8XMLString(String xml) {
		StringBuffer sb = new StringBuffer();
		sb.append(xml);
		String xmString = "";
		String xmlUTF8 = "";
		try {
			xmString = new String(sb.toString().getBytes("UTF-8"));
			System.out.println("getBytes编码：" + xmString);
			xmlUTF8 = URLEncoder.encode(xmString, "UTF-8");
			System.out.println("utf-8 编码：" + xmlUTF8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xmlUTF8;
	}

	/**
	 * 编码
	 * 
	 * @param bstr
	 * @return String
	 */
	public static String encode(byte[] bstr) {
		return new sun.misc.BASE64Encoder().encode(bstr);
	}

	/**
	 * 解码
	 * 
	 * @param str
	 * @return string
	 */
	public static byte[] decode(String str) {
		byte[] bt = null;
		try {
			sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();
			bt = decoder.decodeBuffer(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bt;
	}

	/**
	 * 将 s 进行 BASE64 编码
	 * 
	 * @return String
	 * @author lifq
	 * @date 2015-3-4 上午09:24:02
	 */
	public static String encodeTwo(String s) {
		if (s == null)
			return null;
		String res = "";
		try {
			res = new sun.misc.BASE64Encoder().encode(s.getBytes("UTF-8"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	/**
	 * 将 BASE64 编码的字符串 s 进行解码
	 * 
	 * @return String
	 * @author lifq
	 * @date 2015-3-4 上午09:24:26
	 */
	public static String decodeTwo(String s) {
		if (s == null)
			return null;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] b = decoder.decodeBuffer(s);
			return new String(b, "UTF-8");
		} catch (Exception e) {
			return null;
		}
	}
	
	/**
	 * 删除数据库路径同时删除本地相应目录无用图片
	 * 
	 * @param path 本地路径
	 * @param filename 图片名称
	 */
	public static void delFile(String path,String filename){
		File file = new File(path+filename);
		if(file.exists()&&file.isFile()){
			file.delete();
			System.out.println("删除图片成功！"+file.getName());
		}else{
			System.out.println("删除图片失败！"+file.getName());
		}
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(findStringInFile("E://a.json","否被磨"));
	}

	/**
	 * 到本地每天的点赞，踩的文件中查看有没有当前用户的名称
	 * 
	 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午5:28:30
	 * @param path
	 * @param str
	 * @return
	 * @throws Exception
	 */
	public static boolean findStringInFile(String path, String str)
			throws Exception {
		File file = new File(path);
		InputStreamReader read = new InputStreamReader(
				new FileInputStream(file), "UTF-8");// 考虑到编码格式
		BufferedReader bufferedReader = new BufferedReader(read);
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			if (line.startsWith("#")) {
				continue;
			}
			// 指定字符串判断处
			if (line.contains(str)) {
				return true;
			}
		}
		return false;
	}
}
