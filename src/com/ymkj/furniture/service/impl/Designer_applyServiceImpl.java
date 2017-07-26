package com.ymkj.furniture.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.ymkj.furniture.entity.Designer_apply;
import com.ymkj.furniture.entity.ReturnParam;
import com.ymkj.furniture.mapper.Designer_applyMapper;
import com.ymkj.furniture.service.Designer_applyService;
import com.ymkj.furniture.util.HelpController;

@Service("designer_applyService")
public class Designer_applyServiceImpl implements Designer_applyService {

	@Resource(name="designer_applyMapper")
	Designer_applyMapper designer_applyMapper;
	
	public int addDesigner_apply(Designer_apply designer_apply) {
		return designer_applyMapper.addDesigner_apply(designer_apply);
	}

	public List<Designer_apply> findtodayDesigner_apply() {
		return designer_applyMapper.findtodayDesigner_apply();
	}

	public ReturnParam<Designer_apply> finddesigner_apply(Integer handle,
			Integer start, Integer end) {
		try {
			ReturnParam<Designer_apply> dparam = new ReturnParam<Designer_apply>();
			List<Designer_apply> dlist = designer_applyMapper.finddesigner_apply(handle, (start-1)*end, end);
			dparam.setList(dlist);
			dparam.setStart(start);
			dparam.setSize(end);
			dparam.setCountPage(dlist.size()!=0?dlist.get(0).getDataCount():0);
			return dparam;
		} catch (Exception e) {
			System.out.println("Designer_applyServiceImpl=>finddesigner_apply:"+e.getMessage());
			return null;
		}
	}

	public Map<String, Object> upddesigner_apply(Designer_apply designer_apply,
			HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else{
				if (designer_apply.getMsg() == null) {
					designer_apply.setMsg("");
				}
				if (designer_apply.getDoorDate() == null) {
					designer_apply.setDoorDate("");
				}
				if (designer_applyMapper.upddesigner_apply(designer_apply) > 0) {
					status = 200;
					msg = "处理成功";
				}else{
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println("Designer_applyServiceImpl=>upddesigner_apply:"+e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}

	public Map<String, Object> deldesigner_apply(Integer dpid,
			HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		int status = 0;
		String msg = "";
		try {
			if (HelpController.filterParameter(request)) {
				status = 500;
				msg = "数据有误";
			}else{
				if (designer_applyMapper.deldesigner_apply(dpid) > 0) {
					status = 200;
					msg = "删除成功";
				}else{
					status = 405;
					msg = "操作失败";
				}
			}
		} catch (Exception e) {
			System.out.println("Designer_applyServiceImpl=>deldesigner_apply:"+e.getMessage());
			status = 400;
			msg = "后台有误";
		}
		map.put("status", status);
		map.put("msg", msg);
		return map;
	}
}
