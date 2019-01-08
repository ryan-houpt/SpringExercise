package com.codeup.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String Hello(){
        return "home";
    }

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @GetMapping("/roll-dice")
    public String rollDice(){
        return "roll-dice";
    }

    @GetMapping("/index")
    public String index() {



        return "/posts/index";
    }

}
