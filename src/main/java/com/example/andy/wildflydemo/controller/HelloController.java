package com.example.andy.wildflydemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello/{user}")
    public ResponseEntity<String> hello (@PathVariable("user") String user){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello ")
                .append(user);
        return new ResponseEntity<>(stringBuilder.toString(), HttpStatus.OK);
    }
}
