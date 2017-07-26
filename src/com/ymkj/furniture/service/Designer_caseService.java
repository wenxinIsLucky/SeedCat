package com.ymkj.furniture.service;

import java.util.List;

import com.ymkj.furniture.entity.Designer_case;

public interface Designer_caseService {
	
	
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
	public List<Designer_case> findDcByDid(Integer did);
	
	/**
	 * 根据案例查看案例详情
	 * @param dcid
	 * @return
	 */
	public Designer_case findDcByDcid(Integer dcid);
	
}
