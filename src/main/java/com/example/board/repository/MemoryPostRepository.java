package com.example.board.repository;

import com.example.board.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository
public class MemoryPostRepository implements PostRepository {

    private static List<Post> store = new ArrayList<>();

    @Override
    public Post save(Post post) {
        store.add(post);
        return post;
    }

    @Override
    public List<Post> findAll() {
        return store;
    }
}
