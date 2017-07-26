package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Technology;

public interface TechnologyMapper {
	/**
	 * 添加籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午4:59:47
	 * @param technology
	 * @return
	 */
	public int addTechnology(Technology technology);
	
	/**
	 * 修改籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午4:59:55
	 * @param technology
	 * @return
	 */
	public int updTechnologyContent(Technology technology);
	
	/**
	 * 查看籽匠工艺文章
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:00:04
	 * @param type
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Technology> findTechnologyByType(@Param("type")int type,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 查看籽匠工艺文章详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月13日-下午5:00:12
	 * @param tid
	 * @return
	 */
	public Technology findTechnologyDetailed(@Param("type")int type,@Param("tid")String tid);
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月18日-下午10:31:25
	 * @param param
	 * @param tid
	 * @return
	 */
	public int updTechnologyAllCount(@Param("param")String param,@Param("tid")String tid);
}