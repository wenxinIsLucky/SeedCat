package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Sun_home;

public interface Sun_homeMapper {
	/**
	 * 添加晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:21:41
	 * @param sun_home
	 * @return
	 */
	public int addSunHome(Sun_home sun_home);
	
	/**
	 * 用户查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:21:50
	 * @param uid
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Sun_home> findSunHome(@Param("uid")String uid,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 管理员查看晒家
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:36:10
	 * @param examine
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Sun_home> findSunHomeByAdmin(@Param("examine")int examine,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 审核或者软删除
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月11日-下午5:36:18
	 * @param sun_home
	 * @return
	 */
	public int updSunHome(Sun_home sun_home);
	
	/**
	 * 查看详细
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:04:17
	 * @param shid
	 * @return
	 */
	public Sun_home findSunHomeDetailed(@Param("shid")String shid);
	
	/**
	 * 新增各种数量
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月12日-下午4:43:37
	 * @param param
	 * @param shid
	 * @return
	 */
	public int updSunHomeAllCount(@Param("param")String param,@Param("shid")String shid);
}