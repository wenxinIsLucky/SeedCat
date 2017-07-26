package com.ymkj.admin.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.Designer_caseMapper;
import com.ymkj.admin.service.Designer_caseService;
import com.ymkj.furniture.entity.Designer_case;
import com.ymkj.furniture.util.HelpUtil;
import com.ymkj.furniture.util.IMGPATH;

@Service("admindesigner_caseService")
public class Designer_caseServiceImpl implements Designer_caseService {

	@Resource(name="admindesigner_caseMapper")
	Designer_caseMapper designer_caseMapper;
	
	
	public int addDesigner_case(Designer_case designer_case) {
		//designer_case.setDetails(HelpUtil.encode(designer_case.getDetails().getBytes()));
		return designer_caseMapper.addDesigner_case(designer_case);
	}


	public int updDesigner_case(Designer_case designer_case) {
		return designer_caseMapper.updDesigner_case(designer_case);
	}


	public List<Designer_case> findDcByDid(Integer did) {
		return designer_caseMapper.findDcByDid(did);
	}


	public int delDesigner_case(Integer dcid) {
		int result = 0;
		if (0 != dcid) {
			Designer_case dc = designer_caseMapper.findDcByDcid(dcid);
			designer_caseMapper.findDcByDcid(dcid);
			result = designer_caseMapper.delDesigner_case(dcid);
			if (result > 0) {
				String [] imgs = dc.getImgs()!=null?dc.getImgs().split(","):null;
				if (null != imgs) {
					for (int i = 0; i < imgs.length; i++) {
						HelpUtil.delFile(IMGPATH.designer_case_img, imgs[i]);
					}
				}
			}
		}
		return result;
	}


	public Designer_case findDcByDcid(Integer dcid) {
		return designer_caseMapper.findDcByDcid(dcid);
	}
}
