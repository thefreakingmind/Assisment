package com.example.ciq.Author;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;


@Data
@JsonIgnoreProperties
public class AuthorRequest {

    private String firstName;

    private String lastName;

    private int posts;

    @JsonCreator
    public AuthorRequest(@JsonProperty("firstName") String firstName,
                         @JsonProperty("lastName") String lastName,
                         @JsonProperty("views") int posts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.posts = posts;
    }
}
