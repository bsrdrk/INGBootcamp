package com.example.ingbootcamp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloExampleController {

    @RequestMapping(path = "api/example/helloworld",method = RequestMethod.GET)
    public ResponseEntity getHelloWorld(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
    }
    @GetMapping(path = "api/example/helloworld2/{name}")
    public ResponseEntity getHelloWorld2(@PathVariable String name){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World with name:  " + name);
    }
    @GetMapping(path = "api/example/helloworld3/{id}")
    public ResponseEntity getHelloWorld3(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World with id:  " + id);
    }

}
