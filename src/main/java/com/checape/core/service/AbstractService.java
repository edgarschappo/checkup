package com.checape.core.service;

import com.checape.core.entity.AbstractEntity;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractService<I extends Serializable, E extends AbstractEntity<I>, R extends EntityRepository<E, I>>
{
	@Inject
	R repository;

	public E getById(I id)
	{
		return repository.findBy(id);
	}

	public List<E> getAll()
	{
		return repository.findAll();
	}

	public E create(E entity)
	{
		return repository.saveAndFlush(entity);
	}

	public E update(E entity)
	{
		return null;
	}

	public void delete(E entity)
	{
		repository.remove(entity);
	}

}
