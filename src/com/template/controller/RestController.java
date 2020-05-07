package com.template.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("")
public class RestController {

	@GET
	@Path("{template}")
	@Produces(MediaType.TEXT_HTML)
	public String generateContent(@PathParam("template") String template, @QueryParam("id") String id) {	
		return "Template: " + template + " | Id: " + id;
	}
}