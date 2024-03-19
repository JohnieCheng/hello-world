package com.johnie.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author johniecheng
 * @version 1.0
 * @date 2024/3/19 21:21
 */
@RestController
@RequestMapping
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "hello world!";
    }
}
