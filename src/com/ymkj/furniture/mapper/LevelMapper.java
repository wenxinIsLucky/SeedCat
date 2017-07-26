package com.ymkj.furniture.mapper;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Level;

public interface LevelMapper {
	/**
	 * 添加等级
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:50:15
	 * @param level
	 * @return
	 */
	public int addLevel(Level level);
	
	/**
	 * 修改等级
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:57:02
	 * @param level
	 * @return
	 */
	public int updLevel(Level level);
	
	/**
	 * 查看等级
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:56:57
	 * @param uid
	 * @return
	 */
	public Level findLevel(@Param("uid")String uid);
}