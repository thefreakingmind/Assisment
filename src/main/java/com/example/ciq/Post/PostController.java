package com.example.ciq.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class PostController {

    @Autowired
    private PostService postService;


    @PostMapping("/api/post/create")
    public ResponseEntity<Object> add(@RequestBody PostRequest post){

        Object obj = postService.addPost(post);

        return ResponseEntity.ok(obj);


    }
}
