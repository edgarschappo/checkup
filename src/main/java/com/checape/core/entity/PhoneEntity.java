package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phone", schema = "public")
public class PhoneEntity extends AbstractEntity<Long>
{
	private String number;
	private PhoneTypeEntity type;
	
	public String getNumber() 
	{
		return number;
	}
	
	public void setNumber(String number) 
	{
		this.number = number;
	}
	
	@ManyToOne
	public PhoneTypeEntity getType() 
	{
		return type;
	}
	
	public void setType(PhoneTypeEntity type) 
	{
		this.type = type;
	}	
}
