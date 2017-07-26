package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.Jz_packageMapper;
import com.ymkj.furniture.entity.Jz_package;
import com.ymkj.furniture.service.Jz_packageService;

/**
 * 
 * @author hxc
 *
 */
@Service
public class Jz_packageServiceImpl implements Jz_packageService {
	@Resource
	Jz_packageMapper jz_packageMapper;
	
	
	
	/**
	 * 查看指定家装套餐
	 */
	public Jz_package findJzPackage(String jpid) {
		try {
			List<Jz_package> jzs = jz_packageMapper.findJzPackage(jpid);
			return jzs.size()!=0?jzs.get(0):null;
		} catch (Exception e) {
			System.out.println("Jz_packageServiceImpl=>findJzPackage:"+e.getMessage());
			return null;
		}
		
	}


	/**
	 * 查看所有家装套餐
	 */
	public List<Jz_package> findJPname() {
		return jz_packageMapper.findJPname();
	}
	
	/**
	 * 查看所有家装套装
	 *//*
	public List<Jz_package> findJzPackages(int start,int size) {
		return jz_packageMapper.findJzPackages(start,size);
	}

	*//**
	 * 修改家装套餐
	 *//*
	public int updateJzPackage(Jz_package jz_package) {
		return jz_packageMapper.updateJzPackage(jz_package);
	}

	*//**
	 * 删除家装套餐
	 *//*
	public int deleteJzPackage(String jpid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("in_jpid", jpid);
		jz_packageMapper.deleteJzPackage(map);
		return Integer.parseInt(map.get("result").toString());
	}*/

	
}
