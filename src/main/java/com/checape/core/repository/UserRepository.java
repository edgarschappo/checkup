package com.checape.core.repository;

import com.checape.core.entity.UserEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Query;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = UserEntity.class)
public interface UserRepository extends EntityRepository<UserEntity, Long>
{
	public UserEntity findByCode(String code);
}
