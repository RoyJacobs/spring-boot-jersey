package com.bol.springbootjersey;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvc-1")
public class MvcController1 {
    @GetMapping
    public String get() {
        return "Hello from mvc-1";
    }
}
