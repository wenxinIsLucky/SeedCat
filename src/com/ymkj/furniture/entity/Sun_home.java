package com.ymkj.furniture.entity;

import java.io.Serializable;

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
 * 业主晒家
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:44:05
 */
public class Sun_home implements Serializable {
	private String shid;// 标识
	private String title;// 标题
	private String uid;// 作者uid
	private String name;// 作者名称
	private String head;// 作者头像
	private String cover;// 封面
	private String content;// 内容
	private int zan;// 赞
	private int collection;// 收藏数量
	private int browse;// 浏览数量
	private int examine;// 审核
	private String system;// 什么系统
	private String createDate;// 发布时间
	private int dataCount;//
	private String cunContent;// 纯文本
	private String cunImg;// 纯图片
	private String parentId;// 上一篇id
	private String parentTitle;// 上一篇标题
	private String nextId;// 下一篇id
	private String nextTitle;// 下一篇标题
	// 详情的时候用
	private int fid;// 点赞表中是否存在
	private int ccid;// 收藏表中是否存在

	public Sun_home() {
		this.shid = HelpUtil.generateUUIDTop("sun_home");
	}

	public int getFid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午3:34:01
		 */
		return fid;
	}

	public void setFid(int fid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午3:34:01
		 */
		this.fid = fid;
	}

	public int getCcid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午3:34:01
		 */
		return ccid;
	}

	public void setCcid(int ccid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午3:34:01
		 */
		this.ccid = ccid;
	}

	public String getParentId() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		return parentId;
	}

	public void setParentId(String parentId) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		this.parentId = parentId;
	}

	public String getParentTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		return parentTitle;
	}

	public void setParentTitle(String parentTitle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		this.parentTitle = parentTitle;
	}

	public String getNextId() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		return nextId;
	}

	public void setNextId(String nextId) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		this.nextId = nextId;
	}

	public String getNextTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		return nextTitle;
	}

	public void setNextTitle(String nextTitle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午6:02:08
		 */
		this.nextTitle = nextTitle;
	}

	public String getName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午4:26:36
		 */
		return name;
	}

	public void setName(String name) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午4:26:36
		 */
		this.name = name;
	}

	public String getHead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午4:26:36
		 */
		return head;
	}

	public void setHead(String head) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午4:26:36
		 */
		this.head = head;
	}

	public String getCunContent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午3:26:15
		 */
		return cunContent;
	}

	public void setCunContent(String cunContent) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午3:26:15
		 */
		this.cunContent = cunContent;
	}

	public String getCunImg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午3:26:15
		 */
		return cunImg;
	}

	public void setCunImg(String cunImg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月12日-下午3:26:15
		 */
		this.cunImg = cunImg;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午5:18:17
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午5:18:17
		 */
		this.dataCount = dataCount;
	}

	public String getSystem() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午5:17:45
		 */
		return system;
	}

	public void setSystem(String system) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午5:17:45
		 */
		this.system = system;
	}

	public String getShid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return shid;
	}

	public void setShid(String shid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.shid = shid;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return title;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.title = title;
	}

	public String getUid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return uid;
	}

	public void setUid(String uid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.uid = uid;
	}

	public String getCover() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return cover;
	}

	public void setCover(String cover) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.cover = cover;
	}

	public String getContent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return content;
	}

	public void setContent(String content) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.content = content;
	}

	public int getZan() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return zan;
	}

	public void setZan(int zan) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.zan = zan;
	}

	public int getCollection() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return collection;
	}

	public void setCollection(int collection) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.collection = collection;
	}

	public int getBrowse() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return browse;
	}

	public void setBrowse(int browse) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.browse = browse;
	}

	public int getExamine() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return examine;
	}

	public void setExamine(int examine) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.examine = examine;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:46:13
		 */
		this.createDate = createDate;
	}

}
