package com.checape.core;

import com.checape.core.rest.EntryPointInterface;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@ApplicationPath("/api")
public class Core extends Application
{
	@Inject
	Instance<EntryPointInterface> entryPoints;

	@Override
	public Set<Class<?>> getClasses()
	{
		return getClassesByReflection();
	}

	private Set<Class<?>> getClassesByReflection()
	{
		Set<Class<?>> classes = new HashSet<>();
		Iterator<EntryPointInterface> it = entryPoints.iterator();
		while(it.hasNext())
		{
			Class c = it.next().getClass();
			classes.add(c);
		}
		return classes;
	}
}