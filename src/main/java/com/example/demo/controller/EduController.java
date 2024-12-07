package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduController {
    @GetMapping("/test")
    public ResponseEntity<?> testest() {
        return ResponseEntity.ok("test");
    }
}
