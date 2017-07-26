package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

import com.ymkj.furniture.util.HelpUtil;

/**
 * 家装套餐
 * 
 * @author hxc
 *
 */
public class Jz_package implements Serializable {
	private String jpid;//标识，自增
	private String jpname;//套餐名称
	private String jptype;//套餐类型
	private String jpstartprice;//起步价/平方
	private String describe;//描述
	private String words;//相关词（多个），逗号隔开
	private List<Jz_config> jz_config;//家装配置
	
	public Jz_package(){
		this.jpid = "jp_"+HelpUtil.generateUUID();
	}
	
	
	public List<Jz_config> getJz_config() {
		return jz_config;
	}
	public void setJz_config(List<Jz_config> jz_config) {
		this.jz_config = jz_config;
	}
	public String getJpid() {
		return jpid;
	}
	public void setJpid(String jpid) {
		this.jpid = jpid;
	}
	public String getJpname() {
		return jpname;
	}
	public void setJpname(String jpname) {
		this.jpname = jpname;
	}
	public String getJptype() {
		return jptype;
	}
	public void setJptype(String jptype) {
		this.jptype = jptype;
	}
	public String getJpstartprice() {
		return jpstartprice;
	}
	public void setJpstartprice(String jpstartprice) {
		this.jpstartprice = jpstartprice;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	
}
