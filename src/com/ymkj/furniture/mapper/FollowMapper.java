package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Follow;

public interface FollowMapper {
	/**
	 * 添加关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:10
	 * @param follow
	 * @return
	 */
	public int addFollow(Follow follow);
	
	/**
	 * 取消关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:17
	 * @param follow
	 * @return
	 */
	public int delFollow(Follow follow);
	
	/**
	 * 查看关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:24
	 * @param uid
	 * @param heuid 游客标识
	 * @return
	 */
	public List<Follow> findFollowByThis(@Param("uid")String uid,@Param("heuid")String heuid,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 查看粉丝
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-下午3:15:32
	 * @param uid
	 * @param heuid 游客标识
	 * @return
	 */
	public List<Follow> findFollowByFans(@Param("uid")String uid,@Param("heuid")String heuid,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 是否关注
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月10日-下午12:11:47
	 * @param followUid
	 * @param fansUid
	 * @return
	 */
	public Integer findIsFollow(@Param("followUid")String followUid,@Param("fansUid")String fansUid);
}