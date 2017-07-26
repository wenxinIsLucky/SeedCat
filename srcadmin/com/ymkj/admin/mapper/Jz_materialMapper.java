package com.ymkj.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Jz_material;
@Component("adminjz_materialMapper")
public interface Jz_materialMapper {
	/**
	 * 新增材料信息
	 * @param jz_material
	 * @return
	 */
	public int addJzmaterial(Jz_material jz_material);
	
	/**
	 * 修改材料信息
	 * @param jz_material
	 * @return
	 */
	public int updateJzmaterial(Jz_material jz_material);
	
	/**
	 * 根据配置id查看材料信息集合
	 * @param jcid
	 * @return
	 */
	public List<Jz_material> findJzmaterialsByjcId(@Param("jcid")String jcid);
	
	/**
	 * 查看材料详情
	 * @param jmid
	 * @return
	 */
	public Jz_material findJzmaterial(@Param("jmid")String jmid);
	
	/**
	 * 删除材料信息
	 * @param jmid
	 * @return
	 */
	public int delJzmaterial(@Param("jmid")String jmid);
}
