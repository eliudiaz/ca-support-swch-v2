/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.infrastructure.security;

import java.io.IOException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response.Status;

/**
 *
 * @author edcracken
 */
public class HttpAuthInterceptor implements ContainerRequestFilter {

    @Override
    public void filter(ContainerRequestContext containerRequest) throws IOException {
        //GET, POST, PUT, DELETE, ...
        String method = containerRequest.getMethod();

        // myresource
        String path = containerRequest.getUriInfo().getPath();

        //Get the authentification passed in HTTP headers parameters
        String auth = containerRequest.getHeaderString("authorization");

        //If the user does not have the right (does not provide any HTTP Basic Auth)
        if (auth == null) {
            throw new WebApplicationException(Status.UNAUTHORIZED);
        }

        //lap : loginAndPassword
        String[] lap = BasicAuth.decode(auth);

        //If login or password fail
        if (lap == null || lap.length != 2) {
            throw new WebApplicationException(Status.UNAUTHORIZED);
        }

        //implementacion consulta usuarios
        //User authentificationResult =  AuthentificationThirdParty.authentification(lap[0], lap[1]);
        //Our system refuse login and password
        if (null == null) {
            throw new WebApplicationException(Status.UNAUTHORIZED);
        }

    }

}
