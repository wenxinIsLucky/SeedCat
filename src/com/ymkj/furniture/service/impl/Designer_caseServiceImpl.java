package com.ymkj.furniture.service.impl;

import java.util.List;




import javax.annotation.Resource;


import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Designer_case;
import com.ymkj.furniture.mapper.Designer_caseMapper;
import com.ymkj.furniture.service.Designer_caseService;

@Service
public class Designer_caseServiceImpl implements Designer_caseService {
	
	@Resource
	Designer_caseMapper designer_caseMapper;
	
	
	public int updDesigner_case(Designer_case designer_case) {
		return designer_caseMapper.updDesigner_case(designer_case);
	}


	public List<Designer_case> findDcByDid(Integer did) {
		return designer_caseMapper.findDcByDid(did);
	}


	public Designer_case findDcByDcid(Integer dcid) {
		return designer_caseMapper.findDcByDcid(dcid);
	}
}
