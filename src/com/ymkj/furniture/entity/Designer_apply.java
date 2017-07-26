package com.ymkj.furniture.entity;

import java.io.Serializable;

/**
 * 设计师免费服务申请
 * @author hxc
 *
 */
public class Designer_apply implements Serializable {
	private Integer dpid;//标识
	private String name;//姓名
	private String phone;//手机号码
	private String city;//所在省
	private String county;//所在市、县
	private Integer handle;//处理，0未处理，1成功，2失败
	private String msg;//失败原因
	private String doorDate;//上门时间
	private String createDate;//申请时间
	private Integer dataCount;//数据总数
	
	
	
	public Integer getDataCount() {
		return dataCount;
	}
	public void setDataCount(Integer dataCount) {
		this.dataCount = dataCount;
	}
	public Integer getHandle() {
		return handle;
	}
	public void setHandle(Integer handle) {
		this.handle = handle;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getDoorDate() {
		return doorDate;
	}
	public void setDoorDate(String doorDate) {
		this.doorDate = doorDate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Integer getDpid() {
		return dpid;
	}
	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
}
