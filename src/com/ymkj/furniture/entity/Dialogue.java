package com.ymkj.furniture.entity;

import java.io.Serializable;

public class Dialogue implements Serializable {
	private Integer dgid;//标识
	private Integer did;//设计师id
	private String head;//头像
	private String ip;//ip
	private String ipAddress;//ip地址
	private Integer handle;//处理
	private String content;//询问内容
	private String reply;//回复内容
	private String createDate;//创建时间
	private Designer designer;//设计师对象
	
	public Integer getDgid() {
		return dgid;
	}
	public void setDgid(Integer dgid) {
		this.dgid = dgid;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		String data = createDate;
		if (data != null && data.trim().length() != 0) {
			data = createDate.substring(0,19);
		}
		this.createDate = data;
	}
	public Designer getDesigner() {
		return designer;
	}
	public void setDesigner(Designer designer) {
		this.designer = designer;
	}
	public Integer getHandle() {
		return handle;
	}
	public void setHandle(Integer handle) {
		this.handle = handle;
	}
	
}
