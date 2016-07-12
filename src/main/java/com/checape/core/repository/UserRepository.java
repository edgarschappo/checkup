package com.checape.core.repository;

import com.checape.core.entity.UserEntity;
import com.checape.core.producer.EntityManagerProducer;
import org.apache.deltaspike.data.api.EntityManagerConfig;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.decorator.Decorator;

@Repository(forEntity = UserEntity.class)
public interface UserRepository extends EntityRepository<UserEntity, Long>
{
}
