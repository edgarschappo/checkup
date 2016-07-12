package com.checape.core.setup;

import com.google.common.collect.Lists;
import org.apache.deltaspike.core.api.lifecycle.Destroyed;
import org.apache.deltaspike.core.api.lifecycle.Initialized;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import java.lang.annotation.Annotation;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

@ApplicationScoped public class SetupRunner
{
	@Inject
	private Instance<SetupStartInterface> startInstances;

	@Inject
	private Instance<SetupDestroyInterface> destroyInstances;

	private void runSetup(@Observes @Initialized ServletContext ctx)
	{
		List<SetupStartInterface> setupList = getStartInstances();

		for (SetupStartInterface setup : setupList)
		{
			setup.run();
		}
	}

	private void destroyServletContext(@Observes @Destroyed ServletContext ctx)
	{
		List<SetupDestroyInterface> setupList = getDestroyInstances();

		for (SetupDestroyInterface setup : setupList)
		{
			setup.runDestroy();
		}
		Enumeration<Driver> drivers = DriverManager.getDrivers();
		while (drivers.hasMoreElements())
		{
			Driver driver = drivers.nextElement();
			try
			{
				DriverManager.deregisterDriver(driver);
				//LOG.log(Level.INFO, String.format("deregistering jdbc driver: %s", driver));
			}
			catch (SQLException e)
			{
				//LOG.log(Level.SEVERE, String.format("Error deregistering driver %s", driver), e);
			}

		}
	}

	private List<SetupStartInterface> getStartInstances()
	{
		List<SetupStartInterface> setupList = Lists.newArrayList(startInstances.iterator());

		Collections.sort(setupList, new Comparator<SetupStartInterface>()
		{
			@Override
			public int compare(SetupStartInterface o1, SetupStartInterface o2)
			{
				//TODO return  1 se o1 depois de o2
				//TODO return -1 se o1 antes de  o2
				//TODO return  0 otherwise

				return o1.startupSequence() < o2.startupSequence() ?
						-1 :
						(o1.startupSequence() > o2.startupSequence()) ? 1 : 0;
			}
		});
		return setupList;
	}

	private List<SetupDestroyInterface> getDestroyInstances()
	{
		List<SetupDestroyInterface> setupList = Lists.newArrayList(destroyInstances.iterator());

		Collections.sort(setupList, new Comparator<SetupDestroyInterface>()
		{
			@Override
			public int compare(SetupDestroyInterface o1, SetupDestroyInterface o2)
			{
				return o1.destroySequence() < o2.destroySequence() ?
						1 :
						(o1.destroySequence() > o2.destroySequence()) ? -1 : 0;
			}
		});
		return setupList;
	}

}
