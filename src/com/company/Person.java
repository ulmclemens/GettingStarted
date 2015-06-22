package com.company;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Ulm.Clemens on 22-Jun-15.
 */
public class Person {
    String name;
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
    name = newName;
    }
}
