package com.company;


import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class Main extends Application<GettingStartedConfiguration> {
    public static void main(String[] args) throws Exception {
        new Main().run(args);
    }


    @Override
    public void run(GettingStartedConfiguration configuration,Environment environment) {
        HelloWorldResource resource = new HelloWorldResource( configuration.getTemplate(), configuration.getDefaultName() );
        environment.jersey().register(resource);

        ReportResource resource1 = new ReportResource( configuration.getTemplate(), configuration.getDefaultName() );
        environment.jersey().register(resource1);

    }

}