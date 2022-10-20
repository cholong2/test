package com.example.demo1;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DemoController
{
    @Autowired
    private Calculator calculator;

    @RequestMapping("/hello-add")
    String show(@RequestParam("a") Integer a, @RequestParam("b") Integer b)
    {
        return calculator.add(a,b);
    }

}
