package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city", schema = "public")
public class CityEntity extends AbstractEntity<Long> 
{
	private String code;
	private String name;
	private StateEntity state;	
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
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

	public String getCode() 
	{
		return code;
	}

	public void setCode(String code) 
	{
		this.code = code;
	}	
}
