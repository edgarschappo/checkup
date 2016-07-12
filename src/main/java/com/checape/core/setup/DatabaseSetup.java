package com.checape.core.setup;

import com.checape.core.setup.annotation.Setup;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@Setup(sequence = 10)
public class DatabaseSetup implements SetupInterface
{
	/*@Inject
	EntityManager em;
	*/
	@Override
	public void run()
	{
		//em.getTransaction().isActive();
	}
}
