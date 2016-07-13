package com.checape.core.service;

import com.checape.core.entity.RoleEntity;
import com.checape.core.repository.RoleRepository;

import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;

public class RoleService extends AbstractService<Long, RoleEntity, RoleRepository> implements ServiceInterface<RoleEntity, Long>
{
	public RoleEntity findByCode(String code)
	{
		try
		{
			return repository.findByCode(code);
		}
		catch (NoResultException nrEx)
		{
			return null;
		}
		catch (NonUniqueResultException nurEx)
		{
			return null;
		}
	}
}
