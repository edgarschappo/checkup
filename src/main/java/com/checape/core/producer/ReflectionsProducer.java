package com.checape.core.producer;

import org.reflections.Reflections;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class ReflectionsProducer
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
