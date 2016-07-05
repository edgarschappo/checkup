package com.checape.core.entity;

import javax.persistence.*;

@Entity
@Table(name="state")
public class StateEntity extends AbstractEntity<Long>
{
	private Long id;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

}
