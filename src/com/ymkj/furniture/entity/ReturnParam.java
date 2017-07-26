package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

/*by lucky 2016  
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
 * post返回参数装载对象
 * 
 * @author lucky(李文鑫) ReturnParam ReturnParam.java 2017年1月2日-下午3:57:24
 */
public class ReturnParam<T> implements Serializable {
	/**
	 * return -1:未激活 110:参数缺失 200:成功 300:失败 404:会话失效 500:参数含有敏感东西
	 * 如：特殊符号，script注入
	 */
	private int status;// 状态码
	private int start;// 当前页码
	private int current;// 当前页码
	private int countPage;// 页码集合
	private int size;// 每次的条数
	private List<?> list;// 集合数据
	private T t;// 类
	private String msg;// 提示消息
	private String url;// 跳转url
	private int dataCount;// 该类型的数据条数
	private String param;// 参数

	public String getParam() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:23:20
		 */
		return param;
	}

	public void setParam(String param) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:23:20
		 */
		this.param = param;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午12:37:19
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午12:37:19
		 */
		this.dataCount = dataCount;
	}

	public String getMsg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:21:27
		 */
		return msg;
	}

	public void setMsg(String msg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:21:27
		 */
		this.msg = msg;
	}

	public String getUrl() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:21:27
		 */
		return url;
	}

	public void setUrl(String url) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-上午11:21:27
		 */
		this.url = url;
	}

	public int getStatus() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return status;
	}

	public void setStatus(int status) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		this.status = status;
	}

	public int getCurrent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:23:01
		 */
		return current;
	}

	public void setCurrent(int current) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午4:23:01
		 */
		this.current = current;
	}

	public int getStart() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return start;
	}

	public void setStart(int start) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		this.start = start;
	}

	public int getCountPage() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return countPage;
	}

	public void setCountPage(int countPage) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		if (this.size != 0) {
			this.countPage = countPage % this.size == 0 ? (countPage / this.size)
					: (countPage / this.size) + 1;
		} else {
			this.countPage = countPage;
		}
	}

	public int getSize() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return size;
	}

	public void setSize(int size) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		this.size = size;
	}

	public List<?> getList() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return list;
	}

	public void setList(List<?> list) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		this.list = list;
	}

	public T getT() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		return t;
	}

	public void setT(T t) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午10:28:43
		 */
		this.t = t;
	}

}
