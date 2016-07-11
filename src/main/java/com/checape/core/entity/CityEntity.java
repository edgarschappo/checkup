package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "city", schema = "public")
public class CityEntity extends AbstractEntity<Long> 
{
	private String name;
	private StateEntity state;
	private Long initialZipCode;
	private Long finalZipCode;
	
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
	
	public Long getInitialZipCode() 
	{
		return initialZipCode;
	}
	
	public void setInitialZipCode(Long initialZipCode) 
	{
		this.initialZipCode = initialZipCode;
	}
	
	public Long getFinalZipCode() 
	{
		return finalZipCode;
	}
	
	public void setFinalZipCode(Long finalZipCode) 
	{
		this.finalZipCode = finalZipCode;
	}	
}
