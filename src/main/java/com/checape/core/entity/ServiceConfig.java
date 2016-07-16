package com.checape.core.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "serviceconfig", schema = "public")
public class ServiceConfig extends AbstractEntity<Long>
{
	private SpecialityEntity speciality;
	private Long duration;
	private Long buffer;
	private BigDecimal cost;
	private CompanyEntity company;
	
	@ManyToOne
	public SpecialityEntity getSpeciality() 
	{
		return speciality;
	}
	
	public void setSpeciality(SpecialityEntity speciality) 
	{
		this.speciality = speciality;
	}
	
	public Long getDuration() 
	{
		return duration;
	}
	
	public void setDuration(Long duration) 
	{
		this.duration = duration;
	}
	
	public Long getBuffer() 
	{
		return buffer;
	}
	
	public void setBuffer(Long buffer) 
	{
		this.buffer = buffer;
	}
	
	public BigDecimal getCost() 
	{
		return cost;
	}
	
	public void setCost(BigDecimal cost) 
	{
		this.cost = cost;
	}

	@ManyToOne
	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) 
	{
		this.company = company;
	}
}
