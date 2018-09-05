package com.checape.core.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import com.checape.core.entity.CityEntity;

@Repository(forEntity = CityEntity.class)
public interface CityRepository  extends EntityRepository<CityEntity, Long>
{
	public CityEntity findByCode(String code);
}
