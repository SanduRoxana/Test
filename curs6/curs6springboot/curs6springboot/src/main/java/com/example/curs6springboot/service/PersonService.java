package com.example.curs6springboot.service;

import com.example.curs6springboot.entities.Person;
import com.example.curs6springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    public Person getPersonById(int id) {
        if(personRepository.findById(id).isPresent()) {
            return personRepository.findById(id).get();
        }
        return null;
    }
}
