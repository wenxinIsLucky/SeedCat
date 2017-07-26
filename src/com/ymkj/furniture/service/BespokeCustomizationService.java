package com.ymkj.furniture.service;






import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ymkj.furniture.entity.BespokeCustomization;
import com.ymkj.furniture.entity.ReturnParam;

public interface BespokeCustomizationService {

	/**
	 * 家装预约定制
	 * @param bespokeCustomization
	 * @return
	 */
	public int addbespokecustomization(BespokeCustomization bespokeCustomization);
	
	/**
	 * 查看所有预约数据
	 * @param handle
	 * @param start
	 * @param end
	 * @return
	 */
	public ReturnParam<BespokeCustomization> findbespokecustomization(Integer handle,Integer start,Integer end);
	
	
	public BespokeCustomization findbespokecustomizationBybcid(Integer bcid);
	
	/**
	 * 处理预约定制数据
	 * @param bespokeCustomization
	 * @return
	 */
	public Map<String, Object> updbespokecustomization(BespokeCustomization bespokeCustomization,HttpServletRequest request);
	
	/**
	 * 删除预约定制数据
	 * @param bcid
	 * @return
	 */
	public Map<String, Object> delbespokecustomization(Integer bcid,HttpServletRequest request);
	
}
