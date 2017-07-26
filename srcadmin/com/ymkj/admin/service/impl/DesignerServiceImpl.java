package com.ymkj.admin.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.admin.mapper.DesignerMapper;
import com.ymkj.admin.service.DesignerService;
import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.util.HelpController;

@Service("adminDesignerService")
public class DesignerServiceImpl extends HelpController implements DesignerService {
	
	@Resource(name="adminDesignerMapper")
	DesignerMapper designerMapper;
	
	
	public int addDesigner(Designer designer) {
		return designerMapper.addDesigner(designer);
	}


	public ReturnParam<Designer> findDesigner(Integer begin, Integer end) {
		try {
			ReturnParam<Designer> dparam = new ReturnParam<Designer>();
			dparam.setList(designerMapper.findDesigner((begin-1)*end, end));
			dparam.setStart(begin);
			dparam.setSize(end);
			dparam.setCountPage(designerMapper.findDesignerCount());
			dparam.setStatus(200);
			return dparam;
		} catch (Exception e) {
			System.out.println("DesignerServiceImpl=>findDesigner:"+e.getMessage());
			return null;
		}
	}


	public Designer findDesignerByDid(Integer did) {
		return designerMapper.findDesignerByDid(did);
	}


	public int delDesigner(Integer did) {
		return designerMapper.delDesigner(did);
	}


	public int updDesigner(Designer designer) {
		return designerMapper.updDesigner(designer);
	}

}
