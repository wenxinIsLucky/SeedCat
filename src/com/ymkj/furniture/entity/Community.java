package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

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
 * 籽匠社区
 * 
 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:50:37
 */
public class Community implements Serializable {
	private String cid;// 标识
	private String title;// 标题
	private User user;// 发表人
	private int type;// 社区类型 1为话题 2为拍客
	private String cover;// 封面图片
	private String content;// 内容html存储
	private int examine;// 审核 0：待审核 1：审核成功 2：审核失败    3:用户删除
	private int isAdd;// 是否加精 0:否 1:是
	private int zan;// 点赞数量
	private int cai;// 踩数量
	private int browse;// 浏览数量
	private int reply;// 回复数量
	private int collection;// 收藏数量
	private String system;// 用什么系统发表的
	private String createDate;// 发表时间
	private String cunContext;// 纯内容
	private String cunimg;// 纯内容

	// 详情的时候用
	private int fid;// 点赞表中是否存在
	private int sid;// 踩表中是否存在
	private int ccid;// 收藏表中是否存在
	// 该类型数据数量
	private int dataCount;

	public String getCunContext() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午5:15:56
		 */
		return cunContext;
	}

	public void setCunContext(String cunContext) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午5:15:56
		 */
		this.cunContext = cunContext;
	}

	public String getCunimg() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午5:15:56
		 */
		return cunimg;
	}

	public void setCunimg(String cunimg) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午5:15:56
		 */
		this.cunimg = cunimg;
	}

	public int getDataCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午4:28:50
		 */
		return dataCount;
	}

	public String getSystem() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午4:43:29
		 */
		return system;
	}

	public void setSystem(String system) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午4:43:29
		 */
		this.system = system;
	}

	public void setDataCount(int dataCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午4:28:50
		 */
		this.dataCount = dataCount;
	}

	public Community() {
		// 默认创建对象自动生成rpid
		this.cid = HelpUtil.generateUUIDTop("post");
	}

	public int getIsAdd() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-下午5:26:58
		 */
		return isAdd;
	}

	public void setIsAdd(int isAdd) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月4日-下午5:26:58
		 */
		this.isAdd = isAdd;
	}

	public int getFid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		return fid;
	}

	public void setFid(int fid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		this.fid = fid;
	}

	public int getSid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		return sid;
	}

	public void setSid(int sid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		this.sid = sid;
	}

	public int getCcid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		return ccid;
	}

	public void setCcid(int ccid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月29日-下午6:10:16
		 */
		this.ccid = ccid;
	}

	public String getCid() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return cid;
	}

	public void setCid(String cid) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.cid = cid;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return title;
	}

	public int getBrowse() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:33:51
		 */
		return browse;
	}

	public void setBrowse(int browse) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:33:51
		 */
		this.browse = browse;
	}

	public int getReply() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:33:51
		 */
		return reply;
	}

	public void setReply(int reply) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月28日-上午1:33:51
		 */
		this.reply = reply;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.title = title;
	}

	public User getUser() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return user;
	}

	public void setUser(User user) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.user = user;
	}

	public int getType() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return type;
	}

	public void setType(int type) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.type = type;
	}

	public String getCover() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午3:49:21
		 */
		return cover;
	}

	public void setCover(String cover) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午3:49:21
		 */
		this.cover = cover;
	}

	public String getContent() throws UnsupportedEncodingException {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		// return content!=null?new
		// String(Base64.decodeBase64(content.getBytes("UTF-8"))):content;
		return content;
	}

	public void setContent(String content) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.content = content;
	}

	public int getExamine() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午5:36:15
		 */
		return examine;
	}

	public void setExamine(int examine) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-下午5:36:15
		 */
		this.examine = examine;
	}

	public int getZan() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return zan;
	}

	public void setZan(int zan) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.zan = zan;
	}

	public int getCai() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return cai;
	}

	public void setCai(int cai) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.cai = cai;
	}

	public int getCollection() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return collection;
	}

	public void setCollection(int collection) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.collection = collection;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年6月27日-上午11:52:39
		 */
		this.createDate = createDate != null ? createDate.substring(0, 19)
				: createDate;
	}

}
