package com.example.didjava.controller;

import com.example.didjava.model.DidVideoGenerateRequestDto;
import com.example.didjava.service.DidService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class DidController {

    private final DidService didService;

    @PostMapping("/talks")
    public ResponseEntity<Object> generateVideo(@RequestBody Object didVideoGenerateRequestDto) {
        Object resultObject = didService.generateVideo(didVideoGenerateRequestDto);
        return ResponseEntity.ok(resultObject);
    }

    @GetMapping("/talks/{id}")
    public ResponseEntity<Object> getVideo(@PathVariable String id) {
        Object resultObject = didService.getVideo(id);
        return ResponseEntity.ok(resultObject);
    }
}
