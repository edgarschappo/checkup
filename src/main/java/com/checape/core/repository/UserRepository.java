package com.checape.core.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;
import com.checape.core.entity.UserEntity;

@Repository(forEntity = UserEntity.class)
public interface UserRepository extends EntityRepository<UserEntity, Long>
{
	public UserEntity findByCode(String code);
}
