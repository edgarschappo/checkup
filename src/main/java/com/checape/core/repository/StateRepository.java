package com.checape.core.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.checape.core.entity.StateEntity;

@Repository(forEntity = StateEntity.class)
public interface StateRepository extends EntityRepository<StateEntity, Long>
{
	public StateEntity findByCode(String code);
}
