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
 * 籽匠工艺
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:37:48
 */
public class Technology implements Serializable {
	private String tid;// 标识
	private String title;// 标识
	private int type;// 类型0:视频 1:图文
	private String url;// 视频链接,图文不需
	private String author;// 作者
	private String cover;// 封面
	private String content;// 内容
	private int zan;// 赞
	private int collection;// 收藏数量
	private int browse;// 浏览数量
	private String createDate;// 发布时间
	private int dataCount;// 该类型数据总数
	private String cunContent;// 纯文本
	private String cunImg;// 纯图片
	private String parentId;// 上一篇id
	private String parentTitle;// 上一篇标题
	private String nextId;// 下一篇id
	private String nextTitle;// 下一篇标题
	// 详情的时候用
	private int fid;// 点赞表中是否存在
	private int ccid;// 收藏表中是否存在

	public Technology() {
		this.tid = HelpUtil.generateUUIDTop("technology");
	}

	public String getCunContent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return cunContent;
	}

	public void setCunContent(String cunContent) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.cunContent = cunContent;
	}

	public String getCunImg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return cunImg;
	}

	public void setCunImg(String cunImg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.cunImg = cunImg;
	}

	public String getParentId() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return parentId;
	}

	public void setParentId(String parentId) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.parentId = parentId;
	}

	public String getParentTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return parentTitle;
	}

	public void setParentTitle(String parentTitle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.parentTitle = parentTitle;
	}

	public String getNextId() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return nextId;
	}

	public void setNextId(String nextId) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.nextId = nextId;
	}

	public String getNextTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return nextTitle;
	}

	public void setNextTitle(String nextTitle) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.nextTitle = nextTitle;
	}

	public int getFid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return fid;
	}

	public void setFid(int fid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.fid = fid;
	}

	public int getCcid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		return ccid;
	}

	public void setCcid(int ccid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:51:12
		 */
		this.ccid = ccid;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:50:20
		 */
		return dataCount;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月13日-下午4:50:20
		 */
		this.dataCount = dataCount;
	}

	public String getTid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return tid;
	}

	public void setTid(String tid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.tid = tid;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return title;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.title = title;
	}

	public int getType() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return type;
	}

	public void setType(int type) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.type = type;
	}

	public String getUrl() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return url;
	}

	public void setUrl(String url) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.url = url;
	}

	public String getAuthor() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return author;
	}

	public void setAuthor(String author) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.author = author;
	}

	public String getCover() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return cover;
	}

	public void setCover(String cover) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.cover = cover;
	}

	public String getContent() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return content;
	}

	public void setContent(String content) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.content = content;
	}

	public int getZan() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return zan;
	}

	public void setZan(int zan) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.zan = zan;
	}

	public int getCollection() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return collection;
	}

	public void setCollection(int collection) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.collection = collection;
	}

	public int getBrowse() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return browse;
	}

	public void setBrowse(int browse) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.browse = browse;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月6日-下午5:40:18
		 */
		this.createDate = createDate;
	}

}
