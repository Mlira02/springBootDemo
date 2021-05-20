package com.marcos.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoRestController
{
    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World, Time on the server is currently: " + LocalDateTime.now();
    }
}
