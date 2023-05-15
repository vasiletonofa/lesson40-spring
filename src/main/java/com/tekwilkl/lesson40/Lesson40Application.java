package com.tekwilkl.lesson40;

import com.tekwilkl.lesson40.polymorfism.repository.person.PersonRepository;
import com.tekwilkl.lesson40.polymorfism.service.person.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lesson40Application implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(Lesson40Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.savePerson(1, "Andrei");
		personRepository.savePerson(2, "Ion");
		personRepository.savePerson(3, "Vlad");

		int count = personService.countAllPerson();

		System.out.println("Total persoane: " + count);
	}
}
