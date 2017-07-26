package com.ymkj.furniture.service;

import java.util.List;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Designer_apply;
import com.ymkj.furniture.entity.ReturnParam;

/**
 * 设计师免费服务申请
 * @author hxc
 *
 */
public interface Designer_applyService {

	/**
	 * 申请预约设计
	 * @param designer_apply
	 * @return
	 */
	public int addDesigner_apply(Designer_apply designer_apply);
	
	/**
	 * 查看当日免费设计服务申请的数据
	 * @return
	 */
	public List<Designer_apply> findtodayDesigner_apply();
	
	/**
	 * 查看所有免费设计服务申请的数据
	 * @param handle
	 * @param start
	 * @param end
	 * @return
	 */
	public ReturnParam<Designer_apply> finddesigner_apply(Integer handle,Integer start,Integer end);
	
	/**
	 * 处理免费设计服务申请的数据
	 * @param designer_apply
	 * @return
	 */
	public Map<String,Object> upddesigner_apply(Designer_apply designer_apply,HttpServletRequest request);
	
	/**
	 * 删除免费设计服务申请的数据
	 * @param dpid
	 * @return
	 */
	public Map<String,Object> deldesigner_apply(@Param("dpid")Integer dpid,HttpServletRequest request);
}
