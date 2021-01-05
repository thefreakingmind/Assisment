package com.example.ciq.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author addAuthor(@RequestBody AuthorRequest authorRequest){
        Author author = new Author();
        author.setFirstName(authorRequest.getFirstName());
        author.setLastName(authorRequest.getLastName());
        author.setPosts(authorRequest.getPosts());


        return authorRepository.save(author);

    }
}
