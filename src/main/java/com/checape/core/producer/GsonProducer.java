package com.checape.core.producer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@ApplicationScoped
public class GsonProducer
{
	@Produces
	Gson gsonProducer(){
		final GsonBuilder gsonBuilder = new GsonBuilder();
		//TODO: Cadastrar os TypeAdapters
		//gsonBuilder.registerTypeAdapter(Book.class, new BookTypeAdapter());
		final Gson gson = gsonBuilder.create();
		return gson;
	}
}
