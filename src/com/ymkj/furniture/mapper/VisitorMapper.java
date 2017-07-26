package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Visitor;

public interface VisitorMapper {
	/**
	 * 添加访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-上午11:52:31
	 * @param visitor
	 * @return
	 */
	public int addVisitor(Visitor visitor);
	
	/**
	 * 查看访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-上午11:52:47
	 * @param uid
	 * @param start
	 * @param size
	 * @return
	 */
	public List<Visitor> findVisitor(@Param("uid")String uid,@Param("heuid")String heuid,@Param("start")int start,@Param("size")int size);
	
	/**
	 * 删除访客
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月7日-上午11:52:39
	 * @param visitor
	 * @return
	 */
	public int delVisitor(Visitor visitor);
}