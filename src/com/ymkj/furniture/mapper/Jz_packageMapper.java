package com.ymkj.furniture.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Jz_package;

/**
 * 
 * @author hxc
 *
 */
public interface Jz_packageMapper {
	/**
	 * 查看所有家装套餐
	 * @return
	 */
	public List<Jz_package> findJPname();
	
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
	/*public List<Jz_package> findJzPackages(@Param("start")int start,@Param("size")int size);
	
	*//**
	 * 修改家装套餐
	 * @param jz_package
	 * @return
	 *//*
	public int updateJzPackage(Jz_package jz_package);
	
	*//**
	 * 删除家装套餐
	 * @param jpid
	 * @return
	 *//*
	public void deleteJzPackage(Map<String,Object> map);*/
}
