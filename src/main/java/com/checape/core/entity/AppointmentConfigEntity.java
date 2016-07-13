package com.checape.core.entity;

import java.sql.Time;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.checape.core.entity.enums.DayOfWeek;

@Entity
@Table(name = "appointmentconfig", schema = "public")
public class AppointmentConfigEntity extends AbstractEntity<Long>
{
	private DayOfWeek dayofweek;
	private Time initialTime;
	private Time finalTime;	
	//Um medico pode trabalhar em mais de uma empresa
	private CompanyEntity company;
	
	public DayOfWeek getDayofweek()
	{
		return dayofweek;
	}

	public void setDayofweek(DayOfWeek dayofweek)
	{
		this.dayofweek = dayofweek;
	}
	
	public Time getInitialTime() {
		return initialTime;
	}

	public void setInitialTime(Time initialTime) {
		this.initialTime = initialTime;
	}

	public Time getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(Time finalTime) {
		this.finalTime = finalTime;
	}
	
	@ManyToOne
	public CompanyEntity getCompany()
	{
		return company;
	}

	public void setCompany(CompanyEntity company)
	{
		this.company = company;
	}
}
