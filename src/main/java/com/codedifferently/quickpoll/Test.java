package com.codedifferently.quickpoll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/")
    public String home() {
        return "Hello Me!";
    }
}
