package com.ymkj.furniture.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.mapper.DesignerMapper;
import com.ymkj.furniture.service.DesignerService;
import com.ymkj.furniture.entity.Designer;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.util.HelpController;

@Service
public class DesignerServiceImpl extends HelpController implements DesignerService {
	
	@Resource
	DesignerMapper designerMapper;
	
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


	public Designer findDesignerDataByid(Integer did, Integer dcid) {
		return designerMapper.findDesignerDataByid(did, dcid);
	}


	public List<Designer> findDesignerData() {
		return designerMapper.findDesignerData();
	}

}
