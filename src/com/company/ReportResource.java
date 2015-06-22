package com.company;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/report")
@Produces(MediaType.APPLICATION_JSON)
public class ReportResource {

    public ReportResource() {
    }

    @GET
    @Produces("text/html")
    public PersonView sayReport(@QueryParam("name") String name) {
        Person person = new Person();
        person.setName(name);
        PersonView personView = new PersonView(person);
        return personView;
    }




}