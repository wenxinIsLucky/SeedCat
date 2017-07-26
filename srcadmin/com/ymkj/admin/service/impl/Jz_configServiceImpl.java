package com.ymkj.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.Jz_configMapper;
import com.ymkj.admin.service.Jz_configService;
import com.ymkj.furniture.entity.Jz_config;

@Service("adminjz_configService")
public class Jz_configServiceImpl implements Jz_configService {
	@Resource(name="adminjz_configMapper")
	Jz_configMapper jz_configMapper;

	public int addJzConfig(Jz_config jz_config) {
		return jz_configMapper.addJzConfig(jz_config);
	}

	public Jz_config findJzConfig(String jpid) {
		return jz_configMapper.findJzConfig(jpid);
	}

	public Jz_config findAppointJzPorJzC(String jpid, String jcid) {
		return jz_configMapper.findAppointJzPorJzC(jpid, jcid);
	}

	public int updateAppointJzPorJzC(Jz_config jz_config) {
		return jz_configMapper.updateAppointJzPorJzC(jz_config);
	}

}
