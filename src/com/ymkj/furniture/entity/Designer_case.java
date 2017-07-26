package com.ymkj.furniture.entity;

import java.io.Serializable;


/**
 * 设计师案例
 * @author hxc
 *
 */
public class Designer_case implements Serializable {
	private Integer dcid;//案例标识
	private Integer did;//设计师id
	private String dctitle;//案例标题
	private String describe;//描述
	private String model;//型号
	private String family;//户型
	private String name;//客户姓名
	private String floorname;//楼盘名称
	private String addres;//所在地址
	private String important;//重点设计空间
	private Integer size;//空间大小
	private String likestyle;//喜爱风格
	private String likecolor;//喜爱颜色
	private Integer age;//使用者年龄
	private String ground;//地面材料
	private String demand;//重点空间设计需求
	private Integer follow;//案例关注数量
	private String imgs;//设计效果图集合
	private String recollections;//设计师的设计感言
	private String details;//详细，html保存
	private String createDate;//创建时间
	public Integer getDcid() {
		return dcid;
	}
	public void setDcid(Integer dcid) {
		this.dcid = dcid;
	}
	public Integer getDid() {
		return did;
	}
	public void setDid(Integer did) {
		this.did = did;
	}
	public String getDctitle() {
		return dctitle;
	}
	public void setDctitle(String dctitle) {
		this.dctitle = dctitle;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFloorname() {
		return floorname;
	}
	public void setFloorname(String floorname) {
		this.floorname = floorname;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
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
	public String getLikestyle() {
		return likestyle;
	}
	public void setLikestyle(String likestyle) {
		this.likestyle = likestyle;
	}
	public String getLikecolor() {
		return likecolor;
	}
	public void setLikecolor(String likecolor) {
		this.likecolor = likecolor;
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
	public Integer getFollow() {
		return follow;
	}
	public void setFollow(Integer follow) {
		this.follow = follow;
	}
	public String getImgs() {
		return imgs;
	}
	public void setImgs(String imgs) {
		this.imgs = imgs;
	}
	public String getRecollections() {
		return recollections;
	}
	public void setRecollections(String recollections) {
		this.recollections = recollections;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		String date = createDate;
		if (date != null && date.trim().length() != 0) {
			date = createDate.substring(0,19);
		}
		this.createDate = date;
	}
	
	
}
