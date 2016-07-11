package com.checape.core.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "agency", schema = "public")
public class AgencyEntity extends AbstractEntity<Long> 
{
	private String acronym;
	private String description;
	
	public String getAcronym() 
	{
		return acronym;
	}
	
	public void setAcronym(String acronym) 
	{
		this.acronym = acronym;
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
