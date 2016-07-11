package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "appointment", schema = "public")
public class AppointmentTypeEntity extends AbstractEntity<Long>
{
	private String code;
	private String description;
	
	public String getCode()
	{
		return code;
	}
	
	public void setCode(String code)
	{
		this.code = code;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}	
}
