package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address", schema = "public")
public class AddressEntity extends AbstractEntity<Long> 
{
	private String zipCode;
	private String street;
	private String number;
	private String complement;
	private String district;
	private StateEntity state;
	private CityEntity city;
	
	public String getZipCode() 
	{
		return zipCode;
	}
	
	public void setZipCode(String zipCode) 
	{
		this.zipCode = zipCode;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getNumber() 
	{
		return number;
	}
	
	public void setNumber(String number) 
	{
		this.number = number;
	}
	
	public String getComplement() 
	{
		return complement;
	}
	
	public void setComplement(String complement) 
	{
		this.complement = complement;
	}
	
	public String getDistrict() 
	{
		return district;
	}
	
	public void setDistrict(String district) 
	{
		this.district = district;
	}
	
	@ManyToOne
	public StateEntity getState() 
	{
		return state;
	}
	
	public void setState(StateEntity state) 
	{
		this.state = state;
	}
	
	@ManyToOne
	public CityEntity getCity() 
	{
		return city;
	}
	
	public void setCity(CityEntity city) 
	{
		this.city = city;
	}
}
