package com.ymkj.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.ymkj.furniture.entity.Designer;

/**
 * 设计师模块
 * @author hxc
 *
 */
@Component("adminDesignerMapper")
public interface DesignerMapper {
	/**
	 * 新增设计师
	 * @param designer
	 * @return
	 */
	public int addDesigner(Designer designer);
	
	/**
	 * 分页查看所有设计师
	 * @param begin
	 * @param end
	 * @return
	 */
	public List<Designer> findDesigner(@Param("begin")Integer begin,@Param("end")Integer end);
	
	/**
	 * 根据编号查询设计师
	 * @param did
	 * @return
	 */
	public Designer findDesignerByDid(@Param("did")Integer did);
	
	/**
	 * 删除设计师
	 * @param did
	 * @return
	 */
	public int delDesigner(@Param("did")Integer did);
	
	/**
	 * 修改设计师
	 * @param designer
	 * @return
	 */
	public int updDesigner(Designer designer);
	
	/**
	 * 查看设计师总数
	 * @return
	 */
	public Integer findDesignerCount();
	
}
