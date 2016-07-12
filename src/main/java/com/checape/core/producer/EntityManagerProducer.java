package com.checape.core.producer;

import org.apache.deltaspike.data.api.EntityManagerResolver;
import org.apache.deltaspike.jpa.api.entitymanager.PersistenceUnitName;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.*;

@ApplicationScoped
public class EntityManagerProducer implements EntityManagerResolver
{
	@Inject
	@PersistenceUnitName("com.checape.core")
	EntityManagerFactory emf;

	@Produces
	@Default
	@RequestScoped
	EntityManager ProducesEntityManager()
	{
		return this.emf.createEntityManager();
	}

	protected void closeEntityManager(@Disposes @Default EntityManager entityManager)
	{
		if (entityManager.isOpen())
		{
			entityManager.close();
		}
	}

	@Override
	public EntityManager resolveEntityManager()
	{
		return ProducesEntityManager();
	}
}
