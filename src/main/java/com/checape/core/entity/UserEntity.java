package com.checape.core.entity;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
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

	@Field(index = Index.YES, store = Store.YES)
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

	public UserEntity (){}

	public UserEntity (String code, String name, String password, String email, Set<PhoneEntity> phones, Set<CompanyEntity> company, boolean active){
		this.code = code;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phones = phones;
		this.company = company;
		this.active = active;
	}
}
