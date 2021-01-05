package com.example.ciq.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post addPost(PostRequest postRequest){
        Post post = new Post();
        post.setAuthor(postRequest.getAuthor());
        post.setReview(postRequest.getReview());
        post.setViews(postRequest.getView());
        post.setTitle(postRequest.getTitle());

        return postRepository.save(post);
    }
}
