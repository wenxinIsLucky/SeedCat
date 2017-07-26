package com.ymkj.admin.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.Jz_packageMapper;
import com.ymkj.admin.service.Jz_packageService;
import com.ymkj.furniture.entity.Jz_package;

/**
 * 
 * @author hxc
 *
 */
@Service("adminjz_packageService")
public class Jz_packageServiceImpl implements Jz_packageService {
	@Resource(name="adminjz_packageMapper")
	Jz_packageMapper jz_packageMapper;
	
	/**
	 * 添加家装套餐
	 */
	public int addJzPackage(Jz_package jz_package) {
		return jz_packageMapper.addJzPackage(jz_package);
	}
	
	/**
	 * 查看指定家装套餐
	 */
	public Jz_package findJzPackage(String jpid) {
		try {
			List<Jz_package> jzs = jz_packageMapper.findJzPackage(jpid);
			return jzs.size()!=0?jzs.get(0):null;
		} catch (Exception e) {
			System.out.println("Jz_packageServiceImpl=>findJzPackage"+e.getMessage());
			return null;
		}
		
	}
	
	/**
	 * 查看所有家装套装
	 */
	public List<Jz_package> findJzPackages(int start,int size) {
		return jz_packageMapper.findJzPackages(start,size);
	}

	/**
	 * 修改家装套餐
	 */
	public int updateJzPackage(Jz_package jz_package) {
		return jz_packageMapper.updateJzPackage(jz_package);
	}

	/**
	 * 删除家装套餐
	 */
	public int deleteJzPackage(String jpid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("in_jpid", jpid);
		jz_packageMapper.deleteJzPackage(map);
		return Integer.parseInt(map.get("result").toString());
	}

	
}
