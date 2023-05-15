package com.tekwilkl.lesson40.polymorfism.repository.person;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@Component
public class PersonRepositoryDB implements PersonRepository {

    private Map<Integer, String> persons = new HashMap<>(); // 1, "Vasile"

    @Override
    public String getPersonNameById(int id) { // 1 -> Vasile
        System.out.println("Getting person from Database...");
        return persons.get(id);
    }

    @Override
    public void savePerson(int id, String name) { // 1, "Vasile"
        System.out.println("Saving person in Database...");
        persons.put(id, name);
    }

    @Override
    public List<String> getAllPersonName() {
        System.out.println("Getting all persons from Database...");
        return new ArrayList<>(persons.values());
    }

}
