package com.example.ingbootcamp.controller;

import com.example.ingbootcamp.model.Person;
import com.example.ingbootcamp.model.PersonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "api/person")
public class PersonController {

    @PostMapping(path="new" )
    public ResponseEntity newPerson(Person request){
        PersonResponse response = new PersonResponse();
        response.setName(request.getName());
        response.setResult("Kişi Oluşturuldu");
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }
    public int calculateAmount(int balance){
        return balance*2;
    }

    @PostMapping(path="new/validation" )
    public ResponseEntity newPersonValidation(@Valid Person request){
        PersonResponse response = new PersonResponse();
        calculateAmount(request.getAge());

        if(request.getAge()<1){
            throw new IllegalArgumentException("custom hatamızı alalım");
        }

        response.setName(request.getName());
        response.setResult("Kişi Oluşturuldu");
        return ResponseEntity.status(HttpStatus.OK).body(response);

    }

}
