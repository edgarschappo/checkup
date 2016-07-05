package com.checape.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="chp_user")
public class UserEntity extends AbstractEntity<Long>
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String code;
	private String name;
	private String email;
	private String password;
	private boolean active;

	@ManyToMany(mappedBy = "users")
	private List<RoleEntity> role;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

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

	public List<RoleEntity> getRole()
	{
		return role;
	}

	public void setRole(List<RoleEntity> role)
	{
		this.role = role;
	}
}
