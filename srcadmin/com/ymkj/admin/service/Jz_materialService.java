package com.ymkj.admin.service;

import java.util.List;




import com.ymkj.furniture.entity.Jz_material;

public interface Jz_materialService {
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
	public List<Jz_material> findJzmaterialsByjcId(String jcid);
	
	/**
	 * 查看材料详情
	 * @param jmid
	 * @return
	 */
	public Jz_material findJzmaterial(String jmid);
	
	/**
	 * 删除材料信息
	 * @param jmid
	 * @return
	 */
	public int delJzmaterial(String jmid);
}
