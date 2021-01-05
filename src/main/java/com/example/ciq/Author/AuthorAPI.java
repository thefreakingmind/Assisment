package com.example.ciq.Author;

import com.example.ciq.Post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class AuthorAPI {

    @Autowired
    private AuthorService authorService;


    @PostMapping("/api/post")
    public ResponseEntity<Object> addAuthor(@RequestBody AuthorRequest authorRequest){

        Author author = authorService.addAuthor(authorRequest);


        return ResponseEntity.ok(author);

    }
}
