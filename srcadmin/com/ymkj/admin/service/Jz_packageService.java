package com.ymkj.admin.service;

import java.util.List;

import com.ymkj.furniture.entity.Jz_package;

/**
 * 家装套餐
 * @author hxc
 *
 */
public interface Jz_packageService {
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
	public Jz_package findJzPackage(String jpid); 
	
	/**
	 * 查看所有家装套餐
	 * @return
	 */
	public List<Jz_package> findJzPackages(int start,int size);
	
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
	public int deleteJzPackage(String jpid);
	
}
