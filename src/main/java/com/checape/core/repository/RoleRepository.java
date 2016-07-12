package com.checape.core.repository;

import com.checape.core.entity.RoleEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = RoleEntity.class)
public interface RoleRepository extends EntityRepository<RoleEntity, Long>
{
	public RoleEntity findByCode(String code);
}
