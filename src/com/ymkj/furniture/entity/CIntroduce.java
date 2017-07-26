package com.ymkj.furniture.entity;

import java.io.Serializable;

public class CIntroduce implements Serializable {
	private String mod;//型号
	private String name;//客户称呼
	private String floorName;//楼盘名称
	private String address;//所在地址
	private String important;//重点设计空间
	private Integer size;//空间大小
	private String likeStyle;//喜爱风格
	private String likeColor;//喜爱颜色
	private Integer age;//使用者年龄
	private String ground;//地面材料
	private String demand;//重点空间设计需求
	private String reason;//为什么选择这种风格设计
	private Integer follow;//案例关注数量
	
	
	public String getMod() {
		return mod;
	}
	public void setMod(String mod) {
		this.mod = mod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFloorName() {
		return floorName;
	}
	public void setFloorName(String floorName) {
		this.floorName = floorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImportant() {
		return important;
	}
	public void setImportant(String important) {
		this.important = important;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public String getLikeStyle() {
		return likeStyle;
	}
	public void setLikeStyle(String likeStyle) {
		this.likeStyle = likeStyle;
	}
	public String getLikeColor() {
		return likeColor;
	}
	public void setLikeColor(String likeColor) {
		this.likeColor = likeColor;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGround() {
		return ground;
	}
	public void setGround(String ground) {
		this.ground = ground;
	}
	public String getDemand() {
		return demand;
	}
	public void setDemand(String demand) {
		this.demand = demand;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getFollow() {
		return follow;
	}
	public void setFollow(Integer follow) {
		this.follow = follow;
	}
	
}
