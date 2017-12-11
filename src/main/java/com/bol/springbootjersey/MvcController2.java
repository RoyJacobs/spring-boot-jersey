package com.bol.springbootjersey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc-2")
public class MvcController2 {
    @GetMapping
    public String get() {
        return "Hello from mvc-2";
    }
}
