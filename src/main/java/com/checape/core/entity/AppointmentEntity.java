package com.checape.core.entity;

import java.sql.Time;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.checape.core.entity.enums.AppointmentStatus;

@Entity
@Table(name = "appointment", schema = "public")
public class AppointmentEntity extends AbstractEntity<Long>
{
	private GregorianCalendar appointmentDate;
	private Time initialTime;
	private Long duration;
	private PatientEntity patient;
	private AppointmentStatus AppointmentStatus;
	private AppointmentTypeEntity appointmentType;
	private CompanyEntity company;
	private ProfessionalEntity professional;
	
	public GregorianCalendar getAppointmentDate()
	{
		return appointmentDate;
	}
	
	public void setAppointmentDate(GregorianCalendar appointmentDate)
	{
		this.appointmentDate = appointmentDate;
	}
	
	public Time getInitialTime()
	{
		return initialTime;
	}
	
	public void setInitialTime(Time initialTime)
	{
		this.initialTime = initialTime;
	}
	
	public Long getDuration()
	{
		return duration;
	}
	
	public void setDuration(Long duration)
	{
		this.duration = duration;
	}
	
	@ManyToOne
	public PatientEntity getPatient()
	{
		return patient;
	}
	
	public void setPatient(PatientEntity patient)
	{
		this.patient = patient;
	}
		
	public AppointmentStatus getAppointmentStatus()
	{
		return AppointmentStatus;
	}

	public void setAppointmentStatus(AppointmentStatus appointmentStatus)
	{
		AppointmentStatus = appointmentStatus;
	}
	
	@ManyToOne
	public AppointmentTypeEntity getAppointmentType()
	{
		return appointmentType;
	}

	public void setAppointmentType(AppointmentTypeEntity appointmentType)
	{
		this.appointmentType = appointmentType;
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
	
	@ManyToOne
	public ProfessionalEntity getProfessional()
	{
		return professional;
	}
	
	public void setProfessional(ProfessionalEntity professional) 
	{
		this.professional = professional;
	}
}
