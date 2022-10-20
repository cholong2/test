package com.example.demo1;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController
{
    private Calculator twoCalculator = new Calculator();

    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "HelloWorld";
    }
    @GetMapping("/add")
    public String addGet(){
        int result = this.twoCalculator.sum(5,4);
        return Integer.toString( result);
    }
}