package com.checape.core.produces;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProduces
{
	EntityManagerFactory sessionFactory;
	EntityManager entityManager;

	EntityManagerProduces()
	{
		if(sessionFactory == null)
			sessionFactory = Persistence.createEntityManagerFactory("com.checape.core");
	}

	@Produces
	EntityManager ProducesEntityManager()
	{
		if(entityManager == null)
			entityManager = sessionFactory.createEntityManager();
		return entityManager;
	}
}
