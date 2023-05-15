package com.tekwilkl.lesson40.polymorfism.repository.person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PersonRepositoryFile implements PersonRepository {
    private Map<Integer, String> persons = new HashMap<>(); // 1, "Vasile"

    @Override
    public String getPersonNameById(int id) { // 1 -> Vasile
        System.out.println("Getting person from File...");
        return persons.get(id);
    }

    @Override
    public void savePerson(int id, String name) { // 1, "Vasile"
        System.out.println("Saving person in File...");
        persons.put(id, name);
    }

    @Override
    public List<String> getAllPersonName() {
        System.out.println("Getting all persons from File...");
        return new ArrayList<>(persons.values());
    }
}
