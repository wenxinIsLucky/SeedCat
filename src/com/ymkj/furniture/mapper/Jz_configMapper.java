package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Jz_config;

/**
 * 
 * @author hxc
 *
 */
public interface Jz_configMapper {
	/**
	 * 添加配置
	 * @param Jz_config
	 * @return
	 *//*
	public int addJzConfig(Jz_config jz_config);
	
	*//**
	 * 查看指定套餐内配置详情
	 * @param jpid
	 * @return
	 */
	public List<Jz_config> findJzConfigz(@Param("jpid")String jpid);
	
	/**
	 * 查看指定配置内材料的详情
	 * @param jpid
	 * @return
	 */
	public List<Jz_config> findJzCorJzM(@Param("jpid")String jpid);
	
	/**
	 * 编辑指定套餐内指定的配置的详情
	 * @param jz_config
	 * @return
	 *//*
	public int updateAppointJzPorJzC(Jz_config jz_config);*/

}
