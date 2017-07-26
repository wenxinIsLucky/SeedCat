package com.ymkj.furniture.entity;

import java.io.Serializable;

public class Msg_State implements Serializable {
	//标识
	private Long msid;
	//消息id
	private Long mid;
	//用户id
	private Long uid;
	//状态 1 2已读已删
	private Integer state;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Long getMsid() {
		return msid;
	}
	public void setMsid(Long msid) {
		this.msid = msid;
	}
	public Long getMid() {
		return mid;
	}
	public void setMid(Long mid) {
		this.mid = mid;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	
}
