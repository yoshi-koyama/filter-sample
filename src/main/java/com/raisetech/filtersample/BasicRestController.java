package com.raisetech.filtersample;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BasicRestController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

    @PostMapping("/greeting")
    public ResponseEntity<String> postHello(@RequestBody Map<String, String> greeting) {
        return ResponseEntity.ok(greeting.get("message") + ", too.");
    }
}
