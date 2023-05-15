package com.tekwilkl.lesson40.polymorfism.service.person;

import com.tekwilkl.lesson40.polymorfism.repository.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public int countAllPerson() {
        return personRepository.getAllPersonName().size();
    }

}
