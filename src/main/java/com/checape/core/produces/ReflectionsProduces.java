package com.checape.core.produces;

import org.reflections.Reflections;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ReflectionsProduces
{
	Reflections reflections;

	@Produces
	Reflections ProducesReflections(){
		if(reflections == null)
		{
			reflections = new Reflections("com.checape.core");
		}
		return reflections;
	}
}
