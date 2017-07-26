package com.ymkj.furniture.entity;

import java.io.Serializable;

import com.ymkj.furniture.util.HelpUtil;

public class Jz_material implements Serializable {

	private String jmid;//标识，自生成
	private String jmname;//材料名称
	private String materialinfo;//材料信息
	private String materialexplain;//材料说明
	private String jcid;//所属家装配置id
	
	public Jz_material(){
		this.jmid = "jm_"+HelpUtil.generateUUID();
	}
	
	
	public String getJmid() {
		return jmid;
	}
	public void setJmid(String jmid) {
		this.jmid = jmid;
	}
	public String getJmname() {
		return jmname;
	}
	public void setJmname(String jmname) {
		this.jmname = jmname;
	}
	public String getMaterialinfo() {
		return materialinfo;
	}
	public void setMaterialinfo(String materialinfo) {
		this.materialinfo = materialinfo;
	}
	public String getMaterialexplain() {
		return materialexplain;
	}
	public void setMaterialexplain(String materialexplain) {
		this.materialexplain = materialexplain;
	}
	public String getJcid() {
		return jcid;
	}
	public void setJcid(String jcid) {
		this.jcid = jcid;
	}
	
}
