package com.template.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("")
public class RestController {

    private static Logger _log = LoggerFactory.getLogger(RestController.class);

    @GET
    @Path("{template}")
    @Produces(MediaType.TEXT_PLAIN)
    public String generateContent(@PathParam("template") String template, @QueryParam("id") String id) {
        _log.info("[generateContent()] Request Params: Template: {} | Id: {}", template, id);
        return "Template: " + template + " | Id: " + id;
    }
}