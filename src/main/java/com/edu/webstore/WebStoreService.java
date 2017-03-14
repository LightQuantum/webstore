package com.edu.webstore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/webstore")
public class WebStoreService {

    @GET
    @Path("/{param}")
    public Response getTestMessage(@PathParam("param") String message) {
        String responceMessage = String.format("Hello %s", message);
        return Response.status(200).entity(responceMessage).build();
    }
}
