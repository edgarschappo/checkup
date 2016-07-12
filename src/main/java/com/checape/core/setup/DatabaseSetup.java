package com.checape.core.setup;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class DatabaseSetup implements SetupStartInterface, SetupDestroyInterface
{
	@Inject
	EntityManager em;

	@Override
	public void run()
	{
		em.getTransaction().isActive();
	}

	@Override
	public void runDestroy()
	{
		if(em.isOpen()){
			em.close();
			if(em.getEntityManagerFactory().isOpen())
				em.getEntityManagerFactory().close();
		}
	}

	@Override
	public int startupSequence()
	{
		return 0;
	}

	@Override
	public int destroySequence()
	{
		return 999999;
	}
}
