package com.checape.core.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="role")
public class RoleEntity extends AbstractEntity<Long>
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String code;
	private String name;

	@ManyToMany
	@JoinTable(name = "Role_users")
	private List<UserEntity> users;

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
}
