/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.renap.pub.web;

import com.renap.pub.infrastructure.dto.SwitchResponse;
import com.renap.service.SwitchAPIService;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 * API de switch expuesto en area publica y privada, es necesario que pase por
 * BASIC HTTP AUTH o algun servicio de OAUTH
 *
 * @see Este api debe ser replicado en el APISwitchPriv instalado en LAN
 * @author edcracken
 */
@Path("/v2/eservicios")
public class SwitchAPIController {

    @EJB
    SwitchAPIService service;

    /**
     * utilizar para servicios del switch que requieran el procesamiento de
     * informacion confidencial que se va almacenar o actualizar a la existente,
     * por esa razon no tiene parametro de transformacion de salida (output)
     *
     * @param serviceUri
     * @param componentUri
     * @param params
     * @return
     */
    @PUT
    @POST
    @Path(value = "/{service_uri}/{component_uri}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response get(@PathParam(value = "service_id") String serviceUri, @PathParam(value = "component_uri") String componentUri,
            MultivaluedMap<String, String> params) {

        return processRequest(serviceUri, componentUri, params, null);
    }

    /**
     * Utilizar para servicios del switch que solo extraigan informacion en
     * formato JSON/XML
     *
     * @param serviceId
     * @param componentUri
     * @param uriInfo
     * @param output
     * @return
     */
    @GET
    @Path(value = "/{service_uri}/{component_uri}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response post(@PathParam(value = "service_id") String serviceId, @PathParam(value = "component_uri") String componentUri,
            @Context UriInfo uriInfo,
            @DefaultValue(value = "json") @QueryParam(value = "output") String output) {

        MultivaluedMap<String, String> pathParameters = uriInfo.getPathParameters(true);
        return processRequest(serviceId, componentUri, pathParameters, output);
    }

    /**
     * proceso generico para procesamiento
     *
     * @param serviceId id del servicio solicitado (service_name)
     * @param userId id del usuario (user_name) que solicita inforamcion (hay
     * uno o mas por entidad)
     * @param params Parametros enviados mediante <code>URI</code>
     * @param output <strong>parametro opcional</strong>
     * @return
     */
    private Response processRequest(String serviceId, String userId,
            MultivaluedMap<String, String> params, String output) {
        SwitchResponse sRes = new SwitchResponse();
//return Response.status(Response.Status.BAD_REQUEST).entity(sRes);  //parametros ivalidos {reason:'invalid_parameters',description:'parametro x requerido'}
        return Response.ok(sRes).build();
    }

    @GET
    @Path(value = "/media-resources/{service_id}/{component_uri}")
    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response media(@PathParam(value = "service_id") String serviceId, @PathParam(value = "component_uri") String component_uri,
            @DefaultValue(value = "json") @QueryParam(value = "output") String output) {
        byte[] file = new byte[100];
        Response.ResponseBuilder ok = Response.ok(file, MediaType.APPLICATION_OCTET_STREAM);
        //return Response.status(Response.Status.BAD_REQUEST).entity(sRes);  //parametros faltantes
        if (output.equals("attached")) {
            ok.header("content-disposition", "attachment; filename = doc.rtf").build();
        }
        return ok.build();
    }
}
