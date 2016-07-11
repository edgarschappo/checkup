package com.checape.core;

import com.checape.core.rest.EntryPointInterface;
import com.checape.core.rest.EntryPoint;
import org.reflections.Reflections;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class Core extends Application
{
	@Inject
	Reflections reflections;

	@Inject
	EntityManager entityManager;

	@Override
	public Set<Class<?>> getClasses()
	{
		Set<Class<?>> classes = new HashSet<>();
		//classes.add(EntryPoint.class);
		classes = getClassesByReflection();
		return classes;
	}

	private Set<Class<?>> getClassesByReflection()
	{
		Set<Class<?>> classes = new HashSet<>();
		Set<Class<? extends EntryPointInterface>> entityClasses = reflections.getSubTypesOf(EntryPointInterface.class);
		for(Class c : entityClasses)
		{
			classes.add(c);
		}
		return classes;
	}
}
