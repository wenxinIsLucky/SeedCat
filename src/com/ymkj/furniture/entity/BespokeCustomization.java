package com.ymkj.furniture.entity;

import java.io.Serializable;

public class BespokeCustomization implements Serializable  {

	private Integer bcid;//标识
	private String bname;//名称
	private String bphone;//手机号
	private String errorMsg;//失败消息
	private String doorDate;//上门时间
	private Integer handle;//处理
	private String createDate;//创建时间
	private Integer dataCount;//数据总数 
	public Integer getBcid() {
		return bcid;
	}
	public void setBcid(Integer bcid) {
		this.bcid = bcid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBphone() {
		return bphone;
	}
	public void setBphone(String bphone) {
		this.bphone = bphone;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getDoorDate() {
		return doorDate;
	}
	public void setDoorDate(String doorDate) {
		this.doorDate = doorDate;
	}
	public Integer getHandle() {
		return handle;
	}
	public void setHandle(Integer handle) {
		this.handle = handle;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public Integer getDataCount() {
		return dataCount;
	}
	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}
	
}
