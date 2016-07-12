package com.checape.core.repository;

import com.checape.core.entity.CompanyEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = CompanyEntity.class)
public interface CompanyRepository extends EntityRepository<CompanyEntity, Long>
{
}
