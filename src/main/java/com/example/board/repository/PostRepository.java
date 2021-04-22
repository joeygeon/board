package com.example.board.repository;

import com.example.board.domain.Post;

import java.util.List;


public interface PostRepository {
    Post save(Post post);
    List<Post> findAll();
}
