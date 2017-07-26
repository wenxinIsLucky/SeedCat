package com.ymkj.furniture.service;





import java.util.List;

import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.ReturnParam;

public interface DesignerService {
	
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
	 * 查看设计师查看指定案例
	 * @param did
	 * @param dcid
	 * @return
	 */
	public Designer findDesignerDataByid(Integer did,Integer dcid);
	
	/**
	 * 查看所有设计师的设计案例按关注量降序排序
	 * @return
	 */
	public List<Designer> findDesignerData();
	
}
