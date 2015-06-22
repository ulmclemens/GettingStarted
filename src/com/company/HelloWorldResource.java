package com.company;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces({MediaType.APPLICATION_JSON})
public class HelloWorldResource {
    private final AtomicLong counter;

    public HelloWorldResource() {
        this.counter = new AtomicLong();
    }

    @GET
    @Timed

    public Saying sayHello(@QueryParam("name") String thingie) {
        String value;
        if (thingie == null || thingie.equals("")) {
            value = ("Hello, Stranger");
        } else {
            value = String.format("Hello, %s!", thingie);
        }
        return new Saying(counter.incrementAndGet(), value);
    }


}