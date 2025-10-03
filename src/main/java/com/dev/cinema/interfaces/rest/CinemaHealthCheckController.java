package com.dev.cinema.interfaces.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class CinemaHealthCheckController {

    @GetMapping
    public String healthCheck(){
        return "OK";
    }
}
