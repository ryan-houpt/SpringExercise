package com.codeup.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostRepository postDao;
    private UserRepository userDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts",postDao.findAll());
        return "posts/index";
    }


    @GetMapping("/posts/{id}")
    public String idPosts(@PathVariable Long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        model.addAttribute("id", id);
        return "posts/show";
    }


    @GetMapping("/posts/create")
    public String save(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String postCreate(@ModelAttribute Post post) {
        postDao.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String editPosts(@PathVariable Long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/edit";
    }


    @PostMapping("/posts/{id}/edit")
    public String editPost(@ModelAttribute Post post) {
        postDao.save(post);
        return "redirect:/posts/"+post.getId();
    }

    @PostMapping("/posts/{id}/delete")
    public String deletePost(@ModelAttribute Post post) {
        postDao.delete(post);
        return "redirect:/posts";
    }
}
