package com.checape.core.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "company", schema = "public")
public class CompanyEntity extends AbstractEntity<Long>
{
	private String name;
	private String shortName;
	private String registrationNumber;
	private AddressEntity address;
	private Set<PhoneEntity> phones;
	private Set<ProfessionalEntity> professionals;
	private Set<PatientEntity> patient;
	private Set<UserEntity> users;
	private UserEntity adminUser;
	private Boolean active;
	
	@ManyToMany
	public Set<PatientEntity> getPatient() {
		return patient;
	}

	public void setPatient(Set<PatientEntity> patient) {
		this.patient = patient;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public void setShortName(String shortName)
	{
		this.shortName = shortName;
	}
	
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}
	
	public void setRegistrationNumber(String registrationNumber)
	{
		this.registrationNumber = registrationNumber;
	}
	
	@OneToOne
	public AddressEntity getAddress()
	{
		return address;
	}
	
	public void setAddress(AddressEntity address)
	{
		this.address = address;
	}
	
	@OneToMany
	public Set<PhoneEntity> getPhones()
	{
		return phones;
	}
	
	public void setPhones(Set<PhoneEntity> phones)
	{
		this.phones = phones;
	}
	
	@ManyToMany
	public Set<ProfessionalEntity> getProfessionals()
	{
		return professionals;
	}
	
	public void setProfessionals(Set<ProfessionalEntity> professionals)
	{
		this.professionals = professionals;
	}
	
	@ManyToMany
	public Set<UserEntity> getUsers()
	{
		return users;
	}
	
	public void setUsers(Set<UserEntity> users)
	{
		this.users = users;
	}
	
	@ManyToOne
	public UserEntity getAdminUser()
	{
		return adminUser;
	}
	
	public void setAdminUser(UserEntity adminUser)
	{
		this.adminUser = adminUser;
	}
	
	public Boolean getActive()
	{
		return active;
	}
	
	public void setActive(Boolean active)
	{
		this.active = active;
	}
}
