package edu.poniperro.quickstart.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/bye")
public class GreetingResource {

    @ConfigProperty(name = "greetings.inicio")
    String msg;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String hello() {
        return msg;
    }

}