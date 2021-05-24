package com.marcos.springboot.demo.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DemoRestController
{
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo()
    {
        return "Coach name: " + coachName + ", Team Name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World, Time on the server is currently: " + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout()
    {
        return "Just running";
    }

    @GetMapping("/fortune")
    public String getFortune()
    {
        return "Here's your fortune. Have a Good day...";
    }
}