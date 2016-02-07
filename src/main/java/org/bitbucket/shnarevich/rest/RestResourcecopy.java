package org.bitbucket.shnarevich.rest;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;
import org.bitbucket.shnarevich.laboratory.entity.UserEntity;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("users")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class RestResourcecopy {
    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getMessage() {
        return Response.ok(new RestResourceModel("Hello World")).build();
    }
}