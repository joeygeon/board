package com.example.board.service;

import com.example.board.domain.Post;
import com.example.board.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    /**
     * 글작성
     */
    public String write(Post post) {
        postRepository.save(post);
        return post.getName();
    }

    /**
     *전체 글 조회
     */
    public List<Post> findPosts() {
        return postRepository.findAll();
    }

}
