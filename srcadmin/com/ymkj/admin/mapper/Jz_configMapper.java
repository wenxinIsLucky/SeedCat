package com.ymkj.admin.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Jz_config;

/**
 * 
 * @author hxc
 *
 */
@Component("adminjz_configMapper")
public interface Jz_configMapper {
	/**
	 * 添加配置
	 * @param Jz_config
	 * @return
	 */
	public int addJzConfig(Jz_config jz_config);
	
	/**
	 * 查看指定套餐内配置详情
	 * @param jpid
	 * @return
	 */
	public Jz_config findJzConfig(@Param("jpid")String jpid);
	
	/**
	 * 查看指定套餐内指定配置的详情
	 * @param jpid
	 * @param jcid
	 * @return
	 */
	public Jz_config findAppointJzPorJzC(@Param("jpid")String jpid,@Param("jcid")String jcid);
	
	/**
	 * 编辑指定套餐内指定的配置的详情
	 * @param jz_config
	 * @return
	 */
	public int updateAppointJzPorJzC(Jz_config jz_config);

}
