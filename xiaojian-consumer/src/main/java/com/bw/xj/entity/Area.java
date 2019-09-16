package com.bw.xj.entity;

import java.io.Serializable;

/**
 * 
 * @ClassName: Area 
 * @Description: TODO
 * @author: 肖健
 * @date: 2019年9月12日 上午9:34:52
 */
public class Area implements Serializable{
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private int patentid;
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
	 * @return the patentid
	 */
	public int getPatentid() {
		return patentid;
	}
	/**
	 * @param patentid the patentid to set
	 */
	public void setPatentid(int patentid) {
		this.patentid = patentid;
	}
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Area(int id, String name, int patentid) {
		super();
		this.id = id;
		this.name = name;
		this.patentid = patentid;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Area [id=" + id + ", name=" + name + ", patentid=" + patentid + "]";
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
		result = prime * result + patentid;
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
		Area other = (Area) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patentid != other.patentid)
			return false;
		return true;
	}
	
}
