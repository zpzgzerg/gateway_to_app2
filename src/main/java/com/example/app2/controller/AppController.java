package com.example.app2.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AppController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/app2/check")
    public String check() {
        return String.format("App2 on Port %s", port);
    }
}
