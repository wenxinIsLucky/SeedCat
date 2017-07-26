package com.ymkj.furniture.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Designer_apply;
@Component("designer_applyMapper")
public interface Designer_applyMapper {

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
	public List<Designer_apply> finddesigner_apply(@Param("handle")Integer handle,@Param("start")Integer start,@Param("end")Integer end);
		
	/**
	 * 处理免费设计服务申请的数据
	 * @param designer_apply
	 * @return
	 */
	public int upddesigner_apply(Designer_apply designer_apply);
	
	/**
	 * 删除免费设计服务申请的数据
	 * @param dpid
	 * @return
	 */
	public int deldesigner_apply(@Param("dpid")Integer dpid);
}
