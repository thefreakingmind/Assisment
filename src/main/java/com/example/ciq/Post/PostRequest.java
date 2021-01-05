package com.example.ciq.Post;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Data;

import java.math.BigInteger;

@Data
public class PostRequest {


    private String author;

    private String title;

    private BigInteger view;

    private BigInteger review;


    @JsonCreator
    public PostRequest(@JsonProperty("author") String author,
                       @JsonProperty("title") String title,
                       @JsonProperty("view") BigInteger view,
                       @JsonProperty("review") BigInteger review) {
        this.author = author;
        this.title = title;
        this.view = view;
        this.review = review;
    }
}
