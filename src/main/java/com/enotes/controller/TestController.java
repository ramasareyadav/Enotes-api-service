package com.enotes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/getMassage")
    public String getMsg()
    {
        return "get massage";
    }
}
