package com.example.board.repository;

import com.example.board.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

// DB연결 시 주입
//@Repository
public class JdbcPostRepository implements PostRepository  {

    //dataSource , 생성자 추가

    @Override
    public Post save(Post post) {
        return null;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }
}