package com.ymkj.furniture.util;

import java.io.UnsupportedEncodingException;

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
 * 图片存放路径集合
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年5月16日-下午10:34:06
 */
public class IMGPATH {
	//软装图片存放路径
	public static String rz_img = "E:/img/rz_img/";
	//硬装图片存放路径
	public static String yz_img = "E:/img/yz_img/";
	//帖子视频存放路径
	public static String post_video = "E:/img/post/video/";
	//帖子图片存放路径
	public static String post_img = "E:/img/post/images/";
	//设计师头像存放路径
	public static String designer_img = "E:/img/designer_img/";
	//用户头像
	public static String head = "E:/img/head/";
	//轮播图片
	public static String lunbo = "E:/img/lunbo/";
	//设计师案例完工图集
	public static String designer_case_img = "E:/img/designer_case/img/";
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		String bb = new String("\u8bf7\u6c42\u5730\u5740\u51fa\u9519".getBytes(),"UTF-8");
		System.out.println(bb);
	}
}
