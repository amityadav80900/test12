package com.icl.epod.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity {

	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "CREATE_DATE")
	private Date createDate;

	public RoleEntity() {

	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
