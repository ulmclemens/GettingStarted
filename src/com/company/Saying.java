package com.company;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;


public class Saying {
    long id;
    String content;

    public Saying() {
        // Jackson deserialization
    }

    public Saying(long newId, String newContent) {
        id = newId;
        content = newContent;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}