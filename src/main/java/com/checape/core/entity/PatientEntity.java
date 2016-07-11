package com.checape.core.entity;

import java.util.GregorianCalendar;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.checape.core.entity.enums.Gender;

@Entity
@Table(name = "patient", schema = "public")
public class PatientEntity extends AbstractEntity<Long>
{
	private DocumentTypeEntity documentType;
	private String documentNumber;
	private GregorianCalendar bornDate;
	private Gender gender;
	private HealthCarePlanEntity healthCarePlan;
	private Set<PatientEntity> dependent;
	private Boolean isDependent;
	private KinshipEntity kinship;
	private PatientEntity responsible;
	private UserEntity user;

	@ManyToOne
	public DocumentTypeEntity getDocumentType()
	{
		return documentType;
	}
	
	public void setDocumentType(DocumentTypeEntity documentType)
	{
		this.documentType = documentType;
	}
	
	public String getDocumentNumber()
	{
		return documentNumber;
	}
	
	public void setDocumentNumber(String documentNumber)
	{
		this.documentNumber = documentNumber;
	}
	
	public GregorianCalendar getBornDate()
	{
		return bornDate;
	}
	
	public void setBornDate(GregorianCalendar bornDate)
	{
		this.bornDate = bornDate;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
	
	@ManyToOne
	public HealthCarePlanEntity getHealthCarePlan()
	{
		return healthCarePlan;
	}
	
	public void setHealthCarePlan(HealthCarePlanEntity healthCarePlan)
	{
		this.healthCarePlan = healthCarePlan;
	}
	
	@ManyToMany
	public Set<PatientEntity> getDependent()
	{
		return dependent;
	}

	public void setDependent(Set<PatientEntity> dependent)
	{
		this.dependent = dependent;
	}

	public Boolean getIsDependent()
	{
		return isDependent;
	}

	public void setIsDependent(Boolean isDependent)
	{
		this.isDependent = isDependent;
	}

	@ManyToOne
	public KinshipEntity getKinship()
	{
		return kinship;
	}

	public void setKinship(KinshipEntity kinship)
	{
		this.kinship = kinship;
	}

	@ManyToOne
	public PatientEntity getResponsible()
	{
		return responsible;
	}

	public void setResponsible(PatientEntity responsible)
	{
		this.responsible = responsible;
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
}
