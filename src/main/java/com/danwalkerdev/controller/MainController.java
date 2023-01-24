package com.danwalkerdev.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainController {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody String foo(@RequestParam("msg") String payload) {
        return "hello " + payload;
    }
}
