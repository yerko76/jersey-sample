package com.nisum.jersey;

import com.nisum.jersey.domain.DummyResponse;
import com.nisum.jersey.domain.DummyResponseWrapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Date;

@Path("/example")
public class HelloWorld {


    @GET
    @Path("/response")
    @Produces(MediaType.APPLICATION_JSON)
    public DummyResponseWrapper getDummyResponse() {

        DummyResponse dummyResponse = new DummyResponse();
        dummyResponse.setMessage("Greetings from Nisum!!");
        dummyResponse.setDate(new Date());

        DummyResponseWrapper dummyResponseWrapper = new DummyResponseWrapper();
        dummyResponseWrapper.setCode(200);
        dummyResponseWrapper.setStatus(true);
        dummyResponseWrapper.setResponse(dummyResponse);
        return dummyResponseWrapper;
    }

}
