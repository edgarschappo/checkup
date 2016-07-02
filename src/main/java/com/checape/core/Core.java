package com.checape.core;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class Core
{
	@GET
	public Response info(){
		String teste = "";

		teste = "Olá munto!";

		return Response.ok(teste).build();
	}
}
