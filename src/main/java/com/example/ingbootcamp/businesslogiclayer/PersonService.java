package com.example.ingbootcamp.businesslogiclayer;

import com.example.ingbootcamp.model.Person;
import com.example.ingbootcamp.model.PersonResponse;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public String getPersonName()
    {
        return "Büşra";
    }

    public String getPersonNameById(String Id)
    {
        return "Büşra by Id";
    }

    public PersonResponse getPersonEntity(Person person)
    {

        PersonResponse personResponse=new PersonResponse();
        personResponse.setResult("dönüş sağlandı");
        return personResponse;
    }

    public String getPersonDetail(){
        return "Büşra Durak";
    }

}
