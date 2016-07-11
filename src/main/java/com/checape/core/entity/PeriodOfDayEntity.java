package com.checape.core.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "periodofdayentity", schema = "public")
public class PeriodOfDayEntity extends AbstractEntity<Long>
{
	private Time initialTime;
	private Time finalTime;
	
	public Time getInitialTime() 
	{
		return initialTime;
	}
	
	public void setInitialTime(Time initialTime) 
	{
		this.initialTime = initialTime;
	}
	
	public Time getFinalTime() 
	{
		return finalTime;
	}
	
	public void setFinalTime(Time finalTime) 
	{
		this.finalTime = finalTime;
	}
}
