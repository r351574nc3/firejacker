package com.github.r351574nc3.firecrackr.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/auth")
public class Auth {

	@GET
	@Path("/register")
	public Response register() {
                
		return Response.status(200).entity("success").build();

	}

}
