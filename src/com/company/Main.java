package com.company;


import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.glassfish.jersey.media.multipart.MultiPartFeature;


public class Main extends Application<ProjectConfiguration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void initialize(Bootstrap<ProjectConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<ProjectConfiguration>());
        bootstrap.addBundle(new AssetsBundle("/com/company", "/assets", "index.html"));
    }


    @Override
    public void run(ProjectConfiguration configuration, Environment environment) {
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);

        InvoiceResourceHTML resource1 = new InvoiceResourceHTML();
        environment.jersey().register(resource1);

        InvoiceResourceXML resource2 = new InvoiceResourceXML();
        environment.jersey().register(resource2);

        environment.jersey().register(MultiPartFeature.class);

    }

}