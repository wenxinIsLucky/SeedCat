package com.ymkj.furniture.entity;

import java.io.Serializable;
import java.util.List;

public class Designer implements Serializable {
	private Integer did;//设计师标识
	private String dname;//设计师姓名
	private String level;//设计师等级
	private String address;//所在地
	private String style;//擅长风格
	private String idea;//设计理念
	private String head;//工作照
	private String phone;//联系手机
	private String email;//联系邮箱
	private Integer pularval;//人气值
	private String createDate;//创建时间
	private List<Designer_case> designer_case;//设计师设计案例
	
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPularval() {
		return pularval;
	}
	public void setPularval(Integer pularval) {
		this.pularval = pularval;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		String creDate = createDate;
		if (createDate != null && createDate.trim().length() != 0) {
			creDate = createDate.substring(0, 19);
		}
		this.createDate = creDate;
	}
	public List<Designer_case> getDesigner_case() {
		return designer_case;
	}
	public void setDesigner_case(List<Designer_case> designer_case) {
		this.designer_case = designer_case;
	}
	
	
}
