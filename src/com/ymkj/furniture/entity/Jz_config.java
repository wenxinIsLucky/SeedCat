package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

import com.ymkj.furniture.util.HelpUtil;

/**
 * 家装配置
 * 
 * @author hxc
 *
 */
public class Jz_config implements Serializable{

	private String jcid;//标识，自生成
	private String jcname;//配置名称
	private String jcimg;//图片
	private String jpid;//所属家装套餐id
	private List<Jz_material> jz_material;//家装材料
	
	public Jz_config(){
		this.jcid = "jc_"+HelpUtil.generateUUID();
	}
	
	
	public List<Jz_material> getJz_material() {
		return jz_material;
	}
	public void setJz_material(List<Jz_material> jz_material) {
		this.jz_material = jz_material;
	}
	public String getJcid() {
		return jcid;
	}
	public void setJcid(String jcid) {
		this.jcid = jcid;
	}
	public String getJcname() {
		return jcname;
	}
	public void setJcname(String jcname) {
		this.jcname = jcname;
	}
	public String getJcimg() {
		return jcimg;
	}
	public void setJcimg(String jcimg) {
		this.jcimg = jcimg;
	}
	public String getJpid() {
		return jpid;
	}
	public void setJpid(String jpid) {
		this.jpid = jpid;
	}
	
}
