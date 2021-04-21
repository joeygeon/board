package com.example.board.controller;

import com.example.board.domain.Post;
import com.example.board.domain.PostForm;
import com.example.board.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class PostController {
    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping(value = "/posts/new")
    public String createForm() {
        return "write_content";
    }

    @PostMapping(value = "/posts/write")
    public String create(PostForm form) {
        Post post = new Post();
        post.setName(form.getName());
        post.setContent(form.getContent());
        post.setTitle(form.getTitle());
        postService.write(post);
        return "redirect:/";
    }

    @GetMapping(value = "/posts")
    public String list(Model model) {
        List<Post> posts = postService.findPosts();
        model.addAttribute("posts", posts);
        return "postList";
    }
}