package com.ymkj.furniture.entity;

import java.io.Serializable;

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
 * 帖子评论提醒
 * 
 * @author lucky(李文鑫) PostReminder PostReminder.java 2016年12月26日-下午3:52:12
 */
public class PostReminder implements Serializable {
	private Integer prid;// 标识
	private String tuid;// 提醒人的id
	private String tname;// 提醒人的名称
	private String thead;// 提醒人的头像
	private String yuid;// 回复人id
	private String yname;// 回复人的名称
	private String yhead;// 回复人的头像
	private String luid;// 楼主id
	private String lname;// 楼主的名称
	private String lhead;// 楼主的头像
	private String wzid;// 文章id
	private String content;// 回复我的评论内容显示
	private String hfType;// 回复类型(回复我的评论，回复我的主题，回复我的帖子，后两个是吧主显示，鼠标移上显示可删除按钮)
	private String title;// 评论的标题
	private Integer floor;// 该评论所属的楼层高度
	private String createDate;// 评论的时间
	private Integer countNum;// 提醒总计数条数
	private Integer countPage;// 提醒总页数
	private int size = 10;// 每次数据条数
	private String cover;// 文章封面
	private String system;// 来自哪端评论

	public String getTname() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return tname;
	}

	public void setTname(String tname) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.tname = tname;
	}

	public String getThead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return thead;
	}

	public void setThead(String thead) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.thead = thead;
	}

	public String getYname() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return yname;
	}

	public void setYname(String yname) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.yname = yname;
	}

	public String getYhead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return yhead;
	}

	public void setYhead(String yhead) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.yhead = yhead;
	}

	public String getLname() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return lname;
	}

	public void setLname(String lname) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.lname = lname;
	}

	public String getLhead() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		return lhead;
	}

	public void setLhead(String lhead) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月11日-下午3:12:23
		 */
		this.lhead = lhead;
	}

	public String getSystem() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:50:33
		 */
		return system;
	}

	public void setSystem(String system) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:50:33
		 */
		this.system = system;
	}

	public String getCover() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:30:58
		 */
		return cover;
	}

	public void setCover(String cover) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:30:58
		 */
		this.cover = cover;
	}

	public int getSize() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:10:14
		 */
		return size;
	}

	public void setSize(int size) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:10:14
		 */
		this.size = size;
	}

	public Integer getCountPage() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:09:51
		 */
		return countPage;
	}

	public void setCountPage(Integer countPage) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:09:51
		 */
		this.countPage = countPage;
	}

	public void setCountNum(Integer countNum) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年7月10日-下午3:09:51
		 */
		this.countNum = countNum;
		this.countPage = countNum % size == 0 ? countNum / size
				: (countNum / size) + 1;
	}

	public String getWzid() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午5:21:59
		 */
		return wzid;
	}

	public void setWzid(String wzid) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午5:21:59
		 */
		this.wzid = wzid;
	}

	public Integer getCountNum() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午4:54:11
		 */
		return countNum;
	}

	public void setCountNum(Integer countNum, Integer size) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午4:54:11
		 */
		this.countNum = countNum % size == 0 ? countNum / size
				: (countNum / size) + 1;
	}

	public Integer getPrid() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return prid;
	}

	public void setPrid(Integer prid) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.prid = prid;
	}

	public String getTuid() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return tuid;
	}

	public void setTuid(String tuid) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.tuid = tuid;
	}

	public String getYuid() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return yuid;
	}

	public void setYuid(String yuid) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.yuid = yuid;
	}

	public String getLuid() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return luid;
	}

	public void setLuid(String luid) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.luid = luid;
	}

	public String getContent() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return content;
	}

	public void setContent(String content) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.content = content;
	}

	public String getHfType() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return hfType;
	}

	public void setHfType(String hfType) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.hfType = hfType;
	}

	public String getTitle() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return title;
	}

	public void setTitle(String title) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.title = title;
	}

	public Integer getFloor() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return floor;
	}

	public void setFloor(Integer floor) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.floor = floor;
	}

	public String getCreateDate() {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		return createDate;
	}

	public void setCreateDate(String createDate) {
		/**
		 * @author lucky(李文鑫) 2016年12月26日-下午3:54:35
		 */
		this.createDate = createDate != null ? createDate.substring(0, 19)
				: createDate;
	}

}
