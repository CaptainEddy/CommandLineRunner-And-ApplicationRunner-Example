package com.cob.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping(path = "/response")
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok("Hello from AppController!");
    }

}
