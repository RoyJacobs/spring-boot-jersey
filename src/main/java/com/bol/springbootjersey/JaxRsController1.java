package com.bol.springbootjersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class JaxRsController1 {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Hello from jaxrs-1";
    }
}