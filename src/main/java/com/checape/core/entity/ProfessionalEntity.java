package com.checape.core.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "professional", schema = "public")
public class ProfessionalEntity extends AbstractEntity<Long>
{
	private TreatmentEntity treatment;
	private Set<SpecialityEntity> speciality;
	private Set<HealthCarePlanEntity> healthCarePlan;
	private String registrationCode;
	//CRM, CRO, etc.
	private AgencyEntity agency;
	private UserEntity user;
	private Set<ServiceConfig> serviceConfig;
	private Set<AppointmentConfigEntity> appointmentConfig;	
	private Set<EvaluationEntity> evaluation;

	@ManyToOne
	public TreatmentEntity getTreatment() 
	{
		return treatment;
	}
	
	public void setTreatment(TreatmentEntity treatment) 
	{
		this.treatment = treatment;
	}
	
	@ManyToMany
	public Set<SpecialityEntity> getSpeciality() 
	{
		return speciality;
	}
	
	public void setSpeciality(Set<SpecialityEntity> speciality) 
	{
		this.speciality = speciality;
	}
	
	@ManyToMany
	public Set<HealthCarePlanEntity> getHealthCarePlan() 
	{
		return healthCarePlan;
	}
	
	public void setHealthCarePlan(Set<HealthCarePlanEntity> healthCarePlan) 
	{
		this.healthCarePlan = healthCarePlan;
	}
	
	public String getRegistrationCode() 
	{
		return registrationCode;
	}
	
	public void setRegistrationCode(String registrationCode) 
	{
		this.registrationCode = registrationCode;
	}
	
	@ManyToOne
	public AgencyEntity getAgency() 
	{
		return agency;
	}
	
	public void setAgency(AgencyEntity agency) 
	{
		this.agency = agency;
	}
	
	@OneToOne
	public UserEntity getUser() 
	{
		return user;
	}
	
	public void setUser(UserEntity user) 
	{
		this.user = user;
	}
	
	@ManyToMany
	public Set<ServiceConfig> getServiceConfig() {
		return serviceConfig;
	}

	public void setServiceConfig(Set<ServiceConfig> serviceConfig) {
		this.serviceConfig = serviceConfig;
	}

	@OneToMany
	public Set<AppointmentConfigEntity> getAppointmentConfig() 
	{
		return appointmentConfig;
	}
	
	public void setAppointmentConfig(Set<AppointmentConfigEntity> appointmentConfig) 
	{
		this.appointmentConfig = appointmentConfig;
	}
	
	@OneToMany
	public Set<EvaluationEntity> getEvaluation() 
	{
		return evaluation;
	}
	
	public void setEvaluation(Set<EvaluationEntity> evaluation) 
	{
		this.evaluation = evaluation;
	}
}
