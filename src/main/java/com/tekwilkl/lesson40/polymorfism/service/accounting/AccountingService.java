package com.tekwilkl.lesson40.polymorfism.service.accounting;

import com.tekwilkl.lesson40.polymorfism.repository.person.PersonRepository;

public class AccountingService {


    private PersonRepository personRepository;
    public AccountingService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    void calculateIncome() {
        personRepository.getAllPersonName(); // calculare venituri
    }

}
