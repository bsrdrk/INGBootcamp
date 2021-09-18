package com.example.ingbootcamp.businesslogiclayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    PersonService personService;

    public String getEmployeeDetails(){
        return "Çalışan: "+personService.getPersonDetail();

    }
}
