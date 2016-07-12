package com.checape.core.entity;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractEntity <I extends Serializable>
{
	protected I id;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public I getId()
	{
		return id;
	}

	public void setId(I id)
	{
		this.id = id;
	}
}
