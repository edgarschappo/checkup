package com.checape.core.rest;

import com.checape.core.entity.AbstractEntity;
import com.checape.core.service.AbstractService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.List;

public abstract class AbstractEntryPoint <I extends Serializable, E extends AbstractEntity<I>, R extends EntityRepository<E, I>>
{
	private @Inject AbstractService<I, E, R> service;

	@GET
	public Response getAll(){
		List<E> result = service.getAll();
		return Response.ok(getSerializer().toJson(result)).build();
	}

	protected Gson getSerializer()
	{
		return new GsonBuilder().create();
	}
}
