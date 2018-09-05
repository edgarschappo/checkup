package com.checape.core.service;

import javax.persistence.NoResultException;

import org.apache.deltaspike.data.impl.meta.NonEntityException;

import com.checape.core.entity.CityEntity;
import com.checape.core.repository.CityRepository;

public class CityService extends AbstractService<Long, CityEntity, CityRepository> implements ServiceInterface<CityEntity, Long>
{
	public CityEntity findByCode(String code)
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
