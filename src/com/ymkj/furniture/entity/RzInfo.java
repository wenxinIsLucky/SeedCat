package com.ymkj.furniture.entity;

import java.io.Serializable;

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
 * @author lucky(李文鑫) Email:578581198@qq.com
 * 2017年5月25日-下午3:09:54
 */
public class RzInfo implements Serializable {
	private String position;// 在详细主题图中的位置坐标
	private String materialName;// 所用材料名称
	private String model;// 型号
	private String materialCount;// 所用材料数量
	private String materialSize;// 材料尺寸
	private String material;// 材质
	private int top;
	private int left;

	public int getTop() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月25日-下午2:38:46
		 */
		return top;
	}

	public void setTop(int top) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月25日-下午2:38:46
		 */
		this.top = top;
	}

	public int getLeft() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月25日-下午2:38:46
		 */
		return left;
	}

	public void setLeft(int left) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月25日-下午2:38:46
		 */
		this.left = left;
	}

	public String getPosition() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return position;
	}

	public void setPosition(String position) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.position = position;
		String[] params = position.split(",");
		this.left = Integer.parseInt(params[0]);
		this.top = Integer.parseInt(params[1]);
	}

	public String getMaterialName() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return materialName;
	}

	public void setMaterialName(String materialName) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.materialName = materialName;
	}

	public String getModel() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return model;
	}

	public void setModel(String model) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.model = model;
	}

	public String getMaterialCount() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return materialCount;
	}

	public void setMaterialCount(String materialCount) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.materialCount = materialCount;
	}

	public String getMaterialSize() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return materialSize;
	}

	public void setMaterialSize(String materialSize) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.materialSize = materialSize;
	}

	public String getMaterial() {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		return material;
	}

	public void setMaterial(String material) {
		/**
		 * @author lucky(李文鑫) Email:578581198@qq.com 2017年5月24日-下午5:23:13
		 */
		this.material = material;
	}
}
