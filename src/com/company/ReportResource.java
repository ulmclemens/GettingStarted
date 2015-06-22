package com.company;

import com.codahale.metrics.annotation.Timed;
        import com.google.common.base.Optional;
        import com.codahale.metrics.annotation.Timed;
        import io.dropwizard.setup.Environment;

        import javax.ws.rs.GET;
        import javax.ws.rs.Path;
        import javax.ws.rs.Produces;
        import javax.ws.rs.QueryParam;
        import javax.ws.rs.core.MediaType;
        import java.util.concurrent.atomic.AtomicLong;

@Path("/report")
@Produces(MediaType.APPLICATION_JSON)
public class ReportResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public ReportResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
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