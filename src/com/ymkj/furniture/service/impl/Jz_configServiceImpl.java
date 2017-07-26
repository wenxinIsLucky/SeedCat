package com.ymkj.furniture.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.Jz_configMapper;
import com.ymkj.furniture.entity.Jz_config;
import com.ymkj.furniture.service.Jz_configService;

@Service
public class Jz_configServiceImpl implements Jz_configService {
	@Resource
	Jz_configMapper jz_configMapper;

	public List<Jz_config> findJzCorJzM(String jpid) {
		return jz_configMapper.findJzCorJzM(jpid);
	}

}
