package com.ymkj.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Jz_package;

/**
 * 
 * @author hxc
 *
 */
@Component("adminjz_packageMapper")
public interface Jz_packageMapper {
	/**
	 * 添加家装套餐
	 * @param jz_package
	 * @return
	 */
	public int addJzPackage(Jz_package jz_package);
	
	/**
	 * 查看指定家装套餐
	 * @param jpid
	 * @return
	 */
	public List<Jz_package> findJzPackage(@Param("jpid")String jpid); 
	
	/**
	 * 查看所有家装套餐
	 * @return
	 */
	public List<Jz_package> findJzPackages(@Param("start")int start,@Param("size")int size);
	
	/**
	 * 修改家装套餐
	 * @param jz_package
	 * @return
	 */
	public int updateJzPackage(Jz_package jz_package);
	
	/**
	 * 删除家装套餐
	 * @param jpid
	 * @return
	 */
	public void deleteJzPackage(Map<String,Object> map);
}
