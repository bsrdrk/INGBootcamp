package com.example.ingbootcamp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/configuration")
public class ConfigurationExampleController {
    @Value("${myvalue}")
    private String myValue;
    @GetMapping(path = "/value")
    public ResponseEntity valueusage()
    {
        return ResponseEntity.status(HttpStatus.OK).body("Merhaba Dünya"+myValue);
    }

}
