package com.bw.xj.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @ClassName: Driver 
 * @Description: TODO
 * @author: 肖健
 * @date: 2019年9月12日 上午9:35:09
 */
public class Driver implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nums;
	private String name;
	private String sex;
	private int shengid;
	private int shiid;
	private int quid;
	@DateTimeFormat(style="yyyy-MM-dd")
	private Date pushDate;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nums
	 */
	public String getNums() {
		return nums;
	}
	/**
	 * @param nums the nums to set
	 */
	public void setNums(String nums) {
		this.nums = nums;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the shengid
	 */
	public int getShengid() {
		return shengid;
	}
	/**
	 * @param shengid the shengid to set
	 */
	public void setShengid(int shengid) {
		this.shengid = shengid;
	}
	/**
	 * @return the shiid
	 */
	public int getShiid() {
		return shiid;
	}
	/**
	 * @param shiid the shiid to set
	 */
	public void setShiid(int shiid) {
		this.shiid = shiid;
	}
	/**
	 * @return the quid
	 */
	public int getQuid() {
		return quid;
	}
	/**
	 * @param quid the quid to set
	 */
	public void setQuid(int quid) {
		this.quid = quid;
	}
	/**
	 * @return the pushDate
	 */
	public Date getPushDate() {
		return pushDate;
	}
	/**
	 * @param pushDate the pushDate to set
	 */
	public void setPushDate(Date pushDate) {
		this.pushDate = pushDate;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int id, String nums, String name, String sex, int shengid, int shiid, int quid, Date pushDate) {
		super();
		this.id = id;
		this.nums = nums;
		this.name = name;
		this.sex = sex;
		this.shengid = shengid;
		this.shiid = shiid;
		this.quid = quid;
		this.pushDate = pushDate;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Driver [id=" + id + ", nums=" + nums + ", name=" + name + ", sex=" + sex + ", shengid=" + shengid
				+ ", shiid=" + shiid + ", quid=" + quid + ", pushDate=" + pushDate + "]";
	}
	/* (non Javadoc) 
	 * @Title: hashCode
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nums == null) ? 0 : nums.hashCode());
		result = prime * result + ((pushDate == null) ? 0 : pushDate.hashCode());
		result = prime * result + quid;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + shengid;
		result = prime * result + shiid;
		return result;
	}
	/* (non Javadoc) 
	 * @Title: equals
	 * @Description: TODO
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Driver other = (Driver) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nums == null) {
			if (other.nums != null)
				return false;
		} else if (!nums.equals(other.nums))
			return false;
		if (pushDate == null) {
			if (other.pushDate != null)
				return false;
		} else if (!pushDate.equals(other.pushDate))
			return false;
		if (quid != other.quid)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (shengid != other.shengid)
			return false;
		if (shiid != other.shiid)
			return false;
		return true;
	}
	
	
}
