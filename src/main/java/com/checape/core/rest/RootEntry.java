package com.checape.core.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class RootEntry implements EntryPointInterface
{
	@GET
	public Response info(){
		String teste = "";

		teste = "Olá munto!<br>Response";

		return Response.ok(teste).build();
	}
}
