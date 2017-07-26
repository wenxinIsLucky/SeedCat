package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Designer;

/**
 * 设计师模块
 * @author hxc
 *
 */
public interface DesignerMapper {
	
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
	 * 查看设计师总数
	 * @return
	 */
	public Integer findDesignerCount();
	
	/**
	 * 查看设计师查看指定案例
	 * @param did
	 * @param dcid
	 * @return
	 */
	public Designer findDesignerDataByid(@Param("did")Integer did,@Param("dcid")Integer dcid);
	
	/**
	 * 查看所有设计师的设计案例按关注量降序排序
	 * @return
	 */
	public List<Designer> findDesignerData();
	
}
