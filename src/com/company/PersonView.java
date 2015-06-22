package com.company;

import io.dropwizard.views.View;

public class PersonView extends View {
    private final Person person;

    public PersonView(Person person) {
        super("report.ftl");
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }
}