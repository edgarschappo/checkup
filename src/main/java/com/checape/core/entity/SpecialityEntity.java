package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "speciality", schema = "public")
public class SpecialityEntity extends AbstractEntity<Long>
{
	private String code;
	private String name;
	
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
