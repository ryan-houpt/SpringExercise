package com.codeup.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping("/{math}/{number1}/{next}/{number2}")

    @ResponseBody

    public Integer doMath(@PathVariable String math, @PathVariable int number1, @PathVariable String next, @PathVariable int number2) {
        int Answer = 0;

        if (math.equals("add") && next.equals("and")) {
            Answer += (number1 + number2);
        }
        if (math.equals("subtract") && next.equals("from")) {
            Answer += (number1 - number2);
        }
        if (math.equals("multiply") && next.equals("and")) {
            Answer += (number1 * number2);
        }
        if (math.equals("divide") && next.equals("by")) {
            Answer += (number1 / number2);
        }
        return Answer;
    }

}
