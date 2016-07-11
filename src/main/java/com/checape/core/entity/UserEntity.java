package com.checape.core.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
@Table(name="user", schema = "public")
public class UserEntity extends AbstractEntity<Long>
{
	private String code;
	private String name;
	private String password;	
	private String email;	
	private Set<PhoneEntity> phones;
	//Um medico pode trabalhar em mais de uma clinica
	private Set<CompanyEntity> company;
	private boolean active;
	
	@OneToMany
	public Set<PhoneEntity> getPhones() {
		return phones;
	}

	public void setPhones(Set<PhoneEntity> phones) {
		this.phones = phones;
	}

	@ManyToMany
	public Set<CompanyEntity> getCompany() {
		return company;
	}

	public void setCompany(Set<CompanyEntity> company) {
		this.company = company;
	}

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
