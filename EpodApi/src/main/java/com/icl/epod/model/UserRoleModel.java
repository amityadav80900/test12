package com.icl.epod.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class UserRoleModel {

	private Integer userId;

	private List<Integer> roleId=new ArrayList<Integer>();

	private Date createDate;

	private Date updateDate;

	private String createdB;

	private String createdBY;
	
	private String updateBY;
	

	public String getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(String createdBY) {
		this.createdBY = createdBY;
	}

	public String getUpdateBY() {
		return updateBY;
	}

	public void setUpdateBY(String updateBY) {
		this.updateBY = updateBY;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreatedB() {
		return createdB;
	}

	public void setCreatedB(String createdB) {
		this.createdB = createdB;
	}

	public UserRoleModel() {

	}


	public List<Integer> getRoleId() {
		return roleId;
	}

	public void setRoleId(List<Integer> roleId) {
		this.roleId = roleId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
