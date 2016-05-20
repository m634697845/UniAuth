package com.dianrong.common.uniauth.common.bean.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Arc on 14/1/16.
 */
public class RoleDto implements Serializable {
	private Integer id;
	private String name;
	private String description;
	private Byte status;
	private Integer domainId;
	private Integer roleCodeId;
	private Integer permissionId;
	
	private DomainDto domain;
	private String roleCode;

	private List<GroupDto> groupList;
	private Map<String, Set<String>> permMap;
	private Map<String, Set<PermissionDto>> permDtoMap;

	//whether this role connected with this permission
	//private boolean permChecked;
	//whether this role connected with this user
	//private boolean roleChecked;
	//whether this role connected with this group
	//private boolean groupChecked;
	
	//whether this role connected with a permission, user or group
	private Boolean checked;
	
	public Integer getPermissionId() {
		return permissionId;
	}

	public RoleDto setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
		return this;
	}

	public Integer getRoleCodeId() {
		return roleCodeId;
	}

	public RoleDto setRoleCodeId(Integer roleCodeId) {
		this.roleCodeId = roleCodeId;
		return this;
	}

	public Integer getDomainId() {
		return domainId;
	}

	public RoleDto setDomainId(Integer domainId) {
		this.domainId = domainId;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public RoleDto setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public RoleDto setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public RoleDto setDescription(String description) {
		this.description = description;
		return this;
	}

	public Byte getStatus() {
		return status;
	}

	public RoleDto setStatus(Byte status) {
		this.status = status;
		return this;
	}

	public DomainDto getDomain() {
		return domain;
	}

	public RoleDto setDomain(DomainDto domain) {
		this.domain = domain;
		return this;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public RoleDto setRoleCode(String roleCode) {
		this.roleCode = roleCode;
		return this;
	}

	public List<GroupDto> getGroupList() {
		return groupList;
	}

	public RoleDto setGroupList(List<GroupDto> groupList) {
		this.groupList = groupList;
		return this;
	}


	public Map<String, Set<String>> getPermMap() {
		return permMap;
	}

	public RoleDto setPermMap(Map<String, Set<String>> permMap) {
		this.permMap = permMap;
		return this;
	}

	public Boolean getChecked() {
		return checked;
	}

	public RoleDto setChecked(Boolean checked) {
		this.checked = checked;
		return this;
	}

	public Map<String, Set<PermissionDto>> getPermDtoMap() {
		return permDtoMap;
	}

	public RoleDto setPermDtoMap(Map<String, Set<PermissionDto>> permDtoMap) {
		this.permDtoMap = permDtoMap;
		return this;
	}
}
