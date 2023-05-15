package com.tekwilkl.lesson40.polymorfism.repository.person;

import java.util.List;

public interface PersonRepository {

    String getPersonNameById(int id);

    void savePerson(int id, String name);

    List<String> getAllPersonName();

}
