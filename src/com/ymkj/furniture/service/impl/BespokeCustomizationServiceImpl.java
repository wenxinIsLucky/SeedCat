package com.ymkj.furniture.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.BespokeCustomization;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.mapper.BespokeCustomizationMapper;
import com.ymkj.furniture.service.BespokeCustomizationService;
import com.ymkj.furniture.util.HelpController;

@Service("bespokeCustomizationService")
public class BespokeCustomizationServiceImpl implements
		BespokeCustomizationService {
	
	@Resource(name="bespokeCustomizationMapper")
	BespokeCustomizationMapper bespokeCustomizationMapper;

	public int addbespokecustomization(BespokeCustomization bespokeCustomization) {
		return bespokeCustomizationMapper.addbespokecustomization(bespokeCustomization);
	}

	public ReturnParam<BespokeCustomization> findbespokecustomization(Integer handle,
			Integer start, Integer end) {
		try {
			ReturnParam<BespokeCustomization> bparam = new ReturnParam<BespokeCustomization>();
			List<BespokeCustomization> blist = bespokeCustomizationMapper.findbespokecustomization(handle, (start-1)*end, end);
			bparam.setList(blist);
			bparam.setStart(start);
			bparam.setSize(end);
			bparam.setCountPage(blist.size() != 0?blist.get(0).getDataCount():0);
			return bparam;
		} catch (Exception e) {
			System.out.println("BespokeCustomizationServiceImpl=>findbespokecustomization:"+e.getMessage());
			return null;
		}
	}
	
	public BespokeCustomization findbespokecustomizationBybcid(Integer bcid) {
		return bespokeCustomizationMapper.findbespokecustomizationBybcid(bcid);
	}

	public Map<String, Object> delbespokecustomization(Integer bcid,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else{
				if (bespokeCustomizationMapper.delbespokecustomization(bcid) > 0) {
					status = 200;
					msg = "删除成功";
				}else{
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println("BespokeCustomizationServiceImpl=>delbespokecustomization:"+e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}


	public Map<String, Object> updbespokecustomization(BespokeCustomization bespokeCustomization,HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else{
				if (bespokeCustomization.getErrorMsg() == null) {
					bespokeCustomization.setErrorMsg("");
				}
				if (bespokeCustomization.getDoorDate() == null) {
					bespokeCustomization.setDoorDate("");
				}
				if (bespokeCustomizationMapper.updbespokecustomization(bespokeCustomization) > 0) {
					status = 200;
					msg = "保存成功";
				}else{
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println("BespokeCustomizationServiceImpl=>updbespokeCustomization:"+e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

}
