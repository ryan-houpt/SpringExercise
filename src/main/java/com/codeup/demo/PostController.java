package com.codeup.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @ResponseBody
    @GetMapping("/posts")
    public Post[] posts() {
        return Post.getAllPosts();
    }

    @ResponseBody
    @GetMapping("/posts/{id}")
    public Post idPosts(@PathVariable Long id) {
        Post post = new Post ("This is a post", "Here is some information");
        return post;
    }

    @ResponseBody
    @GetMapping("/posts/create")
    public String createForm() {
        return "This is were you view the form to create a post";
    }

    @ResponseBody
    @PostMapping("/posts/create")
    public String postCreate() {
        return "You have submitted a form";
    }
}
