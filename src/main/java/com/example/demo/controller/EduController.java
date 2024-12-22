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

    @GetMapping("/test/v2")
    public ResponseEntity<?> testestV2() {
        return ResponseEntity.ok("test");
    }
}
