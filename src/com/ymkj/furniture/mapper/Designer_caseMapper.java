package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Designer_case;

public interface Designer_caseMapper {

	
	/**
	 * 编辑设计师案例
	 * @param designer_case
	 * @return
	 */
	public int updDesigner_case(Designer_case designer_case);
	
	/**
	 * 根据设计师查询设计案例列表
	 * @param did
	 * @return
	 */
	public List<Designer_case> findDcByDid(@Param("did")Integer did);
	
	/**
	 * 根据案例查看案例详情		
	 * @param dcid
	 * @return
	 */
	public Designer_case findDcByDcid(@Param("dcid")Integer dcid);
	
}
