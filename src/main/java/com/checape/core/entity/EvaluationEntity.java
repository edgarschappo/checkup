package com.checape.core.entity;

import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.checape.core.entity.enums.EvaluationScore;

@Entity
@Table(name = "evaluation", schema = "public")
public class EvaluationEntity extends AbstractEntity<Long> 
{
	private EvaluationScore score;
	private String commentary;
	private UserEntity valuer;
	private ProfessionalEntity professional;
	
	@ManyToOne
	public ProfessionalEntity getProfessional() 
	{
		return professional;
	}
	
	public void setProfessional(ProfessionalEntity professional) 
	{
		this.professional = professional;
	}

	private GregorianCalendar date;
	
	public EvaluationScore getScore() 
	{
		return score;
	}
	
	public void setScore(EvaluationScore score) 
	{
		this.score = score;
	}
	
	public String getCommentary() 
	{
		return commentary;
	}
	
	public void setCommentary(String commentary) 
	{
		this.commentary = commentary;
	}
	
	@ManyToOne
	public UserEntity getValuer() 
	{
		return valuer;
	}
	
	public void setValuer(UserEntity valuer) 
	{
		this.valuer = valuer;
	}
	
	public GregorianCalendar getDate() 
	{
		return date;
	}
	
	public void setDate(GregorianCalendar date) 
	{
		this.date = date;
	}	
}
