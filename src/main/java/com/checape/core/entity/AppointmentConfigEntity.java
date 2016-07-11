package com.checape.core.entity;

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
	private SpecialityEntity speciality;
	private DayOfWeek dayofweek;
	private Set<PeriodOfDayEntity> periodofday;
	//in minutes
	private Long attendancetime;
	//Um medico pode trabalhar em mais de uma empresa
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
	
	public DayOfWeek getDayofweek()
	{
		return dayofweek;
	}

	public void setDayofweek(DayOfWeek dayofweek)
	{
		this.dayofweek = dayofweek;
	}
	
	@OneToMany
	public Set<PeriodOfDayEntity> getPeriodofday()
	{
		return periodofday;
	}

	public void setPeriodofday(Set<PeriodOfDayEntity> periodofday)
	{
		this.periodofday = periodofday;
	}

	public Long getAttendancetime()
	{
		return attendancetime;
	}
	
	public void setAttendancetime(Long attendancetime)
	{
		this.attendancetime = attendancetime;
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
