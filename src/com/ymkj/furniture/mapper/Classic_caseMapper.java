package com.ymkj.furniture.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ymkj.furniture.entity.Classic_case;

public interface Classic_caseMapper {
	/**
	 * 添加经典案例
	 * @author lucky(李文鑫) Email:578581198@qq.com
	 * 2017年7月14日-上午11:43:42
	 * @param classic_case
	 * @return
	 */
    public int addClassicCase(Classic_case classic_case);
    
    /**
     * 分页查看经典案例
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:43:53
     * @param type
     * @param start
     * @param size
     * @return
     */
    public List<Classic_case> findClassicCaseByType(@Param("type")int type,@Param("start")int start,@Param("size")int size);
    
    /**
     * 查看详细
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:44:20
     * @param ccid
     * @return
     */
    public Classic_case findClassicCaseDetailed(@Param("type")int type,@Param("ccid")String ccid);
    
    /**
     * 修改经典案例
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月14日-上午11:44:26
     * @param classic_case
     * @return
     */
    public int updClassicCaseContent(Classic_case classic_case);
    
    /**
     * 新增各种数量
     * @author lucky(李文鑫) Email:578581198@qq.com
     * 2017年7月18日-下午10:44:21
     * @param param
     * @param ccid
     * @return
     */
    public int updclassic_caseAllCount(@Param("param")String param,@Param("ccid")String ccid);
}