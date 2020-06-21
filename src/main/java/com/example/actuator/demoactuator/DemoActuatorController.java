package com.example.actuator.demoactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoActuatorController {
    @GetMapping("/helloworld")
    public String hello() {
        return "Hello World!";
    }
}