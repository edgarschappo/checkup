package com.checape.core.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="role", schema = "public")
public class RoleEntity extends AbstractEntity<Long>
{
	private String code;
	private String name;

	private Set<UserEntity> users;

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@ManyToMany(mappedBy = "role")
	public Set<UserEntity> getUsers()
	{
		return users;
	}

	public void setUsers(Set<UserEntity> users)
	{
		this.users = users;
	}
}
