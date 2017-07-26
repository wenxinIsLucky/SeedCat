package com.ymkj.furniture.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.Jz_materialMapper;
import com.ymkj.furniture.entity.Jz_material;
import com.ymkj.furniture.service.Jz_materialService;

@Service
public class Jz_materialServiceImpl implements Jz_materialService{
	@Resource
	Jz_materialMapper jz_materialMapper;
	
	/**
	 * 新增材料明细
	 *//*
	public int addJzmaterial(Jz_material jz_material) {
		return jz_materialMapper.addJzmaterial(jz_material);
	}
	
	*//**
	 * 修改材料明细
	 * @param jz_material
	 * @return
	 *//*
	public int updateJzmaterial(Jz_material jz_material){
		return jz_materialMapper.updateJzmaterial(jz_material);
	}
	
	*//**
	 * 根据配置id查看材料信息集合
	 */
	public List<Jz_material> findJzmaterials() {
		return jz_materialMapper.findJzmaterials();
	}

	/**
	 * 查看配置详情
	 *//*
	public Jz_material findJzmaterial(String jmid) {
		return jz_materialMapper.findJzmaterial(jmid);
	}

	*//**
	 * 删除材料信息
	 *//*
	public int delJzmaterial(String jmid) {
		return jz_materialMapper.delJzmaterial(jmid);
	}
*/
}
