package com.ymkj.admin.service;




import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.ReturnParam;

public interface DesignerService {
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
	public ReturnParam<Designer> findDesigner(Integer begin,Integer end);
	
	/**
	 * 根据编号查询设计师
	 * @param did
	 * @return
	 */
	public Designer findDesignerByDid(Integer did);
	
	/**
	 * 删除设计师
	 * @param did
	 * @return
	 */
	public int delDesigner(Integer did);
	
	/**
	 * 修改设计师
	 * @param designer
	 * @return
	 */
	public int updDesigner(Designer designer);
	
}
