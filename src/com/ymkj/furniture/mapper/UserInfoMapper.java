package com.ymkj.furniture.mapper;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.UserInfo;

public interface UserInfoMapper {
	/**
	 * 修改个人资料  
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:45:12
	 * @param userInfo
	 * @return
	 */
	public int updUserInfo(UserInfo userInfo);
	
	/**
	 * 添加个人资料
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:48:36
	 * @param uid
	 * @return
	 */
	public int addUserInfo(@Param("uid")String uid);
	
	/**
	 * 查看个人资料
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午11:55:53
	 * @param uid
	 * @return
	 */
	public UserInfo findUserInfo(@Param("uid")String uid);
}