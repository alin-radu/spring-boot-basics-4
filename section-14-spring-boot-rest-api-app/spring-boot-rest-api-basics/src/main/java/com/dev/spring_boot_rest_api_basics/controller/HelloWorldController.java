package com.dev.spring_boot_rest_api_basics.controller;

import com.dev.spring_boot_rest_api_basics.model.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/hello-bean")
    public HelloWorldModel helloWorldBean() {
        return new HelloWorldModel("Hello World");
    }

    @GetMapping("/hello/path-variable/{name}")
    public HelloWorldModel helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldModel(String.format("Hello World, %s", name));
    }
}
