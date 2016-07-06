package com.checape.core.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="user", schema = "public")
public class UserEntity extends AbstractEntity<Long>
{
	private String code;
	private String name;
	private String email;
	private String password;
	private boolean active;

	private Set<RoleEntity> role;

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

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	@ManyToMany@JoinTable(
			name="user_roles",
			joinColumns={@JoinColumn(name="user_id", referencedColumnName = "id")},
			inverseJoinColumns={@JoinColumn(name="role_id", referencedColumnName = "id")}
	)
	public Set<RoleEntity> getRole()
	{
		return role;
	}

	public void setRole(Set<RoleEntity> role)
	{
		this.role = role;
	}
}
