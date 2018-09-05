package com.checape.core.service;

import javax.persistence.NoResultException;

import org.apache.deltaspike.data.impl.meta.NonEntityException;

import com.checape.core.entity.StateEntity;
import com.checape.core.repository.StateRepository;

public class StateService extends AbstractService<Long, StateEntity, StateRepository> implements ServiceInterface<StateEntity, Long>
{
	public StateEntity findByCode(String code)
	{
		try
		{
			return repository.findByCode(code);
		}
		catch(NoResultException nre)
		{
			return null;
		}
		catch(NonEntityException nee)
		{
			return null;
		}
	}
}
