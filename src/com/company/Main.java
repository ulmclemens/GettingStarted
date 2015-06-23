package com.company;


import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import org.glassfish.jersey.media.multipart.MultiPartFeature;


public class Main extends Application<GettingStartedConfiguration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void initialize(Bootstrap<GettingStartedConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<GettingStartedConfiguration>());
        bootstrap.addBundle(new AssetsBundle("/com/company", "/assets", "index.html"));
    }


    @Override
    public void run(GettingStartedConfiguration configuration, Environment environment) {
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);

        ReportResource resource1 = new ReportResource();
        environment.jersey().register(resource1);
        environment.jersey().register(MultiPartFeature.class);

    }

}