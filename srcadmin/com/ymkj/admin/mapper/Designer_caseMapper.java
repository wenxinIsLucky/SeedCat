package com.ymkj.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ymkj.furniture.entity.Designer_case;

@Component("admindesigner_caseMapper")
public interface Designer_caseMapper {

	/**
	 * 新增设计师案例
	 * @param designer_case
	 * @return
	 */
	public int addDesigner_case(Designer_case designer_case);
	
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
	
	/**
	 * 删除设计师案例
	 * @param did
	 * @return
	 */
	public int delDesigner_case(@Param("dcid")Integer dcid);
}
