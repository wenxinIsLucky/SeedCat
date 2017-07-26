package com.ymkj.admin.service;

import com.ymkj.furniture.entity.Jz_config;

/**
 * 
 * @author hxc
 *
 */
public interface Jz_configService {

	/**
	 * 添加配置
	 * @param jz_config
	 * @return
	 */
	public int addJzConfig(Jz_config jz_config);
	
	/**
	 * 查看套餐内指定配置详情
	 * @param jz_config
	 * @return
	 */
	public Jz_config findJzConfig(String jpid);
	
	/**
	 * 查看指定套餐内指定配置的详情
	 * @param jpid
	 * @param jcid
	 * @return
	 */
	public Jz_config findAppointJzPorJzC(String jpid,String jcid);
	
	/**
	 * 编辑指定套餐内指定配置的详情
	 * @param jz_config
	 * @return
	 */
	public int updateAppointJzPorJzC(Jz_config jz_config);
}
