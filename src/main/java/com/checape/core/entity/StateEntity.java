package com.checape.core.entity;

import javax.persistence.*;

@Entity
@Table(name = "state", schema = "public")
public class StateEntity extends AbstractEntity<Long> 
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
