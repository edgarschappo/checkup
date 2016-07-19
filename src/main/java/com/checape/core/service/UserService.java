package com.checape.core.service;

import javax.persistence.NoResultException;

import org.apache.deltaspike.data.impl.meta.NonEntityException;

import com.checape.core.entity.UserEntity;
import com.checape.core.repository.UserRepository;

public class UserService extends AbstractService<Long, UserEntity, UserRepository> implements ServiceInterface<UserEntity, Long>
{
	public UserEntity findByCode(String code)
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
